package org.example.Interpreter.Reports;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ErrorReporter {

    private final List<ErrorLatinus> errores = new ArrayList<>();

    public void lexico( int line, int column, String message){
        errores.add(new ErrorLatinus(ErrorLatinus.Tipo.LEXICO, line, column, message));
    }

    public void sintactico( int line, int column, String message){
        errores.add(new ErrorLatinus(ErrorLatinus.Tipo.SINTACTICO, line, column, message));
    }

    public void semantico( int line, String message){
        errores.add(new ErrorLatinus(ErrorLatinus.Tipo.SEMANTICO, line, message));
    }

    public boolean tieneErrores(){
        return !errores.isEmpty();
    }

    public List<ErrorLatinus> getErrores(){
        return Collections.unmodifiableList(errores);
    }

    public void imprimir(){
        if (errores.isEmpty()){//modificar para hacerlo con lo grafico
            System.out.println(" no hay errores");
            return;
        }
        for (ErrorLatinus e : errores){
            System.out.println(e);
        }
        System.out.println(errores.size() + "error(es) encontrado(s)");
    }
}
