// This is a generated file. Not intended for manual editing.
package com.glagol.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.glagol.psi.impl.*;

public interface GlagolTypes {

  IElementType G_ANNO = new GlagolElementType("G_ANNO");
  IElementType G_ANNOTATION = new GlagolElementType("G_ANNOTATION");
  IElementType G_DECLARATION = new GlagolElementType("G_DECLARATION");
  IElementType G_DECL_TYPE = new GlagolElementType("G_DECL_TYPE");
  IElementType G_MEMBER = new GlagolElementType("G_MEMBER");
  IElementType G_MEMBER_VALUE = new GlagolElementType("G_MEMBER_VALUE");
  IElementType G_VAR = new GlagolElementType("G_VAR");

  IElementType G_ACCESS_OPTION = new GlagolTokenType("access_option");
  IElementType G_ALPHA = new GlagolTokenType("alpha");
  IElementType G_ARTIFACT_ID = new GlagolTokenType("artifact_id");
  IElementType G_AT = new GlagolTokenType("@");
  IElementType G_BLOCK_COMMENT = new GlagolTokenType("block_comment");
  IElementType G_BOOLEAN = new GlagolTokenType("boolean");
  IElementType G_COLON = new GlagolTokenType(":");
  IElementType G_COMMA = new GlagolTokenType(",");
  IElementType G_DECIMAL = new GlagolTokenType("decimal");
  IElementType G_ID = new GlagolTokenType("id");
  IElementType G_INT = new GlagolTokenType("int");
  IElementType G_KW_ALIAS = new GlagolTokenType("as");
  IElementType G_KW_ENTITY = new GlagolTokenType("entity");
  IElementType G_KW_FROM = new GlagolTokenType("from");
  IElementType G_KW_IMPORT = new GlagolTokenType("use");
  IElementType G_KW_MODULE = new GlagolTokenType("module");
  IElementType G_KW_PRIMARY = new GlagolTokenType("primary");
  IElementType G_KW_REL = new GlagolTokenType("relation");
  IElementType G_KW_VALUE = new GlagolTokenType("value");
  IElementType G_KW_WITH = new GlagolTokenType("with");
  IElementType G_LEFT_BRACE = new GlagolTokenType("{");
  IElementType G_LEFT_BRACKET = new GlagolTokenType("[");
  IElementType G_LEFT_PAREN = new GlagolTokenType("(");
  IElementType G_LINE_COMMENT = new GlagolTokenType("line_comment");
  IElementType G_OP_EQ = new GlagolTokenType("=");
  IElementType G_REL_DIR = new GlagolTokenType("rel_dir");
  IElementType G_RIGHT_BRACE = new GlagolTokenType("}");
  IElementType G_RIGHT_BRACKET = new GlagolTokenType("]");
  IElementType G_RIGHT_PAREN = new GlagolTokenType(")");
  IElementType G_SEMICOLON = new GlagolTokenType(";");
  IElementType G_STRING = new GlagolTokenType("string");
  IElementType G_TYPE_BOOL = new GlagolTokenType("bool");
  IElementType G_TYPE_FLOAT = new GlagolTokenType("float");
  IElementType G_TYPE_INT = new GlagolTokenType("int");
  IElementType G_TYPE_STRING = new GlagolTokenType("string");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == G_ANNO) {
        return new GlagolAnnoImpl(node);
      }
      else if (type == G_ANNOTATION) {
        return new GlagolAnnotationImpl(node);
      }
      else if (type == G_DECLARATION) {
        return new GlagolDeclarationImpl(node);
      }
      else if (type == G_DECL_TYPE) {
        return new GlagolDeclTypeImpl(node);
      }
      else if (type == G_MEMBER) {
        return new GlagolMemberImpl(node);
      }
      else if (type == G_MEMBER_VALUE) {
        return new GlagolMemberValueImpl(node);
      }
      else if (type == G_VAR) {
        return new GlagolVarImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
