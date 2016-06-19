// This is a generated file. Not intended for manual editing.
package com.glagol.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.glagol.psi.impl.*;

public interface GlagolTypes {


  IElementType ANNO_FIELD = new GlagolTokenType("@field");
  IElementType ANNO_INDEX = new GlagolTokenType("@index");
  IElementType ANNO_SPECIAL_VALUE = new GlagolTokenType("primary");
  IElementType ANNO_TABLE = new GlagolTokenType("@table");
  IElementType ANNO_TAG = new GlagolTokenType("anno_tag");
  IElementType BLOCK_COMMENT = new GlagolTokenType("block_comment");
  IElementType BOOLEAN = new GlagolTokenType("boolean");
  IElementType COLON = new GlagolTokenType(":");
  IElementType COMMA = new GlagolTokenType(",");
  IElementType DECL_AS = new GlagolTokenType("as");
  IElementType DECL_ENTITY = new GlagolTokenType("entity");
  IElementType DECL_IMPORT = new GlagolTokenType("use");
  IElementType DECL_IMPORT_FROM = new GlagolTokenType("from");
  IElementType DECL_MODULE = new GlagolTokenType("module");
  IElementType DECL_REL = new GlagolTokenType("relation");
  IElementType DECL_VALUE = new GlagolTokenType("value");
  IElementType DECL_WITH = new GlagolTokenType("with");
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
  IElementType REL_DIR = new GlagolTokenType("rel_dir");
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
