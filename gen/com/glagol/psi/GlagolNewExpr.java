// This is a generated file. Not intended for manual editing.
package com.glagol.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GlagolNewExpr extends GlagolExpr {

  @Nullable
  GlagolExpr getExpr();

  @NotNull
  PsiElement getKwNew();

  @NotNull
  PsiElement getLeftParen();

  @NotNull
  PsiElement getRightParen();

  @NotNull
  PsiElement getSymbolName();

}
