// This is a generated file. Not intended for manual editing.
package com.glagol.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GlagolConcatExpr extends GlagolExpr {

  @NotNull
  List<GlagolExpr> getExprList();

  @NotNull
  PsiElement getConcat();

}
