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

public class GlagolDeclUtilImpl extends GlagolPsiElement implements GlagolDeclUtil {

  public GlagolDeclUtilImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GlagolVisitor visitor) {
    visitor.visitDeclUtil(this);
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
  @Nullable
  public PsiElement getKwService() {
    return findChildByType(G_KW_SERVICE);
  }

  @Override
  @Nullable
  public PsiElement getKwUtil() {
    return findChildByType(G_KW_UTIL);
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
