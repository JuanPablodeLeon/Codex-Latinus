package org.example.Ast.stm;

import org.example.Ast.ASTNode;

public class StrucFieldInit {
    public final String name;
    public final ASTNode value;

    public StrucFieldInit(String name, ASTNode value) {
        this.name = name;
        this.value = value;
    }
}
