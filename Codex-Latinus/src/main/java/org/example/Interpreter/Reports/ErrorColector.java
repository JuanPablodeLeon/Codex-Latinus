package org.example.Interpreter.Reports;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import java.util.ArrayList;
import java.util.List;

public class ErrorColector extends BaseErrorListener {

    private final ErrorReporter reporter;
    private final boolean isLexico;

    public ErrorColector(ErrorReporter reporter, boolean isLexico) {
        this.reporter = reporter;
        this.isLexico = isLexico;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e){
        if (isLexico){
            reporter.lexico(line, charPositionInLine, msg);
        } else{
            reporter.sintactico(line, charPositionInLine, msg);
        }
    }
}
