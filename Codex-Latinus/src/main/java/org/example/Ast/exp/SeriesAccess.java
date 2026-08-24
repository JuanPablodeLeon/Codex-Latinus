package org.example.Ast.exp;

import org.example.Ast.ASTNode;
import org.example.Ast.AbstractNode;
import org.example.visitor.Visitor;

public class SeriesAccess extends AbstractNode {
    private final String name;
    private final ASTNode index;

    public SeriesAccess(String name, ASTNode index, int line) {
        super(line);
        this.name = name;
        this.index = index;
    }

    public static class Context{
        public final String name;
        public final ASTNode index;
        public final int line;

        public Context(SeriesAccess node) {
            this.name = node.name;
            this.index = node.index;
            this.line = node.line;
        }
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(new Context(this));
    }
}
