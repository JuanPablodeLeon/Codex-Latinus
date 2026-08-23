package org.example.Ast.exp;

import org.example.Ast.AbstractNode;
import org.example.visitor.Visitor;

public class DoubleLiteral extends AbstractNode {
    private final double value;

    public DoubleLiteral(double value, int line) {
        super(line);
        this.value = value;
    }

    public static class Context{
        public final double value;
        public final int line;

        public Context(DoubleLiteral node) {
            this.value = node.value;
            this.line = node.line;
        }
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(new Context(this));
    }
}
