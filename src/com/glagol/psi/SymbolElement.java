package com.glagol.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

public interface SymbolElement extends PsiElement {
    @NotNull
    PsiElement getSymbolName();
}
