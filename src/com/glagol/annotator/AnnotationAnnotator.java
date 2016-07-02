package com.glagol.annotator;

import com.glagol.psi.GlagolAnno;
import com.glagol.psi.GlagolVar;
import com.intellij.lang.annotation.Annotation;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

public class AnnotationAnnotator implements Annotator {
    @Override
    public void annotate(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        if (psiElement instanceof GlagolAnno) {
            
            Annotation annotation = annotationHolder.createInfoAnnotation(psiElement.getTextRange(), null);
            annotation.setTextAttributes(DefaultLanguageHighlighterColors.DOC_COMMENT);
        }
    }
}
