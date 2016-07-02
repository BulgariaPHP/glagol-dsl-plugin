package com.glagol;

import com.glagol.parser.GlagolParser;
import com.glagol.psi.GlagolFile;
import com.glagol.psi.GlagolTypes;
import com.intellij.lang.ASTNode;
import com.intellij.lang.Language;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import org.jetbrains.annotations.NotNull;

public class GlagolParserDefinition implements ParserDefinition {
    public static final TokenSet WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE);
    public static final TokenSet COMMENTS = TokenSet.create(GlagolTypes.G_LINE_COMMENT, GlagolTypes.G_BLOCK_COMMENT);
    public static final TokenSet KEYWORDS = TokenSet.create(
            GlagolTypes.G_KW_ALIAS, GlagolTypes.G_KW_ENTITY, GlagolTypes.G_KW_FROM,
            GlagolTypes.G_KW_IMPORT, GlagolTypes.G_KW_MODULE, GlagolTypes.G_KW_PRIMARY,
            GlagolTypes.G_KW_REL, GlagolTypes.G_KW_WITH, GlagolTypes.G_KW_VALUE,
            GlagolTypes.G_BOOLEAN
    );

    public static final TokenSet OPERATORS = TokenSet.create(
            GlagolTypes.G_OP_EQ
    );

    public static final TokenSet NUMBERS = TokenSet.create(
            GlagolTypes.G_DECIMAL, GlagolTypes.G_INT
    );

    public static final TokenSet DATA_TYPES = TokenSet.create(
            GlagolTypes.G_TYPE_BOOL, GlagolTypes.G_TYPE_FLOAT,
            GlagolTypes.G_TYPE_INT, GlagolTypes.G_TYPE_STRING
    );

    public static final IFileElementType FILE =
            new IFileElementType(Language.findInstance(GlagolLanguage.class));

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new GlagolFlexAdapter();
    }

    @NotNull
    public TokenSet getWhitespaceTokens() {
        return WHITE_SPACES;
    }

    @NotNull
    public TokenSet getCommentTokens() {
        return COMMENTS;
    }

    @NotNull
    public TokenSet getStringLiteralElements() {
        return TokenSet.EMPTY;
    }

    @NotNull
    public PsiParser createParser(final Project project) {
        return new GlagolParser();
    }

    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    public PsiFile createFile(FileViewProvider viewProvider) {
        return new GlagolFile(viewProvider);
    }

    public SpaceRequirements spaceExistanceTypeBetweenTokens(ASTNode left, ASTNode right) {
        return SpaceRequirements.MAY;
    }

    @NotNull
    public PsiElement createElement(ASTNode node) {
        return GlagolTypes.Factory.createElement(node);
    }
}