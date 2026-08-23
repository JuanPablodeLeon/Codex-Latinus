package org.example.Ast.stm;

import org.example.Ast.AbstractNode;
import org.example.visitor.Visitor;

public class LeerStm extends AbstractNode {
    private final String name;

    public LeerStm(String name, int line) {
        super(line);
        this.name = name;
    }

    public static class Context{
        public final String name;
        public final int line;

        public Context(LeerStm node) {
            this.name = node.name;
            this.line = node.line;
        }
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(new Context(this));
    }
}
