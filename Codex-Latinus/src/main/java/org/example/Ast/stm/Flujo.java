package org.example.Ast.stm;

import org.example.Ast.ASTNode;
import org.example.Ast.AbstractNode;
import org.example.visitor.Visitor;

import java.util.List;

public class Flujo extends AbstractNode {
    private final List<ASTNode> varsGlb;
    private final List<ASTNode> funcs;
    private final List<ASTNode> main;

    public Flujo(List<ASTNode> varsGlb, List<ASTNode> funcs, List<ASTNode> main, int line) {
        super(line);
        this.varsGlb = varsGlb;
        this.funcs = funcs;
        this.main = main;
    }

    public static class Context{
        public final List<ASTNode> varsGlb;
        public final List<ASTNode> funcs;
        public final List<ASTNode> main;

        public Context(Flujo node) {
            this.varsGlb = node.varsGlb;
            this.funcs = node.funcs;
            this.main = node.main;
        }
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(new Context(this));
    }

}
