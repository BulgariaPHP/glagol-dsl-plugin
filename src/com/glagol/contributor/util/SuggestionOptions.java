package com.glagol.contributor.util;

public class SuggestionOptions {
    private String suffix;
    private int offsetMove = 0;

    public SuggestionOptions(String suffix, int offsetMove) {
        this.suffix = suffix;
        this.offsetMove = offsetMove;
    }

    public String getSuffix() {
        return suffix;
    }

    public int getOffsetMove() {
        return offsetMove;
    }
}
