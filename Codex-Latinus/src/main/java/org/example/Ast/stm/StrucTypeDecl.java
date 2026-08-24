package org.example.Ast.stm;

import org.example.Ast.AbstractNode;
import org.example.visitor.Visitor;

import javax.swing.text.AbstractDocument;
import java.util.List;

public class StrucTypeDecl extends AbstractNode {
    private final String name;
    private final List<StrucFieldParams> fields;

    public StrucTypeDecl( String name, List<StrucFieldParams> fields, int line) {
        super(line);
        this.name = name;
        this.fields = fields;
    }

    public static class Context{
        public final String name;
        public final List<StrucFieldParams> fields;
        public final int line;

        public Context(StrucTypeDecl node) {
            this.name = node.name;
            this.fields = node.fields;
            this.line = node.line;
        }
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(new Context(this));
    }
}
