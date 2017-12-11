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

public class GlagolDeclarationImpl extends ASTWrapperPsiElement implements GlagolDeclaration {

  public GlagolDeclarationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GlagolVisitor visitor) {
    visitor.visitDeclaration(this);
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
  @Nullable
  public GlagolDeclController getDeclController() {
    return findChildByClass(GlagolDeclController.class);
  }

  @Override
  @Nullable
  public GlagolDeclEntity getDeclEntity() {
    return findChildByClass(GlagolDeclEntity.class);
  }

  @Override
  @Nullable
  public GlagolDeclRepo getDeclRepo() {
    return findChildByClass(GlagolDeclRepo.class);
  }

  @Override
  @Nullable
  public GlagolDeclUtil getDeclUtil() {
    return findChildByClass(GlagolDeclUtil.class);
  }

  @Override
  @Nullable
  public GlagolDeclValue getDeclValue() {
    return findChildByClass(GlagolDeclValue.class);
  }

}
