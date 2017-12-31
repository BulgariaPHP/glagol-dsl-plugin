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

public class GlagolCastExprImpl extends GlagolExprImpl implements GlagolCastExpr {

  public GlagolCastExprImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GlagolVisitor visitor) {
    visitor.visitCastExpr(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GlagolVisitor) accept((GlagolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public GlagolExpr getExpr() {
    return findChildByClass(GlagolExpr.class);
  }

  @Override
  @NotNull
  public GlagolType getType() {
    return findNotNullChildByClass(GlagolType.class);
  }

  @Override
  @NotNull
  public PsiElement getLeftParen() {
    return findNotNullChildByType(G_LEFT_PAREN);
  }

  @Override
  @NotNull
  public PsiElement getRightParen() {
    return findNotNullChildByType(G_RIGHT_PAREN);
  }

}
