package org.example.Ast.stm;

import org.example.Ast.ASTNode;
import org.example.Ast.AbstractNode;
import org.example.visitor.Visitor;

import java.util.List;

public class SiStm extends AbstractNode {
    private final ASTNode condition;
    private final List<ASTNode> bodySi;
    private final List<AliterStm> aliterNodes;

    public SiStm(ASTNode condition, List<ASTNode> bodySi, List<AliterStm> aliterNodes, int line) {
        super(line);
        this.condition = condition;
        this.bodySi = bodySi;
        this.aliterNodes = aliterNodes;
    }

    public static class Context{
        public final ASTNode condition;
        public final List<ASTNode> bodySi;
        public final List<AliterStm> aliterNodes;
        public final int line;

        public Context(SiStm node) {
            this.condition = node.condition;
            this.bodySi = node.bodySi;
            this.aliterNodes = node.aliterNodes;
            this.line = node.line;
        }
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(new Context(this));
    }
}
