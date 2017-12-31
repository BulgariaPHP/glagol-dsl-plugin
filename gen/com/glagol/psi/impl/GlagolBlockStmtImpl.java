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

public class GlagolBlockStmtImpl extends GlagolStmtImpl implements GlagolBlockStmt {

  public GlagolBlockStmtImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GlagolVisitor visitor) {
    visitor.visitBlockStmt(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GlagolVisitor) accept((GlagolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<GlagolStmt> getStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GlagolStmt.class);
  }

  @Override
  @NotNull
  public PsiElement getLeftBrace() {
    return findNotNullChildByType(G_LEFT_BRACE);
  }

  @Override
  @NotNull
  public PsiElement getRightBrace() {
    return findNotNullChildByType(G_RIGHT_BRACE);
  }

}
