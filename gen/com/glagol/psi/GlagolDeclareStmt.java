// This is a generated file. Not intended for manual editing.
package com.glagol.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GlagolDeclareStmt extends GlagolStmt {

  @Nullable
  GlagolStmt getStmt();

  @NotNull
  GlagolType getType();

  @Nullable
  PsiElement getOpEq();

  @Nullable
  PsiElement getSemicolon();

  @NotNull
  PsiElement getId();

}
