package org.example.Ast.exp;

import org.example.Ast.AbstractNode;
import org.example.visitor.Visitor;

public class BoolLiteral extends AbstractNode {
    private final boolean value;
    public BoolLiteral(boolean value, int line) {
        super(line);
        this.value = value;
    }

    public static class Context{
        public final boolean value;
        public final int line;

        public Context(BoolLiteral node) {
            this.value = node.value;
            this.line = node.line;
        }
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(new Context(this));
    }
}
