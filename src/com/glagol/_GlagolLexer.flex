package com.glagol;
import com.intellij.lexer.*;
import com.intellij.psi.tree.IElementType;
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

EOL="\r"|"\n"|"\r\n"
LINE_WS=[\ \t\f]
WHITE_SPACE=({LINE_WS}|{EOL})+

ALPHA=[:alpha:]+
INT=[0-9]+
DECIMAL=[0-9]+\.[0-9]+
ARTIFACT_ID=[A-Z][a-zA-Z_0-9]*
ACCESS_OPTION=add|set|get|reset|clear
BOOLEAN=true|false
REL_DIR=one|many
ID=(\\[a-z][a-zA-Z_0-9]*|[a-z][a-zA-Z_0-9]*)
STRING=('([^'\\]|\\.)*'|\"([^\"\\]|\\\"|\\'|\\)*\")
LINE_COMMENT="//".*
BLOCK_COMMENT="/"\*([^])*\*"/"

%%
<YYINITIAL> {
  {WHITE_SPACE}        { return com.intellij.psi.TokenType.WHITE_SPACE; }

  "="                  { return G_OP_EQ; }
  ";"                  { return G_SEMICOLON; }
  ":"                  { return G_COLON; }
  ","                  { return G_COMMA; }
  "{"                  { return G_LEFT_BRACE; }
  "}"                  { return G_RIGHT_BRACE; }
  "["                  { return G_LEFT_BRACKET; }
  "]"                  { return G_RIGHT_BRACKET; }
  "("                  { return G_LEFT_PAREN; }
  ")"                  { return G_RIGHT_PAREN; }
  "@"                  { return G_AT; }
  "module"             { return G_KW_MODULE; }
  "entity"             { return G_KW_ENTITY; }
  "value"              { return G_KW_VALUE; }
  "use"                { return G_KW_IMPORT; }
  "from"               { return G_KW_FROM; }
  "as"                 { return G_KW_ALIAS; }
  "relation"           { return G_KW_REL; }
  "with"               { return G_KW_WITH; }
  "primary"            { return G_KW_PRIMARY; }
  "string"             { return G_TYPE_STRING; }
  "int"                { return G_TYPE_INT; }
  "bool"               { return G_TYPE_BOOL; }
  "float"              { return G_TYPE_FLOAT; }

  {ALPHA}              { return G_ALPHA; }
  {INT}                { return G_INT; }
  {DECIMAL}            { return G_DECIMAL; }
  {ARTIFACT_ID}        { return G_ARTIFACT_ID; }
  {ACCESS_OPTION}      { return G_ACCESS_OPTION; }
  {BOOLEAN}            { return G_BOOLEAN; }
  {REL_DIR}            { return G_REL_DIR; }
  {ID}                 { return G_ID; }
  {STRING}             { return G_STRING; }
  {LINE_COMMENT}       { return G_LINE_COMMENT; }
  {BLOCK_COMMENT}      { return G_BLOCK_COMMENT; }

  [^] { return com.intellij.psi.TokenType.BAD_CHARACTER; }
}
