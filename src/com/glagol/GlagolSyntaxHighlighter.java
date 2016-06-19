package com.glagol;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.*;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import com.glagol.psi.GlagolTypes;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class GlagolSyntaxHighlighter extends SyntaxHighlighterBase {

    public static final TextAttributesKey KEYWORD =
            createTextAttributesKey("KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);

    public static final TextAttributesKey ANNO_MARKUP =
            createTextAttributesKey("ANNO_MARKUP", DefaultLanguageHighlighterColors.DOC_COMMENT_MARKUP);

    public static final TextAttributesKey ANNO_TAG =
            createTextAttributesKey("ANNO_TAG", DefaultLanguageHighlighterColors.DOC_COMMENT_MARKUP);

    public static final TextAttributesKey BRACES =
            createTextAttributesKey("BRACES", DefaultLanguageHighlighterColors.BRACES);

    public static final TextAttributesKey IDENTIFIER =
            createTextAttributesKey("IDENTIFIER", DefaultLanguageHighlighterColors.IDENTIFIER);

    public static final TextAttributesKey REL_DIR =
            createTextAttributesKey("REL_DIR", DefaultLanguageHighlighterColors.DOC_COMMENT_TAG_VALUE);

    public static final TextAttributesKey SEMICOLON =
            createTextAttributesKey("SEMICOLON", DefaultLanguageHighlighterColors.SEMICOLON);

    public static final TextAttributesKey STRING =
            createTextAttributesKey("G_STRING", DefaultLanguageHighlighterColors.STRING);

    public static final TextAttributesKey NUMBER =
            createTextAttributesKey("G_NUMBER", DefaultLanguageHighlighterColors.NUMBER);

    public static final TextAttributesKey OPERATION_SIGN =
            createTextAttributesKey("G_OPERATION_SIGN", DefaultLanguageHighlighterColors.OPERATION_SIGN);

    public static final TextAttributesKey BAD_CHARACTER =
            createTextAttributesKey("G_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new GlagolFlexAdapter();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(GlagolTypes.DECL_ENTITY) ||
            tokenType.equals(GlagolTypes.DECL_VALUE) ||
            tokenType.equals(GlagolTypes.DECL_IMPORT) ||
            tokenType.equals(GlagolTypes.DECL_IMPORT_FROM) ||
            tokenType.equals(GlagolTypes.DECL_AS) ||
            tokenType.equals(GlagolTypes.DECL_REL) ||
            tokenType.equals(GlagolTypes.DECL_WITH) ||
            tokenType.equals(GlagolTypes.TYPE_BOOL) ||
            tokenType.equals(GlagolTypes.TYPE_FLOAT) ||
            tokenType.equals(GlagolTypes.TYPE_INT) ||
            tokenType.equals(GlagolTypes.TYPE_STRING) ||
            tokenType.equals(GlagolTypes.ANNO_SPECIAL_VALUE) ||
            tokenType.equals(GlagolTypes.BOOLEAN) ||
            tokenType.equals(GlagolTypes.DECL_MODULE)) {
            return pack(KEYWORD);
        } else if (tokenType.equals(GlagolTypes.LEFT_BRACE) || tokenType.equals(GlagolTypes.RIGHT_BRACE)) {
            return pack(BRACES);
        } else if (tokenType.equals(GlagolTypes.ID)) {
            return pack(IDENTIFIER);
        } else if (tokenType.equals(GlagolTypes.SEMICOLON)) {
            return pack(SEMICOLON);
        } else if (tokenType.equals(GlagolTypes.STRING)) {
            return pack(STRING);
        } else if (tokenType.equals(GlagolTypes.NUMBER) || tokenType.equals(GlagolTypes.INT)) {
            return pack(NUMBER);
        } else if (tokenType.equals(GlagolTypes.OP_EQ)) {
            return pack(OPERATION_SIGN);
        } else if (tokenType.equals(GlagolTypes.ANNO_TABLE) ||
                    tokenType.equals(GlagolTypes.ANNO_FIELD) ||
                    tokenType.equals(GlagolTypes.ANNO_INDEX)) {
            return pack(ANNO_MARKUP);
        } else if (tokenType.equals(GlagolTypes.REL_DIR)) {
            return pack(REL_DIR);
        } else if (tokenType.equals(GlagolTypes.ANNO_TAG)) {
            return pack(ANNO_TAG);
        } else if (tokenType.equals(TokenType.BAD_CHARACTER)) {
            return pack(BAD_CHARACTER);
        } else {
            return EMPTY;
        }
    }
}