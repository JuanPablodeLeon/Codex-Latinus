package org.example.Interpreter.Reports;

public class ErrorLatinus {

    public enum Tipo{ LEXICO, SINTACTICO, SEMANTICO}

    private final Tipo tipo;
    private final int line;
    private final int columun;
    private final String message;

    public ErrorLatinus(Tipo tipo, int line, int columun, String message) {
        this.tipo = tipo;
        this.line = line;
        this.columun = columun;
        this.message = message;
    }

    public ErrorLatinus(Tipo tipo, int line, String message){
        this(tipo, line, -1, message);
    }

    public Tipo getTipo() {
        return tipo;
    }

    public int getLine() {
        return line;
    }

    public int getColumun() {
        return columun;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
       String pos = columun >= 0 ? "linea: "+line+", columna: "+columun : "linea: "+line;
        return "[Error: "+tipo+"] ("+pos+"): "+message;
    }
}
