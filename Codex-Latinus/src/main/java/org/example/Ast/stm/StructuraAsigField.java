package org.example.Ast.stm;

import org.example.Ast.ASTNode;
import org.example.Ast.AbstractNode;
import org.example.visitor.Visitor;

public class StructuraAsigField extends AbstractNode {
    private final String nameStruc;
    private final ASTNode field;
    private final ASTNode value;

    public StructuraAsigField( String nameStruc, ASTNode field, ASTNode value, int line) {
        super(line);
        this.nameStruc = nameStruc;
        this.field = field;
        this.value = value;
    }

    public static class Context{
        public final String nameStruc;
        public final ASTNode field;
        public final ASTNode value;

        public Context(StructuraAsigField node) {
            this.nameStruc = node.nameStruc;
            this.field = node.field;
            this.value = node.value;
        }
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(new Context(this));
    }
}
