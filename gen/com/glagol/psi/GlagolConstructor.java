// This is a generated file. Not intended for manual editing.
package com.glagol.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GlagolConstructor extends PsiElement {

  @NotNull
  List<GlagolAnnotation> getAnnotationList();

  @NotNull
  GlagolBlockStmt getBlockStmt();

  @NotNull
  List<GlagolDefaultValue> getDefaultValueList();

  @Nullable
  GlagolExpr getExpr();

  @NotNull
  List<GlagolType> getTypeList();

  @Nullable
  PsiElement getKwWhen();

  @NotNull
  PsiElement getLeftParen();

  @NotNull
  PsiElement getRightParen();

  @Nullable
  PsiElement getSemicolon();

  @NotNull
  PsiElement getSymbolName();

}
