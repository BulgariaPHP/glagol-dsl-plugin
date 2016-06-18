package com.glagol;

import com.intellij.lexer.FlexAdapter;
import java.io.Reader;

public class GlagolFlexAdapter extends FlexAdapter {
    public GlagolFlexAdapter() {
        super(new _GlagolLexer((Reader) null));
    }
}