// This is a generated file. Not intended for manual editing.
package com.glagol.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.glagol.psi.GlagolTypes.*;
import com.glagol.psi.*;

public class GlagolPropertyImpl extends GlagolPsiElement implements GlagolProperty {

  public GlagolPropertyImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GlagolVisitor visitor) {
    visitor.visitProperty(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GlagolVisitor) accept((GlagolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public GlagolPropertyDefaultValue getPropertyDefaultValue() {
    return findChildByClass(GlagolPropertyDefaultValue.class);
  }

  @Override
  @NotNull
  public GlagolType getType() {
    return findNotNullChildByClass(GlagolType.class);
  }

  @Override
  @Nullable
  public PsiElement getOpEq() {
    return findChildByType(G_OP_EQ);
  }

  @Override
  @NotNull
  public PsiElement getSemicolon() {
    return findNotNullChildByType(G_SEMICOLON);
  }

  @Override
  @NotNull
  public PsiElement getId() {
    return findNotNullChildByType(G_ID);
  }

}
