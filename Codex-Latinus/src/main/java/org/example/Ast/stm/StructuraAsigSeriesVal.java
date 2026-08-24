package org.example.Ast.stm;

import org.example.Ast.ASTNode;
import org.example.Ast.AbstractNode;
import org.example.visitor.Visitor;

import java.util.List;

public class StructuraAsigSeriesVal extends AbstractNode {
    private final String nameStruc;
    private final String nameSeries;
    private final ASTNode index;
    private final List<StrucFieldInit> values;

    public StructuraAsigSeriesVal(String nameStruc, String nameSeries, ASTNode index, List<StrucFieldInit> values, int line) {
        super(line);
        this.nameStruc = nameStruc;
        this.nameSeries = nameSeries;
        this.index = index;
        this.values = values;
    }

    public static class Context{
        public final String nameStruc;
        public final String nameSeries;
        public final ASTNode index;
        public final List<StrucFieldInit> values;
        public final int line;

        public Context(StructuraAsigSeriesVal node) {
            this.nameStruc = node.nameStruc;
            this.nameSeries = node.nameSeries;
            this.index = node.index;
            this.values = node.values;
            this.line = node.line;
        }
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(new Context(this));
    }
}
