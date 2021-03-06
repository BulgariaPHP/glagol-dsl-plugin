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

public class GlagolLiteralImpl extends GlagolPsiElement implements GlagolLiteral {

  public GlagolLiteralImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GlagolVisitor visitor) {
    visitor.visitLiteral(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GlagolVisitor) accept((GlagolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PsiElement getBoolean() {
    return findChildByType(G_BOOLEAN);
  }

  @Override
  @Nullable
  public PsiElement getDecimal() {
    return findChildByType(G_DECIMAL);
  }

  @Override
  @Nullable
  public PsiElement getInt() {
    return findChildByType(G_INT);
  }

  @Override
  @Nullable
  public PsiElement getString() {
    return findChildByType(G_STRING);
  }

}
