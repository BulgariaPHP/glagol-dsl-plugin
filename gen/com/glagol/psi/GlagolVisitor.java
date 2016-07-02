// This is a generated file. Not intended for manual editing.
package com.glagol.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class GlagolVisitor extends PsiElementVisitor {

  public void visitAnno(@NotNull GlagolAnno o) {
    visitPsiElement(o);
  }

  public void visitAnnotation(@NotNull GlagolAnnotation o) {
    visitPsiElement(o);
  }

  public void visitDeclType(@NotNull GlagolDeclType o) {
    visitPsiElement(o);
  }

  public void visitDeclaration(@NotNull GlagolDeclaration o) {
    visitPsiElement(o);
  }

  public void visitMember(@NotNull GlagolMember o) {
    visitPsiElement(o);
  }

  public void visitMemberValue(@NotNull GlagolMemberValue o) {
    visitPsiElement(o);
  }

  public void visitVar(@NotNull GlagolVar o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
