package org.example.Semantico;

import java.util.List;

public class FuncSymbol extends Symbol{
    public final Tipos typeReddere;
    public final List<Tipos> typesParams;
    public final List<String> nameParams;

    public FuncSymbol(String name, int lineDelcaration, Tipos typeReddere, List<Tipos> typesParams, List<String> nameParams) {
        super(name, lineDelcaration);
        this.typeReddere = typeReddere;
        this.typesParams = typesParams;
        this.nameParams = nameParams;
    }
}
