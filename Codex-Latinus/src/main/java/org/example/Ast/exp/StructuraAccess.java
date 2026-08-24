package org.example.Ast.exp;

import org.example.Ast.AbstractNode;
import org.example.visitor.Visitor;

public class StructuraAccess extends AbstractNode {
    private final String nameStruc;
    private final String nameField;

    public StructuraAccess(String nameStruc, String nameField, int line) {
        super(line);
        this.nameStruc = nameStruc;
        this.nameField = nameField;
    }

    public static class Context{
        public final String nameStruc;
        public final String nameField;
        public final int line;

        public Context(StructuraAccess node) {
            this.nameStruc = node.nameStruc;
            this.nameField = node.nameField;
            this.line = node.line;
        }
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(new Context(this));
    }
}
