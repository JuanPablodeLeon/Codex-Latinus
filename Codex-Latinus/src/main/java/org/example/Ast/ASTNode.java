package org.example.Ast;

import org.example.visitor.Visitor;

public interface ASTNode {

    <T> T accept(Visitor<T> visitor);
    int getLinea();
}
