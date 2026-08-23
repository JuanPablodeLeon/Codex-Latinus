package org.example.Ast.exp;

import org.example.Ast.AbstractNode;
import org.example.visitor.Visitor;

public class Identificador extends AbstractNode {

    private final String nombre;

    public Identificador(String nombre, int line) {
        super(line);
        this.nombre = nombre;
    }

    public static class Context{
        public final String nombre;
        public final int line;

        public Context(Identificador node) {
            this.nombre = node.nombre;
            this.line = node.line;
        }
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(new Context(this));
    }
}
