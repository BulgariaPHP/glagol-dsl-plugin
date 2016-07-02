package com.glagol;

import com.glagol.psi.GlagolTypes;
import com.intellij.lang.BracePair;
import com.intellij.lang.PairedBraceMatcher;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class GlagolBraceMatcher implements PairedBraceMatcher {

    private static final BracePair[] PAIRS = new BracePair[]{
            new BracePair(GlagolTypes.G_LEFT_BRACE, GlagolTypes.G_RIGHT_BRACE, false),
            new BracePair(GlagolTypes.G_LEFT_BRACKET, GlagolTypes.G_RIGHT_BRACKET, false),
            new BracePair(GlagolTypes.G_LEFT_PAREN, GlagolTypes.G_RIGHT_PAREN, false)
    };

    @Override
    public BracePair[] getPairs() {
        return PAIRS;
    }

    @Override
    public boolean isPairedBracesAllowedBeforeType(@NotNull IElementType iElementType, @Nullable IElementType iElementType1) {
        return true;
    }

    @Override
    public int getCodeConstructStart(PsiFile psiFile, int i) {
        return i;
    }
}
