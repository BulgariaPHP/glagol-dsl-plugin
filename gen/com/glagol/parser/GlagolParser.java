// This is a generated file. Not intended for manual editing.
package com.glagol.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.glagol.psi.GlagolTypes.*;
import static com.glagol.parser.GlagolParserUtil.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class GlagolParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b, 0);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return glagol(b, l + 1);
  }

  /* ********************************************************** */
  // 'add' | 'get' | 'set' | 'clear' | 'reset'
  static boolean access_token(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "access_token")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "add");
    if (!r) r = consumeToken(b, "get");
    if (!r) r = consumeToken(b, "set");
    if (!r) r = consumeToken(b, "clear");
    if (!r) r = consumeToken(b, "reset");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (access_token ',')* access_token
  static boolean access_tokens(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "access_tokens")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = access_tokens_0(b, l + 1);
    r = r && access_token(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (access_token ',')*
  private static boolean access_tokens_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "access_tokens_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!access_tokens_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "access_tokens_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // access_token ','
  private static boolean access_tokens_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "access_tokens_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = access_token(b, l + 1);
    r = r && consumeToken(b, COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // number | int | boolean | anno_special_value | data_type
  static boolean anno_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "anno_literal")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NUMBER);
    if (!r) r = consumeToken(b, INT);
    if (!r) r = consumeToken(b, BOOLEAN);
    if (!r) r = consumeToken(b, ANNO_SPECIAL_VALUE);
    if (!r) r = data_type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'int' | 'string' | 'bool' | 'float' | id
  static boolean data_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_type")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TYPE_INT);
    if (!r) r = consumeToken(b, TYPE_STRING);
    if (!r) r = consumeToken(b, TYPE_BOOL);
    if (!r) r = consumeToken(b, TYPE_FLOAT);
    if (!r) r = consumeToken(b, ID);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'entity' | 'value'
  static boolean decl_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_type")) return false;
    if (!nextTokenIs(b, "", DECL_ENTITY, DECL_VALUE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DECL_ENTITY);
    if (!r) r = consumeToken(b, DECL_VALUE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (table_annotation | index_annotation)* decl_type id '{' member* '}'
  static boolean declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = declaration_0(b, l + 1);
    r = r && decl_type(b, l + 1);
    r = r && consumeToken(b, ID);
    r = r && consumeToken(b, LEFT_BRACE);
    r = r && declaration_4(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // (table_annotation | index_annotation)*
  private static boolean declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!declaration_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "declaration_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // table_annotation | index_annotation
  private static boolean declaration_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = table_annotation(b, l + 1);
    if (!r) r = index_annotation(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // member*
  private static boolean declaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!member(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "declaration_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // '=' literal
  static boolean default_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "default_value")) return false;
    if (!nextTokenIs(b, OP_EQ)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_EQ);
    r = r && literal(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'relation' rel_dir ':' rel_dir id 'as' id ('with' '{' access_tokens '}')? ';'
  static boolean entity_relation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_relation")) return false;
    if (!nextTokenIs(b, DECL_REL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DECL_REL);
    r = r && consumeToken(b, REL_DIR);
    r = r && consumeToken(b, COLON);
    r = r && consumeTokens(b, 0, REL_DIR, ID);
    r = r && consumeToken(b, DECL_AS);
    r = r && consumeToken(b, ID);
    r = r && entity_relation_7(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('with' '{' access_tokens '}')?
  private static boolean entity_relation_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_relation_7")) return false;
    entity_relation_7_0(b, l + 1);
    return true;
  }

  // 'with' '{' access_tokens '}'
  private static boolean entity_relation_7_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_relation_7_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DECL_WITH);
    r = r && consumeToken(b, LEFT_BRACE);
    r = r && access_tokens(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '@field' '(' '{' pair_fields '}' ')'
  static boolean field_annotation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_annotation")) return false;
    if (!nextTokenIs(b, ANNO_FIELD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ANNO_FIELD);
    r = r && consumeToken(b, LEFT_PAREN);
    r = r && consumeToken(b, LEFT_BRACE);
    r = r && pair_fields(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACE);
    r = r && consumeToken(b, RIGHT_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (id ',')* id
  static boolean fields_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fields_list")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = fields_list_0(b, l + 1);
    r = r && consumeToken(b, ID);
    exit_section_(b, m, null, r);
    return r;
  }

  // (id ',')*
  private static boolean fields_list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fields_list_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!fields_list_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "fields_list_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // id ','
  private static boolean fields_list_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fields_list_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    r = r && consumeToken(b, COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // !<<eof>> 'module' id ';' import_artifact* declaration?
  static boolean glagol(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "glagol")) return false;
    if (!nextTokenIs(b, DECL_MODULE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = glagol_0(b, l + 1);
    r = r && consumeToken(b, DECL_MODULE);
    r = r && consumeToken(b, ID);
    r = r && consumeToken(b, SEMICOLON);
    r = r && glagol_4(b, l + 1);
    r = r && glagol_5(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // !<<eof>>
  private static boolean glagol_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "glagol_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !eof(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // import_artifact*
  private static boolean glagol_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "glagol_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!import_artifact(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "glagol_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // declaration?
  private static boolean glagol_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "glagol_5")) return false;
    declaration(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'use' id decl_type ('from' id)? ('as' id)? ';'
  static boolean import_artifact(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_artifact")) return false;
    if (!nextTokenIs(b, DECL_IMPORT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DECL_IMPORT);
    r = r && consumeToken(b, ID);
    r = r && decl_type(b, l + 1);
    r = r && import_artifact_3(b, l + 1);
    r = r && import_artifact_4(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('from' id)?
  private static boolean import_artifact_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_artifact_3")) return false;
    import_artifact_3_0(b, l + 1);
    return true;
  }

  // 'from' id
  private static boolean import_artifact_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_artifact_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DECL_IMPORT_FROM);
    r = r && consumeToken(b, ID);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('as' id)?
  private static boolean import_artifact_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_artifact_4")) return false;
    import_artifact_4_0(b, l + 1);
    return true;
  }

  // 'as' id
  private static boolean import_artifact_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_artifact_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DECL_AS);
    r = r && consumeToken(b, ID);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '@index' '(' id ',' '{' fields_list '}' ')'
  static boolean index_annotation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "index_annotation")) return false;
    if (!nextTokenIs(b, ANNO_INDEX)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ANNO_INDEX);
    r = r && consumeToken(b, LEFT_PAREN);
    r = r && consumeToken(b, ID);
    r = r && consumeToken(b, COMMA);
    r = r && consumeToken(b, LEFT_BRACE);
    r = r && fields_list(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACE);
    r = r && consumeToken(b, RIGHT_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // number | string | int | boolean
  static boolean literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NUMBER);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, INT);
    if (!r) r = consumeToken(b, BOOLEAN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // member_value | entity_relation
  static boolean member(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = member_value(b, l + 1);
    if (!r) r = entity_relation(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // field_annotation? 'value' data_type id default_value? ';'
  static boolean member_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member_value")) return false;
    if (!nextTokenIs(b, "", ANNO_FIELD, DECL_VALUE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = member_value_0(b, l + 1);
    r = r && consumeToken(b, DECL_VALUE);
    r = r && data_type(b, l + 1);
    r = r && consumeToken(b, ID);
    r = r && member_value_4(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // field_annotation?
  private static boolean member_value_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member_value_0")) return false;
    field_annotation(b, l + 1);
    return true;
  }

  // default_value?
  private static boolean member_value_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member_value_4")) return false;
    default_value(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // anno_tag ':' anno_literal
  static boolean pair_field(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pair_field")) return false;
    if (!nextTokenIs(b, ANNO_TAG)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ANNO_TAG);
    r = r && consumeToken(b, COLON);
    r = r && anno_literal(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (pair_field ",")* pair_field
  static boolean pair_fields(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pair_fields")) return false;
    if (!nextTokenIs(b, ANNO_TAG)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = pair_fields_0(b, l + 1);
    r = r && pair_field(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (pair_field ",")*
  private static boolean pair_fields_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pair_fields_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!pair_fields_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "pair_fields_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // pair_field ","
  private static boolean pair_fields_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pair_fields_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = pair_field(b, l + 1);
    r = r && consumeToken(b, COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '@table' '(' 'name' ':' string ')'
  static boolean table_annotation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_annotation")) return false;
    if (!nextTokenIs(b, ANNO_TABLE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ANNO_TABLE);
    r = r && consumeToken(b, LEFT_PAREN);
    r = r && consumeToken(b, "name");
    r = r && consumeToken(b, COLON);
    r = r && consumeToken(b, STRING);
    r = r && consumeToken(b, RIGHT_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

}
