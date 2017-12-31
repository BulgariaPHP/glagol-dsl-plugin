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

public class GlagolFieldExprImpl extends GlagolExprImpl implements GlagolFieldExpr {

  public GlagolFieldExprImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GlagolVisitor visitor) {
    visitor.visitFieldExpr(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GlagolVisitor) accept((GlagolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public GlagolExpr getExpr() {
    return findNotNullChildByClass(GlagolExpr.class);
  }

  @Override
  @NotNull
  public PsiElement getDot() {
    return findNotNullChildByType(G_DOT);
  }

  @Override
  @NotNull
  public PsiElement getId() {
    return findNotNullChildByType(G_ID);
  }

}
