package com.glagol.annotator.color;

import com.glagol.psi.NamedElement;
import com.glagol.psi.impl.GlagolPsiElement;
import com.intellij.ide.highlighter.JavaHighlightingColors;
import com.intellij.lang.annotation.Annotation;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

public class VariableColorizer implements Annotator {
    @Override
    public void annotate(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        if (isVariableElement(psiElement)) {
            TextRange textRange = ((NamedElement) psiElement).getId().getTextRange();
            Annotation colorAnnotation = annotationHolder.createInfoAnnotation(
                    new TextRange(textRange.getStartOffset(), textRange.getEndOffset()), null);
            colorAnnotation.setTextAttributes(JavaHighlightingColors.INSTANCE_FIELD_ATTRIBUTES);
        }
    }

    private boolean isVariableElement(@NotNull PsiElement psiElement) {
        return psiElement instanceof GlagolPsiElement && ((GlagolPsiElement) psiElement).isVariable();
    }
}
