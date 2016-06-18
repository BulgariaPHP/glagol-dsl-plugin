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

INT=[0-9]+
NUMBER=[0-9]+\.[0-9]+
BOOLEAN=true|false
ID=[a-zA-Z_0-9]+
STRING=('([^'\\]|\\.)*'|\"([^\"\\]|\\\"|\\'|\\)*\")
LINE_COMMENT="//".*
BLOCK_COMMENT="/"\*([^])*\*"/"

%%
<YYINITIAL> {
  {WHITE_SPACE}        { return com.intellij.psi.TokenType.WHITE_SPACE; }

  "="                  { return OP_EQ; }
  ";"                  { return SEMICOLON; }
  "{"                  { return LEFT_BRACE; }
  "}"                  { return RIGHT_BRACE; }
  "["                  { return LEFT_BRACKET; }
  "]"                  { return RIGHT_BRACKET; }
  "("                  { return LEFT_PAREN; }
  ")"                  { return RIGHT_PAREN; }
  "<<"                 { return EXTERNAL_START; }
  ">>"                 { return EXTERNAL_END; }
  "module"             { return DECL_MODULE; }
  "entity"             { return DECL_ENTITY; }
  "value"              { return DECL_VALUE; }
  "string"             { return TYPE_STRING; }
  "int"                { return TYPE_INT; }
  "bool"               { return TYPE_BOOL; }
  "float"              { return TYPE_FLOAT; }

  {INT}                { return INT; }
  {NUMBER}             { return NUMBER; }
  {BOOLEAN}            { return BOOLEAN; }
  {ID}                 { return ID; }
  {STRING}             { return STRING; }
  {LINE_COMMENT}       { return LINE_COMMENT; }
  {BLOCK_COMMENT}      { return BLOCK_COMMENT; }

  [^] { return com.intellij.psi.TokenType.BAD_CHARACTER; }
}
