package org.example.MatchColors;

import antlr4.com.CodexLatinusGrammarLexer;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.fife.ui.rsyntaxtextarea.AbstractTokenMaker;
import org.fife.ui.rsyntaxtextarea.Token;
import org.fife.ui.rsyntaxtextarea.TokenMap;

import javax.swing.text.Segment;
import java.util.List;

public class AntlrTokenMaker extends AbstractTokenMaker {

    public AntlrTokenMaker(){

    }
    @Override
    public TokenMap getWordsToHighlight() {
        return null;
    }

    @Override
    public Token getTokenList(Segment text, int initialTokenType, int startOffset) {
        resetTokenList();

        String code = text.toString();
        if (code.isEmpty()){
            addNullToken();
            return firstToken;
        }
        try{
            CodexLatinusGrammarLexer lexer = new CodexLatinusGrammarLexer(CharStreams.fromString(code));
            List<? extends org.antlr.v4.runtime.Token> allToken = lexer.getAllTokens();
            //CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            //tokenStream.fill();

            for (org.antlr.v4.runtime.Token t : allToken){
                if (t.getType() == org.antlr.v4.runtime.Token.EOF) break;

                int localStart = t.getStartIndex();
                int localEnd = t.getStopIndex();
                int rsyntaxType = mapTokenType(t.getType());

                if (rsyntaxType != Token.NULL) {
                    // Agregar el token usando el array del segmento y los offsets correctos
                    addToken(
                            text.array,
                            text.offset + localStart,
                            text.offset + localEnd,
                            rsyntaxType,
                            startOffset + localStart,
                            false
                    );
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        addNullToken();
        return firstToken;
    }

    private int mapTokenType(int antlrType) {
        // Palabras clave y estructurales
        switch (antlrType) {
            case CodexLatinusGrammarLexer.NON:
            case CodexLatinusGrammarLexer.ESTO:
            case CodexLatinusGrammarLexer.SERIES:
            case CodexLatinusGrammarLexer.SI:
            case CodexLatinusGrammarLexer.ALITER:
            case CodexLatinusGrammarLexer.DUM:
            case CodexLatinusGrammarLexer.FACERE:
            case CodexLatinusGrammarLexer.PERGE:
            case CodexLatinusGrammarLexer.PER:
            case CodexLatinusGrammarLexer.INTERRUMPE:
            case CodexLatinusGrammarLexer.STRUCTURA:
            case CodexLatinusGrammarLexer.FINIS:
                return Token.RESERVED_WORD;

            // Tipos de dato
            case CodexLatinusGrammarLexer.TEXTUM:
            case CodexLatinusGrammarLexer.DECIMALIS:
            case CodexLatinusGrammarLexer.NUMERUS:
            case CodexLatinusGrammarLexer.LITTERA:
            case CodexLatinusGrammarLexer.BOOL:
                return Token.DATA_TYPE;

            // Booleanos
            case CodexLatinusGrammarLexer.VERUM:
            case CodexLatinusGrammarLexer.FALSUS:
                return Token.LITERAL_BOOLEAN;

            // Funciones y operaciones especiales
            case CodexLatinusGrammarLexer.ACTIO:
            case CodexLatinusGrammarLexer.RATIO:
            case CodexLatinusGrammarLexer.REDDERE:
            case CodexLatinusGrammarLexer.VARIABILES:
            case CodexLatinusGrammarLexer.MUNERA:
            case CodexLatinusGrammarLexer.MAIOR:
            case CodexLatinusGrammarLexer.FINISUP:
            case CodexLatinusGrammarLexer.IMPR:
            case CodexLatinusGrammarLexer.LEER:
                return Token.FUNCTION;

            // Literales
            case CodexLatinusGrammarLexer.STRING:
                return Token.LITERAL_STRING_DOUBLE_QUOTE;
            case CodexLatinusGrammarLexer.CHARS:
                return Token.LITERAL_CHAR;
            case CodexLatinusGrammarLexer.INT:
                return Token.LITERAL_NUMBER_DECIMAL_INT;
            case CodexLatinusGrammarLexer.DOUBLE:
                return Token.LITERAL_NUMBER_FLOAT;

            // Comentarios
            case CodexLatinusGrammarLexer.LINE_COMMENT:
                return Token.COMMENT_EOL;
            case CodexLatinusGrammarLexer.BLOCK_COMMENT:
                return Token.COMMENT_MULTILINE;

            // Operadores
            case CodexLatinusGrammarLexer.SUMA_INCR:
            case CodexLatinusGrammarLexer.RESTA_DECR:
            case CodexLatinusGrammarLexer.SUMA:
            case CodexLatinusGrammarLexer.RESTA:
            case CodexLatinusGrammarLexer.MULTI:
            case CodexLatinusGrammarLexer.DIV:
            case CodexLatinusGrammarLexer.IGUAL:
            case CodexLatinusGrammarLexer.NO_IGUAL:
            case CodexLatinusGrammarLexer.MENRO_IGUAL:
            case CodexLatinusGrammarLexer.MAYOR_IGUAL:
            case CodexLatinusGrammarLexer.MENOR:
            case CodexLatinusGrammarLexer.MAYOR:
            case CodexLatinusGrammarLexer.AND:
            case CodexLatinusGrammarLexer.OR:
            case CodexLatinusGrammarLexer.ASIGNACION:
                return Token.OPERATOR;

            // Separadores
            case CodexLatinusGrammarLexer.DOS_PUNTOS:
            case CodexLatinusGrammarLexer.PUNTO_COMA:
            case CodexLatinusGrammarLexer.COMA:
            case CodexLatinusGrammarLexer.PUNTO:
            case CodexLatinusGrammarLexer.LLLAVE:
            case CodexLatinusGrammarLexer.RLLAVE:
            case CodexLatinusGrammarLexer.LCORCH:
            case CodexLatinusGrammarLexer.RCORCH:
            case CodexLatinusGrammarLexer.LPAREN:
            case CodexLatinusGrammarLexer.RPAREN:
                return Token.SEPARATOR;

            case CodexLatinusGrammarLexer.WS:
                return Token.WHITESPACE;

            // Identificadores y cualquier otro token no mapeado
            case CodexLatinusGrammarLexer.ID:
                return Token.IDENTIFIER;
            default:
                return Token.IDENTIFIER;
        }
    }

    public String[] getLineCommentStartAndEnd() {
        return new String[] { "//", null };
    }
}
