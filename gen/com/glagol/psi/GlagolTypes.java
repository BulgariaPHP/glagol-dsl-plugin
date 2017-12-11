// This is a generated file. Not intended for manual editing.
package com.glagol.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.glagol.psi.impl.*;

public interface GlagolTypes {

  IElementType G_ACTION = new GlagolElementType("G_ACTION");
  IElementType G_AND_EXPR = new GlagolElementType("G_AND_EXPR");
  IElementType G_ANNOTATION = new GlagolElementType("G_ANNOTATION");
  IElementType G_ARTIFACT_TYPE = new GlagolElementType("G_ARTIFACT_TYPE");
  IElementType G_ASSIGN_STMT = new GlagolElementType("G_ASSIGN_STMT");
  IElementType G_BLOCK_STMT = new GlagolElementType("G_BLOCK_STMT");
  IElementType G_BRACKET_EXPR = new GlagolElementType("G_BRACKET_EXPR");
  IElementType G_BREAK_STMT = new GlagolElementType("G_BREAK_STMT");
  IElementType G_CAST_EXPR = new GlagolElementType("G_CAST_EXPR");
  IElementType G_CONSTRUCTOR = new GlagolElementType("G_CONSTRUCTOR");
  IElementType G_CONTINUE_STMT = new GlagolElementType("G_CONTINUE_STMT");
  IElementType G_DECLARATION = new GlagolElementType("G_DECLARATION");
  IElementType G_DECLARE_STMT = new GlagolElementType("G_DECLARE_STMT");
  IElementType G_DECL_CONTROLLER = new GlagolElementType("G_DECL_CONTROLLER");
  IElementType G_DECL_ENTITY = new GlagolElementType("G_DECL_ENTITY");
  IElementType G_DECL_REPO = new GlagolElementType("G_DECL_REPO");
  IElementType G_DECL_UTIL = new GlagolElementType("G_DECL_UTIL");
  IElementType G_DECL_VALUE = new GlagolElementType("G_DECL_VALUE");
  IElementType G_DEFAULT_VALUE = new GlagolElementType("G_DEFAULT_VALUE");
  IElementType G_DIVISION_EXPR = new GlagolElementType("G_DIVISION_EXPR");
  IElementType G_DV_LIST = new GlagolElementType("G_DV_LIST");
  IElementType G_DV_MAP = new GlagolElementType("G_DV_MAP");
  IElementType G_DV_MAP_PAIR = new GlagolElementType("G_DV_MAP_PAIR");
  IElementType G_DV_MAP_SEQUENCE = new GlagolElementType("G_DV_MAP_SEQUENCE");
  IElementType G_DV_SEQUENCE = new GlagolElementType("G_DV_SEQUENCE");
  IElementType G_EMPTY_STMT = new GlagolElementType("G_EMPTY_STMT");
  IElementType G_EQ_EXPR = new GlagolElementType("G_EQ_EXPR");
  IElementType G_EXPR = new GlagolElementType("G_EXPR");
  IElementType G_EXPR_STMT = new GlagolElementType("G_EXPR_STMT");
  IElementType G_FIELD_EXPR = new GlagolElementType("G_FIELD_EXPR");
  IElementType G_FLUSH_STMT = new GlagolElementType("G_FLUSH_STMT");
  IElementType G_FOREACH_STMT = new GlagolElementType("G_FOREACH_STMT");
  IElementType G_GET = new GlagolElementType("G_GET");
  IElementType G_GTE_EXPR = new GlagolElementType("G_GTE_EXPR");
  IElementType G_GT_EXPR = new GlagolElementType("G_GT_EXPR");
  IElementType G_IF_STMT = new GlagolElementType("G_IF_STMT");
  IElementType G_IMPORT_ARTIFACT = new GlagolElementType("G_IMPORT_ARTIFACT");
  IElementType G_INVOKE_EXPR = new GlagolElementType("G_INVOKE_EXPR");
  IElementType G_INVOKE_FINAL_EXPR = new GlagolElementType("G_INVOKE_FINAL_EXPR");
  IElementType G_LIST_EXPR = new GlagolElementType("G_LIST_EXPR");
  IElementType G_LIST_SEQ_EXPR = new GlagolElementType("G_LIST_SEQ_EXPR");
  IElementType G_LIST_TYPE = new GlagolElementType("G_LIST_TYPE");
  IElementType G_LITERAL = new GlagolElementType("G_LITERAL");
  IElementType G_LITERAL_EXPR = new GlagolElementType("G_LITERAL_EXPR");
  IElementType G_LTE_EXPR = new GlagolElementType("G_LTE_EXPR");
  IElementType G_LT_EXPR = new GlagolElementType("G_LT_EXPR");
  IElementType G_MAP_EXPR = new GlagolElementType("G_MAP_EXPR");
  IElementType G_MAP_PAIR_EXPR = new GlagolElementType("G_MAP_PAIR_EXPR");
  IElementType G_MAP_SEQ_EXPR = new GlagolElementType("G_MAP_SEQ_EXPR");
  IElementType G_MAP_TYPE = new GlagolElementType("G_MAP_TYPE");
  IElementType G_MEMBER = new GlagolElementType("G_MEMBER");
  IElementType G_METHOD = new GlagolElementType("G_METHOD");
  IElementType G_MINUS_EXPR = new GlagolElementType("G_MINUS_EXPR");
  IElementType G_NEGATIVE_EXPR = new GlagolElementType("G_NEGATIVE_EXPR");
  IElementType G_NEW = new GlagolElementType("G_NEW");
  IElementType G_NEW_EXPR = new GlagolElementType("G_NEW_EXPR");
  IElementType G_NON_EQ_EXPR = new GlagolElementType("G_NON_EQ_EXPR");
  IElementType G_OR_EXPR = new GlagolElementType("G_OR_EXPR");
  IElementType G_PERSIST_STMT = new GlagolElementType("G_PERSIST_STMT");
  IElementType G_PLUS_EXPR = new GlagolElementType("G_PLUS_EXPR");
  IElementType G_POSITIVE_EXPR = new GlagolElementType("G_POSITIVE_EXPR");
  IElementType G_PRODUCT_EXPR = new GlagolElementType("G_PRODUCT_EXPR");
  IElementType G_PROPERTY = new GlagolElementType("G_PROPERTY");
  IElementType G_PROPERTY_DEFAULT_VALUE = new GlagolElementType("G_PROPERTY_DEFAULT_VALUE");
  IElementType G_QUALIFIED_NAME = new GlagolElementType("G_QUALIFIED_NAME");
  IElementType G_REMAINDER_EXPR = new GlagolElementType("G_REMAINDER_EXPR");
  IElementType G_REMOVE_STMT = new GlagolElementType("G_REMOVE_STMT");
  IElementType G_REPOSITORY_TYPE = new GlagolElementType("G_REPOSITORY_TYPE");
  IElementType G_RETURN_STMT = new GlagolElementType("G_RETURN_STMT");
  IElementType G_SCALAR_TYPE = new GlagolElementType("G_SCALAR_TYPE");
  IElementType G_SELFIE_TYPE = new GlagolElementType("G_SELFIE_TYPE");
  IElementType G_SEQ_EXPR = new GlagolElementType("G_SEQ_EXPR");
  IElementType G_STMT = new GlagolElementType("G_STMT");
  IElementType G_TERNARY_EXPR = new GlagolElementType("G_TERNARY_EXPR");
  IElementType G_THIS_EXPR = new GlagolElementType("G_THIS_EXPR");
  IElementType G_TYPE = new GlagolElementType("G_TYPE");
  IElementType G_VARIABLE_EXPR = new GlagolElementType("G_VARIABLE_EXPR");
  IElementType G_VOID_TYPE = new GlagolElementType("G_VOID_TYPE");

