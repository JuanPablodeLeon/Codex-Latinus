package org.example.Ast.exp;

import org.example.Ast.ASTNode;
import org.example.Ast.AbstractNode;
import org.example.visitor.Visitor;

public class StringLiteral extends AbstractNode {
    private final String value;

    public StringLiteral(String value, int line) {
        super(line);
        this.value = value;
    }

    public static class Context{
        public final String value;
        public final int line;

        public Context(StringLiteral node) {
            this.value = node.value;
            this.line = node.line;
        }
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(new Context(this));
    }

}
