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

public class GlagolReturnStmtImpl extends GlagolStmtImpl implements GlagolReturnStmt {

  public GlagolReturnStmtImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GlagolVisitor visitor) {
    visitor.visitReturnStmt(this);
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
  public PsiElement getKwReturn() {
    return findNotNullChildByType(G_KW_RETURN);
  }

  @Override
  @NotNull
  public PsiElement getSemicolon() {
    return findNotNullChildByType(G_SEMICOLON);
  }

}
