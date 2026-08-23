package org.example.Ast.exp;

import org.example.Ast.AbstractNode;
import org.example.visitor.Visitor;

public class CharLiteral extends AbstractNode {
    private final char value;

    public CharLiteral(char value, int line) {
        super(line);
        this.value = value;
    }

    public static class Context{
        public final char value;
        public final int line;

        public Context(CharLiteral node) {
            this.value = node.value;
            this.line = node.line;
        }
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(new Context(this));
    }
}
