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

public class GlagolForeachStmtImpl extends GlagolStmtImpl implements GlagolForeachStmt {

  public GlagolForeachStmtImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GlagolVisitor visitor) {
    visitor.visitForeachStmt(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GlagolVisitor) accept((GlagolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<GlagolExpr> getExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GlagolExpr.class);
  }

  @Override
  @NotNull
  public GlagolStmt getStmt() {
    return findNotNullChildByClass(GlagolStmt.class);
  }

}
