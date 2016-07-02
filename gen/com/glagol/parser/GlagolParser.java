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
    if (t == G_ANNO) {
      r = anno(b, 0);
    }
    else if (t == G_ANNOTATION) {
      r = annotation(b, 0);
    }
    else if (t == G_DECL_TYPE) {
      r = decl_type(b, 0);
    }
    else if (t == G_DECLARATION) {
      r = declaration(b, 0);
    }
    else if (t == G_MEMBER) {
      r = member(b, 0);
    }
    else if (t == G_MEMBER_VALUE) {
      r = member_value(b, 0);
    }
    else if (t == G_VAR) {
      r = var(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return root(b, l + 1);
  }

  /* ********************************************************** */
  // access_option
  static boolean access_token(PsiBuilder b, int l) {
    return consumeToken(b, G_ACCESS_OPTION);
  }

  /* ********************************************************** */
  // (access_token ',')* access_token
  static boolean access_tokens(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "access_tokens")) return false;
    if (!nextTokenIs(b, G_ACCESS_OPTION)) return false;
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
    r = r && consumeToken(b, G_COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '@' id
  public static boolean anno(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "anno")) return false;
    if (!nextTokenIs(b, G_AT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, G_AT);
    r = r && consumeToken(b, G_ID);
    exit_section_(b, m, G_ANNO, r);
    return r;
  }

  /* ********************************************************** */
  // anno annotation_args?
  public static boolean annotation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation")) return false;
    if (!nextTokenIs(b, G_AT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = anno(b, l + 1);
    r = r && annotation_1(b, l + 1);
    exit_section_(b, m, G_ANNOTATION, r);
    return r;
  }

  // annotation_args?
  private static boolean annotation_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_1")) return false;
    annotation_args(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // string | annotation_list | annotation_map
  static boolean annotation_arg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_arg")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, G_STRING);
    if (!r) r = annotation_list(b, l + 1);
    if (!r) r = annotation_map(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '(' (annotation_arg ",")* annotation_arg ')'
  static boolean annotation_args(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_args")) return false;
    if (!nextTokenIs(b, G_LEFT_PAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, G_LEFT_PAREN);
    p = r; // pin = 1
    r = r && report_error_(b, annotation_args_1(b, l + 1));
    r = p && report_error_(b, annotation_arg(b, l + 1)) && r;
    r = p && consumeToken(b, G_RIGHT_PAREN) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (annotation_arg ",")*
  private static boolean annotation_args_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_args_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!annotation_args_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "annotation_args_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // annotation_arg ","
  private static boolean annotation_args_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_args_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = annotation_arg(b, l + 1);
    r = r && consumeToken(b, G_COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '[' (annotation_arg ",")* annotation_arg ']'
  static boolean annotation_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_list")) return false;
    if (!nextTokenIs(b, G_LEFT_BRACKET)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, G_LEFT_BRACKET);
    p = r; // pin = 1
    r = r && report_error_(b, annotation_list_1(b, l + 1));
    r = p && report_error_(b, annotation_arg(b, l + 1)) && r;
    r = p && consumeToken(b, G_RIGHT_BRACKET) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (annotation_arg ",")*
  private static boolean annotation_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_list_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!annotation_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "annotation_list_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // annotation_arg ","
  private static boolean annotation_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = annotation_arg(b, l + 1);
    r = r && consumeToken(b, G_COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // decimal | int | boolean | 'primary' | string | data_type
  static boolean annotation_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_literal")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, G_DECIMAL);
    if (!r) r = consumeToken(b, G_INT);
    if (!r) r = consumeToken(b, G_BOOLEAN);
    if (!r) r = consumeToken(b, G_KW_PRIMARY);
    if (!r) r = consumeToken(b, G_STRING);
    if (!r) r = data_type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '{' (annotation_map_pair ",")* annotation_map_pair '}'
  static boolean annotation_map(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_map")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, G_LEFT_BRACE);
    p = r; // pin = 1
    r = r && report_error_(b, annotation_map_1(b, l + 1));
    r = p && report_error_(b, annotation_map_pair(b, l + 1)) && r;
    r = p && consumeToken(b, G_RIGHT_BRACE) && r;
    exit_section_(b, l, m, r, p, annotation_map_auto_recover_);
    return r || p;
  }

  // (annotation_map_pair ",")*
  private static boolean annotation_map_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_map_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!annotation_map_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "annotation_map_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // annotation_map_pair ","
  private static boolean annotation_map_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_map_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = annotation_map_pair(b, l + 1);
    r = r && consumeToken(b, G_COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // id ':' annotation_literal
  static boolean annotation_map_pair(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_map_pair")) return false;
    if (!nextTokenIs(b, G_ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, G_ID);
    r = r && consumeToken(b, G_COLON);
    r = r && annotation_literal(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'int' | 'string' | 'bool' | 'float' | artifact_id
  static boolean data_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_type")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, G_TYPE_INT);
    if (!r) r = consumeToken(b, G_TYPE_STRING);
    if (!r) r = consumeToken(b, G_TYPE_BOOL);
    if (!r) r = consumeToken(b, G_TYPE_FLOAT);
    if (!r) r = consumeToken(b, G_ARTIFACT_ID);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'entity' | 'value'
  public static boolean decl_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_type")) return false;
    if (!nextTokenIs(b, "<decl type>", G_KW_ENTITY, G_KW_VALUE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, G_DECL_TYPE, "<decl type>");
    r = consumeToken(b, G_KW_ENTITY);
    if (!r) r = consumeToken(b, G_KW_VALUE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // annotation* decl_type artifact_id '{' member+ '}'
  public static boolean declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, G_DECLARATION, "<declaration>");
    r = declaration_0(b, l + 1);
    r = r && decl_type(b, l + 1);
    r = r && consumeToken(b, G_ARTIFACT_ID);
    r = r && consumeToken(b, G_LEFT_BRACE);
    p = r; // pin = 4
    r = r && report_error_(b, declaration_4(b, l + 1));
    r = p && consumeToken(b, G_RIGHT_BRACE) && r;
    exit_section_(b, l, m, r, p, declaration_recover_parser_);
    return r || p;
  }

  // annotation*
  private static boolean declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!annotation(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "declaration_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // member+
  private static boolean declaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = member(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!member(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "declaration_4", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // !('entity' | 'module' | ',' | id)
  static boolean declaration_recover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_recover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !declaration_recover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'entity' | 'module' | ',' | id
  private static boolean declaration_recover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_recover_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, G_KW_ENTITY);
    if (!r) r = consumeToken(b, G_KW_MODULE);
    if (!r) r = consumeToken(b, G_COMMA);
    if (!r) r = consumeToken(b, G_ID);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '=' literal
  static boolean default_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "default_value")) return false;
    if (!nextTokenIs(b, G_OP_EQ)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, G_OP_EQ);
    r = r && literal(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'relation' rel_dir ':' rel_dir artifact_id 'as' var ('with' '{' access_tokens '}')? ';'
  static boolean entity_relation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_relation")) return false;
    if (!nextTokenIs(b, G_KW_REL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, G_KW_REL);
    r = r && consumeToken(b, G_REL_DIR);
    r = r && consumeToken(b, G_COLON);
    r = r && consumeTokens(b, 0, G_REL_DIR, G_ARTIFACT_ID);
    r = r && consumeToken(b, G_KW_ALIAS);
    r = r && var(b, l + 1);
    r = r && entity_relation_7(b, l + 1);
    r = r && consumeToken(b, G_SEMICOLON);
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
    r = consumeToken(b, G_KW_WITH);
    r = r && consumeToken(b, G_LEFT_BRACE);
    r = r && access_tokens(b, l + 1);
    r = r && consumeToken(b, G_RIGHT_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'use' artifact_id decl_type ('from' artifact_id)? ('as' artifact_id)? ';'
  static boolean import_artifact(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_artifact")) return false;
    if (!nextTokenIs(b, G_KW_IMPORT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, G_KW_IMPORT);
    r = r && consumeToken(b, G_ARTIFACT_ID);
    r = r && decl_type(b, l + 1);
    r = r && import_artifact_3(b, l + 1);
    r = r && import_artifact_4(b, l + 1);
    r = r && consumeToken(b, G_SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('from' artifact_id)?
  private static boolean import_artifact_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_artifact_3")) return false;
    import_artifact_3_0(b, l + 1);
    return true;
  }

  // 'from' artifact_id
  private static boolean import_artifact_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_artifact_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, G_KW_FROM);
    r = r && consumeToken(b, G_ARTIFACT_ID);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('as' artifact_id)?
  private static boolean import_artifact_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_artifact_4")) return false;
    import_artifact_4_0(b, l + 1);
    return true;
  }

  // 'as' artifact_id
  private static boolean import_artifact_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_artifact_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, G_KW_ALIAS);
    r = r && consumeToken(b, G_ARTIFACT_ID);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // decimal | string | int | boolean
  static boolean literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, G_DECIMAL);
    if (!r) r = consumeToken(b, G_STRING);
    if (!r) r = consumeToken(b, G_INT);
    if (!r) r = consumeToken(b, G_BOOLEAN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // member_value | entity_relation
  public static boolean member(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, G_MEMBER, "<member>");
    r = member_value(b, l + 1);
    if (!r) r = entity_relation(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // annotation? 'value' data_type var default_value? ';'
  public static boolean member_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member_value")) return false;
    if (!nextTokenIs(b, "<member value>", G_AT, G_KW_VALUE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, G_MEMBER_VALUE, "<member value>");
    r = member_value_0(b, l + 1);
    r = r && consumeToken(b, G_KW_VALUE);
    r = r && data_type(b, l + 1);
    r = r && var(b, l + 1);
    r = r && member_value_4(b, l + 1);
    r = r && consumeToken(b, G_SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // annotation?
  private static boolean member_value_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member_value_0")) return false;
    annotation(b, l + 1);
    return true;
  }

  // default_value?
  private static boolean member_value_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member_value_4")) return false;
    default_value(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // !<<eof>> annotation* 'module' artifact_id ';' import_artifact* declaration?
  static boolean root(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root")) return false;
    if (!nextTokenIs(b, "", G_AT, G_KW_MODULE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = root_0(b, l + 1);
    r = r && root_1(b, l + 1);
    r = r && consumeToken(b, G_KW_MODULE);
    r = r && consumeToken(b, G_ARTIFACT_ID);
    r = r && consumeToken(b, G_SEMICOLON);
    r = r && root_5(b, l + 1);
    r = r && root_6(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // !<<eof>>
  private static boolean root_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !eof(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // annotation*
  private static boolean root_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!annotation(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "root_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // import_artifact*
  private static boolean root_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!import_artifact(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "root_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // declaration?
  private static boolean root_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_6")) return false;
    declaration(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // id
  public static boolean var(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var")) return false;
    if (!nextTokenIs(b, G_ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, G_ID);
    exit_section_(b, m, G_VAR, r);
    return r;
  }

  final static Parser annotation_map_auto_recover_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return !nextTokenIsFast(b, G_RIGHT_PAREN, G_COMMA,
        G_AT, G_RIGHT_BRACKET, G_KW_ENTITY, G_KW_MODULE, G_KW_VALUE);
    }
  };
  final static Parser declaration_recover_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return declaration_recover(b, l + 1);
    }
  };
}
