package org.example.Ast.stm;

import org.example.Ast.AbstractNode;
import org.example.visitor.Visitor;

import java.util.List;

public class StrucVarDecl extends AbstractNode {
    private final String name;
    private final String type;
    private final List<StrucFieldInit> values;

    public StrucVarDecl( String name, String type, List<StrucFieldInit> values, int line) {
        super(line);
        this.name = name;
        this.type = type;
        this.values = values;
    }

    public static class Context{
        public final String name;
        public final String type;
        public final List<StrucFieldInit> values;

        public Context(StrucVarDecl node) {
            this.name = node.name;
            this.type = node.type;
            this.values = node.values;
        }
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(new Context(this));
    }
}
