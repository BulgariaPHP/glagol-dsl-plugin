// This is a generated file. Not intended for manual editing.
package com.glagol.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GlagolMethod extends PsiElement {

  @NotNull
  List<GlagolAnnotation> getAnnotationList();

  @Nullable
  GlagolBlockStmt getBlockStmt();

  @NotNull
  List<GlagolDefaultValue> getDefaultValueList();

  @NotNull
  List<GlagolExpr> getExprList();

  @NotNull
  List<GlagolType> getTypeList();

}
