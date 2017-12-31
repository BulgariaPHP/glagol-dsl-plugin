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

public class GlagolDeclEntityImpl extends GlagolPsiElement implements GlagolDeclEntity {

  public GlagolDeclEntityImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GlagolVisitor visitor) {
    visitor.visitDeclEntity(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GlagolVisitor) accept((GlagolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<GlagolMember> getMemberList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GlagolMember.class);
  }

  @Override
  @NotNull
  public PsiElement getKwEntity() {
    return findNotNullChildByType(G_KW_ENTITY);
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

  @Override
  @NotNull
  public PsiElement getSymbolName() {
    return findNotNullChildByType(G_SYMBOL_NAME);
  }

}
