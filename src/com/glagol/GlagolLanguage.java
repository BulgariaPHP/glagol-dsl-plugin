package com.glagol;

import com.intellij.lang.Language;

public class GlagolLanguage extends Language {
    public static final GlagolLanguage INSTANCE = new GlagolLanguage();

    private GlagolLanguage() {
        super("glagol");
    }
}