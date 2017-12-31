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

public class GlagolNewImpl extends GlagolPsiElement implements GlagolNew {

  public GlagolNewImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GlagolVisitor visitor) {
    visitor.visitNew(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GlagolVisitor) accept((GlagolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public GlagolArtifactType getArtifactType() {
    return findNotNullChildByClass(GlagolArtifactType.class);
  }

  @Override
  @Nullable
  public GlagolDvSequence getDvSequence() {
    return findChildByClass(GlagolDvSequence.class);
  }

  @Override
  @NotNull
  public PsiElement getKwNew() {
    return findNotNullChildByType(G_KW_NEW);
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
