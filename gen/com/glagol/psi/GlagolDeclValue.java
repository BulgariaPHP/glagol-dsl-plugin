// This is a generated file. Not intended for manual editing.
package com.glagol.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GlagolDeclValue extends PsiElement {

  @NotNull
  List<GlagolMember> getMemberList();

  @NotNull
  PsiElement getKwValue();

  @NotNull
  PsiElement getLeftBrace();

  @NotNull
  PsiElement getRightBrace();

  @NotNull
  PsiElement getSymbolName();

}
