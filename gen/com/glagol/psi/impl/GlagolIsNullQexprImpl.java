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

public class GlagolIsNullQexprImpl extends GlagolQexprImpl implements GlagolIsNullQexpr {

  public GlagolIsNullQexprImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GlagolVisitor visitor) {
    visitor.visitIsNullQexpr(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GlagolVisitor) accept((GlagolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public GlagolQexpr getQexpr() {
    return findNotNullChildByClass(GlagolQexpr.class);
  }

  @Override
  @NotNull
  public PsiElement getKwIs() {
    return findNotNullChildByType(G_KW_IS);
  }

  @Override
  @NotNull
  public PsiElement getKwNull() {
    return findNotNullChildByType(G_KW_NULL);
  }

}
