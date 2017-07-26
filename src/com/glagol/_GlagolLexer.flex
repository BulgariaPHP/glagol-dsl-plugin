package com.glagol;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.glagol.psi.GlagolTypes.*;

%%

%{
  public _GlagolLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _GlagolLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

TYPE_BOOL=bool|boolean
INT=[0-9]+
DECIMAL=[0-9]+\.[0-9]+
SYMBOL_NAME=[A-Z][a-zA-Z_0-9]*
BOOLEAN=true|false
REL_DIR=one|many
ID=[a-z][a-zA-Z]*
STRING=('([^'\\]|\\.)*'|\"([^\"\\]|\\\"|\\'|\\)*\")
LINE_COMMENT="//".*
BLOCK_COMMENT="/"\*([^])*\*"/"

%%
<YYINITIAL> {
  {WHITE_SPACE}        { return WHITE_SPACE; }

  "="                  { return G_OP_EQ; }
  ";"                  { return G_SEMICOLON; }
  ":"                  { return G_COLON; }
  "::"                 { return G_DOUBLE_COLON; }
  ","                  { return G_COMMA; }
  "{"                  { return G_LEFT_BRACE; }
  "}"                  { return G_RIGHT_BRACE; }
  "["                  { return G_LEFT_BRACKET; }
  "]"                  { return G_RIGHT_BRACKET; }
  "("                  { return G_LEFT_PAREN; }
  ")"                  { return G_RIGHT_PAREN; }
  "@"                  { return G_AT; }
  "[]"                 { return G_TYPED_LIST; }
  "-"                  { return G_MINUS; }
  "+"                  { return G_PLUS; }
  "."                  { return G_DOT; }
  "*"                  { return G_ASTERIX; }
  "%"                  { return G_PERCENT; }
  "/"                  { return G_SLASH; }
  "<"                  { return G_LT; }
  ">"                  { return G_GT; }
  "<="                 { return G_LTE; }
  ">="                 { return G_GTE; }
  "=="                 { return G_EQ; }
  "!="                 { return G_NON_EQ; }
  "&&"                 { return G_AND; }
  "||"                 { return G_OR; }
  "?"                  { return G_QUESTION_MARK; }
  "namespace"          { return G_KW_NS; }
  "entity"             { return G_KW_ENTITY; }
  "value"              { return G_KW_VALUE; }
  "repository"         { return G_KW_REPOSITORY; }
  "import"             { return G_KW_IMPORT; }
  "as"                 { return G_KW_ALIAS; }
  "relation"           { return G_KW_REL; }
  "get"                { return G_KW_GET; }
  "selfie"             { return G_KW_SELFIE; }
  "new"                { return G_KW_NEW; }
  "primary"            { return G_KW_PRIMARY; }
  "when"               { return G_KW_WHEN; }
  "this"               { return G_KW_THIS; }
  "if"                 { return G_KW_IF; }
  "else"               { return G_KW_ELSE; }
  "for"                { return G_KW_FOR; }
  "return"             { return G_KW_RETURN; }
  "persist"            { return G_KW_PERSIST; }
  "flush"              { return G_KW_FLUSH; }
  "remove"             { return G_KW_REMOVE; }
  "break"              { return G_KW_BREAK; }
  "continue"           { return G_KW_CONTINUE; }
  "string"             { return G_TYPE_STRING; }
  "int"                { return G_TYPE_INT; }
  "float"              { return G_TYPE_FLOAT; }
  "void"               { return G_TYPE_VOID; }

  {TYPE_BOOL}          { return G_TYPE_BOOL; }
  {INT}                { return G_INT; }
  {DECIMAL}            { return G_DECIMAL; }
  {SYMBOL_NAME}        { return G_SYMBOL_NAME; }
  {BOOLEAN}            { return G_BOOLEAN; }
  {REL_DIR}            { return G_REL_DIR; }
  {ID}                 { return G_ID; }
  {STRING}             { return G_STRING; }
  {LINE_COMMENT}       { return G_LINE_COMMENT; }
  {BLOCK_COMMENT}      { return G_BLOCK_COMMENT; }

}

[^] { return BAD_CHARACTER; }
