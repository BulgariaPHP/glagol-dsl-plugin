package com.glagol.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

public interface NamedElement extends PsiElement {
    @NotNull
    PsiElement getId();
}