  IElementType G_AND = new GlagolTokenType("&&");
  IElementType G_ASTERIX = new GlagolTokenType("*");
  IElementType G_AT = new GlagolTokenType("@");
  IElementType G_BLOCK_COMMENT = new GlagolTokenType("block_comment");
  IElementType G_BOOLEAN = new GlagolTokenType("boolean");
  IElementType G_COLON = new GlagolTokenType(":");
  IElementType G_COMMA = new GlagolTokenType(",");
  IElementType G_DECIMAL = new GlagolTokenType("decimal");
  IElementType G_DOT = new GlagolTokenType(".");
  IElementType G_DOUBLE_COLON = new GlagolTokenType("::");
  IElementType G_EQ = new GlagolTokenType("==");
  IElementType G_GT = new GlagolTokenType(">");
  IElementType G_GTE = new GlagolTokenType(">=");
  IElementType G_ID = new GlagolTokenType("id");
  IElementType G_INT = new GlagolTokenType("int");
  IElementType G_KW_ALIAS = new GlagolTokenType("as");
  IElementType G_KW_BREAK = new GlagolTokenType("break");
  IElementType G_KW_CONTINUE = new GlagolTokenType("continue");
  IElementType G_KW_CONTROLLER = new GlagolTokenType("controller");
  IElementType G_KW_ELSE = new GlagolTokenType("else");
  IElementType G_KW_ENTITY = new GlagolTokenType("entity");
  IElementType G_KW_FLUSH = new GlagolTokenType("flush");
  IElementType G_KW_FOR = new GlagolTokenType("for");
  IElementType G_KW_GET = new GlagolTokenType("get");
  IElementType G_KW_IF = new GlagolTokenType("if");
  IElementType G_KW_IMPORT = new GlagolTokenType("import");
  IElementType G_KW_JSON_API = new GlagolTokenType("json-api");
  IElementType G_KW_NEW = new GlagolTokenType("new");
  IElementType G_KW_NS = new GlagolTokenType("namespace");
  IElementType G_KW_PERSIST = new GlagolTokenType("persist");
  IElementType G_KW_PRIMARY = new GlagolTokenType("primary");
  IElementType G_KW_PRIVATE = new GlagolTokenType("private");
  IElementType G_KW_PUBLIC = new GlagolTokenType("public");
  IElementType G_KW_REL = new GlagolTokenType("relation");
  IElementType G_KW_REMOVE = new GlagolTokenType("remove");
  IElementType G_KW_REPOSITORY = new GlagolTokenType("repository");
  IElementType G_KW_REST = new GlagolTokenType("rest");
  IElementType G_KW_RETURN = new GlagolTokenType("return");
  IElementType G_KW_SELFIE = new GlagolTokenType("selfie");
  IElementType G_KW_SERVICE = new GlagolTokenType("service");
  IElementType G_KW_THIS = new GlagolTokenType("this");
  IElementType G_KW_UTIL = new GlagolTokenType("util");
  IElementType G_KW_VALUE = new GlagolTokenType("value");
  IElementType G_KW_WHEN = new GlagolTokenType("when");
  IElementType G_LEFT_BRACE = new GlagolTokenType("{");
  IElementType G_LEFT_BRACKET = new GlagolTokenType("[");
  IElementType G_LEFT_PAREN = new GlagolTokenType("(");
  IElementType G_LINE_COMMENT = new GlagolTokenType("line_comment");
  IElementType G_LT = new GlagolTokenType("<");
  IElementType G_LTE = new GlagolTokenType("<=");
  IElementType G_MINUS = new GlagolTokenType("-");
  IElementType G_NON_EQ = new GlagolTokenType("!=");
  IElementType G_OP_EQ = new GlagolTokenType("=");
  IElementType G_OR = new GlagolTokenType("||");
  IElementType G_PERCENT = new GlagolTokenType("%");
  IElementType G_PLUS = new GlagolTokenType("+");
  IElementType G_QUESTION_MARK = new GlagolTokenType("?");
  IElementType G_REL_DIR = new GlagolTokenType("rel_dir");
  IElementType G_RIGHT_BRACE = new GlagolTokenType("}");
  IElementType G_RIGHT_BRACKET = new GlagolTokenType("]");
  IElementType G_RIGHT_PAREN = new GlagolTokenType(")");
  IElementType G_SEMICOLON = new GlagolTokenType(";");
  IElementType G_SLASH = new GlagolTokenType("/");
  IElementType G_STRING = new GlagolTokenType("string");
  IElementType G_SYMBOL_NAME = new GlagolTokenType("symbol_name");
  IElementType G_TYPE_BOOL = new GlagolTokenType("TYPE_BOOL");
  IElementType G_TYPE_FLOAT = new GlagolTokenType("float");
  IElementType G_TYPE_INT = new GlagolTokenType("int");
  IElementType G_TYPE_STRING = new GlagolTokenType("string");
  IElementType G_TYPE_VOID = new GlagolTokenType("void");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == G_ACTION) {
        return new GlagolActionImpl(node);
      }
      else if (type == G_AND_EXPR) {
        return new GlagolAndExprImpl(node);
      }
      else if (type == G_ANNOTATION) {
        return new GlagolAnnotationImpl(node);
      }
      else if (type == G_ARTIFACT_TYPE) {
        return new GlagolArtifactTypeImpl(node);
      }
      else if (type == G_ASSIGN_STMT) {
        return new GlagolAssignStmtImpl(node);
      }
      else if (type == G_BLOCK_STMT) {
        return new GlagolBlockStmtImpl(node);
      }
      else if (type == G_BRACKET_EXPR) {
        return new GlagolBracketExprImpl(node);
      }
      else if (type == G_BREAK_STMT) {
        return new GlagolBreakStmtImpl(node);
      }
      else if (type == G_CAST_EXPR) {
        return new GlagolCastExprImpl(node);
      }
      else if (type == G_CONSTRUCTOR) {
        return new GlagolConstructorImpl(node);
      }
      else if (type == G_CONTINUE_STMT) {
        return new GlagolContinueStmtImpl(node);
      }
      else if (type == G_DECLARATION) {
        return new GlagolDeclarationImpl(node);
      }
      else if (type == G_DECLARE_STMT) {
        return new GlagolDeclareStmtImpl(node);
      }
      else if (type == G_DECL_CONTROLLER) {
        return new GlagolDeclControllerImpl(node);
      }
      else if (type == G_DECL_ENTITY) {
        return new GlagolDeclEntityImpl(node);
      }
      else if (type == G_DECL_REPO) {
        return new GlagolDeclRepoImpl(node);
      }
      else if (type == G_DECL_UTIL) {
        return new GlagolDeclUtilImpl(node);
      }
      else if (type == G_DECL_VALUE) {
        return new GlagolDeclValueImpl(node);
      }
      else if (type == G_DEFAULT_VALUE) {
        return new GlagolDefaultValueImpl(node);
      }
      else if (type == G_DIVISION_EXPR) {
        return new GlagolDivisionExprImpl(node);
      }
      else if (type == G_DV_LIST) {
        return new GlagolDvListImpl(node);
      }
      else if (type == G_DV_MAP) {
        return new GlagolDvMapImpl(node);
      }
      else if (type == G_DV_MAP_PAIR) {
        return new GlagolDvMapPairImpl(node);
      }
      else if (type == G_DV_MAP_SEQUENCE) {
        return new GlagolDvMapSequenceImpl(node);
      }
      else if (type == G_DV_SEQUENCE) {
        return new GlagolDvSequenceImpl(node);
      }
      else if (type == G_EMPTY_STMT) {
        return new GlagolEmptyStmtImpl(node);
      }
      else if (type == G_EQ_EXPR) {
        return new GlagolEqExprImpl(node);
      }
      else if (type == G_EXPR_STMT) {
        return new GlagolExprStmtImpl(node);
      }
      else if (type == G_FIELD_EXPR) {
        return new GlagolFieldExprImpl(node);
      }
      else if (type == G_FLUSH_STMT) {
        return new GlagolFlushStmtImpl(node);
      }
      else if (type == G_FOREACH_STMT) {
        return new GlagolForeachStmtImpl(node);
      }
      else if (type == G_GET) {
        return new GlagolGetImpl(node);
      }
      else if (type == G_GTE_EXPR) {
        return new GlagolGteExprImpl(node);
      }
      else if (type == G_GT_EXPR) {
        return new GlagolGtExprImpl(node);
      }
      else if (type == G_IF_STMT) {
        return new GlagolIfStmtImpl(node);
      }
      else if (type == G_IMPORT_ARTIFACT) {
        return new GlagolImportArtifactImpl(node);
      }
      else if (type == G_INVOKE_EXPR) {
        return new GlagolInvokeExprImpl(node);
      }
      else if (type == G_INVOKE_FINAL_EXPR) {
        return new GlagolInvokeFinalExprImpl(node);
      }
      else if (type == G_LIST_EXPR) {
        return new GlagolListExprImpl(node);
      }
      else if (type == G_LIST_SEQ_EXPR) {
        return new GlagolListSeqExprImpl(node);
      }
      else if (type == G_LIST_TYPE) {
        return new GlagolListTypeImpl(node);
      }
      else if (type == G_LITERAL) {
        return new GlagolLiteralImpl(node);
      }
      else if (type == G_LITERAL_EXPR) {
        return new GlagolLiteralExprImpl(node);
      }
      else if (type == G_LTE_EXPR) {
        return new GlagolLteExprImpl(node);
      }
      else if (type == G_LT_EXPR) {
        return new GlagolLtExprImpl(node);
      }
      else if (type == G_MAP_EXPR) {
        return new GlagolMapExprImpl(node);
      }
      else if (type == G_MAP_PAIR_EXPR) {
        return new GlagolMapPairExprImpl(node);
      }
      else if (type == G_MAP_SEQ_EXPR) {
        return new GlagolMapSeqExprImpl(node);
      }
      else if (type == G_MAP_TYPE) {
        return new GlagolMapTypeImpl(node);
      }
      else if (type == G_MEMBER) {
        return new GlagolMemberImpl(node);
      }
      else if (type == G_METHOD) {
        return new GlagolMethodImpl(node);
      }
      else if (type == G_MINUS_EXPR) {
        return new GlagolMinusExprImpl(node);
      }
      else if (type == G_NEGATIVE_EXPR) {
        return new GlagolNegativeExprImpl(node);
      }
      else if (type == G_NEW) {
        return new GlagolNewImpl(node);
      }
      else if (type == G_NEW_EXPR) {
        return new GlagolNewExprImpl(node);
      }
      else if (type == G_NON_EQ_EXPR) {
        return new GlagolNonEqExprImpl(node);
      }
      else if (type == G_OR_EXPR) {
        return new GlagolOrExprImpl(node);
      }
      else if (type == G_PERSIST_STMT) {
        return new GlagolPersistStmtImpl(node);
      }
      else if (type == G_PLUS_EXPR) {
        return new GlagolPlusExprImpl(node);
      }
      else if (type == G_POSITIVE_EXPR) {
        return new GlagolPositiveExprImpl(node);
      }
      else if (type == G_PRODUCT_EXPR) {
        return new GlagolProductExprImpl(node);
      }
      else if (type == G_PROPERTY) {
        return new GlagolPropertyImpl(node);
      }
      else if (type == G_PROPERTY_DEFAULT_VALUE) {
        return new GlagolPropertyDefaultValueImpl(node);
      }
      else if (type == G_QUALIFIED_NAME) {
        return new GlagolQualifiedNameImpl(node);
      }
      else if (type == G_REMAINDER_EXPR) {
        return new GlagolRemainderExprImpl(node);
      }
      else if (type == G_REMOVE_STMT) {
        return new GlagolRemoveStmtImpl(node);
      }
      else if (type == G_REPOSITORY_TYPE) {
        return new GlagolRepositoryTypeImpl(node);
      }
      else if (type == G_RETURN_STMT) {
        return new GlagolReturnStmtImpl(node);
      }
      else if (type == G_SCALAR_TYPE) {
        return new GlagolScalarTypeImpl(node);
      }
      else if (type == G_SELFIE_TYPE) {
        return new GlagolSelfieTypeImpl(node);
      }
      else if (type == G_SEQ_EXPR) {
        return new GlagolSeqExprImpl(node);
      }
      else if (type == G_TERNARY_EXPR) {
        return new GlagolTernaryExprImpl(node);
      }
      else if (type == G_THIS_EXPR) {
        return new GlagolThisExprImpl(node);
      }
      else if (type == G_VARIABLE_EXPR) {
        return new GlagolVariableExprImpl(node);
      }
      else if (type == G_VOID_TYPE) {
        return new GlagolVoidTypeImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
