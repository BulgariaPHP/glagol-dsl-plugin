package com.glagol;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.*;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import com.glagol.psi.GlagolTypes;
import org.jetbrains.annotations.NotNull;
import java.util.HashMap;
import java.util.Map;

import static com.intellij.openapi.editor.DefaultLanguageHighlighterColors.*;

public class GlagolSyntaxHighlighter extends SyntaxHighlighterBase {
    private static final Map<IElementType, TextAttributesKey> ATTRIBUTES = new HashMap<IElementType, TextAttributesKey>();

    static {
        fillMap(ATTRIBUTES, LINE_COMMENT, GlagolTypes.G_LINE_COMMENT);
        fillMap(ATTRIBUTES, BLOCK_COMMENT, GlagolTypes.G_BLOCK_COMMENT);
        fillMap(ATTRIBUTES, PARENTHESES, GlagolTypes.G_LEFT_PAREN, GlagolTypes.G_RIGHT_PAREN);
        fillMap(ATTRIBUTES, BRACES, GlagolTypes.G_LEFT_BRACE, GlagolTypes.G_RIGHT_BRACE);
        fillMap(ATTRIBUTES, BRACKETS, GlagolTypes.G_LEFT_BRACKET, GlagolTypes.G_RIGHT_BRACKET);
        fillMap(ATTRIBUTES, HighlighterColors.BAD_CHARACTER, TokenType.BAD_CHARACTER);
        fillMap(ATTRIBUTES, IDENTIFIER, GlagolTypes.G_ID);
        fillMap(ATTRIBUTES, COMMA, GlagolTypes.G_COLON, GlagolTypes.G_COMMA);
        fillMap(ATTRIBUTES, SEMICOLON, GlagolTypes.G_SEMICOLON);
        fillMap(ATTRIBUTES, COMMA, GlagolTypes.G_COMMA);
        fillMap(ATTRIBUTES, METADATA, GlagolTypes.G_ACCESS_OPTION, GlagolTypes.G_REL_DIR);
        fillMap(ATTRIBUTES, GlagolParserDefinition.KEYWORDS, KEYWORD);
        fillMap(ATTRIBUTES, GlagolParserDefinition.DATA_TYPES, KEYWORD);
        fillMap(ATTRIBUTES, GlagolParserDefinition.OPERATORS, OPERATION_SIGN);
        fillMap(ATTRIBUTES, GlagolParserDefinition.NUMBERS, NUMBER);
        fillMap(ATTRIBUTES, STRING, GlagolTypes.G_STRING);
        fillMap(ATTRIBUTES, IDENTIFIER, GlagolTypes.G_ARTIFACT_ID);
        fillMap(ATTRIBUTES, IDENTIFIER, GlagolTypes.G_ARTIFACT_ID);
    }

    @NotNull
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        return pack(ATTRIBUTES.get(tokenType));
    }

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new GlagolFlexAdapter();
    }
}