package com.glagol.psi;

import com.glagol.GlagolLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class GlagolTokenType extends IElementType {
    public GlagolTokenType(@NotNull @NonNls String debugName) {
        super(debugName, GlagolLanguage.INSTANCE);
    }
}