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

public class GlagolAnnotationImpl extends GlagolPsiElement implements GlagolAnnotation {

  public GlagolAnnotationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GlagolVisitor visitor) {
    visitor.visitAnnotation(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GlagolVisitor) accept((GlagolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public GlagolLiteral getLiteral() {
    return findChildByClass(GlagolLiteral.class);
  }

  @Override
  @NotNull
  public PsiElement getAt() {
    return findNotNullChildByType(G_AT);
  }

  @Override
  @Nullable
  public PsiElement getLeftBracket() {
    return findChildByType(G_LEFT_BRACKET);
  }

  @Override
  @Nullable
  public PsiElement getLeftParen() {
    return findChildByType(G_LEFT_PAREN);
  }

  @Override
  @Nullable
  public PsiElement getOpEq() {
    return findChildByType(G_OP_EQ);
  }

  @Override
  @Nullable
  public PsiElement getRightBracket() {
    return findChildByType(G_RIGHT_BRACKET);
  }

  @Override
  @Nullable
  public PsiElement getRightParen() {
    return findChildByType(G_RIGHT_PAREN);
  }

  @Override
  @NotNull
  public PsiElement getId() {
    return findNotNullChildByType(G_ID);
  }

  @NotNull
  public String getName() {
    return GlagolPsiImplUtil.getName(this);
  }

  @NotNull
  public boolean isAnnotation() {
    return GlagolPsiImplUtil.isAnnotation(this);
  }

}
