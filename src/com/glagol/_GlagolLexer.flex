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
  "<"                  { return G_LT; }
  ">"                  { return G_GT; }
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
