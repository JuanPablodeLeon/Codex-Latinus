package org.example.Semantico;

import java.util.LinkedHashMap;
import java.util.Map;

public class Scope {
    public final Scope parent;
    public final String envr;
    private final Map<String, VarSymbol> vars = new LinkedHashMap<>();

    public Scope(Scope parent, String envr) {
        this.parent = parent;
        this.envr = envr;
    }

    public boolean existLocal(String name){
        return vars.containsKey(name);
    }

    public void declarar(VarSymbol sym){
        vars.put(sym.name, sym);
    }

    public VarSymbol resolve(String name){
        Scope actual = this;
        while (actual != null){
            VarSymbol s = actual.vars.get(name);
            if (s != null) return s;

            actual = actual.parent;
        }
        return null;
    }

    public Map<String, VarSymbol> getVars() {
        return vars;
    }
}
