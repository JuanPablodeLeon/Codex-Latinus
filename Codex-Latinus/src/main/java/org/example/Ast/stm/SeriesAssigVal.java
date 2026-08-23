package org.example.Ast.stm;

import org.example.Ast.ASTNode;
import org.example.Ast.AbstractNode;
import org.example.visitor.Visitor;

public class SeriesAssigVal extends AbstractNode {
    private final String name;
    private final ASTNode index;
    private final ASTNode value;

    public SeriesAssigVal( String name, ASTNode index, ASTNode value, int line) {
        super(line);
        this.name = name;
        this.index = index;
        this.value = value;
    }

    public static class Context{
        public final String name;
        public final ASTNode index;
        public final ASTNode value;

        public Context(SeriesAssigVal node) {
            this.name = node.name;
            this.index = node.index;
            this.value = node.value;
        }
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(new Context(this));
    }
}