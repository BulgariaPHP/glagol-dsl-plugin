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
    b = adapt_builder_(t, b, this, EXTENDS_SETS_);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == G_ACTION) {
      r = action(b, 0);
    }
    else if (t == G_ANNOTATION) {
      r = annotation(b, 0);
    }
    else if (t == G_ASSIGN_STMT) {
      r = assign_stmt(b, 0);
    }
    else if (t == G_BLOCK_STMT) {
      r = block_stmt(b, 0);
    }
    else if (t == G_BREAK_STMT) {
      r = break_stmt(b, 0);
    }
    else if (t == G_CONSTRUCTOR) {
      r = constructor(b, 0);
    }
    else if (t == G_CONTINUE_STMT) {
      r = continue_stmt(b, 0);
    }
    else if (t == G_DECL_CONTROLLER) {
      r = decl_controller(b, 0);
    }
    else if (t == G_DECL_ENTITY) {
      r = decl_entity(b, 0);
    }
    else if (t == G_DECL_REPO) {
      r = decl_repo(b, 0);
    }
    else if (t == G_DECL_UTIL) {
      r = decl_util(b, 0);
    }
    else if (t == G_DECL_VALUE) {
      r = decl_value(b, 0);
    }
    else if (t == G_DECLARATION) {
      r = declaration(b, 0);
    }
    else if (t == G_DECLARE_STMT) {
      r = declare_stmt(b, 0);
    }
    else if (t == G_DEFAULT_VALUE) {
      r = default_value(b, 0);
    }
    else if (t == G_DV_LIST) {
      r = dv_list(b, 0);
    }
    else if (t == G_DV_MAP) {
      r = dv_map(b, 0);
    }
    else if (t == G_DV_MAP_PAIR) {
      r = dv_map_pair(b, 0);
    }
    else if (t == G_DV_MAP_SEQUENCE) {
      r = dv_map_sequence(b, 0);
    }
    else if (t == G_DV_SEQUENCE) {
      r = dv_sequence(b, 0);
    }
    else if (t == G_EMPTY_STMT) {
      r = empty_stmt(b, 0);
    }
    else if (t == G_EXPR) {
      r = expr(b, 0, -1);
    }
    else if (t == G_EXPR_STMT) {
      r = expr_stmt(b, 0);
    }
    else if (t == G_FLUSH_STMT) {
      r = flush_stmt(b, 0);
    }
    else if (t == G_FOREACH_STMT) {
      r = foreach_stmt(b, 0);
    }
    else if (t == G_GET) {
      r = get(b, 0);
    }
    else if (t == G_IF_STMT) {
      r = if_stmt(b, 0);
    }
    else if (t == G_IMPORT_ARTIFACT) {
      r = import_artifact(b, 0);
    }
    else if (t == G_LIST_SEQ_EXPR) {
      r = list_seq_expr(b, 0);
    }
    else if (t == G_LITERAL) {
      r = literal(b, 0);
    }
    else if (t == G_MAP_PAIR_EXPR) {
      r = map_pair_expr(b, 0);
    }
    else if (t == G_MAP_SEQ_EXPR) {
      r = map_seq_expr(b, 0);
    }
    else if (t == G_MEMBER) {
      r = member(b, 0);
    }
    else if (t == G_METHOD) {
      r = method(b, 0);
    }
    else if (t == G_NEW) {
      r = new_$(b, 0);
    }
    else if (t == G_PERSIST_STMT) {
      r = persist_stmt(b, 0);
    }
    else if (t == G_PROPERTY) {
      r = property(b, 0);
    }
    else if (t == G_PROPERTY_DEFAULT_VALUE) {
      r = property_default_value(b, 0);
    }
    else if (t == G_QEXPR) {
      r = qexpr(b, 0, -1);
    }
    else if (t == G_QUALIFIED_NAME) {
      r = qualified_name(b, 0);
    }
    else if (t == G_QUERY_FIELD) {
      r = query_field(b, 0);
    }
    else if (t == G_QUERY_SPEC) {
      r = query_spec(b, 0);
    }
    else if (t == G_QUERY_STATEMENT) {
      r = query_statement(b, 0);
    }
    else if (t == G_REMOVE_STMT) {
      r = remove_stmt(b, 0);
    }
    else if (t == G_RETURN_STMT) {
      r = return_stmt(b, 0);
    }
    else if (t == G_SEQ_EXPR) {
      r = seq_expr(b, 0);
    }
    else if (t == G_STMT) {
      r = stmt(b, 0);
    }
    else if (t == G_TYPE) {
      r = type(b, 0, -1);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return root(b, l + 1);
  }

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(G_ARTIFACT_TYPE, G_LIST_TYPE, G_MAP_TYPE, G_REPOSITORY_TYPE,
      G_SCALAR_TYPE, G_SELFIE_TYPE, G_TYPE, G_VOID_TYPE),
    create_token_set_(G_ASSIGN_STMT, G_BLOCK_STMT, G_BREAK_STMT, G_CONTINUE_STMT,
      G_DECLARE_STMT, G_EMPTY_STMT, G_EXPR_STMT, G_FLUSH_STMT,
      G_FOREACH_STMT, G_IF_STMT, G_PERSIST_STMT, G_REMOVE_STMT,
      G_RETURN_STMT, G_STMT),
    create_token_set_(G_AND_QEXPR, G_BRACKET_QEXPR, G_EQUALS_QEXPR, G_GTE_QEXPR,
      G_GT_QEXPR, G_G_QEXPR, G_IS_NOT_NULL_QEXPR, G_IS_NULL_QEXPR,
      G_LTE_QEXPR, G_LT_QEXPR, G_NON_EQUALS_QEXPR, G_OR_QEXPR,
      G_QEXPR, G_QUERY_FIELD_QEXPR),
    create_token_set_(G_AND_EXPR, G_BRACKET_EXPR, G_CAST_EXPR, G_CONCAT_EXPR,
      G_DIVISION_EXPR, G_EQ_EXPR, G_EXPR, G_FIELD_EXPR,
      G_GTE_EXPR, G_GT_EXPR, G_INVOKE_EXPR, G_INVOKE_FINAL_EXPR,
      G_LIST_EXPR, G_LIST_SEQ_EXPR, G_LITERAL_EXPR, G_LTE_EXPR,
      G_LT_EXPR, G_MAP_EXPR, G_MAP_PAIR_EXPR, G_MAP_SEQ_EXPR,
      G_MINUS_EXPR, G_NEGATIVE_EXPR, G_NEW_EXPR, G_NON_EQ_EXPR,
      G_OR_EXPR, G_PLUS_EXPR, G_POSITIVE_EXPR, G_PRODUCT_EXPR,
      G_QUERY_EXPR, G_REMAINDER_EXPR, G_SEQ_EXPR, G_TERNARY_EXPR,
      G_THIS_EXPR, G_VARIABLE_EXPR),
  };

  /* ********************************************************** */
  // annotation* parameter
  static boolean abstract_parameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abstract_parameter")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = abstract_parameter_0(b, l + 1);
    r = r && parameter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // annotation*
  private static boolean abstract_parameter_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abstract_parameter_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!annotation(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "abstract_parameter_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // (abstract_parameter ',')* abstract_parameter
  static boolean abstract_parameters(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abstract_parameters")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = abstract_parameters_0(b, l + 1);
    r = r && abstract_parameter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (abstract_parameter ',')*
  private static boolean abstract_parameters_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abstract_parameters_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!abstract_parameters_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "abstract_parameters_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // abstract_parameter ','
  private static boolean abstract_parameters_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abstract_parameters_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = abstract_parameter(b, l + 1);
    r = r && consumeToken(b, G_COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // id ('(' abstract_parameters? ')')? action_body
  public static boolean action(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "action")) return false;
    if (!nextTokenIs(b, G_ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, G_ID);
    r = r && action_1(b, l + 1);
    r = r && action_body(b, l + 1);
    exit_section_(b, m, G_ACTION, r);
    return r;
  }

  // ('(' abstract_parameters? ')')?
  private static boolean action_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "action_1")) return false;
    action_1_0(b, l + 1);
    return true;
  }

  // '(' abstract_parameters? ')'
  private static boolean action_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "action_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, G_LEFT_PAREN);
    r = r && action_1_0_1(b, l + 1);
    r = r && consumeToken(b, G_RIGHT_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // abstract_parameters?
  private static boolean action_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "action_1_0_1")) return false;
    abstract_parameters(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // action_body_expr | action_body_statement
  static boolean action_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "action_body")) return false;
    if (!nextTokenIs(b, "", G_OP_EQ, G_LEFT_BRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = action_body_expr(b, l + 1);
    if (!r) r = action_body_statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '=' expr ';'
  static boolean action_body_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "action_body_expr")) return false;
    if (!nextTokenIsFast(b, G_OP_EQ)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenFast(b, G_OP_EQ);
    r = r && expr(b, l + 1, -1);
    r = r && consumeToken(b, G_SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // block_stmt
  static boolean action_body_statement(PsiBuilder b, int l) {
    return block_stmt(b, l + 1);
  }

  /* ********************************************************** */
  // '@' id '=' annotation_arg | '@' id '(' annotation_arg_sequence ')'| '@' id
  public static boolean annotation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation")) return false;
    if (!nextTokenIs(b, G_AT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = annotation_0(b, l + 1);
    if (!r) r = annotation_1(b, l + 1);
    if (!r) r = parseTokens(b, 0, G_AT, G_ID);
    exit_section_(b, m, G_ANNOTATION, r);
    return r;
  }

  // '@' id '=' annotation_arg
  private static boolean annotation_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, G_AT, G_ID, G_OP_EQ);
    r = r && annotation_arg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '@' id '(' annotation_arg_sequence ')'
  private static boolean annotation_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, G_AT, G_ID, G_LEFT_PAREN);
    r = r && annotation_arg_sequence(b, l + 1);
    r = r && consumeToken(b, G_RIGHT_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // literal | annotation_arg_list | annotation_arg_map
  static boolean annotation_arg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_arg")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = literal(b, l + 1);
    if (!r) r = annotation_arg_list(b, l + 1);
    if (!r) r = annotation_arg_map(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '[' annotation_arg_sequence? ']'
  static boolean annotation_arg_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_arg_list")) return false;
    if (!nextTokenIs(b, G_LEFT_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, G_LEFT_BRACKET);
    r = r && annotation_arg_list_1(b, l + 1);
    r = r && consumeToken(b, G_RIGHT_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // annotation_arg_sequence?
  private static boolean annotation_arg_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_arg_list_1")) return false;
    annotation_arg_sequence(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // '[' ((annotation_arg_pair ',')* annotation_arg_pair)? ']'
  static boolean annotation_arg_map(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_arg_map")) return false;
    if (!nextTokenIs(b, G_LEFT_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, G_LEFT_BRACKET);
    r = r && annotation_arg_map_1(b, l + 1);
    r = r && consumeToken(b, G_RIGHT_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // ((annotation_arg_pair ',')* annotation_arg_pair)?
  private static boolean annotation_arg_map_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_arg_map_1")) return false;
    annotation_arg_map_1_0(b, l + 1);
    return true;
  }

  // (annotation_arg_pair ',')* annotation_arg_pair
  private static boolean annotation_arg_map_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_arg_map_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = annotation_arg_map_1_0_0(b, l + 1);
    r = r && annotation_arg_pair(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (annotation_arg_pair ',')*
  private static boolean annotation_arg_map_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_arg_map_1_0_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!annotation_arg_map_1_0_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "annotation_arg_map_1_0_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // annotation_arg_pair ','
  private static boolean annotation_arg_map_1_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_arg_map_1_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = annotation_arg_pair(b, l + 1);
    r = r && consumeToken(b, G_COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // annotation_arg ':' annotation_arg
  static boolean annotation_arg_pair(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_arg_pair")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = annotation_arg(b, l + 1);
    r = r && consumeToken(b, G_COLON);
    r = r && annotation_arg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (annotation_arg ',')* annotation_arg
  static boolean annotation_arg_sequence(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_arg_sequence")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = annotation_arg_sequence_0(b, l + 1);
    r = r && annotation_arg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (annotation_arg ',')*
  private static boolean annotation_arg_sequence_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_arg_sequence_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!annotation_arg_sequence_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "annotation_arg_sequence_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // annotation_arg ','
  private static boolean annotation_arg_sequence_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_arg_sequence_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = annotation_arg(b, l + 1);
    r = r && consumeToken(b, G_COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // expr '=' (assign_stmt | expr_stmt)
  public static boolean assign_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assign_stmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, G_ASSIGN_STMT, "<assign stmt>");
    r = expr(b, l + 1, -1);
    r = r && consumeToken(b, G_OP_EQ);
    r = r && assign_stmt_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // assign_stmt | expr_stmt
  private static boolean assign_stmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assign_stmt_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = assign_stmt(b, l + 1);
    if (!r) r = expr_stmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '{' stmt* '}'
  public static boolean block_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_stmt")) return false;
    if (!nextTokenIs(b, G_LEFT_BRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, G_LEFT_BRACE);
    r = r && block_stmt_1(b, l + 1);
    r = r && consumeToken(b, G_RIGHT_BRACE);
    exit_section_(b, m, G_BLOCK_STMT, r);
    return r;
  }

  // stmt*
  private static boolean block_stmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_stmt_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!stmt(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "block_stmt_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // 'break' int? ';'
  public static boolean break_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "break_stmt")) return false;
    if (!nextTokenIs(b, G_KW_BREAK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, G_KW_BREAK);
    r = r && break_stmt_1(b, l + 1);
    r = r && consumeToken(b, G_SEMICOLON);
    exit_section_(b, m, G_BREAK_STMT, r);
    return r;
  }

  // int?
  private static boolean break_stmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "break_stmt_1")) return false;
    consumeToken(b, G_INT);
    return true;
  }

  /* ********************************************************** */
  // (',' expr)+
  static boolean conditions(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditions")) return false;
    if (!nextTokenIs(b, G_COMMA)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = conditions_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!conditions_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "conditions", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ',' expr
  private static boolean conditions_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditions_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, G_COMMA);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SYMBOL_NAME '(' abstract_parameters? ')' block_stmt guard?
  public static boolean constructor(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructor")) return false;
    if (!nextTokenIs(b, G_SYMBOL_NAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, G_SYMBOL_NAME, G_LEFT_PAREN);
    r = r && constructor_2(b, l + 1);
    r = r && consumeToken(b, G_RIGHT_PAREN);
    r = r && block_stmt(b, l + 1);
    r = r && constructor_5(b, l + 1);
    exit_section_(b, m, G_CONSTRUCTOR, r);
    return r;
  }

  // abstract_parameters?
  private static boolean constructor_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructor_2")) return false;
    abstract_parameters(b, l + 1);
    return true;
  }

  // guard?
  private static boolean constructor_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructor_5")) return false;
    guard(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'continue' int? ';'
  public static boolean continue_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "continue_stmt")) return false;
    if (!nextTokenIs(b, G_KW_CONTINUE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, G_KW_CONTINUE);
    r = r && continue_stmt_1(b, l + 1);
    r = r && consumeToken(b, G_SEMICOLON);
    exit_section_(b, m, G_CONTINUE_STMT, r);
    return r;
  }

  // int?
  private static boolean continue_stmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "continue_stmt_1")) return false;
    consumeToken(b, G_INT);
    return true;
  }

  /* ********************************************************** */
  // 'rest' | 'json-api'
  static boolean controller_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "controller_type")) return false;
    if (!nextTokenIs(b, "", G_KW_JSON_API, G_KW_REST)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, G_KW_REST);
    if (!r) r = consumeToken(b, G_KW_JSON_API);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // controller_type 'controller' route '{' member* '}'
  public static boolean decl_controller(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_controller")) return false;
    if (!nextTokenIs(b, "<decl controller>", G_KW_JSON_API, G_KW_REST)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, G_DECL_CONTROLLER, "<decl controller>");
    r = controller_type(b, l + 1);
    r = r && consumeToken(b, G_KW_CONTROLLER);
    r = r && route(b, l + 1);
    r = r && consumeToken(b, G_LEFT_BRACE);
    r = r && decl_controller_4(b, l + 1);
    r = r && consumeToken(b, G_RIGHT_BRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // member*
  private static boolean decl_controller_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_controller_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!member(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "decl_controller_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // 'entity' SYMBOL_NAME '{' member* '}'
  public static boolean decl_entity(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_entity")) return false;
    if (!nextTokenIs(b, G_KW_ENTITY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, G_KW_ENTITY, G_SYMBOL_NAME, G_LEFT_BRACE);
    r = r && decl_entity_3(b, l + 1);
    r = r && consumeToken(b, G_RIGHT_BRACE);
    exit_section_(b, m, G_DECL_ENTITY, r);
    return r;
  }

  // member*
  private static boolean decl_entity_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_entity_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!member(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "decl_entity_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // 'repository' 'for' SYMBOL_NAME '{' member* '}'
  public static boolean decl_repo(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_repo")) return false;
    if (!nextTokenIs(b, G_KW_REPOSITORY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, G_KW_REPOSITORY, G_KW_FOR, G_SYMBOL_NAME, G_LEFT_BRACE);
    r = r && decl_repo_4(b, l + 1);
    r = r && consumeToken(b, G_RIGHT_BRACE);
    exit_section_(b, m, G_DECL_REPO, r);
    return r;
  }

  // member*
  private static boolean decl_repo_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_repo_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!member(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "decl_repo_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // ('util' | 'service') SYMBOL_NAME '{' member* '}'
  public static boolean decl_util(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_util")) return false;
    if (!nextTokenIs(b, "<decl util>", G_KW_SERVICE, G_KW_UTIL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, G_DECL_UTIL, "<decl util>");
    r = decl_util_0(b, l + 1);
    r = r && consumeTokens(b, 0, G_SYMBOL_NAME, G_LEFT_BRACE);
    r = r && decl_util_3(b, l + 1);
    r = r && consumeToken(b, G_RIGHT_BRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'util' | 'service'
  private static boolean decl_util_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_util_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, G_KW_UTIL);
    if (!r) r = consumeToken(b, G_KW_SERVICE);
    exit_section_(b, m, null, r);
    return r;
  }

  // member*
  private static boolean decl_util_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_util_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!member(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "decl_util_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // 'value' SYMBOL_NAME '{' member* '}'
  public static boolean decl_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_value")) return false;
    if (!nextTokenIs(b, G_KW_VALUE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, G_KW_VALUE, G_SYMBOL_NAME, G_LEFT_BRACE);
    r = r && decl_value_3(b, l + 1);
    r = r && consumeToken(b, G_RIGHT_BRACE);
    exit_section_(b, m, G_DECL_VALUE, r);
    return r;
  }

  // member*
  private static boolean decl_value_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_value_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!member(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "decl_value_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // annotation* (decl_entity | decl_value | decl_repo | decl_controller | decl_util)
  public static boolean declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, G_DECLARATION, "<declaration>");
    r = declaration_0(b, l + 1);
    r = r && declaration_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
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

  // decl_entity | decl_value | decl_repo | decl_controller | decl_util
  private static boolean declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = decl_entity(b, l + 1);
    if (!r) r = decl_value(b, l + 1);
    if (!r) r = decl_repo(b, l + 1);
    if (!r) r = decl_controller(b, l + 1);
    if (!r) r = decl_util(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '=' (assign_stmt | expr_stmt)
  static boolean declare_default_val(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declare_default_val")) return false;
    if (!nextTokenIs(b, G_OP_EQ)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, G_OP_EQ);
    r = r && declare_default_val_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // assign_stmt | expr_stmt
  private static boolean declare_default_val_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declare_default_val_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = assign_stmt(b, l + 1);
    if (!r) r = expr_stmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // type id (declare_default_val | ';')
  public static boolean declare_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declare_stmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, G_DECLARE_STMT, "<declare stmt>");
    r = type(b, l + 1, -1);
    r = r && consumeToken(b, G_ID);
    r = r && declare_stmt_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // declare_default_val | ';'
  private static boolean declare_stmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declare_stmt_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = declare_default_val(b, l + 1);
    if (!r) r = consumeToken(b, G_SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // literal | dv_list | dv_map | get | new
  public static boolean default_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "default_value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, G_DEFAULT_VALUE, "<default value>");
    r = literal(b, l + 1);
    if (!r) r = dv_list(b, l + 1);
    if (!r) r = dv_map(b, l + 1);
    if (!r) r = get(b, l + 1);
    if (!r) r = new_$(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '[' dv_sequence? ']'
  public static boolean dv_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dv_list")) return false;
    if (!nextTokenIs(b, G_LEFT_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, G_LEFT_BRACKET);
    r = r && dv_list_1(b, l + 1);
    r = r && consumeToken(b, G_RIGHT_BRACKET);
    exit_section_(b, m, G_DV_LIST, r);
    return r;
  }

  // dv_sequence?
  private static boolean dv_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dv_list_1")) return false;
    dv_sequence(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // '{' dv_map_sequence? '}'
  public static boolean dv_map(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dv_map")) return false;
    if (!nextTokenIs(b, G_LEFT_BRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, G_LEFT_BRACE);
    r = r && dv_map_1(b, l + 1);
    r = r && consumeToken(b, G_RIGHT_BRACE);
    exit_section_(b, m, G_DV_MAP, r);
    return r;
  }

  // dv_map_sequence?
  private static boolean dv_map_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dv_map_1")) return false;
    dv_map_sequence(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // default_value ':' default_value
  public static boolean dv_map_pair(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dv_map_pair")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, G_DV_MAP_PAIR, "<dv map pair>");
    r = default_value(b, l + 1);
    r = r && consumeToken(b, G_COLON);
    r = r && default_value(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ((dv_map_pair ',')* dv_map_pair) | (dv_map_pair ',')+
  public static boolean dv_map_sequence(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dv_map_sequence")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, G_DV_MAP_SEQUENCE, "<dv map sequence>");
    r = dv_map_sequence_0(b, l + 1);
    if (!r) r = dv_map_sequence_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (dv_map_pair ',')* dv_map_pair
  private static boolean dv_map_sequence_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dv_map_sequence_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = dv_map_sequence_0_0(b, l + 1);
    r = r && dv_map_pair(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (dv_map_pair ',')*
  private static boolean dv_map_sequence_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dv_map_sequence_0_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!dv_map_sequence_0_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "dv_map_sequence_0_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // dv_map_pair ','
  private static boolean dv_map_sequence_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dv_map_sequence_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = dv_map_pair(b, l + 1);
    r = r && consumeToken(b, G_COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  // (dv_map_pair ',')+
  private static boolean dv_map_sequence_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dv_map_sequence_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = dv_map_sequence_1_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!dv_map_sequence_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "dv_map_sequence_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // dv_map_pair ','
  private static boolean dv_map_sequence_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dv_map_sequence_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = dv_map_pair(b, l + 1);
    r = r && consumeToken(b, G_COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ((default_value ',')* default_value) | (default_value ',')+
  public static boolean dv_sequence(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dv_sequence")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, G_DV_SEQUENCE, "<dv sequence>");
    r = dv_sequence_0(b, l + 1);
    if (!r) r = dv_sequence_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (default_value ',')* default_value
  private static boolean dv_sequence_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dv_sequence_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = dv_sequence_0_0(b, l + 1);
    r = r && default_value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (default_value ',')*
  private static boolean dv_sequence_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dv_sequence_0_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!dv_sequence_0_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "dv_sequence_0_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // default_value ','
  private static boolean dv_sequence_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dv_sequence_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = default_value(b, l + 1);
    r = r && consumeToken(b, G_COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  // (default_value ',')+
  private static boolean dv_sequence_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dv_sequence_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = dv_sequence_1_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!dv_sequence_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "dv_sequence_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // default_value ','
  private static boolean dv_sequence_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dv_sequence_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = default_value(b, l + 1);
    r = r && consumeToken(b, G_COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ';'
  public static boolean empty_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "empty_stmt")) return false;
    if (!nextTokenIs(b, G_SEMICOLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, G_SEMICOLON);
    exit_section_(b, m, G_EMPTY_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // expr ';'
  public static boolean expr_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_stmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, G_EXPR_STMT, "<expr stmt>");
    r = expr(b, l + 1, -1);
    r = r && consumeToken(b, G_SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'flush' expr? ';'
  public static boolean flush_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "flush_stmt")) return false;
    if (!nextTokenIs(b, G_KW_FLUSH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, G_KW_FLUSH);
    r = r && flush_stmt_1(b, l + 1);
    r = r && consumeToken(b, G_SEMICOLON);
    exit_section_(b, m, G_FLUSH_STMT, r);
    return r;
  }

  // expr?
  private static boolean flush_stmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "flush_stmt_1")) return false;
    expr(b, l + 1, -1);
    return true;
  }

  /* ********************************************************** */
  // 'for' '(' expr 'as' id (':' id) conditions? ')' stmt
  public static boolean foreach_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreach_stmt")) return false;
    if (!nextTokenIs(b, G_KW_FOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, G_KW_FOR, G_LEFT_PAREN);
    r = r && expr(b, l + 1, -1);
    r = r && consumeTokens(b, 0, G_KW_ALIAS, G_ID);
    r = r && foreach_stmt_5(b, l + 1);
    r = r && foreach_stmt_6(b, l + 1);
    r = r && consumeToken(b, G_RIGHT_PAREN);
    r = r && stmt(b, l + 1);
    exit_section_(b, m, G_FOREACH_STMT, r);
    return r;
  }

  // ':' id
  private static boolean foreach_stmt_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreach_stmt_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, G_COLON, G_ID);
    exit_section_(b, m, null, r);
    return r;
  }

  // conditions?
  private static boolean foreach_stmt_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreach_stmt_6")) return false;
    conditions(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'get' type
  public static boolean get(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "get")) return false;
    if (!nextTokenIs(b, G_KW_GET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, G_KW_GET);
    r = r && type(b, l + 1, -1);
    exit_section_(b, m, G_GET, r);
    return r;
  }

  /* ********************************************************** */
  // 'when' expr ';'
  static boolean guard(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "guard")) return false;
    if (!nextTokenIs(b, G_KW_WHEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, G_KW_WHEN);
    r = r && expr(b, l + 1, -1);
    r = r && consumeToken(b, G_SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'if' '(' expr ')' stmt ('else' stmt)
  public static boolean if_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_stmt")) return false;
    if (!nextTokenIs(b, G_KW_IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, G_KW_IF, G_LEFT_PAREN);
    r = r && expr(b, l + 1, -1);
    r = r && consumeToken(b, G_RIGHT_PAREN);
    r = r && stmt(b, l + 1);
    r = r && if_stmt_5(b, l + 1);
    exit_section_(b, m, G_IF_STMT, r);
    return r;
  }

  // 'else' stmt
  private static boolean if_stmt_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_stmt_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, G_KW_ELSE);
    r = r && stmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'import' qualified_name ('as' SYMBOL_NAME)? ';'
  public static boolean import_artifact(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_artifact")) return false;
    if (!nextTokenIs(b, G_KW_IMPORT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, G_KW_IMPORT);
    r = r && qualified_name(b, l + 1);
    r = r && import_artifact_2(b, l + 1);
    r = r && consumeToken(b, G_SEMICOLON);
    exit_section_(b, m, G_IMPORT_ARTIFACT, r);
    return r;
  }

  // ('as' SYMBOL_NAME)?
  private static boolean import_artifact_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_artifact_2")) return false;
    import_artifact_2_0(b, l + 1);
    return true;
  }

  // 'as' SYMBOL_NAME
  private static boolean import_artifact_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_artifact_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, G_KW_ALIAS, G_SYMBOL_NAME);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // seq_expr | (expr ',')+
  public static boolean list_seq_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_seq_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, G_LIST_SEQ_EXPR, "<list seq expr>");
    r = seq_expr(b, l + 1);
    if (!r) r = list_seq_expr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (expr ',')+
  private static boolean list_seq_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_seq_expr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = list_seq_expr_1_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!list_seq_expr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "list_seq_expr_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // expr ','
  private static boolean list_seq_expr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_seq_expr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1, -1);
    r = r && consumeToken(b, G_COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // string | int | decimal | boolean
  public static boolean literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, G_LITERAL, "<literal>");
    r = consumeToken(b, G_STRING);
    if (!r) r = consumeToken(b, G_INT);
    if (!r) r = consumeToken(b, G_DECIMAL);
    if (!r) r = consumeToken(b, G_BOOLEAN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // expr ':' expr
  public static boolean map_pair_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "map_pair_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, G_MAP_PAIR_EXPR, "<map pair expr>");
    r = expr(b, l + 1, -1);
    r = r && consumeToken(b, G_COLON);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ((map_pair_expr ',')* map_pair_expr) | (map_pair_expr ',')+
  public static boolean map_seq_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "map_seq_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, G_MAP_SEQ_EXPR, "<map seq expr>");
    r = map_seq_expr_0(b, l + 1);
    if (!r) r = map_seq_expr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (map_pair_expr ',')* map_pair_expr
  private static boolean map_seq_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "map_seq_expr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = map_seq_expr_0_0(b, l + 1);
    r = r && map_pair_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (map_pair_expr ',')*
  private static boolean map_seq_expr_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "map_seq_expr_0_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!map_seq_expr_0_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "map_seq_expr_0_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // map_pair_expr ','
  private static boolean map_seq_expr_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "map_seq_expr_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = map_pair_expr(b, l + 1);
    r = r && consumeToken(b, G_COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  // (map_pair_expr ',')+
  private static boolean map_seq_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "map_seq_expr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = map_seq_expr_1_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!map_seq_expr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "map_seq_expr_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // map_pair_expr ','
  private static boolean map_seq_expr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "map_seq_expr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = map_pair_expr(b, l + 1);
    r = r && consumeToken(b, G_COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // annotation* (property | constructor | method | action)
  public static boolean member(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, G_MEMBER, "<member>");
    r = member_0(b, l + 1);
    r = r && member_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // annotation*
  private static boolean member_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!annotation(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "member_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // property | constructor | method | action
  private static boolean member_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = property(b, l + 1);
    if (!r) r = constructor(b, l + 1);
    if (!r) r = method(b, l + 1);
    if (!r) r = action(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (modifier type id '(' abstract_parameters? ')' block_stmt guard?)
  //          | (modifier type id '(' abstract_parameters? ')' '=' expr guard)
  //          | (modifier type id '(' abstract_parameters? ')' '=' expr ';')
  public static boolean method(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method")) return false;
    if (!nextTokenIs(b, "<method>", G_KW_PRIVATE, G_KW_PUBLIC)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, G_METHOD, "<method>");
    r = method_0(b, l + 1);
    if (!r) r = method_1(b, l + 1);
    if (!r) r = method_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // modifier type id '(' abstract_parameters? ')' block_stmt guard?
  private static boolean method_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = modifier(b, l + 1);
    r = r && type(b, l + 1, -1);
    r = r && consumeTokens(b, 0, G_ID, G_LEFT_PAREN);
    r = r && method_0_4(b, l + 1);
    r = r && consumeToken(b, G_RIGHT_PAREN);
    r = r && block_stmt(b, l + 1);
    r = r && method_0_7(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // abstract_parameters?
  private static boolean method_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_0_4")) return false;
    abstract_parameters(b, l + 1);
    return true;
  }

  // guard?
  private static boolean method_0_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_0_7")) return false;
    guard(b, l + 1);
    return true;
  }

  // modifier type id '(' abstract_parameters? ')' '=' expr guard
  private static boolean method_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = modifier(b, l + 1);
    r = r && type(b, l + 1, -1);
    r = r && consumeTokens(b, 0, G_ID, G_LEFT_PAREN);
    r = r && method_1_4(b, l + 1);
    r = r && consumeTokens(b, 0, G_RIGHT_PAREN, G_OP_EQ);
    r = r && expr(b, l + 1, -1);
    r = r && guard(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // abstract_parameters?
  private static boolean method_1_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_1_4")) return false;
    abstract_parameters(b, l + 1);
    return true;
  }

  // modifier type id '(' abstract_parameters? ')' '=' expr ';'
  private static boolean method_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = modifier(b, l + 1);
    r = r && type(b, l + 1, -1);
    r = r && consumeTokens(b, 0, G_ID, G_LEFT_PAREN);
    r = r && method_2_4(b, l + 1);
    r = r && consumeTokens(b, 0, G_RIGHT_PAREN, G_OP_EQ);
    r = r && expr(b, l + 1, -1);
    r = r && consumeToken(b, G_SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // abstract_parameters?
  private static boolean method_2_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_2_4")) return false;
    abstract_parameters(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'private' | 'public'
  static boolean modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "modifier")) return false;
    if (!nextTokenIs(b, "", G_KW_PRIVATE, G_KW_PUBLIC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, G_KW_PRIVATE);
    if (!r) r = consumeToken(b, G_KW_PUBLIC);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'new' artifact_type '(' dv_sequence? ')'
  public static boolean new_$(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "new_$")) return false;
    if (!nextTokenIs(b, G_KW_NEW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, G_KW_NEW);
    r = r && artifact_type(b, l + 1);
    r = r && consumeToken(b, G_LEFT_PAREN);
    r = r && new_3(b, l + 1);
    r = r && consumeToken(b, G_RIGHT_PAREN);
    exit_section_(b, m, G_NEW, r);
    return r;
  }

  // dv_sequence?
  private static boolean new_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "new_3")) return false;
    dv_sequence(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // return_stmt | persist_stmt | flush_stmt | remove_stmt | break_stmt | continue_stmt | declare_stmt
  static boolean non_assoc_group(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "non_assoc_group")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = return_stmt(b, l + 1);
    if (!r) r = persist_stmt(b, l + 1);
    if (!r) r = flush_stmt(b, l + 1);
    if (!r) r = remove_stmt(b, l + 1);
    if (!r) r = break_stmt(b, l + 1);
    if (!r) r = continue_stmt(b, l + 1);
    if (!r) r = declare_stmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // type id ('=' default_value)?
  static boolean parameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type(b, l + 1, -1);
    r = r && consumeToken(b, G_ID);
    r = r && parameter_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('=' default_value)?
  private static boolean parameter_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_2")) return false;
    parameter_2_0(b, l + 1);
    return true;
  }

  // '=' default_value
  private static boolean parameter_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, G_OP_EQ);
    r = r && default_value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'persist' expr ';'
  public static boolean persist_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "persist_stmt")) return false;
    if (!nextTokenIs(b, G_KW_PERSIST)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, G_KW_PERSIST);
    r = r && expr(b, l + 1, -1);
    r = r && consumeToken(b, G_SEMICOLON);
    exit_section_(b, m, G_PERSIST_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // type id ('=' property_default_value)? ';'
  public static boolean property(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, G_PROPERTY, "<property>");
    r = type(b, l + 1, -1);
    r = r && consumeToken(b, G_ID);
    r = r && property_2(b, l + 1);
    r = r && consumeToken(b, G_SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ('=' property_default_value)?
  private static boolean property_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_2")) return false;
    property_2_0(b, l + 1);
    return true;
  }

  // '=' property_default_value
  private static boolean property_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, G_OP_EQ);
    r = r && property_default_value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // default_value
  public static boolean property_default_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_default_value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, G_PROPERTY_DEFAULT_VALUE, "<property default value>");
    r = default_value(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // SYMBOL_NAME ('::' SYMBOL_NAME)*
  public static boolean qualified_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualified_name")) return false;
    if (!nextTokenIs(b, G_SYMBOL_NAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, G_SYMBOL_NAME);
    r = r && qualified_name_1(b, l + 1);
    exit_section_(b, m, G_QUALIFIED_NAME, r);
    return r;
  }

  // ('::' SYMBOL_NAME)*
  private static boolean qualified_name_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualified_name_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!qualified_name_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "qualified_name_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '::' SYMBOL_NAME
  private static boolean qualified_name_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualified_name_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, G_DOUBLE_COLON, G_SYMBOL_NAME);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // id '.' id
  public static boolean query_field(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query_field")) return false;
    if (!nextTokenIs(b, G_ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, G_ID, G_DOT, G_ID);
    exit_section_(b, m, G_QUERY_FIELD, r);
    return r;
  }

  /* ********************************************************** */
  // "LIMIT" qexpr | "LIMIT" qexpr "OFFSET" qexpr | "LIMIT" qexpr "," qexpr
  static boolean query_limit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query_limit")) return false;
    if (!nextTokenIs(b, G_KW_LIMIT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = query_limit_0(b, l + 1);
    if (!r) r = query_limit_1(b, l + 1);
    if (!r) r = query_limit_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "LIMIT" qexpr
  private static boolean query_limit_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query_limit_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, G_KW_LIMIT);
    r = r && qexpr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "LIMIT" qexpr "OFFSET" qexpr
  private static boolean query_limit_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query_limit_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, G_KW_LIMIT);
    r = r && qexpr(b, l + 1, -1);
    r = r && consumeToken(b, G_KW_OFFSET);
    r = r && qexpr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "LIMIT" qexpr "," qexpr
  private static boolean query_limit_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query_limit_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, G_KW_LIMIT);
    r = r && qexpr(b, l + 1, -1);
    r = r && consumeToken(b, G_COMMA);
    r = r && qexpr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "ORDER" "BY" (query_order_by_field ',')* query_order_by_field
  static boolean query_order_by(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query_order_by")) return false;
    if (!nextTokenIs(b, G_KW_ORDER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, G_KW_ORDER, G_KW_BY);
    r = r && query_order_by_2(b, l + 1);
    r = r && query_order_by_field(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (query_order_by_field ',')*
  private static boolean query_order_by_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query_order_by_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!query_order_by_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "query_order_by_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // query_order_by_field ','
  private static boolean query_order_by_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query_order_by_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = query_order_by_field(b, l + 1);
    r = r && consumeToken(b, G_COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // query_field | query_field "ASC" | query_field "DESC"
  static boolean query_order_by_field(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query_order_by_field")) return false;
    if (!nextTokenIs(b, G_ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = query_field(b, l + 1);
    if (!r) r = query_order_by_field_1(b, l + 1);
    if (!r) r = query_order_by_field_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // query_field "ASC"
  private static boolean query_order_by_field_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query_order_by_field_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = query_field(b, l + 1);
    r = r && consumeToken(b, G_KW_ASC);
    exit_section_(b, m, null, r);
    return r;
  }

  // query_field "DESC"
  private static boolean query_order_by_field_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query_order_by_field_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = query_field(b, l + 1);
    r = r && consumeToken(b, G_KW_DESC);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "SELECT" query_spec "FROM" query_source query_where? query_order_by? query_limit?
  static boolean query_select(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query_select")) return false;
    if (!nextTokenIs(b, G_KW_SELECT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, G_KW_SELECT);
    r = r && query_spec(b, l + 1);
    r = r && consumeToken(b, G_KW_FROM);
    r = r && query_source(b, l + 1);
    r = r && query_select_4(b, l + 1);
    r = r && query_select_5(b, l + 1);
    r = r && query_select_6(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // query_where?
  private static boolean query_select_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query_select_4")) return false;
    query_where(b, l + 1);
    return true;
  }

  // query_order_by?
  private static boolean query_select_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query_select_5")) return false;
    query_order_by(b, l + 1);
    return true;
  }

  // query_limit?
  private static boolean query_select_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query_select_6")) return false;
    query_limit(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // SYMBOL_NAME id | SYMBOL_NAME "as" id
  static boolean query_source(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query_source")) return false;
    if (!nextTokenIs(b, G_SYMBOL_NAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parseTokens(b, 0, G_SYMBOL_NAME, G_ID);
    if (!r) r = parseTokens(b, 0, G_SYMBOL_NAME, G_KW_ALIAS, G_ID);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // id ('[' ']')?
  public static boolean query_spec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query_spec")) return false;
    if (!nextTokenIs(b, G_ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, G_ID);
    r = r && query_spec_1(b, l + 1);
    exit_section_(b, m, G_QUERY_SPEC, r);
    return r;
  }

  // ('[' ']')?
  private static boolean query_spec_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query_spec_1")) return false;
    query_spec_1_0(b, l + 1);
    return true;
  }

  // '[' ']'
  private static boolean query_spec_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query_spec_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, G_LEFT_BRACKET, G_RIGHT_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // query_select
  public static boolean query_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query_statement")) return false;
    if (!nextTokenIs(b, G_KW_SELECT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = query_select(b, l + 1);
    exit_section_(b, m, G_QUERY_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // "WHERE" qexpr
  static boolean query_where(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query_where")) return false;
    if (!nextTokenIs(b, G_KW_WHERE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, G_KW_WHERE);
    r = r && qexpr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'remove' expr ';'
  public static boolean remove_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "remove_stmt")) return false;
    if (!nextTokenIs(b, G_KW_REMOVE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, G_KW_REMOVE);
    r = r && expr(b, l + 1, -1);
    r = r && consumeToken(b, G_SEMICOLON);
    exit_section_(b, m, G_REMOVE_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // 'return' expr? ';'
  public static boolean return_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_stmt")) return false;
    if (!nextTokenIs(b, G_KW_RETURN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, G_KW_RETURN);
    r = r && return_stmt_1(b, l + 1);
    r = r && consumeToken(b, G_SEMICOLON);
    exit_section_(b, m, G_RETURN_STMT, r);
    return r;
  }

  // expr?
  private static boolean return_stmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_stmt_1")) return false;
    expr(b, l + 1, -1);
    return true;
  }

  /* ********************************************************** */
  // !<<eof>> annotation* 'namespace' qualified_name import_artifact* declaration?
  static boolean root(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = root_0(b, l + 1);
    r = r && root_1(b, l + 1);
    r = r && consumeToken(b, G_KW_NS);
    r = r && qualified_name(b, l + 1);
    r = r && root_4(b, l + 1);
    r = r && root_5(b, l + 1);
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
  private static boolean root_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!import_artifact(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "root_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // declaration?
  private static boolean root_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_5")) return false;
    declaration(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // '/' route_parts?
  static boolean route(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "route")) return false;
    if (!nextTokenIs(b, G_SLASH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, G_SLASH);
    r = r && route_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // route_parts?
  private static boolean route_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "route_1")) return false;
    route_parts(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // id | route_placeholder
  static boolean route_part(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "route_part")) return false;
    if (!nextTokenIs(b, "", G_COLON, G_ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, G_ID);
    if (!r) r = route_placeholder(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (route_part '/')* route_part
  static boolean route_parts(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "route_parts")) return false;
    if (!nextTokenIs(b, "", G_COLON, G_ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = route_parts_0(b, l + 1);
    r = r && route_part(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (route_part '/')*
  private static boolean route_parts_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "route_parts_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!route_parts_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "route_parts_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // route_part '/'
  private static boolean route_parts_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "route_parts_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = route_part(b, l + 1);
    r = r && consumeToken(b, G_SLASH);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ':' id
  static boolean route_placeholder(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "route_placeholder")) return false;
    if (!nextTokenIs(b, G_COLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, G_COLON, G_ID);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (expr ',')* expr
  public static boolean seq_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "seq_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, G_SEQ_EXPR, "<seq expr>");
    r = seq_expr_0(b, l + 1);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (expr ',')*
  private static boolean seq_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "seq_expr_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!seq_expr_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "seq_expr_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // expr ','
  private static boolean seq_expr_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "seq_expr_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1, -1);
    r = r && consumeToken(b, G_COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // expr_stmt
  //        | block_stmt
  //        | if_stmt
  //        | assign_stmt
  //        | foreach_stmt
  //        | non_assoc_group
  //        | empty_stmt
  public static boolean stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, G_STMT, "<stmt>");
    r = expr_stmt(b, l + 1);
    if (!r) r = block_stmt(b, l + 1);
    if (!r) r = if_stmt(b, l + 1);
    if (!r) r = assign_stmt(b, l + 1);
    if (!r) r = foreach_stmt(b, l + 1);
    if (!r) r = non_assoc_group(b, l + 1);
    if (!r) r = empty_stmt(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Expression root: expr
  // Operator priority table:
  // 0: PREFIX(cast_expr)
  // 1: PREFIX(bracket_expr)
  // 2: ATOM(literal_expr)
  // 3: ATOM(list_expr)
  // 4: ATOM(map_expr)
  // 5: PREFIX(negative_expr)
  // 6: ATOM(positive_expr)
  // 7: BINARY(invoke_expr) ATOM(invoke_final_expr)
  // 8: POSTFIX(field_expr)
  // 9: ATOM(variable_expr)
  // 10: ATOM(new_expr)
  // 11: ATOM(this_expr)
  // 12: BINARY(product_expr) BINARY(division_expr)
  // 13: BINARY(plus_expr) BINARY(minus_expr)
  // 14: BINARY(remainder_expr)
  // 15: BINARY(concat_expr)
  // 16: BINARY(lt_expr) BINARY(lte_expr) BINARY(gt_expr) BINARY(gte_expr)
  //    BINARY(eq_expr) BINARY(non_eq_expr)
  // 17: BINARY(and_expr) BINARY(or_expr)
  // 18: BINARY(ternary_expr)
  // 19: ATOM(query_expr)
  public static boolean expr(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "expr")) return false;
    addVariant(b, "<expr>");
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<expr>");
    r = cast_expr(b, l + 1);
    if (!r) r = bracket_expr(b, l + 1);
    if (!r) r = literal_expr(b, l + 1);
    if (!r) r = list_expr(b, l + 1);
    if (!r) r = map_expr(b, l + 1);
    if (!r) r = negative_expr(b, l + 1);
    if (!r) r = positive_expr(b, l + 1);
    if (!r) r = invoke_final_expr(b, l + 1);
    if (!r) r = variable_expr(b, l + 1);
    if (!r) r = new_expr(b, l + 1);
    if (!r) r = this_expr(b, l + 1);
    if (!r) r = query_expr(b, l + 1);
    p = r;
    r = r && expr_0(b, l + 1, g);
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  public static boolean expr_0(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "expr_0")) return false;
    boolean r = true;
    while (true) {
      Marker m = enter_section_(b, l, _LEFT_, null);
      if (g < 13 && consumeTokenSmart(b, G_MINUS)) {
        r = expr(b, l, 13);
        exit_section_(b, l, m, G_MINUS_EXPR, r, true, null);
      }
      else if (g < 13 && consumeTokenSmart(b, G_PLUS)) {
        r = expr(b, l, 13);
        exit_section_(b, l, m, G_PLUS_EXPR, r, true, null);
      }
      else if (g < 7 && consumeTokenSmart(b, G_DOT)) {
        r = expr(b, l, 6);
        exit_section_(b, l, m, G_INVOKE_EXPR, r, true, null);
      }
      else if (g < 8 && field_expr_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, G_FIELD_EXPR, r, true, null);
      }
      else if (g < 12 && consumeTokenSmart(b, G_ASTERIX)) {
        r = expr(b, l, 12);
        exit_section_(b, l, m, G_PRODUCT_EXPR, r, true, null);
      }
      else if (g < 12 && consumeTokenSmart(b, G_SLASH)) {
        r = expr(b, l, 12);
        exit_section_(b, l, m, G_DIVISION_EXPR, r, true, null);
      }
      else if (g < 14 && consumeTokenSmart(b, G_PERCENT)) {
        r = expr(b, l, 14);
        exit_section_(b, l, m, G_REMAINDER_EXPR, r, true, null);
      }
      else if (g < 15 && consumeTokenSmart(b, G_CONCAT)) {
        r = expr(b, l, 15);
        exit_section_(b, l, m, G_CONCAT_EXPR, r, true, null);
      }
      else if (g < 16 && consumeTokenSmart(b, G_LT)) {
        r = expr(b, l, 16);
        exit_section_(b, l, m, G_LT_EXPR, r, true, null);
      }
      else if (g < 16 && consumeTokenSmart(b, G_LTE)) {
        r = expr(b, l, 16);
        exit_section_(b, l, m, G_LTE_EXPR, r, true, null);
      }
      else if (g < 16 && consumeTokenSmart(b, G_GT)) {
        r = expr(b, l, 16);
        exit_section_(b, l, m, G_GT_EXPR, r, true, null);
      }
      else if (g < 16 && consumeTokenSmart(b, G_GTE)) {
        r = expr(b, l, 16);
        exit_section_(b, l, m, G_GTE_EXPR, r, true, null);
      }
      else if (g < 16 && consumeTokenSmart(b, G_EQ)) {
        r = expr(b, l, 16);
        exit_section_(b, l, m, G_EQ_EXPR, r, true, null);
      }
      else if (g < 16 && consumeTokenSmart(b, G_NON_EQ)) {
        r = expr(b, l, 16);
        exit_section_(b, l, m, G_NON_EQ_EXPR, r, true, null);
      }
      else if (g < 17 && consumeTokenSmart(b, G_AND)) {
        r = expr(b, l, 17);
        exit_section_(b, l, m, G_AND_EXPR, r, true, null);
      }
      else if (g < 17 && consumeTokenSmart(b, G_OR)) {
        r = expr(b, l, 17);
        exit_section_(b, l, m, G_OR_EXPR, r, true, null);
      }
      else if (g < 18 && consumeTokenSmart(b, G_QUESTION_MARK)) {
        r = report_error_(b, expr(b, l, 18));
        r = ternary_expr_1(b, l + 1) && r;
        exit_section_(b, l, m, G_TERNARY_EXPR, r, true, null);
      }
      else {
        exit_section_(b, l, m, null, false, false, null);
        break;
      }
    }
    return r;
  }

  public static boolean cast_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cast_expr")) return false;
    if (!nextTokenIsSmart(b, G_LEFT_PAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = cast_expr_0(b, l + 1);
    p = r;
    r = p && expr(b, l, 0);
    exit_section_(b, l, m, G_CAST_EXPR, r, p, null);
    return r || p;
  }

  // '(' type ')'
  private static boolean cast_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cast_expr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, G_LEFT_PAREN);
    r = r && type(b, l + 1, -1);
    r = r && consumeToken(b, G_RIGHT_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  public static boolean bracket_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bracket_expr")) return false;
    if (!nextTokenIsSmart(b, G_LEFT_PAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokenSmart(b, G_LEFT_PAREN);
    p = r;
    r = p && expr(b, l, 1);
    r = p && report_error_(b, consumeToken(b, G_RIGHT_PAREN)) && r;
    exit_section_(b, l, m, G_BRACKET_EXPR, r, p, null);
    return r || p;
  }

  // literal
  public static boolean literal_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, G_LITERAL_EXPR, "<literal expr>");
    r = literal(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '[' list_seq_expr? ']'
  public static boolean list_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_expr")) return false;
    if (!nextTokenIsSmart(b, G_LEFT_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, G_LEFT_BRACKET);
    r = r && list_expr_1(b, l + 1);
    r = r && consumeToken(b, G_RIGHT_BRACKET);
    exit_section_(b, m, G_LIST_EXPR, r);
    return r;
  }

  // list_seq_expr?
  private static boolean list_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_expr_1")) return false;
    list_seq_expr(b, l + 1);
    return true;
  }

  // '{' map_seq_expr? '}'
  public static boolean map_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "map_expr")) return false;
    if (!nextTokenIsSmart(b, G_LEFT_BRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, G_LEFT_BRACE);
    r = r && map_expr_1(b, l + 1);
    r = r && consumeToken(b, G_RIGHT_BRACE);
    exit_section_(b, m, G_MAP_EXPR, r);
    return r;
  }

  // map_seq_expr?
  private static boolean map_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "map_expr_1")) return false;
    map_seq_expr(b, l + 1);
    return true;
  }

  public static boolean negative_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "negative_expr")) return false;
    if (!nextTokenIsSmart(b, G_MINUS)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokenSmart(b, G_MINUS);
    p = r;
    r = p && expr(b, l, 5);
    exit_section_(b, l, m, G_NEGATIVE_EXPR, r, p, null);
    return r || p;
  }

  // '+'
  public static boolean positive_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "positive_expr")) return false;
    if (!nextTokenIsSmart(b, G_PLUS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, G_PLUS);
    exit_section_(b, m, G_POSITIVE_EXPR, r);
    return r;
  }

  // id '(' seq_expr? ')'
  public static boolean invoke_final_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "invoke_final_expr")) return false;
    if (!nextTokenIsSmart(b, G_ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokensSmart(b, 0, G_ID, G_LEFT_PAREN);
    r = r && invoke_final_expr_2(b, l + 1);
    r = r && consumeToken(b, G_RIGHT_PAREN);
    exit_section_(b, m, G_INVOKE_FINAL_EXPR, r);
    return r;
  }

  // seq_expr?
  private static boolean invoke_final_expr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "invoke_final_expr_2")) return false;
    seq_expr(b, l + 1);
    return true;
  }

  // '.' id
  private static boolean field_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_expr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokensSmart(b, 0, G_DOT, G_ID);
    exit_section_(b, m, null, r);
    return r;
  }

  // id
  public static boolean variable_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_expr")) return false;
    if (!nextTokenIsSmart(b, G_ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, G_ID);
    exit_section_(b, m, G_VARIABLE_EXPR, r);
    return r;
  }

  // 'new' SYMBOL_NAME '(' seq_expr? ')'
  public static boolean new_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "new_expr")) return false;
    if (!nextTokenIsSmart(b, G_KW_NEW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokensSmart(b, 0, G_KW_NEW, G_SYMBOL_NAME, G_LEFT_PAREN);
    r = r && new_expr_3(b, l + 1);
    r = r && consumeToken(b, G_RIGHT_PAREN);
    exit_section_(b, m, G_NEW_EXPR, r);
    return r;
  }

  // seq_expr?
  private static boolean new_expr_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "new_expr_3")) return false;
    seq_expr(b, l + 1);
    return true;
  }

  // 'this'
  public static boolean this_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "this_expr")) return false;
    if (!nextTokenIsSmart(b, G_KW_THIS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, G_KW_THIS);
    exit_section_(b, m, G_THIS_EXPR, r);
    return r;
  }

  // ':' expr
  private static boolean ternary_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ternary_expr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenFast(b, G_COLON);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // query_statement
  public static boolean query_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query_expr")) return false;
    if (!nextTokenIsSmart(b, G_KW_SELECT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = query_statement(b, l + 1);
    exit_section_(b, m, G_QUERY_EXPR, r);
    return r;
  }

  /* ********************************************************** */
  // Expression root: qexpr
  // Operator priority table:
  // 0: PREFIX(bracket_qexpr)
  // 1: BINARY(equals_qexpr)
  // 2: BINARY(non_equals_qexpr)
  // 3: BINARY(gt_qexpr)
  // 4: BINARY(gte_qexpr)
  // 5: BINARY(lt_qexpr)
  // 6: BINARY(lte_qexpr)
  // 7: POSTFIX(is_null_qexpr)
  // 8: POSTFIX(is_not_null_qexpr)
  // 9: BINARY(and_qexpr)
  // 10: BINARY(or_qexpr)
  // 11: ATOM(g_qexpr)
  // 12: ATOM(query_field_qexpr)
  public static boolean qexpr(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "qexpr")) return false;
    addVariant(b, "<qexpr>");
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<qexpr>");
    r = bracket_qexpr(b, l + 1);
    if (!r) r = g_qexpr(b, l + 1);
    if (!r) r = query_field_qexpr(b, l + 1);
    p = r;
    r = r && qexpr_0(b, l + 1, g);
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  public static boolean qexpr_0(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "qexpr_0")) return false;
    boolean r = true;
    while (true) {
      Marker m = enter_section_(b, l, _LEFT_, null);
      if (g < 1 && consumeTokenSmart(b, G_OP_EQ)) {
        r = qexpr(b, l, 1);
        exit_section_(b, l, m, G_EQUALS_QEXPR, r, true, null);
      }
      else if (g < 2 && consumeTokenSmart(b, G_NON_EQ)) {
        r = qexpr(b, l, 2);
        exit_section_(b, l, m, G_NON_EQUALS_QEXPR, r, true, null);
      }
      else if (g < 3 && consumeTokenSmart(b, G_GT)) {
        r = qexpr(b, l, 3);
        exit_section_(b, l, m, G_GT_QEXPR, r, true, null);
      }
      else if (g < 4 && consumeTokenSmart(b, G_GTE)) {
        r = qexpr(b, l, 4);
        exit_section_(b, l, m, G_GTE_QEXPR, r, true, null);
      }
      else if (g < 5 && consumeTokenSmart(b, G_LT)) {
        r = qexpr(b, l, 5);
        exit_section_(b, l, m, G_LT_QEXPR, r, true, null);
      }
      else if (g < 6 && consumeTokenSmart(b, G_LTE)) {
        r = qexpr(b, l, 6);
        exit_section_(b, l, m, G_LTE_QEXPR, r, true, null);
      }
      else if (g < 7 && parseTokensSmart(b, 0, G_KW_IS, G_KW_NULL)) {
        r = true;
        exit_section_(b, l, m, G_IS_NULL_QEXPR, r, true, null);
      }
      else if (g < 8 && parseTokensSmart(b, 0, G_KW_IS, G_KW_NOT, G_KW_NULL)) {
        r = true;
        exit_section_(b, l, m, G_IS_NOT_NULL_QEXPR, r, true, null);
      }
      else if (g < 9 && consumeTokenSmart(b, G_KW_AND)) {
        r = qexpr(b, l, 9);
        exit_section_(b, l, m, G_AND_QEXPR, r, true, null);
      }
      else if (g < 10 && consumeTokenSmart(b, G_KW_OR)) {
        r = qexpr(b, l, 10);
        exit_section_(b, l, m, G_OR_QEXPR, r, true, null);
      }
      else {
        exit_section_(b, l, m, null, false, false, null);
        break;
      }
    }
    return r;
  }

  public static boolean bracket_qexpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bracket_qexpr")) return false;
    if (!nextTokenIsSmart(b, G_LEFT_PAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokenSmart(b, G_LEFT_PAREN);
    p = r;
    r = p && qexpr(b, l, 0);
    r = p && report_error_(b, consumeToken(b, G_RIGHT_PAREN)) && r;
    exit_section_(b, l, m, G_BRACKET_QEXPR, r, p, null);
    return r || p;
  }

  // '<<' expr '>>'
  public static boolean g_qexpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "g_qexpr")) return false;
    if (!nextTokenIsSmart(b, G_QEXPR_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, G_QEXPR_START);
    r = r && expr(b, l + 1, -1);
    r = r && consumeToken(b, G_QEXPR_END);
    exit_section_(b, m, G_G_QEXPR, r);
    return r;
  }

  // query_field
  public static boolean query_field_qexpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query_field_qexpr")) return false;
    if (!nextTokenIsSmart(b, G_ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = query_field(b, l + 1);
    exit_section_(b, m, G_QUERY_FIELD_QEXPR, r);
    return r;
  }

  /* ********************************************************** */
  // Expression root: type
  // Operator priority table:
  // 0: ATOM(scalar_type)
  // 1: POSTFIX(list_type)
  // 2: ATOM(map_type)
  // 3: ATOM(repository_type)
  // 4: ATOM(artifact_type)
  // 5: ATOM(selfie_type)
  // 6: ATOM(void_type)
  public static boolean type(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "type")) return false;
    addVariant(b, "<type>");
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<type>");
    r = scalar_type(b, l + 1);
    if (!r) r = map_type(b, l + 1);
    if (!r) r = repository_type(b, l + 1);
    if (!r) r = artifact_type(b, l + 1);
    if (!r) r = selfie_type(b, l + 1);
    if (!r) r = void_type(b, l + 1);
    p = r;
    r = r && type_0(b, l + 1, g);
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  public static boolean type_0(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "type_0")) return false;
    boolean r = true;
    while (true) {
      Marker m = enter_section_(b, l, _LEFT_, null);
      if (g < 1 && parseTokensSmart(b, 0, G_LEFT_BRACKET, G_RIGHT_BRACKET)) {
        r = true;
        exit_section_(b, l, m, G_LIST_TYPE, r, true, null);
      }
      else {
        exit_section_(b, l, m, null, false, false, null);
        break;
      }
    }
    return r;
  }

  // TYPE_BOOL | TYPE_FLOAT | TYPE_INT | TYPE_STRING | TYPE_VOID
  public static boolean scalar_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "scalar_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, G_SCALAR_TYPE, "<scalar type>");
    r = consumeTokenSmart(b, G_TYPE_BOOL);
    if (!r) r = consumeTokenSmart(b, G_TYPE_FLOAT);
    if (!r) r = consumeTokenSmart(b, G_TYPE_INT);
    if (!r) r = consumeTokenSmart(b, G_TYPE_STRING);
    if (!r) r = consumeTokenSmart(b, G_TYPE_VOID);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '{' type ',' type '}'
  public static boolean map_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "map_type")) return false;
    if (!nextTokenIsSmart(b, G_LEFT_BRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, G_LEFT_BRACE);
    r = r && type(b, l + 1, -1);
    r = r && consumeToken(b, G_COMMA);
    r = r && type(b, l + 1, -1);
    r = r && consumeToken(b, G_RIGHT_BRACE);
    exit_section_(b, m, G_MAP_TYPE, r);
    return r;
  }

  // 'repository' '<' SYMBOL_NAME '>'
  public static boolean repository_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "repository_type")) return false;
    if (!nextTokenIsSmart(b, G_KW_REPOSITORY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokensSmart(b, 0, G_KW_REPOSITORY, G_LT, G_SYMBOL_NAME, G_GT);
    exit_section_(b, m, G_REPOSITORY_TYPE, r);
    return r;
  }

  // SYMBOL_NAME
  public static boolean artifact_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "artifact_type")) return false;
    if (!nextTokenIsSmart(b, G_SYMBOL_NAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, G_SYMBOL_NAME);
    exit_section_(b, m, G_ARTIFACT_TYPE, r);
    return r;
  }

  // 'selfie'
  public static boolean selfie_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selfie_type")) return false;
    if (!nextTokenIsSmart(b, G_KW_SELFIE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, G_KW_SELFIE);
    exit_section_(b, m, G_SELFIE_TYPE, r);
    return r;
  }

  // 'void'
  public static boolean void_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "void_type")) return false;
    if (!nextTokenIsSmart(b, G_TYPE_VOID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, G_TYPE_VOID);
    exit_section_(b, m, G_VOID_TYPE, r);
    return r;
  }

}
