package org.example.Ast.exp;

import org.example.Ast.ASTNode;
import org.example.Ast.AbstractNode;
import org.example.visitor.Visitor;

public class Parentesis  extends AbstractNode {
    private final ASTNode value;
    public Parentesis(ASTNode value, int line) {
        super(line);
        this.value = value;
    }

    public static class Context{
        public final ASTNode value;
        public final int line;

        public Context(Parentesis node) {
            this.value = node.value;
            this.line = node.line;
        }
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(new Context(this));
    }
}
