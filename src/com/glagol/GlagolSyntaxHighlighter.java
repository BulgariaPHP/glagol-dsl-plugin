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

    public static final TextAttributesKey BRACES =
            createTextAttributesKey("BRACES", DefaultLanguageHighlighterColors.BRACES);

    public static final TextAttributesKey IDENTIFIER =
            createTextAttributesKey("IDENTIFIER", DefaultLanguageHighlighterColors.IDENTIFIER);

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

    private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[]{BAD_CHARACTER};
    private static final TextAttributesKey[] KEYWORD_KEYS = new TextAttributesKey[]{KEYWORD};
    private static final TextAttributesKey[] IDENTIFIER_KEYS = new TextAttributesKey[]{IDENTIFIER};
    private static final TextAttributesKey[] SEMICOLON_KEYS = new TextAttributesKey[]{SEMICOLON};
    private static final TextAttributesKey[] STRING_KEYS = new TextAttributesKey[]{STRING};
    private static final TextAttributesKey[] NUMBER_KEYS = new TextAttributesKey[]{NUMBER};
    private static final TextAttributesKey[] OPERATION_SIGN_KEYS = new TextAttributesKey[]{OPERATION_SIGN};
    private static final TextAttributesKey[] BRACES_KEYS = new TextAttributesKey[]{BRACES};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

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
            tokenType.equals(GlagolTypes.TYPE_BOOL) ||
            tokenType.equals(GlagolTypes.TYPE_FLOAT) ||
            tokenType.equals(GlagolTypes.TYPE_INT) ||
            tokenType.equals(GlagolTypes.TYPE_STRING) ||
            tokenType.equals(GlagolTypes.BOOLEAN) ||
            tokenType.equals(GlagolTypes.DECL_MODULE)) {
            return KEYWORD_KEYS;
        } else if (tokenType.equals(GlagolTypes.LEFT_BRACE) || tokenType.equals(GlagolTypes.RIGHT_BRACE)) {
            return BRACES_KEYS;
        } else if (tokenType.equals(GlagolTypes.ID)) {
            return IDENTIFIER_KEYS;
        } else if (tokenType.equals(GlagolTypes.SEMICOLON)) {
            return SEMICOLON_KEYS;
        } else if (tokenType.equals(GlagolTypes.STRING)) {
            return STRING_KEYS;
        } else if (tokenType.equals(GlagolTypes.NUMBER) || tokenType.equals(GlagolTypes.INT)) {
            return NUMBER_KEYS;
        } else if (tokenType.equals(GlagolTypes.OP_EQ)) {
            return OPERATION_SIGN_KEYS;
        } else if (tokenType.equals(TokenType.BAD_CHARACTER)) {
            return BAD_CHAR_KEYS;
        } else {
            return EMPTY_KEYS;
        }
    }
}