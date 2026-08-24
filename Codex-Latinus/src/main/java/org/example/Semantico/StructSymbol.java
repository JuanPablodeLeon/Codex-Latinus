package org.example.Semantico;

import java.util.LinkedHashMap;
import java.util.Map;

public class StructSymbol extends Symbol{
    public final Map<String, Tipos> fields = new LinkedHashMap<>();

    public StructSymbol(String name, int lineDelcaration) {
        super(name, lineDelcaration);
    }

    public boolean hasField(String nameField){
        return fields.containsKey(nameField);
    }

    public Tipos fieldsType(String nameField){
        return fields.get(nameField);
    }
}
