package com.glagol;

import com.intellij.lexer.FlexAdapter;

public class GlagolLexer extends FlexAdapter {
    public GlagolLexer() {
        super(new _GlagolLexer());
    }
}
