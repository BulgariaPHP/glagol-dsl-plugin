// This is a generated file. Not intended for manual editing.
package com.glagol.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GlagolMember extends PsiElement {

  @Nullable
  GlagolAction getAction();

  @NotNull
  List<GlagolAnnotation> getAnnotationList();

  @Nullable
  GlagolConstructor getConstructor();

  @Nullable
  GlagolMethod getMethod();

  @Nullable
  GlagolProperty getProperty();

}
