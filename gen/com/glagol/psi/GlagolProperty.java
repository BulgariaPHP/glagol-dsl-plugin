// This is a generated file. Not intended for manual editing.
package com.glagol.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GlagolProperty extends PsiElement {

  @Nullable
  GlagolPropertyDefaultValue getPropertyDefaultValue();

  @NotNull
  GlagolType getType();

  @Nullable
  PsiElement getOpEq();

  @NotNull
  PsiElement getSemicolon();

  @NotNull
  PsiElement getId();

}
