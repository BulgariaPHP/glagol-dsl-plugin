// This is a generated file. Not intended for manual editing.
package com.glagol.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GlagolForeachStmt extends GlagolStmt {

  @NotNull
  List<GlagolExpr> getExprList();

  @NotNull
  GlagolStmt getStmt();

  @NotNull
  PsiElement getColon();

  @NotNull
  PsiElement getKwAlias();

  @NotNull
  PsiElement getKwFor();

  @NotNull
  PsiElement getLeftParen();

  @NotNull
  PsiElement getRightParen();

}
