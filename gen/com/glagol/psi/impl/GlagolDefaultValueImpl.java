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

public class GlagolDefaultValueImpl extends GlagolPsiElement implements GlagolDefaultValue {

  public GlagolDefaultValueImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GlagolVisitor visitor) {
    visitor.visitDefaultValue(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GlagolVisitor) accept((GlagolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public GlagolDvList getDvList() {
    return findChildByClass(GlagolDvList.class);
  }

  @Override
  @Nullable
  public GlagolDvMap getDvMap() {
    return findChildByClass(GlagolDvMap.class);
  }

  @Override
  @Nullable
  public GlagolGet getGet() {
    return findChildByClass(GlagolGet.class);
  }

  @Override
  @Nullable
  public GlagolLiteral getLiteral() {
    return findChildByClass(GlagolLiteral.class);
  }

  @Override
  @Nullable
  public GlagolNew getNew() {
    return findChildByClass(GlagolNew.class);
  }

}
