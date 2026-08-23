package org.example.Ast.stm;

import org.example.Ast.AbstractNode;
import org.example.visitor.Visitor;

public class AutoOpStm extends AbstractNode {
    private final String name;
    private final String op;

    public AutoOpStm(String name, String op, int line) {
        super(line);
        this.name = name;
        this.op = op;
    }

    public static class Context{
        public final String name;
        public final String op;
        public final int line;

        public Context(AutoOpStm node) {
            this.name = node.name;
            this.op = node.op;
            this.line = node.line;
        }
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(new Context(this));
    }
}
