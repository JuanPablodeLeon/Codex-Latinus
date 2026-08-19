package org.example.Interpreter;

import java.util.HashMap;
import java.util.Map;

public class Enviroment {
    private final Map<String, Object> values = new HashMap<>();
    private final Map<String, String> types = new HashMap<>();
    private final Enviroment padre;

    public Enviroment(){
        this.padre = null;
    }

    public Enviroment(Enviroment padre){
        this.padre = padre;
    }

    public Object get(String nombre){
        if (values.containsKey(nombre)) return values.get(nombre);
        if (padre != null) return padre.get(nombre);
        throw new RuntimeException("Variable no declarada: "+nombre);
    }

    public boolean exist(String nombre){
        if (values.containsKey(nombre)) return true;
        return padre != null && padre.exist(nombre);
    }

    public void assing(String nombre, Object value/*, String type*/){
        if (values.containsKey(nombre)){
            values.put(nombre, value);
            return;
        }
        if (padre != null && padre.exist(nombre)){
            padre.assing(nombre, value);
            return;
        }
        values.put(nombre, value);
    }
}
