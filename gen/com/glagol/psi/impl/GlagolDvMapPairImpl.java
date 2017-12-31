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

public class GlagolDvMapPairImpl extends GlagolPsiElement implements GlagolDvMapPair {

  public GlagolDvMapPairImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GlagolVisitor visitor) {
    visitor.visitDvMapPair(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GlagolVisitor) accept((GlagolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<GlagolDefaultValue> getDefaultValueList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GlagolDefaultValue.class);
  }

  @Override
  @NotNull
  public PsiElement getColon() {
    return findNotNullChildByType(G_COLON);
  }

}
