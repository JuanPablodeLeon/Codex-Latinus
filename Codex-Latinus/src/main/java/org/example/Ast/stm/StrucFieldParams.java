package org.example.Ast.stm;

public class StrucFieldParams {
    public final String name;
    public final String type;
    public final boolean isSeries;
    public final int sizeSeries;

    public StrucFieldParams(String name, String type, boolean isSeries) {
        this.name = name;
        this.type = type;
        this.isSeries = isSeries;
        this.sizeSeries = -1;
    }
}
