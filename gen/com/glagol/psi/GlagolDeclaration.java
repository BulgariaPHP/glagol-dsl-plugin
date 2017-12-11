// This is a generated file. Not intended for manual editing.
package com.glagol.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GlagolDeclaration extends PsiElement {

  @NotNull
  List<GlagolAnnotation> getAnnotationList();

  @Nullable
  GlagolDeclController getDeclController();

  @Nullable
  GlagolDeclEntity getDeclEntity();

  @Nullable
  GlagolDeclRepo getDeclRepo();

  @Nullable
  GlagolDeclUtil getDeclUtil();

  @Nullable
  GlagolDeclValue getDeclValue();

}
