// This is a generated file. Not intended for manual editing.
package com.geowang.language.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.geowang.language.psi.MinispecTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class MinispecParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, EXTENDS_SETS_);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return PackageDef(b, l + 1);
  }

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(INDEX_L_VALUE, L_VALUE, MEMBER_L_VALUE, SIMPLE_L_VALUE,
      SLICE_L_VALUE),
    create_token_set_(ADDITION_BINOP, AND_BOOLEAN_BINOP, AND_LOGICAL_BINOP, BINOP_EXPR,
      BIT_CONCAT_PRIMARY, BLOCK_PRIMARY, CALL_PRIMARY, CASE_EXPR,
      COND_EXPR, DIVISION_BINOP, EQ_EQUALITY_BINOP, EXPONENTIATION_BINOP,
      EXPRESSION, FIELD_PRIMARY, GEQ_RELATION_BINOP, GT_RELATION_BINOP,
      LEFT_SHIFT_BINOP, LEQ_RELATION_BINOP, LITERAL_PRIMARY, LT_RELATION_BINOP,
      META_BINOP_EXPR, MODULUS_BINOP, MULTIPLICATION_BINOP, NEQ_EQUALITY_BINOP,
      OR_BOOLEAN_BINOP, OR_LOGICAL_BINOP, OTHER_PRIMARY, PARENTHESES_PRIMARY,
      PRIMARY_EXPR, RETURN_PRIMARY, RIGHT_SHIFT_BINOP, SLICE_PRIMARY,
      STRUCT_PRIMARY, SUBTRACTION_BINOP, UNOP_BINOP, VAR_PRIMARY,
      XNOR_LOGICAL_BINOP, XOR_LOGICAL_BINOP),
  };

  /* ********************************************************** */
  // Expression
  public static boolean Arg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Arg")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARG, "<arg>");
    r = Expression(b, l + 1, -1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Type ArgName
  public static boolean ArgFormal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArgFormal")) return false;
    if (!nextTokenIs(b, UPPER_CASE_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Type(b, l + 1);
    r = r && ArgName(b, l + 1);
    exit_section_(b, m, ARG_FORMAL, r);
    return r;
  }

  /* ********************************************************** */
  // LP (ArgFormal (COMMA ArgFormal)*)? RP
  public static boolean ArgFormals(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArgFormals")) return false;
    if (!nextTokenIs(b, LP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LP);
    r = r && ArgFormals_1(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, ARG_FORMALS, r);
    return r;
  }

  // (ArgFormal (COMMA ArgFormal)*)?
  private static boolean ArgFormals_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArgFormals_1")) return false;
    ArgFormals_1_0(b, l + 1);
    return true;
  }

  // ArgFormal (COMMA ArgFormal)*
  private static boolean ArgFormals_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArgFormals_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ArgFormal(b, l + 1);
    r = r && ArgFormals_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA ArgFormal)*
  private static boolean ArgFormals_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArgFormals_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ArgFormals_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ArgFormals_1_0_1", c)) break;
    }
    return true;
  }

  // COMMA ArgFormal
  private static boolean ArgFormals_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArgFormals_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && ArgFormal(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LOWER_CASE_IDENTIFIER
  public static boolean ArgName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArgName")) return false;
    if (!nextTokenIs(b, LOWER_CASE_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LOWER_CASE_IDENTIFIER);
    exit_section_(b, m, ARG_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // LP (Arg (COMMA Arg)*)? RP
  public static boolean Args(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Args")) return false;
    if (!nextTokenIs(b, LP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LP);
    r = r && Args_1(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, ARGS, r);
    return r;
  }

  // (Arg (COMMA Arg)*)?
  private static boolean Args_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Args_1")) return false;
    Args_1_0(b, l + 1);
    return true;
  }

  // Arg (COMMA Arg)*
  private static boolean Args_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Args_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Arg(b, l + 1);
    r = r && Args_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA Arg)*
  private static boolean Args_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Args_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Args_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Args_1_0_1", c)) break;
    }
    return true;
  }

  // COMMA Arg
  private static boolean Args_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Args_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && Arg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // BEGIN Stmt* END
  public static boolean BeginEndBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BeginEndBlock")) return false;
    if (!nextTokenIs(b, BEGIN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BEGIN);
    r = r && BeginEndBlock_1(b, l + 1);
    r = r && consumeToken(b, END);
    exit_section_(b, m, BEGIN_END_BLOCK, r);
    return r;
  }

  // Stmt*
  private static boolean BeginEndBlock_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BeginEndBlock_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Stmt(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "BeginEndBlock_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // LC Expression (COMMA Expression)* RC
  public static boolean BitConcatPrimary(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BitConcatPrimary")) return false;
    if (!nextTokenIs(b, LC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LC);
    r = r && Expression(b, l + 1, -1);
    r = r && BitConcatPrimary_2(b, l + 1);
    r = r && consumeToken(b, RC);
    exit_section_(b, m, BIT_CONCAT_PRIMARY, r);
    return r;
  }

  // (COMMA Expression)*
  private static boolean BitConcatPrimary_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BitConcatPrimary_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!BitConcatPrimary_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "BitConcatPrimary_2", c)) break;
    }
    return true;
  }

  // COMMA Expression
  private static boolean BitConcatPrimary_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BitConcatPrimary_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && Expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // BeginEndBlock
  public static boolean BlockPrimary(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BlockPrimary")) return false;
    if (!nextTokenIs(b, BEGIN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BeginEndBlock(b, l + 1);
    exit_section_(b, m, BLOCK_PRIMARY, r);
    return r;
  }

  /* ********************************************************** */
  // UPPER_CASE_IDENTIFIER
  public static boolean BsvFilename(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BsvFilename")) return false;
    if (!nextTokenIs(b, UPPER_CASE_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, UPPER_CASE_IDENTIFIER);
    exit_section_(b, m, BSV_FILENAME, r);
    return r;
  }

  /* ********************************************************** */
  // BSV_IMPORT BsvFilename (COMMA BsvFilename)* SEMI
  public static boolean BsvImportDecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BsvImportDecl")) return false;
    if (!nextTokenIs(b, BSV_IMPORT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, BSV_IMPORT_DECL, null);
    r = consumeToken(b, BSV_IMPORT);
    p = r; // pin = 1
    r = r && report_error_(b, BsvFilename(b, l + 1));
    r = p && report_error_(b, BsvImportDecl_2(b, l + 1)) && r;
    r = p && consumeToken(b, SEMI) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (COMMA BsvFilename)*
  private static boolean BsvImportDecl_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BsvImportDecl_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!BsvImportDecl_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "BsvImportDecl_2", c)) break;
    }
    return true;
  }

  // COMMA BsvFilename
  private static boolean BsvImportDecl_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BsvImportDecl_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && BsvFilename(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (DEFAULT | (PrimaryExpr (COMMA PrimaryExpr)*)) COLON CaseExprItemBody SEMI
  public static boolean CaseExprItem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseExprItem")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CASE_EXPR_ITEM, "<case expr item>");
    r = CaseExprItem_0(b, l + 1);
    r = r && consumeToken(b, COLON);
    p = r; // pin = 2
    r = r && report_error_(b, CaseExprItemBody(b, l + 1));
    r = p && consumeToken(b, SEMI) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // DEFAULT | (PrimaryExpr (COMMA PrimaryExpr)*)
  private static boolean CaseExprItem_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseExprItem_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DEFAULT);
    if (!r) r = CaseExprItem_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // PrimaryExpr (COMMA PrimaryExpr)*
  private static boolean CaseExprItem_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseExprItem_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PrimaryExpr(b, l + 1, -1);
    r = r && CaseExprItem_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA PrimaryExpr)*
  private static boolean CaseExprItem_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseExprItem_0_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!CaseExprItem_0_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CaseExprItem_0_1_1", c)) break;
    }
    return true;
  }

  // COMMA PrimaryExpr
  private static boolean CaseExprItem_0_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseExprItem_0_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && PrimaryExpr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Expression
  public static boolean CaseExprItemBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseExprItemBody")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CASE_EXPR_ITEM_BODY, "<case expr item body>");
    r = Expression(b, l + 1, -1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // CASE LP Expression RP CaseStmtElement* CaseStmtDefaultElement? END_CASE
  public static boolean CaseStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseStmt")) return false;
    if (!nextTokenIs(b, CASE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CASE, LP);
    r = r && Expression(b, l + 1, -1);
    r = r && consumeToken(b, RP);
    r = r && CaseStmt_4(b, l + 1);
    r = r && CaseStmt_5(b, l + 1);
    r = r && consumeToken(b, END_CASE);
    exit_section_(b, m, CASE_STMT, r);
    return r;
  }

  // CaseStmtElement*
  private static boolean CaseStmt_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseStmt_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!CaseStmtElement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CaseStmt_4", c)) break;
    }
    return true;
  }

  // CaseStmtDefaultElement?
  private static boolean CaseStmt_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseStmt_5")) return false;
    CaseStmtDefaultElement(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // DEFAULT COLON Stmt
  public static boolean CaseStmtDefaultElement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseStmtDefaultElement")) return false;
    if (!nextTokenIs(b, DEFAULT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DEFAULT, COLON);
    r = r && Stmt(b, l + 1);
    exit_section_(b, m, CASE_STMT_DEFAULT_ELEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // Expression (COMMA Expression)* COLON Stmt
  public static boolean CaseStmtElement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseStmtElement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CASE_STMT_ELEMENT, "<case stmt element>");
    r = Expression(b, l + 1, -1);
    r = r && CaseStmtElement_1(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && Stmt(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (COMMA Expression)*
  private static boolean CaseStmtElement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseStmtElement_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!CaseStmtElement_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CaseStmtElement_1", c)) break;
    }
    return true;
  }

  // COMMA Expression
  private static boolean CaseStmtElement_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseStmtElement_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && Expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // EnumLabelName (EQ EnumLabelVal)?
  public static boolean EnumElement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumElement")) return false;
    if (!nextTokenIs(b, UPPER_CASE_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = EnumLabelName(b, l + 1);
    r = r && EnumElement_1(b, l + 1);
    exit_section_(b, m, ENUM_ELEMENT, r);
    return r;
  }

  // (EQ EnumLabelVal)?
  private static boolean EnumElement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumElement_1")) return false;
    EnumElement_1_0(b, l + 1);
    return true;
  }

  // EQ EnumLabelVal
  private static boolean EnumElement_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumElement_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQ);
    r = r && EnumLabelVal(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // UPPER_CASE_IDENTIFIER
  public static boolean EnumLabelName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumLabelName")) return false;
    if (!nextTokenIs(b, UPPER_CASE_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, UPPER_CASE_IDENTIFIER);
    exit_section_(b, m, ENUM_LABEL_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // INT_LITERAL
  public static boolean EnumLabelVal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumLabelVal")) return false;
    if (!nextTokenIs(b, INT_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INT_LITERAL);
    exit_section_(b, m, ENUM_LABEL_VAL, r);
    return r;
  }

  /* ********************************************************** */
  // UPPER_CASE_IDENTIFIER
  public static boolean EnumName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumName")) return false;
    if (!nextTokenIs(b, UPPER_CASE_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, UPPER_CASE_IDENTIFIER);
    exit_section_(b, m, ENUM_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // Expression SEMI
  public static boolean ExpressionStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExpressionStmt")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION_STMT, "<expression stmt>");
    r = Expression(b, l + 1, -1);
    p = r; // pin = 1
    r = r && consumeToken(b, SEMI);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // FOR LP Type VarName EQ Expression SEMI Expression SEMI VarName EQ Expression RP Stmt
  public static boolean ForStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForStmt")) return false;
    if (!nextTokenIs(b, FOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FOR, LP);
    r = r && Type(b, l + 1);
    r = r && VarName(b, l + 1);
    r = r && consumeToken(b, EQ);
    r = r && Expression(b, l + 1, -1);
    r = r && consumeToken(b, SEMI);
    r = r && Expression(b, l + 1, -1);
    r = r && consumeToken(b, SEMI);
    r = r && VarName(b, l + 1);
    r = r && consumeToken(b, EQ);
    r = r && Expression(b, l + 1, -1);
    r = r && consumeToken(b, RP);
    r = r && Stmt(b, l + 1);
    exit_section_(b, m, FOR_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // SEMI Stmt* END_FUNCTION
  static boolean FunctionBlockDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionBlockDef")) return false;
    if (!nextTokenIs(b, SEMI)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SEMI);
    r = r && FunctionBlockDef_1(b, l + 1);
    r = r && consumeToken(b, END_FUNCTION);
    exit_section_(b, m, null, r);
    return r;
  }

  // Stmt*
  private static boolean FunctionBlockDef_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionBlockDef_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Stmt(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FunctionBlockDef_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // FUNCTION Type FunctionName ParamFormals? ArgFormals? (FunctionBlockDef | FunctionSimpleDef)
  public static boolean FunctionDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDef")) return false;
    if (!nextTokenIs(b, FUNCTION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FUNCTION);
    r = r && Type(b, l + 1);
    r = r && FunctionName(b, l + 1);
    r = r && FunctionDef_3(b, l + 1);
    r = r && FunctionDef_4(b, l + 1);
    r = r && FunctionDef_5(b, l + 1);
    exit_section_(b, m, FUNCTION_DEF, r);
    return r;
  }

  // ParamFormals?
  private static boolean FunctionDef_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDef_3")) return false;
    ParamFormals(b, l + 1);
    return true;
  }

  // ArgFormals?
  private static boolean FunctionDef_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDef_4")) return false;
    ArgFormals(b, l + 1);
    return true;
  }

  // FunctionBlockDef | FunctionSimpleDef
  private static boolean FunctionDef_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDef_5")) return false;
    boolean r;
    r = FunctionBlockDef(b, l + 1);
    if (!r) r = FunctionSimpleDef(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // LOWER_CASE_IDENTIFIER
  public static boolean FunctionName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionName")) return false;
    if (!nextTokenIs(b, LOWER_CASE_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LOWER_CASE_IDENTIFIER);
    exit_section_(b, m, FUNCTION_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // EQ Expression SEMI
  static boolean FunctionSimpleDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionSimpleDef")) return false;
    if (!nextTokenIs(b, EQ)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQ);
    r = r && Expression(b, l + 1, -1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IF LP Expression RP Stmt (ELSE Stmt)?
  public static boolean IfStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStmt")) return false;
    if (!nextTokenIs(b, IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IF, LP);
    r = r && Expression(b, l + 1, -1);
    r = r && consumeToken(b, RP);
    r = r && Stmt(b, l + 1);
    r = r && IfStmt_5(b, l + 1);
    exit_section_(b, m, IF_STMT, r);
    return r;
  }

  // (ELSE Stmt)?
  private static boolean IfStmt_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStmt_5")) return false;
    IfStmt_5_0(b, l + 1);
    return true;
  }

  // ELSE Stmt
  private static boolean IfStmt_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStmt_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELSE);
    r = r && Stmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IMPORT ImportFilename (COMMA ImportFilename)* SEMI
  public static boolean ImportDecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportDecl")) return false;
    if (!nextTokenIs(b, IMPORT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, IMPORT_DECL, null);
    r = consumeToken(b, IMPORT);
    p = r; // pin = 1
    r = r && report_error_(b, ImportFilename(b, l + 1));
    r = p && report_error_(b, ImportDecl_2(b, l + 1)) && r;
    r = p && consumeToken(b, SEMI) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (COMMA ImportFilename)*
  private static boolean ImportDecl_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportDecl_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ImportDecl_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ImportDecl_2", c)) break;
    }
    return true;
  }

  // COMMA ImportFilename
  private static boolean ImportDecl_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportDecl_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && ImportFilename(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LOWER_CASE_IDENTIFIER | UPPER_CASE_IDENTIFIER
  public static boolean ImportFilename(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportFilename")) return false;
    if (!nextTokenIs(b, "<import filename>", LOWER_CASE_IDENTIFIER, UPPER_CASE_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IMPORT_FILENAME, "<import filename>");
    r = consumeToken(b, LOWER_CASE_IDENTIFIER);
    if (!r) r = consumeToken(b, UPPER_CASE_IDENTIFIER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // INPUT Type InputName (DEFAULT EQ InputDefaultVal)? SEMI
  public static boolean InputDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InputDef")) return false;
    if (!nextTokenIs(b, INPUT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INPUT);
    r = r && Type(b, l + 1);
    r = r && InputName(b, l + 1);
    r = r && InputDef_3(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, INPUT_DEF, r);
    return r;
  }

  // (DEFAULT EQ InputDefaultVal)?
  private static boolean InputDef_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InputDef_3")) return false;
    InputDef_3_0(b, l + 1);
    return true;
  }

  // DEFAULT EQ InputDefaultVal
  private static boolean InputDef_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InputDef_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DEFAULT, EQ);
    r = r && InputDefaultVal(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Expression
  public static boolean InputDefaultVal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InputDefaultVal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INPUT_DEFAULT_VAL, "<input default val>");
    r = Expression(b, l + 1, -1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LOWER_CASE_IDENTIFIER
  public static boolean InputName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InputName")) return false;
    if (!nextTokenIs(b, LOWER_CASE_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LOWER_CASE_IDENTIFIER);
    exit_section_(b, m, INPUT_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // INT_LITERAL | STRING_LITERAL | QMARK
  public static boolean LiteralPrimary(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LiteralPrimary")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL_PRIMARY, "<literal primary>");
    r = consumeToken(b, INT_LITERAL);
    if (!r) r = consumeToken(b, STRING_LITERAL);
    if (!r) r = consumeToken(b, QMARK);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // StructMemberName COLON Expression
  public static boolean MemberBind(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MemberBind")) return false;
    if (!nextTokenIs(b, LOWER_CASE_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = StructMemberName(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && Expression(b, l + 1, -1);
    exit_section_(b, m, MEMBER_BIND, r);
    return r;
  }

  /* ********************************************************** */
  // MemberBind (COMMA MemberBinds)*
  public static boolean MemberBinds(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MemberBinds")) return false;
    if (!nextTokenIs(b, LOWER_CASE_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MemberBind(b, l + 1);
    r = r && MemberBinds_1(b, l + 1);
    exit_section_(b, m, MEMBER_BINDS, r);
    return r;
  }

  // (COMMA MemberBinds)*
  private static boolean MemberBinds_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MemberBinds_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!MemberBinds_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MemberBinds_1", c)) break;
    }
    return true;
  }

  // COMMA MemberBinds
  private static boolean MemberBinds_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MemberBinds_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && MemberBinds(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // METHOD Type MethodName ArgFormals ? (SEMI Stmt* END_METHOD | EQ Expression SEMI)
  public static boolean MethodDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodDef")) return false;
    if (!nextTokenIs(b, METHOD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, METHOD);
    r = r && Type(b, l + 1);
    r = r && MethodName(b, l + 1);
    r = r && MethodDef_3(b, l + 1);
    r = r && MethodDef_4(b, l + 1);
    exit_section_(b, m, METHOD_DEF, r);
    return r;
  }

  // ArgFormals ?
  private static boolean MethodDef_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodDef_3")) return false;
    ArgFormals(b, l + 1);
    return true;
  }

  // SEMI Stmt* END_METHOD | EQ Expression SEMI
  private static boolean MethodDef_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodDef_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MethodDef_4_0(b, l + 1);
    if (!r) r = MethodDef_4_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SEMI Stmt* END_METHOD
  private static boolean MethodDef_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodDef_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SEMI);
    r = r && MethodDef_4_0_1(b, l + 1);
    r = r && consumeToken(b, END_METHOD);
    exit_section_(b, m, null, r);
    return r;
  }

  // Stmt*
  private static boolean MethodDef_4_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodDef_4_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Stmt(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MethodDef_4_0_1", c)) break;
    }
    return true;
  }

  // EQ Expression SEMI
  private static boolean MethodDef_4_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodDef_4_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQ);
    r = r && Expression(b, l + 1, -1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LOWER_CASE_IDENTIFIER
  public static boolean MethodName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodName")) return false;
    if (!nextTokenIs(b, LOWER_CASE_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LOWER_CASE_IDENTIFIER);
    exit_section_(b, m, METHOD_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // MODULE ModuleName ParamFormals? ArgFormals? SEMI ModuleStmt* END_MODULE
  public static boolean ModuleDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModuleDef")) return false;
    if (!nextTokenIs(b, MODULE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MODULE);
    r = r && ModuleName(b, l + 1);
    r = r && ModuleDef_2(b, l + 1);
    r = r && ModuleDef_3(b, l + 1);
    r = r && consumeToken(b, SEMI);
    r = r && ModuleDef_5(b, l + 1);
    r = r && consumeToken(b, END_MODULE);
    exit_section_(b, m, MODULE_DEF, r);
    return r;
  }

  // ParamFormals?
  private static boolean ModuleDef_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModuleDef_2")) return false;
    ParamFormals(b, l + 1);
    return true;
  }

  // ArgFormals?
  private static boolean ModuleDef_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModuleDef_3")) return false;
    ArgFormals(b, l + 1);
    return true;
  }

  // ModuleStmt*
  private static boolean ModuleDef_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModuleDef_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ModuleStmt(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ModuleDef_5", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // UPPER_CASE_IDENTIFIER
  public static boolean ModuleName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModuleName")) return false;
    if (!nextTokenIs(b, UPPER_CASE_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, UPPER_CASE_IDENTIFIER);
    exit_section_(b, m, MODULE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // SubmoduleDecl
  //     | InputDef
  //     | MethodDef
  //     | RuleDef
  //     | Stmt
  public static boolean ModuleStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModuleStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MODULE_STMT, "<module stmt>");
    r = SubmoduleDecl(b, l + 1);
    if (!r) r = InputDef(b, l + 1);
    if (!r) r = MethodDef(b, l + 1);
    if (!r) r = RuleDef(b, l + 1);
    if (!r) r = Stmt(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // PackageStmt *
  static boolean PackageDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PackageDef")) return false;
    while (true) {
      int c = current_position_(b);
      if (!PackageStmt(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "PackageDef", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // ImportDecl
  //     | BsvImportDecl
  //     | TypeDecl
  //     | VarDecl
  //     | FunctionDef
  //     | ModuleDef
  public static boolean PackageStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PackageStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PACKAGE_STMT, "<package stmt>");
    r = ImportDecl(b, l + 1);
    if (!r) r = BsvImportDecl(b, l + 1);
    if (!r) r = TypeDecl(b, l + 1);
    if (!r) r = VarDecl(b, l + 1);
    if (!r) r = FunctionDef(b, l + 1);
    if (!r) r = ModuleDef(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Type | Expression
  public static boolean Param(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Param")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PARAM, "<param>");
    r = Type(b, l + 1);
    if (!r) r = Expression(b, l + 1, -1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Type ParamName
  //     | TYPE_KEYWORD ParamTypeName
  //     | Param
  public static boolean ParamFormal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParamFormal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PARAM_FORMAL, "<param formal>");
    r = ParamFormal_0(b, l + 1);
    if (!r) r = ParamFormal_1(b, l + 1);
    if (!r) r = Param(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Type ParamName
  private static boolean ParamFormal_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParamFormal_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Type(b, l + 1);
    r = r && ParamName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TYPE_KEYWORD ParamTypeName
  private static boolean ParamFormal_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParamFormal_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TYPE_KEYWORD);
    r = r && ParamTypeName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // HASH LP (ParamFormal (COMMA ParamFormal)*)? RP
  public static boolean ParamFormals(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParamFormals")) return false;
    if (!nextTokenIs(b, HASH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, HASH, LP);
    r = r && ParamFormals_2(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, PARAM_FORMALS, r);
    return r;
  }

  // (ParamFormal (COMMA ParamFormal)*)?
  private static boolean ParamFormals_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParamFormals_2")) return false;
    ParamFormals_2_0(b, l + 1);
    return true;
  }

  // ParamFormal (COMMA ParamFormal)*
  private static boolean ParamFormals_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParamFormals_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ParamFormal(b, l + 1);
    r = r && ParamFormals_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA ParamFormal)*
  private static boolean ParamFormals_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParamFormals_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ParamFormals_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ParamFormals_2_0_1", c)) break;
    }
    return true;
  }

  // COMMA ParamFormal
  private static boolean ParamFormals_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParamFormals_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && ParamFormal(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LOWER_CASE_IDENTIFIER
  public static boolean ParamName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParamName")) return false;
    if (!nextTokenIs(b, LOWER_CASE_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LOWER_CASE_IDENTIFIER);
    exit_section_(b, m, PARAM_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // UPPER_CASE_IDENTIFIER
  public static boolean ParamTypeName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParamTypeName")) return false;
    if (!nextTokenIs(b, UPPER_CASE_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, UPPER_CASE_IDENTIFIER);
    exit_section_(b, m, PARAM_TYPE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // HASH LP (Param (COMMA Param)*)? RP
  public static boolean Params(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Params")) return false;
    if (!nextTokenIs(b, HASH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, HASH, LP);
    r = r && Params_2(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, PARAMS, r);
    return r;
  }

  // (Param (COMMA Param)*)?
  private static boolean Params_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Params_2")) return false;
    Params_2_0(b, l + 1);
    return true;
  }

  // Param (COMMA Param)*
  private static boolean Params_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Params_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Param(b, l + 1);
    r = r && Params_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA Param)*
  private static boolean Params_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Params_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Params_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Params_2_0_1", c)) break;
    }
    return true;
  }

  // COMMA Param
  private static boolean Params_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Params_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && Param(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LP Expression RP
  public static boolean ParenthesesPrimary(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParenthesesPrimary")) return false;
    if (!nextTokenIs(b, LP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LP);
    r = r && Expression(b, l + 1, -1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, PARENTHESES_PRIMARY, r);
    return r;
  }

  /* ********************************************************** */
  // !PackageStmt
  static boolean Recover_PackageDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Recover_PackageDef")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !PackageStmt(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LValue
  public static boolean RegName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RegName")) return false;
    if (!nextTokenIsSmart(b, LOWER_CASE_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = LValue(b, l + 1, -1);
    exit_section_(b, m, REG_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // RegName LEQ Expression SEMI
  public static boolean RegWrite(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RegWrite")) return false;
    if (!nextTokenIsSmart(b, LOWER_CASE_IDENTIFIER)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, REG_WRITE, null);
    r = RegName(b, l + 1);
    r = r && consumeToken(b, LEQ);
    p = r; // pin = 2
    r = r && report_error_(b, Expression(b, l + 1, -1));
    r = p && consumeToken(b, SEMI) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // RETURN Expression
  public static boolean ReturnPrimary(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnPrimary")) return false;
    if (!nextTokenIs(b, RETURN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RETURN);
    r = r && Expression(b, l + 1, -1);
    exit_section_(b, m, RETURN_PRIMARY, r);
    return r;
  }

  /* ********************************************************** */
  // RULE RuleName SEMI Stmt* END_RULE
  public static boolean RuleDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RuleDef")) return false;
    if (!nextTokenIs(b, RULE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RULE);
    r = r && RuleName(b, l + 1);
    r = r && consumeToken(b, SEMI);
    r = r && RuleDef_3(b, l + 1);
    r = r && consumeToken(b, END_RULE);
    exit_section_(b, m, RULE_DEF, r);
    return r;
  }

  // Stmt*
  private static boolean RuleDef_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RuleDef_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Stmt(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RuleDef_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // LOWER_CASE_IDENTIFIER
  public static boolean RuleName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RuleName")) return false;
    if (!nextTokenIs(b, LOWER_CASE_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LOWER_CASE_IDENTIFIER);
    exit_section_(b, m, RULE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // VarDecl
  //     | VarAssign
  //     | RegWrite
  //     | BeginEndBlock
  //     | IfStmt
  //     | CaseStmt
  //     | ForStmt
  //     | ExpressionStmt
  public static boolean Stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Stmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STMT, "<stmt>");
    r = VarDecl(b, l + 1);
    if (!r) r = VarAssign(b, l + 1);
    if (!r) r = RegWrite(b, l + 1);
    if (!r) r = BeginEndBlock(b, l + 1);
    if (!r) r = IfStmt(b, l + 1);
    if (!r) r = CaseStmt(b, l + 1);
    if (!r) r = ForStmt(b, l + 1);
    if (!r) r = ExpressionStmt(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Type StructMemberName SEMI
  public static boolean StructElement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructElement")) return false;
    if (!nextTokenIs(b, UPPER_CASE_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Type(b, l + 1);
    r = r && StructMemberName(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, STRUCT_ELEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // LOWER_CASE_IDENTIFIER
  public static boolean StructMemberName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructMemberName")) return false;
    if (!nextTokenIs(b, LOWER_CASE_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LOWER_CASE_IDENTIFIER);
    exit_section_(b, m, STRUCT_MEMBER_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // Type LC MemberBinds RC
  public static boolean StructPrimary(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructPrimary")) return false;
    if (!nextTokenIs(b, UPPER_CASE_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Type(b, l + 1);
    r = r && consumeToken(b, LC);
    r = r && MemberBinds(b, l + 1);
    r = r && consumeToken(b, RC);
    exit_section_(b, m, STRUCT_PRIMARY, r);
    return r;
  }

  /* ********************************************************** */
  // Type SubmoduleName Args? SEMI
  public static boolean SubmoduleDecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SubmoduleDecl")) return false;
    if (!nextTokenIs(b, UPPER_CASE_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Type(b, l + 1);
    r = r && SubmoduleName(b, l + 1);
    r = r && SubmoduleDecl_2(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, SUBMODULE_DECL, r);
    return r;
  }

  // Args?
  private static boolean SubmoduleDecl_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SubmoduleDecl_2")) return false;
    Args(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // LOWER_CASE_IDENTIFIER
  public static boolean SubmoduleName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SubmoduleName")) return false;
    if (!nextTokenIs(b, LOWER_CASE_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LOWER_CASE_IDENTIFIER);
    exit_section_(b, m, SUBMODULE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // TypeName Params?
  public static boolean Type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Type")) return false;
    if (!nextTokenIs(b, UPPER_CASE_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TypeName(b, l + 1);
    r = r && Type_1(b, l + 1);
    exit_section_(b, m, TYPE, r);
    return r;
  }

  // Params?
  private static boolean Type_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Type_1")) return false;
    Params(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // TypeDefSynonym
  //     | TypeDefEnum
  //     | TypeDefStruct
  public static boolean TypeDecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeDecl")) return false;
    if (!nextTokenIs(b, TYPEDEF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TypeDefSynonym(b, l + 1);
    if (!r) r = TypeDefEnum(b, l + 1);
    if (!r) r = TypeDefStruct(b, l + 1);
    exit_section_(b, m, TYPE_DECL, r);
    return r;
  }

  /* ********************************************************** */
  // TYPEDEF ENUM LC EnumElement (COMMA EnumElement)* RC EnumName SEMI
  public static boolean TypeDefEnum(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeDefEnum")) return false;
    if (!nextTokenIs(b, TYPEDEF)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, TYPE_DEF_ENUM, null);
    r = consumeTokens(b, 2, TYPEDEF, ENUM, LC);
    p = r; // pin = 2
    r = r && report_error_(b, EnumElement(b, l + 1));
    r = p && report_error_(b, TypeDefEnum_4(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, RC)) && r;
    r = p && report_error_(b, EnumName(b, l + 1)) && r;
    r = p && consumeToken(b, SEMI) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (COMMA EnumElement)*
  private static boolean TypeDefEnum_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeDefEnum_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!TypeDefEnum_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TypeDefEnum_4", c)) break;
    }
    return true;
  }

  // COMMA EnumElement
  private static boolean TypeDefEnum_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeDefEnum_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && EnumElement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TYPEDEF STRUCT LC (StructElement)* RC TypeName ParamFormals? SEMI
  public static boolean TypeDefStruct(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeDefStruct")) return false;
    if (!nextTokenIs(b, TYPEDEF)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, TYPE_DEF_STRUCT, null);
    r = consumeTokens(b, 2, TYPEDEF, STRUCT, LC);
    p = r; // pin = 2
    r = r && report_error_(b, TypeDefStruct_3(b, l + 1));
    r = p && report_error_(b, consumeToken(b, RC)) && r;
    r = p && report_error_(b, TypeName(b, l + 1)) && r;
    r = p && report_error_(b, TypeDefStruct_6(b, l + 1)) && r;
    r = p && consumeToken(b, SEMI) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (StructElement)*
  private static boolean TypeDefStruct_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeDefStruct_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!TypeDefStruct_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TypeDefStruct_3", c)) break;
    }
    return true;
  }

  // (StructElement)
  private static boolean TypeDefStruct_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeDefStruct_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = StructElement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ParamFormals?
  private static boolean TypeDefStruct_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeDefStruct_6")) return false;
    ParamFormals(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // TYPEDEF Type TypeName ParamFormals? SEMI
  public static boolean TypeDefSynonym(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeDefSynonym")) return false;
    if (!nextTokenIs(b, TYPEDEF)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, TYPE_DEF_SYNONYM, null);
    r = consumeToken(b, TYPEDEF);
    r = r && Type(b, l + 1);
    p = r; // pin = 2
    r = r && report_error_(b, TypeName(b, l + 1));
    r = p && report_error_(b, TypeDefSynonym_3(b, l + 1)) && r;
    r = p && consumeToken(b, SEMI) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ParamFormals?
  private static boolean TypeDefSynonym_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeDefSynonym_3")) return false;
    ParamFormals(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // UPPER_CASE_IDENTIFIER
  public static boolean TypeName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeName")) return false;
    if (!nextTokenIs(b, UPPER_CASE_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, UPPER_CASE_IDENTIFIER);
    exit_section_(b, m, TYPE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // NOT | INVERT | BIT_AND | BIT_NAND | BIT_OR | BIT_NOR | XOR | XNOR
  public static boolean UnopExpressionOpBit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnopExpressionOpBit")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UNOP_EXPRESSION_OP_BIT, "<unop expression op bit>");
    r = consumeToken(b, NOT);
    if (!r) r = consumeToken(b, INVERT);
    if (!r) r = consumeToken(b, BIT_AND);
    if (!r) r = consumeToken(b, BIT_NAND);
    if (!r) r = consumeToken(b, BIT_OR);
    if (!r) r = consumeToken(b, BIT_NOR);
    if (!r) r = consumeToken(b, XOR);
    if (!r) r = consumeToken(b, XNOR);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ADD | SUB
  public static boolean UnopExpressionOpMath(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnopExpressionOpMath")) return false;
    if (!nextTokenIs(b, "<unop expression op math>", ADD, SUB)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UNOP_EXPRESSION_OP_MATH, "<unop expression op math>");
    r = consumeToken(b, ADD);
    if (!r) r = consumeToken(b, SUB);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LValue EQ Expression SEMI
  //     | LC LValue (COMMA LValue)* RC EQ Expression SEMI
  public static boolean VarAssign(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarAssign")) return false;
    if (!nextTokenIsSmart(b, LOWER_CASE_IDENTIFIER) &&
        !nextTokenIs(b, "<var assign>", LC)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VAR_ASSIGN, "<var assign>");
    r = VarAssign_0(b, l + 1);
    if (!r) r = VarAssign_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // LValue EQ Expression SEMI
  private static boolean VarAssign_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarAssign_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = LValue(b, l + 1, -1);
    r = r && consumeToken(b, EQ);
    r = r && Expression(b, l + 1, -1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  // LC LValue (COMMA LValue)* RC EQ Expression SEMI
  private static boolean VarAssign_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarAssign_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LC);
    r = r && LValue(b, l + 1, -1);
    r = r && VarAssign_1_2(b, l + 1);
    r = r && consumeTokens(b, 0, RC, EQ);
    r = r && Expression(b, l + 1, -1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA LValue)*
  private static boolean VarAssign_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarAssign_1_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!VarAssign_1_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "VarAssign_1_2", c)) break;
    }
    return true;
  }

  // COMMA LValue
  private static boolean VarAssign_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarAssign_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && LValue(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // VarSimpleDecl
  //     | VarLetDecl
  public static boolean VarDecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarDecl")) return false;
    if (!nextTokenIs(b, "<var decl>", LET, UPPER_CASE_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VAR_DECL, "<var decl>");
    r = VarSimpleDecl(b, l + 1);
    if (!r) r = VarLetDecl(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // VarName (EQ Expression)?
  public static boolean VarElement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarElement")) return false;
    if (!nextTokenIs(b, LOWER_CASE_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VarName(b, l + 1);
    r = r && VarElement_1(b, l + 1);
    exit_section_(b, m, VAR_ELEMENT, r);
    return r;
  }

  // (EQ Expression)?
  private static boolean VarElement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarElement_1")) return false;
    VarElement_1_0(b, l + 1);
    return true;
  }

  // EQ Expression
  private static boolean VarElement_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarElement_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQ);
    r = r && Expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LET (VarName | (LC VarName (COMMA VarName)* RC)) (EQ Expression)? SEMI
  public static boolean VarLetDecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarLetDecl")) return false;
    if (!nextTokenIs(b, LET)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, VAR_LET_DECL, null);
    r = consumeToken(b, LET);
    p = r; // pin = 1
    r = r && report_error_(b, VarLetDecl_1(b, l + 1));
    r = p && report_error_(b, VarLetDecl_2(b, l + 1)) && r;
    r = p && consumeToken(b, SEMI) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // VarName | (LC VarName (COMMA VarName)* RC)
  private static boolean VarLetDecl_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarLetDecl_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VarName(b, l + 1);
    if (!r) r = VarLetDecl_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LC VarName (COMMA VarName)* RC
  private static boolean VarLetDecl_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarLetDecl_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LC);
    r = r && VarName(b, l + 1);
    r = r && VarLetDecl_1_1_2(b, l + 1);
    r = r && consumeToken(b, RC);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA VarName)*
  private static boolean VarLetDecl_1_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarLetDecl_1_1_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!VarLetDecl_1_1_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "VarLetDecl_1_1_2", c)) break;
    }
    return true;
  }

  // COMMA VarName
  private static boolean VarLetDecl_1_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarLetDecl_1_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && VarName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (EQ Expression)?
  private static boolean VarLetDecl_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarLetDecl_2")) return false;
    VarLetDecl_2_0(b, l + 1);
    return true;
  }

  // EQ Expression
  private static boolean VarLetDecl_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarLetDecl_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQ);
    r = r && Expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LOWER_CASE_IDENTIFIER | UPPER_CASE_IDENTIFIER | DOLLAR_IDENTIFIER
  static boolean VarLiteralPrimary(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarLiteralPrimary")) return false;
    boolean r;
    r = consumeToken(b, LOWER_CASE_IDENTIFIER);
    if (!r) r = consumeToken(b, UPPER_CASE_IDENTIFIER);
    if (!r) r = consumeToken(b, DOLLAR_IDENTIFIER);
    return r;
  }

  /* ********************************************************** */
  // LOWER_CASE_IDENTIFIER
  public static boolean VarName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarName")) return false;
    if (!nextTokenIs(b, LOWER_CASE_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LOWER_CASE_IDENTIFIER);
    exit_section_(b, m, VAR_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // VarLiteralPrimary Params?
  public static boolean VarPrimary(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarPrimary")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VAR_PRIMARY, "<var primary>");
    r = VarLiteralPrimary(b, l + 1);
    r = r && VarPrimary_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Params?
  private static boolean VarPrimary_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarPrimary_1")) return false;
    Params(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // Type VarElement (COMMA VarElement)* SEMI
  public static boolean VarSimpleDecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarSimpleDecl")) return false;
    if (!nextTokenIs(b, UPPER_CASE_IDENTIFIER)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, VAR_SIMPLE_DECL, null);
    r = Type(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, VarElement(b, l + 1));
    r = p && report_error_(b, VarSimpleDecl_2(b, l + 1)) && r;
    r = p && consumeToken(b, SEMI) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (COMMA VarElement)*
  private static boolean VarSimpleDecl_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarSimpleDecl_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!VarSimpleDecl_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "VarSimpleDecl_2", c)) break;
    }
    return true;
  }

  // COMMA VarElement
  private static boolean VarSimpleDecl_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarSimpleDecl_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && VarElement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Expression root: BinopExpr
  // Operator priority table:
  // 0: BINARY(ExponentiationBinop)
  // 1: BINARY(MultiplicationBinop) BINARY(DivisionBinop) BINARY(ModulusBinop)
  // 2: BINARY(AdditionBinop) BINARY(SubtractionBinop)
  // 3: BINARY(LeftShiftBinop) BINARY(RightShiftBinop)
  // 4: BINARY(LTRelationBinop) BINARY(LEQRelationBinop) BINARY(GTRelationBinop) BINARY(GEQRelationBinop)
  // 5: BINARY(EQEqualityBinop) BINARY(NEQEqualityBinop)
  // 6: BINARY(AndLogicalBinop)
  // 7: BINARY(XorLogicalBinop)
  // 8: BINARY(XnorLogicalBinop)
  // 9: BINARY(OrLogicalBinop)
  // 10: BINARY(AndBooleanBinop)
  // 11: BINARY(OrBooleanBinop)
  // 12: ATOM(UnopBinop)
  public static boolean BinopExpr(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "BinopExpr")) return false;
    addVariant(b, "<binop expr>");
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<binop expr>");
    r = UnopBinop(b, l + 1);
    p = r;
    r = r && BinopExpr_0(b, l + 1, g);
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  public static boolean BinopExpr_0(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "BinopExpr_0")) return false;
    boolean r = true;
    while (true) {
      Marker m = enter_section_(b, l, _LEFT_, null);
      if (g < 0 && consumeTokenSmart(b, EXPO)) {
        r = BinopExpr(b, l, 0);
        exit_section_(b, l, m, EXPONENTIATION_BINOP, r, true, null);
      }
      else if (g < 1 && consumeTokenSmart(b, MUL)) {
        r = BinopExpr(b, l, 1);
        exit_section_(b, l, m, MULTIPLICATION_BINOP, r, true, null);
      }
      else if (g < 1 && consumeTokenSmart(b, DIV)) {
        r = BinopExpr(b, l, 1);
        exit_section_(b, l, m, DIVISION_BINOP, r, true, null);
      }
      else if (g < 1 && consumeTokenSmart(b, MOD)) {
        r = BinopExpr(b, l, 1);
        exit_section_(b, l, m, MODULUS_BINOP, r, true, null);
      }
      else if (g < 2 && consumeTokenSmart(b, ADD)) {
        r = BinopExpr(b, l, 2);
        exit_section_(b, l, m, ADDITION_BINOP, r, true, null);
      }
      else if (g < 2 && consumeTokenSmart(b, SUB)) {
        r = BinopExpr(b, l, 2);
        exit_section_(b, l, m, SUBTRACTION_BINOP, r, true, null);
      }
      else if (g < 3 && consumeTokenSmart(b, LS)) {
        r = BinopExpr(b, l, 3);
        exit_section_(b, l, m, LEFT_SHIFT_BINOP, r, true, null);
      }
      else if (g < 3 && consumeTokenSmart(b, RS)) {
        r = BinopExpr(b, l, 3);
        exit_section_(b, l, m, RIGHT_SHIFT_BINOP, r, true, null);
      }
      else if (g < 4 && consumeTokenSmart(b, LT)) {
        r = BinopExpr(b, l, 4);
        exit_section_(b, l, m, LT_RELATION_BINOP, r, true, null);
      }
      else if (g < 4 && consumeTokenSmart(b, LEQ)) {
        r = BinopExpr(b, l, 4);
        exit_section_(b, l, m, LEQ_RELATION_BINOP, r, true, null);
      }
      else if (g < 4 && consumeTokenSmart(b, GT)) {
        r = BinopExpr(b, l, 4);
        exit_section_(b, l, m, GT_RELATION_BINOP, r, true, null);
      }
      else if (g < 4 && consumeTokenSmart(b, GEQ)) {
        r = BinopExpr(b, l, 4);
        exit_section_(b, l, m, GEQ_RELATION_BINOP, r, true, null);
      }
      else if (g < 5 && consumeTokenSmart(b, BOOL_EQ)) {
        r = BinopExpr(b, l, 5);
        exit_section_(b, l, m, EQ_EQUALITY_BINOP, r, true, null);
      }
      else if (g < 5 && consumeTokenSmart(b, BOOL_NEQ)) {
        r = BinopExpr(b, l, 5);
        exit_section_(b, l, m, NEQ_EQUALITY_BINOP, r, true, null);
      }
      else if (g < 6 && consumeTokenSmart(b, BIT_AND)) {
        r = BinopExpr(b, l, 6);
        exit_section_(b, l, m, AND_LOGICAL_BINOP, r, true, null);
      }
      else if (g < 7 && consumeTokenSmart(b, XOR)) {
        r = BinopExpr(b, l, 7);
        exit_section_(b, l, m, XOR_LOGICAL_BINOP, r, true, null);
      }
      else if (g < 8 && consumeTokenSmart(b, XNOR)) {
        r = BinopExpr(b, l, 8);
        exit_section_(b, l, m, XNOR_LOGICAL_BINOP, r, true, null);
      }
      else if (g < 9 && consumeTokenSmart(b, BIT_OR)) {
        r = BinopExpr(b, l, 9);
        exit_section_(b, l, m, OR_LOGICAL_BINOP, r, true, null);
      }
      else if (g < 10 && consumeTokenSmart(b, BOOL_AND)) {
        r = BinopExpr(b, l, 10);
        exit_section_(b, l, m, AND_BOOLEAN_BINOP, r, true, null);
      }
      else if (g < 11 && consumeTokenSmart(b, BOOL_OR)) {
        r = BinopExpr(b, l, 11);
        exit_section_(b, l, m, OR_BOOLEAN_BINOP, r, true, null);
      }
      else {
        exit_section_(b, l, m, null, false, false, null);
        break;
      }
    }
    return r;
  }

  // UnopExpressionOpBit PrimaryExpr
  //     | UnopExpressionOpMath PrimaryExpr
  //     | PrimaryExpr
  public static boolean UnopBinop(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnopBinop")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, UNOP_BINOP, "<unop binop>");
    r = UnopBinop_0(b, l + 1);
    if (!r) r = UnopBinop_1(b, l + 1);
    if (!r) r = PrimaryExpr(b, l + 1, -1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // UnopExpressionOpBit PrimaryExpr
  private static boolean UnopBinop_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnopBinop_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = UnopExpressionOpBit(b, l + 1);
    r = r && PrimaryExpr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // UnopExpressionOpMath PrimaryExpr
  private static boolean UnopBinop_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnopBinop_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = UnopExpressionOpMath(b, l + 1);
    r = r && PrimaryExpr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Expression root: Expression
  // Operator priority table:
  // 0: BINARY(CondExpr)
  // 1: PREFIX(CaseExpr)
  // 2: ATOM(MetaBinopExpr)
  public static boolean Expression(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "Expression")) return false;
    addVariant(b, "<expression>");
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<expression>");
    r = CaseExpr(b, l + 1);
    if (!r) r = MetaBinopExpr(b, l + 1);
    p = r;
    r = r && Expression_0(b, l + 1, g);
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  public static boolean Expression_0(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "Expression_0")) return false;
    boolean r = true;
    while (true) {
      Marker m = enter_section_(b, l, _LEFT_, null);
      if (g < 0 && consumeTokenSmart(b, QMARK)) {
        r = report_error_(b, Expression(b, l, -1));
        r = CondExpr_1(b, l + 1) && r;
        exit_section_(b, l, m, COND_EXPR, r, true, null);
      }
      else {
        exit_section_(b, l, m, null, false, false, null);
        break;
      }
    }
    return r;
  }

  // COLON Expression
  private static boolean CondExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CondExpr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && Expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  public static boolean CaseExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseExpr")) return false;
    if (!nextTokenIsSmart(b, CASE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = parseTokensSmart(b, 0, CASE, LP);
    p = r;
    r = p && Expression(b, l, 1);
    r = p && report_error_(b, CaseExpr_1(b, l + 1)) && r;
    exit_section_(b, l, m, CASE_EXPR, r, p, null);
    return r || p;
  }

  // RP CaseExprItem* END_CASE
  private static boolean CaseExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseExpr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RP);
    r = r && CaseExpr_1_1(b, l + 1);
    r = r && consumeToken(b, END_CASE);
    exit_section_(b, m, null, r);
    return r;
  }

  // CaseExprItem*
  private static boolean CaseExpr_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseExpr_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!CaseExprItem(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CaseExpr_1_1", c)) break;
    }
    return true;
  }

  // BinopExpr
  public static boolean MetaBinopExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MetaBinopExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, META_BINOP_EXPR, "<meta binop expr>");
    r = BinopExpr(b, l + 1, -1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Expression root: LValue
  // Operator priority table:
  // 0: ATOM(SimpleLValue)
  // 1: POSTFIX(MemberLValue)
  // 2: POSTFIX(IndexLValue)
  // 3: POSTFIX(SliceLValue)
  public static boolean LValue(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "LValue")) return false;
    addVariant(b, "<l value>");
    if (!nextTokenIsSmart(b, LOWER_CASE_IDENTIFIER)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<l value>");
    r = SimpleLValue(b, l + 1);
    p = r;
    r = r && LValue_0(b, l + 1, g);
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  public static boolean LValue_0(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "LValue_0")) return false;
    boolean r = true;
    while (true) {
      Marker m = enter_section_(b, l, _LEFT_, null);
      if (g < 1 && parseTokensSmart(b, 0, DOT, LOWER_CASE_IDENTIFIER)) {
        r = true;
        exit_section_(b, l, m, MEMBER_L_VALUE, r, true, null);
      }
      else if (g < 2 && IndexLValue_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, INDEX_L_VALUE, r, true, null);
      }
      else if (g < 3 && SliceLValue_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, SLICE_L_VALUE, r, true, null);
      }
      else {
        exit_section_(b, l, m, null, false, false, null);
        break;
      }
    }
    return r;
  }

  // LOWER_CASE_IDENTIFIER
  public static boolean SimpleLValue(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SimpleLValue")) return false;
    if (!nextTokenIsSmart(b, LOWER_CASE_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, LOWER_CASE_IDENTIFIER);
    exit_section_(b, m, SIMPLE_L_VALUE, r);
    return r;
  }

  // LB Expression RB
  private static boolean IndexLValue_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IndexLValue_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, LB);
    r = r && Expression(b, l + 1, -1);
    r = r && consumeToken(b, RB);
    exit_section_(b, m, null, r);
    return r;
  }

  // LB Expression COLON Expression RB
  private static boolean SliceLValue_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SliceLValue_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, LB);
    r = r && Expression(b, l + 1, -1);
    r = r && consumeToken(b, COLON);
    r = r && Expression(b, l + 1, -1);
    r = r && consumeToken(b, RB);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Expression root: PrimaryExpr
  // Operator priority table:
  // 0: BINARY(FieldPrimary)
  // 1: POSTFIX(SlicePrimary)
  // 2: POSTFIX(CallPrimary)
  // 3: ATOM(OtherPrimary)
  public static boolean PrimaryExpr(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "PrimaryExpr")) return false;
    addVariant(b, "<primary expr>");
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<primary expr>");
    r = OtherPrimary(b, l + 1);
    p = r;
    r = r && PrimaryExpr_0(b, l + 1, g);
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  public static boolean PrimaryExpr_0(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "PrimaryExpr_0")) return false;
    boolean r = true;
    while (true) {
      Marker m = enter_section_(b, l, _LEFT_, null);
      if (g < 0 && consumeTokenSmart(b, DOT)) {
        r = PrimaryExpr(b, l, 0);
        exit_section_(b, l, m, FIELD_PRIMARY, r, true, null);
      }
      else if (g < 1 && SlicePrimary_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, SLICE_PRIMARY, r, true, null);
      }
      else if (g < 2 && CallPrimary_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, CALL_PRIMARY, r, true, null);
      }
      else {
        exit_section_(b, l, m, null, false, false, null);
        break;
      }
    }
    return r;
  }

  // LB (Expression (COLON Expression)?) RB
  private static boolean SlicePrimary_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SlicePrimary_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, LB);
    r = r && SlicePrimary_0_1(b, l + 1);
    r = r && consumeToken(b, RB);
    exit_section_(b, m, null, r);
    return r;
  }

  // Expression (COLON Expression)?
  private static boolean SlicePrimary_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SlicePrimary_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression(b, l + 1, -1);
    r = r && SlicePrimary_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COLON Expression)?
  private static boolean SlicePrimary_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SlicePrimary_0_1_1")) return false;
    SlicePrimary_0_1_1_0(b, l + 1);
    return true;
  }

  // COLON Expression
  private static boolean SlicePrimary_0_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SlicePrimary_0_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, COLON);
    r = r && Expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LP (Expression (COMMA Expression)*)? RP
  private static boolean CallPrimary_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallPrimary_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, LP);
    r = r && CallPrimary_0_1(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, null, r);
    return r;
  }

  // (Expression (COMMA Expression)*)?
  private static boolean CallPrimary_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallPrimary_0_1")) return false;
    CallPrimary_0_1_0(b, l + 1);
    return true;
  }

  // Expression (COMMA Expression)*
  private static boolean CallPrimary_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallPrimary_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression(b, l + 1, -1);
    r = r && CallPrimary_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA Expression)*
  private static boolean CallPrimary_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallPrimary_0_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!CallPrimary_0_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CallPrimary_0_1_0_1", c)) break;
    }
    return true;
  }

  // COMMA Expression
  private static boolean CallPrimary_0_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallPrimary_0_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, COMMA);
    r = r && Expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ParenthesesPrimary
  //     | ReturnPrimary
  //     | StructPrimary
  //     | VarPrimary
  //     | LiteralPrimary
  //     | BitConcatPrimary
  //     | BlockPrimary
  public static boolean OtherPrimary(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OtherPrimary")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, OTHER_PRIMARY, "<other primary>");
    r = ParenthesesPrimary(b, l + 1);
    if (!r) r = ReturnPrimary(b, l + 1);
    if (!r) r = StructPrimary(b, l + 1);
    if (!r) r = VarPrimary(b, l + 1);
    if (!r) r = LiteralPrimary(b, l + 1);
    if (!r) r = BitConcatPrimary(b, l + 1);
    if (!r) r = BlockPrimary(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

}
