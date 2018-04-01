package com.glagol.psi.impl;

import com.glagol.psi.*;
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

    @NotNull
    public static boolean isVariable(@NotNull GlagolProperty element) {
        return true;
    }

    public static boolean isVariable(@NotNull GlagolVariableExpr element) {
        return true;
    }

    public static boolean isVariable(@NotNull GlagolFieldExpr element) {
        return true;
    }

    public static boolean isVariable(@NotNull GlagolParameter element) {
        return true;
    }

    public static boolean isMethod(@NotNull GlagolMethod element) {
        return true;
    }

    public static boolean isMethod(@NotNull GlagolInvokeFinalExpr element) {
        return true;
    }

    public static boolean isMethod(@NotNull GlagolProxyMethod element) {
        return true;
    }

    public static boolean isMethod(@NotNull GlagolAction element) {
        return true;
    }

    public static boolean isConstructor(@NotNull GlagolConstructor element) {
        return true;
    }

    public static boolean isConstructor(@NotNull GlagolProxyConstructor element) {
        return true;
    }
}
