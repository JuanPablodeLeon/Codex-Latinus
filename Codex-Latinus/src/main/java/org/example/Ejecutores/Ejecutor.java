package org.example.Ejecutores;

import antlr4.com.CodexLatinusGrammarLexer;
import antlr4.com.CodexLatinusGrammarParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.example.Interpreter.Reports.ErrorLatinus;
import org.example.Interpreter.InterpreterVisitor;

import java.util.ArrayList;
import java.util.List;

public class Ejecutor {
    //lista de errores

    private String salida = "";
    private ParseTree tree;
    private CommonTokenStream tokens;
    private CodexLatinusGrammarParser parser;
    private final List<ErrorLatinus> errorLexico = new ArrayList<>();
    private final List<ErrorLatinus> errorSintactico = new ArrayList<>();
    private final List<ErrorLatinus> errorSemantico = new ArrayList<>();


    public boolean ejecuar(String codigo){
        //limpiar errores

        CodexLatinusGrammarLexer lexer = new CodexLatinusGrammarLexer(CharStreams.fromString(codigo));
        lexer.removeErrorListeners();
        //errores lexicos
        tokens = new CommonTokenStream(lexer);

        CodexLatinusGrammarParser parser = new CodexLatinusGrammarParser(tokens);
        parser.removeErrorListeners();
        //errores sintacticos

        this.parser = parser;

        tree = parser.inicio();
        //lista de errores
        //if de errores
        InterpreterVisitor interpreter = new InterpreterVisitor();
        try{
            interpreter.visit(tree);
        } catch (RuntimeException e) {
            // nuevo error
        }
        salida = interpreter.getConsola();
        //errores semanticos


        return true;
    }

    public String getConsola(){ return salida;}
    public ParseTree getTree(){ return tree;}
    public CommonTokenStream getTokens(){ return tokens;}
    public CodexLatinusGrammarParser getParser(){ return  parser;}
}
