// This is a generated file. Not intended for manual editing.
package com.glagol.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GlagolQueryStatement extends PsiElement {

  @NotNull
  List<GlagolQexpr> getQexprList();

  @NotNull
  List<GlagolQueryField> getQueryFieldList();

  @NotNull
  GlagolQuerySpec getQuerySpec();

  @Nullable
  PsiElement getComma();

  @Nullable
  PsiElement getKwAlias();

  @Nullable
  PsiElement getKwBy();

  @NotNull
  PsiElement getKwFrom();

  @Nullable
  PsiElement getKwLimit();

  @Nullable
  PsiElement getKwOffset();

  @Nullable
  PsiElement getKwOrder();

  @NotNull
  PsiElement getKwSelect();

  @Nullable
  PsiElement getKwWhere();

  @NotNull
  PsiElement getSymbolName();

  @NotNull
  PsiElement getId();

}
