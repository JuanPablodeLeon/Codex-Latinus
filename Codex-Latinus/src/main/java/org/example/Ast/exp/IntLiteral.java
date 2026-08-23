package org.example.Ast.exp;

import org.example.Ast.AbstractNode;
import org.example.visitor.Visitor;

public class IntLiteral extends AbstractNode {
    private final int value;

    public IntLiteral(int value, int line) {
        super(line);
        this.value = value;
    }

    public static class Context{
        public final int value;
        public final int line;

        public Context(IntLiteral node) {
            this.value = node.value;
            this.line = node.line;
        }
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(new Context(this));
    }
}
