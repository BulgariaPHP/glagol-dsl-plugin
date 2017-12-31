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

public class GlagolQueryStatementImpl extends GlagolPsiElement implements GlagolQueryStatement {

  public GlagolQueryStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GlagolVisitor visitor) {
    visitor.visitQueryStatement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GlagolVisitor) accept((GlagolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<GlagolQexpr> getQexprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GlagolQexpr.class);
  }

  @Override
  @NotNull
  public List<GlagolQueryField> getQueryFieldList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GlagolQueryField.class);
  }

  @Override
  @NotNull
  public GlagolQuerySpec getQuerySpec() {
    return findNotNullChildByClass(GlagolQuerySpec.class);
  }

  @Override
  @Nullable
  public PsiElement getComma() {
    return findChildByType(G_COMMA);
  }

  @Override
  @Nullable
  public PsiElement getKwAlias() {
    return findChildByType(G_KW_ALIAS);
  }

  @Override
  @Nullable
  public PsiElement getKwBy() {
    return findChildByType(G_KW_BY);
  }

  @Override
  @NotNull
  public PsiElement getKwFrom() {
    return findNotNullChildByType(G_KW_FROM);
  }

  @Override
  @Nullable
  public PsiElement getKwLimit() {
    return findChildByType(G_KW_LIMIT);
  }

  @Override
  @Nullable
  public PsiElement getKwOffset() {
    return findChildByType(G_KW_OFFSET);
  }

  @Override
  @Nullable
  public PsiElement getKwOrder() {
    return findChildByType(G_KW_ORDER);
  }

  @Override
  @NotNull
  public PsiElement getKwSelect() {
    return findNotNullChildByType(G_KW_SELECT);
  }

  @Override
  @Nullable
  public PsiElement getKwWhere() {
    return findChildByType(G_KW_WHERE);
  }

  @Override
  @NotNull
  public PsiElement getSymbolName() {
    return findNotNullChildByType(G_SYMBOL_NAME);
  }

  @Override
  @NotNull
  public PsiElement getId() {
    return findNotNullChildByType(G_ID);
  }

}
