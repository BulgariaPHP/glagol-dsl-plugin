package com.glagol.annotator.color;

import com.glagol.psi.SymbolElement;
import com.glagol.psi.impl.GlagolPsiElement;
import com.intellij.ide.highlighter.JavaHighlightingColors;
import com.intellij.lang.annotation.Annotation;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

public class ConstructorColorizer implements Annotator {
    @Override
    public void annotate(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        if (isConstructorElement(psiElement)) {
            TextRange textRange = ((SymbolElement) psiElement).getSymbolName().getTextRange();
            Annotation colorAnnotation = annotationHolder.createInfoAnnotation(
                    new TextRange(textRange.getStartOffset(), textRange.getEndOffset()), null);
            colorAnnotation.setTextAttributes(JavaHighlightingColors.METHOD_DECLARATION_ATTRIBUTES);
        }
    }

    private boolean isConstructorElement(@NotNull PsiElement psiElement) {
        return psiElement instanceof GlagolPsiElement && ((GlagolPsiElement) psiElement).isConstructor();
    }
}
