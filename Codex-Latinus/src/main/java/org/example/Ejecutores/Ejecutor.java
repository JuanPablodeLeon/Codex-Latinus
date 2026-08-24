package org.example.Ejecutores;

import antlr4.com.CodexLatinusGrammarLexer;
import antlr4.com.CodexLatinusGrammarParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.example.Ast.ASTNode;
import org.example.Ast.stm.Flujo;
import org.example.Interpreter.Reports.ErrorColector;
import org.example.Interpreter.Reports.ErrorLatinus;
import org.example.Interpreter.InterpreterVisitor;
import org.example.Interpreter.Reports.ErrorReporter;
import org.example.Semantico.SemanticVisitor;
import org.example.visitor.BuilderVisitor;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejecutor {
    //lista de errores

    private StringBuilder salida = new StringBuilder();
    private ErrorReporter reporter = new ErrorReporter();
    private final List<Token> tokens = new ArrayList<>();
    private Flujo raiz;

    public boolean ejecuar(String codigo) {
        salida.setLength(0);
        tokens.clear();
        raiz = null;
        reporter = new ErrorReporter();

        CharStream entrada = CharStreams.fromString(codigo);
        CodexLatinusGrammarLexer lexer = new CodexLatinusGrammarLexer(entrada);
        lexer.removeErrorListeners();
        lexer.addErrorListener(new ErrorColector(reporter, true));

        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        tokenStream.fill();
        tokens.addAll(tokenStream.getTokens());
        tokenStream.seek(0);

        CodexLatinusGrammarParser parser = new CodexLatinusGrammarParser(tokenStream);
        parser.removeErrorListeners();
        parser.addErrorListener(new ErrorColector(reporter, false));

        CodexLatinusGrammarParser.InicioContext arbolParse = parser.inicio();

        if (reporter.tieneErrores()) {
            salida.append("----- Hay Errores Lexicos/Sintacticos ------");
            escribirErrores();
            return false;
        }

        BuilderVisitor builder = new BuilderVisitor();
        ASTNode nodoRaiz = builder.visit(arbolParse);

        if (!(nodoRaiz instanceof Flujo)){
            salida.append("No se pudo cosntruir el AST\n");
            return false;
        }
        raiz = (Flujo) nodoRaiz;

        SemanticVisitor semantico = new SemanticVisitor(reporter);
        semantico.analize(raiz);

        if (reporter.tieneErrores()){
            salida.append("----- Hay Errores Semanticos -----");
            escribirErrores();
            return false;
        }

        InterpreterVisitor interprete = new InterpreterVisitor();
        interprete.setSalida(linea-> salida.append(linea).append("\n"));
        interprete.setEntrada(() -> JOptionPane.showInputDialog(null, "Entrada Requerida (Leer): ", "Codex Latinus", JOptionPane.QUESTION_MESSAGE));

        try {
            interprete.ejecutar(raiz);
        } catch (RuntimeException e){
            salida.append("--- Error en tiempo de ejecucion ---");
            salida.append(e.getMessage()).append("\n");
        }

        return true;
    }

    public String getConsola() {
        return salida.toString();
    }

    private void escribirErrores(){
        for (ErrorLatinus err : reporter.getErrores()){
            salida.append(err).append("\n");
        }
        salida.append(reporter.getErrores().size()).append(" error(es) encontrados(s)\n");
    }

    public Flujo getAst() {
        return raiz;
    }

    public List<Token> getTokens() {
        return Collections.unmodifiableList(tokens);
    }

    public List<ErrorLatinus> getErrores() {
        return reporter.getErrores();
    }
}

