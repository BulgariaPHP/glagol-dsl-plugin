// This is a generated file. Not intended for manual editing.
package com.glagol.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GlagolDeclUtil extends PsiElement {

  @NotNull
  List<GlagolMember> getMemberList();

  @Nullable
  PsiElement getKwService();

  @Nullable
  PsiElement getKwUtil();

  @NotNull
  PsiElement getLeftBrace();

  @NotNull
  PsiElement getRightBrace();

  @NotNull
  PsiElement getSymbolName();

}
