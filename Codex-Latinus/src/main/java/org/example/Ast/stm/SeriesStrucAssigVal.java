package org.example.Ast.stm;

import org.example.Ast.ASTNode;
import org.example.Ast.AbstractNode;
import org.example.visitor.Visitor;

public class SeriesStrucAssigVal extends AbstractNode {
    private final String nameSeries;
    private final ASTNode index;
    private final String nameStruc;
    private final ASTNode value;

    public SeriesStrucAssigVal( String nameSeries, ASTNode index, String nameStruc, ASTNode value, int line) {
        super(line);
        this.nameSeries = nameSeries;
        this.index = index;
        this.nameStruc = nameStruc;
        this.value = value;
    }

    public static class Context{
        public final String nameSeries;
        public final ASTNode index;
        public final String nameStruc;
        public final ASTNode value;
        public final int line;

        public Context(SeriesStrucAssigVal node) {
            this.nameSeries = node.nameSeries;
            this.index = node.index;
            this.nameStruc = node.nameStruc;
            this.value = node.value;
            this.line = node.line;
        }
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(new Context(this));
    }
}
