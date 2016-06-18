package com.glagol.psi;

import com.glagol.GlagolLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class GlagolElementType extends IElementType {
    public GlagolElementType(@NotNull @NonNls String debugName) {
        super(debugName, GlagolLanguage.INSTANCE);
    }
}