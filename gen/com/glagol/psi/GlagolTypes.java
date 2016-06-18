// This is a generated file. Not intended for manual editing.
package com.glagol.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.glagol.psi.impl.*;

public interface GlagolTypes {


  IElementType BLOCK_COMMENT = new GlagolTokenType("block_comment");
  IElementType BOOLEAN = new GlagolTokenType("boolean");
  IElementType DECL_ENTITY = new GlagolTokenType("entity");
  IElementType DECL_MODULE = new GlagolTokenType("module");
  IElementType DECL_VALUE = new GlagolTokenType("value");
  IElementType EXTERNAL_END = new GlagolTokenType(">>");
  IElementType EXTERNAL_START = new GlagolTokenType("<<");
  IElementType ID = new GlagolTokenType("id");
  IElementType INT = new GlagolTokenType("int");
  IElementType LEFT_BRACE = new GlagolTokenType("{");
  IElementType LEFT_BRACKET = new GlagolTokenType("[");
  IElementType LEFT_PAREN = new GlagolTokenType("(");
  IElementType LINE_COMMENT = new GlagolTokenType("line_comment");
  IElementType NUMBER = new GlagolTokenType("number");
  IElementType OP_EQ = new GlagolTokenType("=");
  IElementType RIGHT_BRACE = new GlagolTokenType("}");
  IElementType RIGHT_BRACKET = new GlagolTokenType("]");
  IElementType RIGHT_PAREN = new GlagolTokenType(")");
  IElementType SEMICOLON = new GlagolTokenType(";");
  IElementType STRING = new GlagolTokenType("string");
  IElementType TYPE_BOOL = new GlagolTokenType("bool");
  IElementType TYPE_FLOAT = new GlagolTokenType("float");
  IElementType TYPE_INT = new GlagolTokenType("int");
  IElementType TYPE_STRING = new GlagolTokenType("string");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
