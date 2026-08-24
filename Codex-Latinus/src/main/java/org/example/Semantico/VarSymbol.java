package org.example.Semantico;

public class VarSymbol extends Symbol{

    public final Tipos type;
    public final boolean isIterationPer;
    public Integer sizeSeries;

    public VarSymbol(String name, int lineDelcaration, Tipos type, boolean isIterationPer) {
        super(name, lineDelcaration);
        this.type = type;
        this.isIterationPer = isIterationPer;
    }
}
