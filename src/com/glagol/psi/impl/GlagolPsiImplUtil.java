package com.glagol.psi.impl;

import com.glagol.psi.GlagolAnnotation;
import org.jetbrains.annotations.NotNull;

public class GlagolPsiImplUtil {
    @NotNull
    public static String getName(@NotNull GlagolAnnotation element) {
        return element.getId().getText();
    }

    @NotNull
    public static boolean isAnnotation(@NotNull GlagolAnnotation element) {
        return true;
    }
}
