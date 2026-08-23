package org.example.Ast.exp;

import org.example.Ast.ASTNode;
import org.example.Ast.AbstractNode;
import org.example.visitor.Visitor;

public class SeriesAccess extends AbstractNode {
    private final String name;
    private final ASTNode value;

    public SeriesAccess(String name, ASTNode value, int line) {
        super(line);
        this.name = name;
        this.value = value;
    }

    public static class Context{
        public final String name;
        public final ASTNode value;

        public Context(SeriesAccess node) {
            this.name = node.name;
            this.value = node.value;
        }
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(new Context(this));
    }
}
