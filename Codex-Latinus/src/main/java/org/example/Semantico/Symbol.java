package org.example.Semantico;

public abstract class Symbol {
    public final String name;
    public final int lineDelcaration;

    protected Symbol(String name, int lineDelcaration) {
        this.name = name;
        this.lineDelcaration = lineDelcaration;
    }
}
