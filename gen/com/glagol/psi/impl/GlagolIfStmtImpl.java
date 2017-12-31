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

public class GlagolIfStmtImpl extends GlagolStmtImpl implements GlagolIfStmt {

  public GlagolIfStmtImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GlagolVisitor visitor) {
    visitor.visitIfStmt(this);
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
  public List<GlagolStmt> getStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GlagolStmt.class);
  }

  @Override
  @NotNull
  public PsiElement getKwElse() {
    return findNotNullChildByType(G_KW_ELSE);
  }

  @Override
  @NotNull
  public PsiElement getKwIf() {
    return findNotNullChildByType(G_KW_IF);
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
