// This is a generated file. Not intended for manual editing.
package com.glagol.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GlagolAnnotation extends PsiElement {

  @Nullable
  GlagolLiteral getLiteral();

  @NotNull
  PsiElement getAt();

  @Nullable
  PsiElement getLeftBracket();

  @Nullable
  PsiElement getLeftParen();

  @Nullable
  PsiElement getOpEq();

  @Nullable
  PsiElement getRightBracket();

  @Nullable
  PsiElement getRightParen();

  @NotNull
  PsiElement getId();

  @NotNull
  String getName();

  @NotNull
  boolean isAnnotation();

}
