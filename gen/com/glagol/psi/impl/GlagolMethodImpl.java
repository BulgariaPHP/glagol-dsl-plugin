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

public class GlagolMethodImpl extends GlagolPsiElement implements GlagolMethod {

  public GlagolMethodImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GlagolVisitor visitor) {
    visitor.visitMethod(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GlagolVisitor) accept((GlagolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<GlagolAnnotation> getAnnotationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GlagolAnnotation.class);
  }

  @Override
  @Nullable
  public GlagolBlockStmt getBlockStmt() {
    return findChildByClass(GlagolBlockStmt.class);
  }

  @Override
  @NotNull
  public List<GlagolDefaultValue> getDefaultValueList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GlagolDefaultValue.class);
  }

  @Override
  @NotNull
  public List<GlagolExpr> getExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GlagolExpr.class);
  }

  @Override
  @NotNull
  public List<GlagolType> getTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GlagolType.class);
  }

  @Override
  @Nullable
  public PsiElement getKwPrivate() {
    return findChildByType(G_KW_PRIVATE);
  }

  @Override
  @Nullable
  public PsiElement getKwPublic() {
    return findChildByType(G_KW_PUBLIC);
  }

  @Override
  @Nullable
  public PsiElement getKwWhen() {
    return findChildByType(G_KW_WHEN);
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

  @Override
  @Nullable
  public PsiElement getSemicolon() {
    return findChildByType(G_SEMICOLON);
  }

}
