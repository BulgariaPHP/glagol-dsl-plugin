package com.glagol.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

public class GlagolPsiElement extends ASTWrapperPsiElement {
    public GlagolPsiElement(@NotNull ASTNode node) {
        super(node);
    }

    public boolean isAnnotation()
    {
        return false;
    }
}
