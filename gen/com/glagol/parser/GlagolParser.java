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
  // decl_type id '{' member* '}'
  static boolean declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration")) return false;
    if (!nextTokenIs(b, "", DECL_ENTITY, DECL_VALUE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = decl_type(b, l + 1);
    r = r && consumeToken(b, ID);
    r = r && consumeToken(b, LEFT_BRACE);
    r = r && declaration_3(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // member*
  private static boolean declaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!member(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "declaration_3", c)) break;
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
  // !<<eof>> 'module' id ';' declaration?
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

  // declaration?
  private static boolean glagol_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "glagol_4")) return false;
    declaration(b, l + 1);
    return true;
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
  // 'value' data_type id default_value? ';'
  static boolean member(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member")) return false;
    if (!nextTokenIs(b, DECL_VALUE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DECL_VALUE);
    r = r && data_type(b, l + 1);
    r = r && consumeToken(b, ID);
    r = r && member_3(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // default_value?
  private static boolean member_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member_3")) return false;
    default_value(b, l + 1);
    return true;
  }

}
