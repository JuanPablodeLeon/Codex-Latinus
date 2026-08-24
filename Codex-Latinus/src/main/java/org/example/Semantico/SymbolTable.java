package org.example.Semantico;

import java.util.HashMap;
import java.util.Map;

public class SymbolTable {
    private final Map<String, FuncSymbol> funcs = new HashMap<>();
    private final Map<String, StructSymbol> strucs = new HashMap<>();

    private Scope actualScope;

    public SymbolTable(){
        this.actualScope = new Scope(null, "global");
    }

    //Funciones
    public boolean existFunc(String name){
        return funcs.containsKey(name);
    }

    public void setFunc(FuncSymbol f){
        funcs.put(f.name, f);
    }

    public FuncSymbol getFunc(String name){
        return funcs.get(name);
    }

    //StructuraS
    public boolean existStruc(String name){
        return strucs.containsKey(name);
    }

    public void setStruc(StructSymbol s){
        strucs.put(s.name, s);
    }

    public StructSymbol getStructura(String name){
        return strucs.get(name);
    }


    //Scopes
    public Scope getActualScope(){
        return actualScope;
    }

    public void enterScope(String etiqueta){
        actualScope = new Scope(actualScope, etiqueta);
    }

    public void exitScope(){
        if (actualScope.parent != null){
            actualScope = actualScope.parent;
        }
    }

    //Variables
    public boolean existLocalVar(String name){
        return actualScope.existLocal(name);
    }

    public void setVar(VarSymbol v){
        actualScope.declarar(v);
    }

    public VarSymbol getVar(String name){
        return actualScope.resolve(name);
    }
}
