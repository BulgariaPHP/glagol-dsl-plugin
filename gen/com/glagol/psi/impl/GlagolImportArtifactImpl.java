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

public class GlagolImportArtifactImpl extends ASTWrapperPsiElement implements GlagolImportArtifact {

  public GlagolImportArtifactImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GlagolVisitor visitor) {
    visitor.visitImportArtifact(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GlagolVisitor) accept((GlagolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public GlagolQualifiedName getQualifiedName() {
    return findNotNullChildByClass(GlagolQualifiedName.class);
  }

  @Override
  @Nullable
  public PsiElement getSymbolName() {
    return findChildByType(G_SYMBOL_NAME);
  }

}
