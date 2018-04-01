package com.glagol;

import com.glagol.parser.GlagolParser;
import com.glagol.psi.GlagolFile;
import com.glagol.psi.GlagolType;
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
            GlagolTypes.G_KW_ALIAS, GlagolTypes.G_KW_ENTITY, GlagolTypes.G_KW_SELFIE,
            GlagolTypes.G_KW_IMPORT, GlagolTypes.G_KW_NS, GlagolTypes.G_KW_PRIMARY,
            GlagolTypes.G_KW_REL, GlagolTypes.G_KW_GET, GlagolTypes.G_KW_VALUE,
            GlagolTypes.G_BOOLEAN, GlagolTypes.G_KW_REPOSITORY, GlagolTypes.G_KW_NEW,
            GlagolTypes.G_KW_WHEN, GlagolTypes.G_KW_THIS, GlagolTypes.G_KW_IF, GlagolTypes.G_KW_ELSE,
            GlagolTypes.G_KW_FOR, GlagolTypes.G_KW_RETURN, GlagolTypes.G_KW_PERSIST,
            GlagolTypes.G_KW_FLUSH, GlagolTypes.G_KW_REMOVE, GlagolTypes.G_KW_BREAK,
            GlagolTypes.G_KW_CONTINUE, GlagolTypes.G_KW_PUBLIC, GlagolTypes.G_KW_PRIVATE,
            GlagolTypes.G_TYPE_VOID, GlagolTypes.G_KW_REST, GlagolTypes.G_KW_JSON_API,
            GlagolTypes.G_KW_CONTROLLER, GlagolTypes.G_KW_UTIL, GlagolTypes.G_KW_SERVICE,
            GlagolTypes.G_KW_SELECT, GlagolTypes.G_KW_FROM, GlagolTypes.G_KW_WHERE, GlagolTypes.G_KW_ORDER,
            GlagolTypes.G_KW_BY, GlagolTypes.G_KW_LIMIT, GlagolTypes.G_KW_OFFSET, GlagolTypes.G_KW_AND,
            GlagolTypes.G_KW_OR, GlagolTypes.G_KW_IS, GlagolTypes.G_KW_NOT, GlagolTypes.G_KW_NULL, GlagolTypes.G_KW_ASC,
            GlagolTypes.G_KW_DESC, GlagolTypes.G_KW_PROXY, GlagolTypes.G_KW_REQUIRE
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