// This is a generated file. Not intended for manual editing.
package com.glagol.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GlagolAction extends PsiElement {

  @NotNull
  List<GlagolAnnotation> getAnnotationList();

  @Nullable
  GlagolBlockStmt getBlockStmt();

  @NotNull
  List<GlagolDefaultValue> getDefaultValueList();

  @Nullable
  GlagolExpr getExpr();

  @NotNull
  List<GlagolType> getTypeList();

  @Nullable
  PsiElement getLeftParen();

  @Nullable
  PsiElement getRightParen();

  @Nullable
  PsiElement getSemicolon();

}
