// This is a generated file. Not intended for manual editing.
package com.geowang.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.geowang.language.psi.impl.*;

public interface MinispecTypes {

  IElementType ADDITION_BINOP = new MinispecElementType("ADDITION_BINOP");
  IElementType AND_BOOLEAN_BINOP = new MinispecElementType("AND_BOOLEAN_BINOP");
  IElementType AND_LOGICAL_BINOP = new MinispecElementType("AND_LOGICAL_BINOP");
  IElementType ARG = new MinispecElementType("ARG");
  IElementType ARGS = new MinispecElementType("ARGS");
  IElementType ARG_FORMAL = new MinispecElementType("ARG_FORMAL");
  IElementType ARG_FORMALS = new MinispecElementType("ARG_FORMALS");
  IElementType ARG_NAME = new MinispecElementType("ARG_NAME");
  IElementType BEGIN_END_BLOCK = new MinispecElementType("BEGIN_END_BLOCK");
  IElementType BINOP_EXPR = new MinispecElementType("BINOP_EXPR");
  IElementType BIT_CONCAT_PRIMARY = new MinispecElementType("BIT_CONCAT_PRIMARY");
  IElementType BLOCK_PRIMARY = new MinispecElementType("BLOCK_PRIMARY");
  IElementType BSV_FILENAME = new MinispecElementType("BSV_FILENAME");
  IElementType BSV_IMPORT_DECL = new MinispecElementType("BSV_IMPORT_DECL");
  IElementType CALL_PRIMARY = new MinispecElementType("CALL_PRIMARY");
  IElementType CASE_EXPR = new MinispecElementType("CASE_EXPR");
  IElementType CASE_EXPR_ITEM = new MinispecElementType("CASE_EXPR_ITEM");
  IElementType CASE_EXPR_ITEM_BODY = new MinispecElementType("CASE_EXPR_ITEM_BODY");
  IElementType CASE_STMT = new MinispecElementType("CASE_STMT");
  IElementType CASE_STMT_DEFAULT_ELEMENT = new MinispecElementType("CASE_STMT_DEFAULT_ELEMENT");
  IElementType CASE_STMT_ELEMENT = new MinispecElementType("CASE_STMT_ELEMENT");
  IElementType COND_EXPR = new MinispecElementType("COND_EXPR");
  IElementType DIVISION_BINOP = new MinispecElementType("DIVISION_BINOP");
  IElementType ENUM_ELEMENT = new MinispecElementType("ENUM_ELEMENT");
  IElementType ENUM_LABEL_NAME = new MinispecElementType("ENUM_LABEL_NAME");
  IElementType ENUM_LABEL_VAL = new MinispecElementType("ENUM_LABEL_VAL");
  IElementType ENUM_NAME = new MinispecElementType("ENUM_NAME");
  IElementType EQ_EQUALITY_BINOP = new MinispecElementType("EQ_EQUALITY_BINOP");
  IElementType EXPONENTIATION_BINOP = new MinispecElementType("EXPONENTIATION_BINOP");
  IElementType EXPRESSION = new MinispecElementType("EXPRESSION");
  IElementType EXPRESSION_STMT = new MinispecElementType("EXPRESSION_STMT");
  IElementType FIELD_PRIMARY = new MinispecElementType("FIELD_PRIMARY");
  IElementType FOR_STMT = new MinispecElementType("FOR_STMT");
  IElementType FUNCTION_DEF = new MinispecElementType("FUNCTION_DEF");
  IElementType FUNCTION_NAME = new MinispecElementType("FUNCTION_NAME");
  IElementType GEQ_RELATION_BINOP = new MinispecElementType("GEQ_RELATION_BINOP");
  IElementType GT_RELATION_BINOP = new MinispecElementType("GT_RELATION_BINOP");
  IElementType IF_STMT = new MinispecElementType("IF_STMT");
  IElementType IMPORT_DECL = new MinispecElementType("IMPORT_DECL");
  IElementType IMPORT_FILENAME = new MinispecElementType("IMPORT_FILENAME");
  IElementType INDEX_L_VALUE = new MinispecElementType("INDEX_L_VALUE");
  IElementType INPUT_DEF = new MinispecElementType("INPUT_DEF");
  IElementType INPUT_DEFAULT_VAL = new MinispecElementType("INPUT_DEFAULT_VAL");
  IElementType INPUT_NAME = new MinispecElementType("INPUT_NAME");
  IElementType LEFT_SHIFT_BINOP = new MinispecElementType("LEFT_SHIFT_BINOP");
  IElementType LEQ_RELATION_BINOP = new MinispecElementType("LEQ_RELATION_BINOP");
  IElementType LITERAL_PRIMARY = new MinispecElementType("LITERAL_PRIMARY");
  IElementType LT_RELATION_BINOP = new MinispecElementType("LT_RELATION_BINOP");
  IElementType L_VALUE = new MinispecElementType("L_VALUE");
  IElementType MEMBER_BIND = new MinispecElementType("MEMBER_BIND");
  IElementType MEMBER_BINDS = new MinispecElementType("MEMBER_BINDS");
  IElementType MEMBER_L_VALUE = new MinispecElementType("MEMBER_L_VALUE");
  IElementType META_BINOP_EXPR = new MinispecElementType("META_BINOP_EXPR");
  IElementType METHOD_DEF = new MinispecElementType("METHOD_DEF");
  IElementType METHOD_NAME = new MinispecElementType("METHOD_NAME");
  IElementType MODULE_DEF = new MinispecElementType("MODULE_DEF");
  IElementType MODULE_NAME = new MinispecElementType("MODULE_NAME");
  IElementType MODULE_STMT = new MinispecElementType("MODULE_STMT");
  IElementType MODULUS_BINOP = new MinispecElementType("MODULUS_BINOP");
  IElementType MULTIPLICATION_BINOP = new MinispecElementType("MULTIPLICATION_BINOP");
  IElementType NEQ_EQUALITY_BINOP = new MinispecElementType("NEQ_EQUALITY_BINOP");
  IElementType OR_BOOLEAN_BINOP = new MinispecElementType("OR_BOOLEAN_BINOP");
  IElementType OR_LOGICAL_BINOP = new MinispecElementType("OR_LOGICAL_BINOP");
  IElementType OTHER_PRIMARY = new MinispecElementType("OTHER_PRIMARY");
  IElementType PACKAGE_STMT = new MinispecElementType("PACKAGE_STMT");
  IElementType PARAM = new MinispecElementType("PARAM");
  IElementType PARAMS = new MinispecElementType("PARAMS");
  IElementType PARAM_FORMAL = new MinispecElementType("PARAM_FORMAL");
  IElementType PARAM_FORMALS = new MinispecElementType("PARAM_FORMALS");
  IElementType PARAM_NAME = new MinispecElementType("PARAM_NAME");
  IElementType PARAM_TYPE_NAME = new MinispecElementType("PARAM_TYPE_NAME");
  IElementType PARENTHESES_PRIMARY = new MinispecElementType("PARENTHESES_PRIMARY");
  IElementType PRIMARY_EXPR = new MinispecElementType("PRIMARY_EXPR");
  IElementType REG_NAME = new MinispecElementType("REG_NAME");
  IElementType REG_WRITE = new MinispecElementType("REG_WRITE");
  IElementType RETURN_PRIMARY = new MinispecElementType("RETURN_PRIMARY");
  IElementType RIGHT_SHIFT_BINOP = new MinispecElementType("RIGHT_SHIFT_BINOP");
  IElementType RULE_DEF = new MinispecElementType("RULE_DEF");
  IElementType RULE_NAME = new MinispecElementType("RULE_NAME");
  IElementType SIMPLE_L_VALUE = new MinispecElementType("SIMPLE_L_VALUE");
  IElementType SLICE_L_VALUE = new MinispecElementType("SLICE_L_VALUE");
  IElementType SLICE_PRIMARY = new MinispecElementType("SLICE_PRIMARY");
  IElementType STMT = new MinispecElementType("STMT");
  IElementType STRUCT_ELEMENT = new MinispecElementType("STRUCT_ELEMENT");
  IElementType STRUCT_MEMBER_NAME = new MinispecElementType("STRUCT_MEMBER_NAME");
  IElementType STRUCT_PRIMARY = new MinispecElementType("STRUCT_PRIMARY");
  IElementType SUBMODULE_DECL = new MinispecElementType("SUBMODULE_DECL");
  IElementType SUBMODULE_NAME = new MinispecElementType("SUBMODULE_NAME");
  IElementType SUBTRACTION_BINOP = new MinispecElementType("SUBTRACTION_BINOP");
  IElementType TYPE = new MinispecElementType("TYPE");
  IElementType TYPE_DECL = new MinispecElementType("TYPE_DECL");
  IElementType TYPE_DEF_ENUM = new MinispecElementType("TYPE_DEF_ENUM");
  IElementType TYPE_DEF_STRUCT = new MinispecElementType("TYPE_DEF_STRUCT");
  IElementType TYPE_DEF_SYNONYM = new MinispecElementType("TYPE_DEF_SYNONYM");
  IElementType TYPE_NAME = new MinispecElementType("TYPE_NAME");
  IElementType UNOP_BINOP = new MinispecElementType("UNOP_BINOP");
  IElementType UNOP_EXPRESSION_OP_BIT = new MinispecElementType("UNOP_EXPRESSION_OP_BIT");
  IElementType UNOP_EXPRESSION_OP_MATH = new MinispecElementType("UNOP_EXPRESSION_OP_MATH");
  IElementType VAR_ASSIGN = new MinispecElementType("VAR_ASSIGN");
  IElementType VAR_DECL = new MinispecElementType("VAR_DECL");
  IElementType VAR_ELEMENT = new MinispecElementType("VAR_ELEMENT");
  IElementType VAR_LET_DECL = new MinispecElementType("VAR_LET_DECL");
  IElementType VAR_NAME = new MinispecElementType("VAR_NAME");
  IElementType VAR_PRIMARY = new MinispecElementType("VAR_PRIMARY");
  IElementType VAR_SIMPLE_DECL = new MinispecElementType("VAR_SIMPLE_DECL");
  IElementType XNOR_LOGICAL_BINOP = new MinispecElementType("XNOR_LOGICAL_BINOP");
  IElementType XOR_LOGICAL_BINOP = new MinispecElementType("XOR_LOGICAL_BINOP");

