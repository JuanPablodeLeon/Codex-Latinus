package org.example.Ast.exp;

import org.example.Ast.ASTNode;
import org.example.Ast.AbstractNode;
import org.example.visitor.Visitor;

public class SeriesFieldAccess extends AbstractNode {
    private final String nameSeries;
    private final ASTNode index;
    private final String nameField;

    public SeriesFieldAccess(String nameSeries, ASTNode index, String nameField, int line) {
        super(line);
        this.nameField = nameField;
        this.index = index;
        this.nameSeries = nameSeries;
    }

    public static class Context{
        public final String nameSeries;
        public final ASTNode index;
        public final String nameField;

        public Context(SeriesFieldAccess node) {
            this.nameSeries = node.nameSeries;
            this.index = node.index;
            this.nameField = node.nameField;
        }
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(new Context(this));
    }
}
