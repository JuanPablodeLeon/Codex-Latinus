package org.example.Interpreter;

import java.util.HashMap;
import java.util.Map;

public class Enviroment {
    private final Map<String, Object> values = new HashMap<>();
    private final Enviroment padre;

    public Enviroment(Enviroment padre){
        this.padre = padre;
    }

    public void setEviroment(String name, Object value){
        values.put(name, value);
    }

    public Object getEnviroment(String nombre){
        Enviroment actual = this; //Se guarda referencia del entorno actual
        while (actual != null){
            if (actual.values.containsKey(nombre)){
                return actual.values.get(nombre);
            }
            actual = actual.padre;
        }
        throw new RuntimeException("Variable no declarada: "+nombre);
    }

    public boolean exist(String nombre){
        if (values.containsKey(nombre)) return true;
        return padre != null && padre.exist(nombre);
    }

    public void assing(String nombre, Object value){
        Enviroment actual = this;
        while (actual != null){
            if (actual.values.containsKey(nombre)){
                actual.values.put(nombre, value);
                return;
            }
            actual = actual.padre;
        }
        values.put(nombre, value);
    }
}
