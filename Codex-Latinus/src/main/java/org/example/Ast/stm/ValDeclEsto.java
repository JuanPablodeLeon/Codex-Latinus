package org.example.Ast.stm;

import org.example.Ast.ASTNode;
import org.example.Ast.AbstractNode;
import org.example.visitor.Visitor;

public class ValDeclEsto extends AbstractNode {
    private final String name;
    private final String type;
    private final ASTNode initValue;
    private final boolean typeInf;

    public ValDeclEsto( String name, String type, ASTNode initValue, boolean typeInf, int line) {
        super(line);
        this.name = name;
        this.type = type;
        this.initValue = initValue;
        this.typeInf = typeInf;
    }

    public static class Context{
        public final String name;
        public final String type;
        public final ASTNode initValue;
        public final boolean typeInf;

        public Context(ValDeclEsto node) {
            this.name = node.name;
            this.type = node.type;
            this.initValue = node.initValue;
            this.typeInf = node.typeInf;
        }
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(new Context(this));
    }
}
