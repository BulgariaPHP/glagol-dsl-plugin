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

public class GlagolScalarTypeImpl extends GlagolTypeImpl implements GlagolScalarType {

  public GlagolScalarTypeImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GlagolVisitor visitor) {
    visitor.visitScalarType(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GlagolVisitor) accept((GlagolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PsiElement getTypeBool() {
    return findChildByType(G_TYPE_BOOL);
  }

  @Override
  @Nullable
  public PsiElement getTypeFloat() {
    return findChildByType(G_TYPE_FLOAT);
  }

  @Override
  @Nullable
  public PsiElement getTypeInt() {
    return findChildByType(G_TYPE_INT);
  }

  @Override
  @Nullable
  public PsiElement getTypeString() {
    return findChildByType(G_TYPE_STRING);
  }

  @Override
  @Nullable
  public PsiElement getTypeVoid() {
    return findChildByType(G_TYPE_VOID);
  }

}