  IElementType ADD = new MinispecTokenType("+");
  IElementType BEGIN = new MinispecTokenType("begin");
  IElementType BIT_AND = new MinispecTokenType("&");
  IElementType BIT_NAND = new MinispecTokenType("~&");
  IElementType BIT_NOR = new MinispecTokenType("~|");
  IElementType BIT_OR = new MinispecTokenType("|");
  IElementType BOOL_AND = new MinispecTokenType("&&");
  IElementType BOOL_EQ = new MinispecTokenType("==");
  IElementType BOOL_NEQ = new MinispecTokenType("!=");
  IElementType BOOL_OR = new MinispecTokenType("||");
  IElementType BSV_IMPORT = new MinispecTokenType("bsvimport");
  IElementType CASE = new MinispecTokenType("case");
  IElementType COLON = new MinispecTokenType(":");
  IElementType COMMA = new MinispecTokenType(",");
  IElementType DEFAULT = new MinispecTokenType("default");
  IElementType DIV = new MinispecTokenType("/");
  IElementType DOLLAR_IDENTIFIER = new MinispecTokenType("DOLLAR_IDENTIFIER");
  IElementType DOT = new MinispecTokenType(".");
  IElementType ELSE = new MinispecTokenType("else");
  IElementType END = new MinispecTokenType("end");
  IElementType END_CASE = new MinispecTokenType("endcase");
  IElementType END_FUNCTION = new MinispecTokenType("endfunction");
  IElementType END_METHOD = new MinispecTokenType("endmethod");
  IElementType END_MODULE = new MinispecTokenType("endmodule");
  IElementType END_RULE = new MinispecTokenType("endrule");
  IElementType ENUM = new MinispecTokenType("enum");
  IElementType EQ = new MinispecTokenType("=");
  IElementType EXPO = new MinispecTokenType("**");
  IElementType FOR = new MinispecTokenType("for");
  IElementType FUNCTION = new MinispecTokenType("function");
  IElementType GEQ = new MinispecTokenType(">=");
  IElementType GT = new MinispecTokenType(">");
  IElementType HASH = new MinispecTokenType("#");
  IElementType IF = new MinispecTokenType("if");
  IElementType IMPORT = new MinispecTokenType("import");
  IElementType INLINE_COMMENT = new MinispecTokenType("INLINE_COMMENT");
  IElementType INPUT = new MinispecTokenType("input");
  IElementType INT_LITERAL = new MinispecTokenType("INT_LITERAL");
  IElementType INVERT = new MinispecTokenType("~");
  IElementType LB = new MinispecTokenType("[");
  IElementType LC = new MinispecTokenType("{");
  IElementType LEQ = new MinispecTokenType("<=");
  IElementType LET = new MinispecTokenType("let");
  IElementType LOWER_CASE_IDENTIFIER = new MinispecTokenType("LOWER_CASE_IDENTIFIER");
  IElementType LP = new MinispecTokenType("(");
  IElementType LS = new MinispecTokenType("<<");
  IElementType LT = new MinispecTokenType("<");
  IElementType METHOD = new MinispecTokenType("method");
  IElementType MOD = new MinispecTokenType("%");
  IElementType MODULE = new MinispecTokenType("module");
  IElementType MUL = new MinispecTokenType("*");
  IElementType NOT = new MinispecTokenType("!");
  IElementType ONE_LINE_COMMENT = new MinispecTokenType("ONE_LINE_COMMENT");
  IElementType QMARK = new MinispecTokenType("?");
  IElementType RB = new MinispecTokenType("]");
  IElementType RC = new MinispecTokenType("}");
  IElementType RETURN = new MinispecTokenType("return");
  IElementType RP = new MinispecTokenType(")");
  IElementType RS = new MinispecTokenType(">>");
  IElementType RULE = new MinispecTokenType("rule");
  IElementType SEMI = new MinispecTokenType(";");
  IElementType STRING_LITERAL = new MinispecTokenType("STRING_LITERAL");
  IElementType STRUCT = new MinispecTokenType("struct");
  IElementType SUB = new MinispecTokenType("-");
  IElementType TYPEDEF = new MinispecTokenType("typedef");
  IElementType TYPE_KEYWORD = new MinispecTokenType("type");
  IElementType UPPER_CASE_IDENTIFIER = new MinispecTokenType("UPPER_CASE_IDENTIFIER");
  IElementType XNOR = new MinispecTokenType("XNOR");
  IElementType XOR = new MinispecTokenType("^");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ADDITION_BINOP) {
        return new MinispecAdditionBinopImpl(node);
      }
      else if (type == AND_BOOLEAN_BINOP) {
        return new MinispecAndBooleanBinopImpl(node);
      }
      else if (type == AND_LOGICAL_BINOP) {
        return new MinispecAndLogicalBinopImpl(node);
      }
      else if (type == ARG) {
        return new MinispecArgImpl(node);
      }
      else if (type == ARGS) {
        return new MinispecArgsImpl(node);
      }
      else if (type == ARG_FORMAL) {
        return new MinispecArgFormalImpl(node);
      }
      else if (type == ARG_FORMALS) {
        return new MinispecArgFormalsImpl(node);
      }
      else if (type == ARG_NAME) {
        return new MinispecArgNameImpl(node);
      }
      else if (type == BEGIN_END_BLOCK) {
        return new MinispecBeginEndBlockImpl(node);
      }
      else if (type == BIT_CONCAT_PRIMARY) {
        return new MinispecBitConcatPrimaryImpl(node);
      }
      else if (type == BLOCK_PRIMARY) {
        return new MinispecBlockPrimaryImpl(node);
      }
      else if (type == BSV_FILENAME) {
        return new MinispecBsvFilenameImpl(node);
      }
      else if (type == BSV_IMPORT_DECL) {
        return new MinispecBsvImportDeclImpl(node);
      }
      else if (type == CALL_PRIMARY) {
        return new MinispecCallPrimaryImpl(node);
      }
      else if (type == CASE_EXPR) {
        return new MinispecCaseExprImpl(node);
      }
      else if (type == CASE_EXPR_ITEM) {
        return new MinispecCaseExprItemImpl(node);
      }
      else if (type == CASE_EXPR_ITEM_BODY) {
        return new MinispecCaseExprItemBodyImpl(node);
      }
      else if (type == CASE_STMT) {
        return new MinispecCaseStmtImpl(node);
      }
      else if (type == CASE_STMT_DEFAULT_ELEMENT) {
        return new MinispecCaseStmtDefaultElementImpl(node);
      }
      else if (type == CASE_STMT_ELEMENT) {
        return new MinispecCaseStmtElementImpl(node);
      }
      else if (type == COND_EXPR) {
        return new MinispecCondExprImpl(node);
      }
      else if (type == DIVISION_BINOP) {
        return new MinispecDivisionBinopImpl(node);
      }
      else if (type == ENUM_ELEMENT) {
        return new MinispecEnumElementImpl(node);
      }
      else if (type == ENUM_LABEL_NAME) {
        return new MinispecEnumLabelNameImpl(node);
      }
      else if (type == ENUM_LABEL_VAL) {
        return new MinispecEnumLabelValImpl(node);
      }
      else if (type == ENUM_NAME) {
        return new MinispecEnumNameImpl(node);
      }
      else if (type == EQ_EQUALITY_BINOP) {
        return new MinispecEQEqualityBinopImpl(node);
      }
      else if (type == EXPONENTIATION_BINOP) {
        return new MinispecExponentiationBinopImpl(node);
      }
      else if (type == EXPRESSION_STMT) {
        return new MinispecExpressionStmtImpl(node);
      }
      else if (type == FIELD_PRIMARY) {
        return new MinispecFieldPrimaryImpl(node);
      }
      else if (type == FOR_STMT) {
        return new MinispecForStmtImpl(node);
      }
      else if (type == FUNCTION_DEF) {
        return new MinispecFunctionDefImpl(node);
      }
      else if (type == FUNCTION_NAME) {
        return new MinispecFunctionNameImpl(node);
      }
      else if (type == GEQ_RELATION_BINOP) {
        return new MinispecGEQRelationBinopImpl(node);
      }
      else if (type == GT_RELATION_BINOP) {
        return new MinispecGTRelationBinopImpl(node);
      }
      else if (type == IF_STMT) {
        return new MinispecIfStmtImpl(node);
      }
      else if (type == IMPORT_DECL) {
        return new MinispecImportDeclImpl(node);
      }
      else if (type == IMPORT_FILENAME) {
        return new MinispecImportFilenameImpl(node);
      }
      else if (type == INDEX_L_VALUE) {
        return new MinispecIndexLValueImpl(node);
      }
      else if (type == INPUT_DEF) {
        return new MinispecInputDefImpl(node);
      }
      else if (type == INPUT_DEFAULT_VAL) {
        return new MinispecInputDefaultValImpl(node);
      }
      else if (type == INPUT_NAME) {
        return new MinispecInputNameImpl(node);
      }
      else if (type == LEFT_SHIFT_BINOP) {
        return new MinispecLeftShiftBinopImpl(node);
      }
      else if (type == LEQ_RELATION_BINOP) {
        return new MinispecLEQRelationBinopImpl(node);
      }
      else if (type == LITERAL_PRIMARY) {
        return new MinispecLiteralPrimaryImpl(node);
      }
      else if (type == LT_RELATION_BINOP) {
        return new MinispecLTRelationBinopImpl(node);
      }
      else if (type == MEMBER_BIND) {
        return new MinispecMemberBindImpl(node);
      }
      else if (type == MEMBER_BINDS) {
        return new MinispecMemberBindsImpl(node);
      }
      else if (type == MEMBER_L_VALUE) {
        return new MinispecMemberLValueImpl(node);
      }
      else if (type == METHOD_DEF) {
        return new MinispecMethodDefImpl(node);
      }
      else if (type == METHOD_NAME) {
        return new MinispecMethodNameImpl(node);
      }
      else if (type == MODULE_DEF) {
        return new MinispecModuleDefImpl(node);
      }
      else if (type == MODULE_NAME) {
        return new MinispecModuleNameImpl(node);
      }
      else if (type == MODULE_STMT) {
        return new MinispecModuleStmtImpl(node);
      }
      else if (type == MODULUS_BINOP) {
        return new MinispecModulusBinopImpl(node);
      }
      else if (type == MULTIPLICATION_BINOP) {
        return new MinispecMultiplicationBinopImpl(node);
      }
      else if (type == NEQ_EQUALITY_BINOP) {
        return new MinispecNEQEqualityBinopImpl(node);
      }
      else if (type == OR_BOOLEAN_BINOP) {
        return new MinispecOrBooleanBinopImpl(node);
      }
      else if (type == OR_LOGICAL_BINOP) {
        return new MinispecOrLogicalBinopImpl(node);
      }
      else if (type == PACKAGE_STMT) {
        return new MinispecPackageStmtImpl(node);
      }
      else if (type == PARAM) {
        return new MinispecParamImpl(node);
      }
      else if (type == PARAMS) {
        return new MinispecParamsImpl(node);
      }
      else if (type == PARAM_FORMAL) {
        return new MinispecParamFormalImpl(node);
      }
      else if (type == PARAM_FORMALS) {
        return new MinispecParamFormalsImpl(node);
      }
      else if (type == PARAM_NAME) {
        return new MinispecParamNameImpl(node);
      }
      else if (type == PARAM_TYPE_NAME) {
        return new MinispecParamTypeNameImpl(node);
      }
      else if (type == PARENTHESES_PRIMARY) {
        return new MinispecParenthesesPrimaryImpl(node);
      }
      else if (type == REG_NAME) {
        return new MinispecRegNameImpl(node);
      }
      else if (type == REG_WRITE) {
        return new MinispecRegWriteImpl(node);
      }
      else if (type == RETURN_PRIMARY) {
        return new MinispecReturnPrimaryImpl(node);
      }
      else if (type == RIGHT_SHIFT_BINOP) {
        return new MinispecRightShiftBinopImpl(node);
      }
      else if (type == RULE_DEF) {
        return new MinispecRuleDefImpl(node);
      }
      else if (type == RULE_NAME) {
        return new MinispecRuleNameImpl(node);
      }
      else if (type == SIMPLE_L_VALUE) {
        return new MinispecSimpleLValueImpl(node);
      }
      else if (type == SLICE_L_VALUE) {
        return new MinispecSliceLValueImpl(node);
      }
      else if (type == SLICE_PRIMARY) {
        return new MinispecSlicePrimaryImpl(node);
      }
      else if (type == STMT) {
        return new MinispecStmtImpl(node);
      }
      else if (type == STRUCT_ELEMENT) {
        return new MinispecStructElementImpl(node);
      }
      else if (type == STRUCT_MEMBER_NAME) {
        return new MinispecStructMemberNameImpl(node);
      }
      else if (type == STRUCT_PRIMARY) {
        return new MinispecStructPrimaryImpl(node);
      }
      else if (type == SUBMODULE_DECL) {
        return new MinispecSubmoduleDeclImpl(node);
      }
      else if (type == SUBMODULE_NAME) {
        return new MinispecSubmoduleNameImpl(node);
      }
      else if (type == SUBTRACTION_BINOP) {
        return new MinispecSubtractionBinopImpl(node);
      }
      else if (type == TYPE) {
        return new MinispecTypeImpl(node);
      }
      else if (type == TYPE_DECL) {
        return new MinispecTypeDeclImpl(node);
      }
      else if (type == TYPE_DEF_ENUM) {
        return new MinispecTypeDefEnumImpl(node);
      }
      else if (type == TYPE_DEF_STRUCT) {
        return new MinispecTypeDefStructImpl(node);
      }
      else if (type == TYPE_DEF_SYNONYM) {
        return new MinispecTypeDefSynonymImpl(node);
      }
      else if (type == TYPE_NAME) {
        return new MinispecTypeNameImpl(node);
      }
      else if (type == UNOP_BINOP) {
        return new MinispecUnopBinopImpl(node);
      }
      else if (type == UNOP_EXPRESSION_OP_BIT) {
        return new MinispecUnopExpressionOpBitImpl(node);
      }
      else if (type == UNOP_EXPRESSION_OP_MATH) {
        return new MinispecUnopExpressionOpMathImpl(node);
      }
      else if (type == VAR_ASSIGN) {
        return new MinispecVarAssignImpl(node);
      }
      else if (type == VAR_DECL) {
        return new MinispecVarDeclImpl(node);
      }
      else if (type == VAR_ELEMENT) {
        return new MinispecVarElementImpl(node);
      }
      else if (type == VAR_LET_DECL) {
        return new MinispecVarLetDeclImpl(node);
      }
      else if (type == VAR_NAME) {
        return new MinispecVarNameImpl(node);
      }
      else if (type == VAR_PRIMARY) {
        return new MinispecVarPrimaryImpl(node);
      }
      else if (type == VAR_SIMPLE_DECL) {
        return new MinispecVarSimpleDeclImpl(node);
      }
      else if (type == XNOR_LOGICAL_BINOP) {
        return new MinispecXnorLogicalBinopImpl(node);
      }
      else if (type == XOR_LOGICAL_BINOP) {
        return new MinispecXorLogicalBinopImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
