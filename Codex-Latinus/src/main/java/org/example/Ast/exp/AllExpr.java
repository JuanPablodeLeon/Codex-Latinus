package org.example.Ast.exp;

import org.example.Ast.ASTNode;
import org.example.Ast.AbstractNode;
import org.example.visitor.Visitor;

//Agrupa y maneja a todas las expresiones
public class AllExpr extends AbstractNode {
    private final ASTNode left;
    private final String op;
    private final ASTNode right;

    public AllExpr(ASTNode left, String op, ASTNode right, int line) {
        super(line);
        this.left = left;
        this.op = op;
        this.right = right;
    }

    public static class Context{
        public final ASTNode left;
        public final String op;
        public final ASTNode right;

        public Context(AllExpr node) {
            this.left = node.left;
            this.op = node.op;
            this.right = node.right;
        }
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(new Context(this));
    }
}
