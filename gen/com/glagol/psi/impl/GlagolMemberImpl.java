// This is a generated file. Not intended for manual editing.
package com.glagol.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.glagol.psi.GlagolTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.glagol.psi.*;

public class GlagolMemberImpl extends ASTWrapperPsiElement implements GlagolMember {

  public GlagolMemberImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GlagolVisitor visitor) {
    visitor.visitMember(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GlagolVisitor) accept((GlagolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public GlagolAction getAction() {
    return findChildByClass(GlagolAction.class);
  }

  @Override
  @NotNull
  public List<GlagolAnnotation> getAnnotationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GlagolAnnotation.class);
  }

  @Override
  @Nullable
  public GlagolConstructor getConstructor() {
    return findChildByClass(GlagolConstructor.class);
  }

  @Override
  @Nullable
  public GlagolMethod getMethod() {
    return findChildByClass(GlagolMethod.class);
  }

  @Override
  @Nullable
  public GlagolProperty getProperty() {
    return findChildByClass(GlagolProperty.class);
  }

}
