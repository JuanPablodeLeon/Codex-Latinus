package org.example.Ast.stm;

import org.example.Ast.ASTNode;
import org.example.Ast.AbstractNode;
import org.example.visitor.Visitor;

import java.util.List;

public class PerStm extends AbstractNode {
    private final String nameParam;
    private final String typeParam;
    private final ASTNode initValue;
    private final ASTNode condition;
    private final AutoOpStm incrm;
    private final List<ASTNode> body;

    public PerStm( String nameParam, String typeParam, ASTNode initValue, ASTNode condition, AutoOpStm incrm, List<ASTNode> body, int line) {
        super(line);
        this.nameParam = nameParam;
        this.typeParam = typeParam;
        this.initValue = initValue;
        this.condition = condition;
        this.incrm = incrm;
        this.body = body;

    }

    public static class Context{
        public final String nameParam;
        public final String typeParam;
        public final ASTNode initValue;
        public final ASTNode condition;
        public final AutoOpStm incrm;
        public final List<ASTNode> body;
        public final int line;

        public Context(PerStm node) {
            this.nameParam = node.nameParam;
            this.typeParam = node.typeParam;
            this.initValue = node.initValue;
            this.condition = node.condition;
            this.incrm = node.incrm;
            this.body = node.body;
            this.line = node.line;
        }
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(new Context(this));
    }
}
