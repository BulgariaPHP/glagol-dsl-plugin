package com.glagol.annotator.color;

import com.glagol.psi.GlagolAnnotation;
import com.glagol.psi.impl.GlagolPsiElement;
import com.intellij.lang.annotation.Annotation;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

public class AnnotationColorizer implements Annotator {
    @Override
    public void annotate(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        if (isAnnotationElement(psiElement)) {
            TextRange textRange = ((GlagolAnnotation) psiElement).getId().getTextRange();
            Annotation colorAnnotation = annotationHolder.createInfoAnnotation(
                    new TextRange(textRange.getStartOffset() - 1, textRange.getEndOffset()), null);
            colorAnnotation.setTextAttributes(DefaultLanguageHighlighterColors.DOC_COMMENT);
        }
    }

    private boolean isAnnotationElement(@NotNull PsiElement psiElement) {
        return psiElement instanceof GlagolPsiElement && ((GlagolPsiElement) psiElement).isAnnotation();
    }
}
