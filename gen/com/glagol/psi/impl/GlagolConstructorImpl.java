// This is a generated file. Not intended for manual editing.
package com.glagol.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.glagol.psi.GlagolTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.glagol.psi.*;

public class GlagolConstructorImpl extends ASTWrapperPsiElement implements GlagolConstructor {

  public GlagolConstructorImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GlagolVisitor visitor) {
    visitor.visitConstructor(this);
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
  @NotNull
  public GlagolBlockStmt getBlockStmt() {
    return findNotNullChildByClass(GlagolBlockStmt.class);
  }

  @Override
  @NotNull
  public List<GlagolDefaultValue> getDefaultValueList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GlagolDefaultValue.class);
  }

  @Override
  @Nullable
  public GlagolExpr getExpr() {
    return findChildByClass(GlagolExpr.class);
  }

  @Override
  @NotNull
  public List<GlagolType> getTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GlagolType.class);
  }

  @Override
  @NotNull
  public PsiElement getSymbolName() {
    return findNotNullChildByType(G_SYMBOL_NAME);
  }

}
