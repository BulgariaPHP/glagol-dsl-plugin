// This is a generated file. Not intended for manual editing.
package com.glagol.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GlagolIfStmt extends GlagolStmt {

  @NotNull
  GlagolExpr getExpr();

  @NotNull
  List<GlagolStmt> getStmtList();

  @NotNull
  PsiElement getKwElse();

  @NotNull
  PsiElement getKwIf();

  @NotNull
  PsiElement getLeftParen();

  @NotNull
  PsiElement getRightParen();

}
