// This is a generated file. Not intended for manual editing.
package com.geowang.language.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class MinispecVisitor extends PsiElementVisitor {

  public void visitAdditionBinop(@NotNull MinispecAdditionBinop o) {
    visitBinopExpr(o);
  }

  public void visitAndBooleanBinop(@NotNull MinispecAndBooleanBinop o) {
    visitBinopExpr(o);
  }

  public void visitAndLogicalBinop(@NotNull MinispecAndLogicalBinop o) {
    visitBinopExpr(o);
  }

  public void visitArg(@NotNull MinispecArg o) {
    visitPsiElement(o);
  }

  public void visitArgFormal(@NotNull MinispecArgFormal o) {
    visitPsiElement(o);
  }

  public void visitArgFormals(@NotNull MinispecArgFormals o) {
    visitPsiElement(o);
  }

  public void visitArgName(@NotNull MinispecArgName o) {
    visitPsiElement(o);
  }

  public void visitArgs(@NotNull MinispecArgs o) {
    visitPsiElement(o);
  }

  public void visitBeginEndBlock(@NotNull MinispecBeginEndBlock o) {
    visitPsiElement(o);
  }

  public void visitBinopExpr(@NotNull MinispecBinopExpr o) {
    visitExpression(o);
  }

  public void visitBitConcatPrimary(@NotNull MinispecBitConcatPrimary o) {
    visitPrimaryExpr(o);
  }

  public void visitBlockPrimary(@NotNull MinispecBlockPrimary o) {
    visitPrimaryExpr(o);
  }

  public void visitBsvFilename(@NotNull MinispecBsvFilename o) {
    visitPsiElement(o);
  }

  public void visitBsvImportDecl(@NotNull MinispecBsvImportDecl o) {
    visitPsiElement(o);
  }

  public void visitCallPrimary(@NotNull MinispecCallPrimary o) {
    visitPrimaryExpr(o);
  }

  public void visitCaseExpr(@NotNull MinispecCaseExpr o) {
    visitExpression(o);
  }

  public void visitCaseExprItem(@NotNull MinispecCaseExprItem o) {
    visitPsiElement(o);
  }

  public void visitCaseExprItemBody(@NotNull MinispecCaseExprItemBody o) {
    visitPsiElement(o);
  }

  public void visitCaseStmt(@NotNull MinispecCaseStmt o) {
    visitPsiElement(o);
  }

  public void visitCaseStmtDefaultElement(@NotNull MinispecCaseStmtDefaultElement o) {
    visitPsiElement(o);
  }

  public void visitCaseStmtElement(@NotNull MinispecCaseStmtElement o) {
    visitPsiElement(o);
  }

  public void visitCondExpr(@NotNull MinispecCondExpr o) {
    visitExpression(o);
  }

  public void visitDivisionBinop(@NotNull MinispecDivisionBinop o) {
    visitBinopExpr(o);
  }

  public void visitEQEqualityBinop(@NotNull MinispecEQEqualityBinop o) {
    visitBinopExpr(o);
  }

  public void visitEnumElement(@NotNull MinispecEnumElement o) {
    visitPsiElement(o);
  }

  public void visitEnumLabelName(@NotNull MinispecEnumLabelName o) {
    visitPsiElement(o);
  }

  public void visitEnumLabelVal(@NotNull MinispecEnumLabelVal o) {
    visitPsiElement(o);
  }

  public void visitEnumName(@NotNull MinispecEnumName o) {
    visitPsiElement(o);
  }

  public void visitExponentiationBinop(@NotNull MinispecExponentiationBinop o) {
    visitBinopExpr(o);
  }

  public void visitExpression(@NotNull MinispecExpression o) {
    visitPsiElement(o);
  }

  public void visitExpressionStmt(@NotNull MinispecExpressionStmt o) {
    visitPsiElement(o);
  }

  public void visitFieldPrimary(@NotNull MinispecFieldPrimary o) {
    visitPrimaryExpr(o);
  }

  public void visitForStmt(@NotNull MinispecForStmt o) {
    visitPsiElement(o);
  }

  public void visitFunctionDef(@NotNull MinispecFunctionDef o) {
    visitPsiElement(o);
  }

  public void visitFunctionName(@NotNull MinispecFunctionName o) {
    visitPsiElement(o);
  }

  public void visitGEQRelationBinop(@NotNull MinispecGEQRelationBinop o) {
    visitBinopExpr(o);
  }

  public void visitGTRelationBinop(@NotNull MinispecGTRelationBinop o) {
    visitBinopExpr(o);
  }

  public void visitIfStmt(@NotNull MinispecIfStmt o) {
    visitPsiElement(o);
  }

  public void visitImportDecl(@NotNull MinispecImportDecl o) {
    visitPsiElement(o);
  }

  public void visitImportFilename(@NotNull MinispecImportFilename o) {
    visitPsiElement(o);
  }

  public void visitIndexLValue(@NotNull MinispecIndexLValue o) {
    visitLValue(o);
  }

  public void visitInputDef(@NotNull MinispecInputDef o) {
    visitPsiElement(o);
  }

  public void visitInputDefaultVal(@NotNull MinispecInputDefaultVal o) {
    visitPsiElement(o);
  }

  public void visitInputName(@NotNull MinispecInputName o) {
    visitPsiElement(o);
  }

  public void visitLEQRelationBinop(@NotNull MinispecLEQRelationBinop o) {
    visitBinopExpr(o);
  }

  public void visitLTRelationBinop(@NotNull MinispecLTRelationBinop o) {
    visitBinopExpr(o);
  }

  public void visitLValue(@NotNull MinispecLValue o) {
    visitPsiElement(o);
  }

  public void visitLeftShiftBinop(@NotNull MinispecLeftShiftBinop o) {
    visitBinopExpr(o);
  }

  public void visitLiteralPrimary(@NotNull MinispecLiteralPrimary o) {
    visitPrimaryExpr(o);
  }

  public void visitMemberBind(@NotNull MinispecMemberBind o) {
    visitPsiElement(o);
  }

  public void visitMemberBinds(@NotNull MinispecMemberBinds o) {
    visitPsiElement(o);
  }

  public void visitMemberLValue(@NotNull MinispecMemberLValue o) {
    visitLValue(o);
  }

  public void visitMetaBinopExpr(@NotNull MinispecMetaBinopExpr o) {
    visitExpression(o);
  }

  public void visitMethodDef(@NotNull MinispecMethodDef o) {
    visitPsiElement(o);
  }

  public void visitMethodName(@NotNull MinispecMethodName o) {
    visitPsiElement(o);
  }

  public void visitModuleDef(@NotNull MinispecModuleDef o) {
    visitPsiElement(o);
  }

  public void visitModuleName(@NotNull MinispecModuleName o) {
    visitPsiElement(o);
  }

  public void visitModuleStmt(@NotNull MinispecModuleStmt o) {
    visitPsiElement(o);
  }

  public void visitModulusBinop(@NotNull MinispecModulusBinop o) {
    visitBinopExpr(o);
  }

  public void visitMultiplicationBinop(@NotNull MinispecMultiplicationBinop o) {
    visitBinopExpr(o);
  }

  public void visitNEQEqualityBinop(@NotNull MinispecNEQEqualityBinop o) {
    visitBinopExpr(o);
  }

  public void visitOrBooleanBinop(@NotNull MinispecOrBooleanBinop o) {
    visitBinopExpr(o);
  }

  public void visitOrLogicalBinop(@NotNull MinispecOrLogicalBinop o) {
    visitBinopExpr(o);
  }

  public void visitOtherPrimary(@NotNull MinispecOtherPrimary o) {
    visitPrimaryExpr(o);
  }

  public void visitPackageStmt(@NotNull MinispecPackageStmt o) {
    visitPsiElement(o);
  }

  public void visitParam(@NotNull MinispecParam o) {
    visitPsiElement(o);
  }

  public void visitParamFormal(@NotNull MinispecParamFormal o) {
    visitPsiElement(o);
  }

  public void visitParamFormals(@NotNull MinispecParamFormals o) {
    visitPsiElement(o);
  }

  public void visitParamName(@NotNull MinispecParamName o) {
    visitPsiElement(o);
  }

  public void visitParamTypeName(@NotNull MinispecParamTypeName o) {
    visitPsiElement(o);
  }

  public void visitParams(@NotNull MinispecParams o) {
    visitPsiElement(o);
  }

  public void visitParenthesesPrimary(@NotNull MinispecParenthesesPrimary o) {
    visitPrimaryExpr(o);
  }

  public void visitPrimaryExpr(@NotNull MinispecPrimaryExpr o) {
    visitExpression(o);
  }

  public void visitRegName(@NotNull MinispecRegName o) {
    visitPsiElement(o);
  }

  public void visitRegWrite(@NotNull MinispecRegWrite o) {
    visitPsiElement(o);
  }

  public void visitReturnPrimary(@NotNull MinispecReturnPrimary o) {
    visitPrimaryExpr(o);
  }

  public void visitRightShiftBinop(@NotNull MinispecRightShiftBinop o) {
    visitBinopExpr(o);
  }

  public void visitRuleDef(@NotNull MinispecRuleDef o) {
    visitPsiElement(o);
  }

  public void visitRuleName(@NotNull MinispecRuleName o) {
    visitPsiElement(o);
  }

  public void visitSimpleLValue(@NotNull MinispecSimpleLValue o) {
    visitLValue(o);
  }

  public void visitSliceLValue(@NotNull MinispecSliceLValue o) {
    visitLValue(o);
  }

  public void visitSlicePrimary(@NotNull MinispecSlicePrimary o) {
    visitPrimaryExpr(o);
  }

  public void visitStmt(@NotNull MinispecStmt o) {
    visitPsiElement(o);
  }

  public void visitStructElement(@NotNull MinispecStructElement o) {
    visitPsiElement(o);
  }

  public void visitStructMemberName(@NotNull MinispecStructMemberName o) {
    visitPsiElement(o);
  }

  public void visitStructPrimary(@NotNull MinispecStructPrimary o) {
    visitPrimaryExpr(o);
  }

  public void visitSubmoduleDecl(@NotNull MinispecSubmoduleDecl o) {
    visitPsiElement(o);
  }

  public void visitSubmoduleName(@NotNull MinispecSubmoduleName o) {
    visitPsiElement(o);
  }

  public void visitSubtractionBinop(@NotNull MinispecSubtractionBinop o) {
    visitBinopExpr(o);
  }

  public void visitType(@NotNull MinispecType o) {
    visitPsiElement(o);
  }

  public void visitTypeDecl(@NotNull MinispecTypeDecl o) {
    visitPsiElement(o);
  }

  public void visitTypeDefEnum(@NotNull MinispecTypeDefEnum o) {
    visitPsiElement(o);
  }

  public void visitTypeDefStruct(@NotNull MinispecTypeDefStruct o) {
    visitPsiElement(o);
  }

  public void visitTypeDefSynonym(@NotNull MinispecTypeDefSynonym o) {
    visitPsiElement(o);
  }

  public void visitTypeName(@NotNull MinispecTypeName o) {
    visitPsiElement(o);
  }

  public void visitUnopBinop(@NotNull MinispecUnopBinop o) {
    visitBinopExpr(o);
  }

  public void visitUnopExpressionOpBit(@NotNull MinispecUnopExpressionOpBit o) {
    visitPsiElement(o);
  }

  public void visitUnopExpressionOpMath(@NotNull MinispecUnopExpressionOpMath o) {
    visitPsiElement(o);
  }

  public void visitVarAssign(@NotNull MinispecVarAssign o) {
    visitPsiElement(o);
  }

  public void visitVarDecl(@NotNull MinispecVarDecl o) {
    visitPsiElement(o);
  }

  public void visitVarElement(@NotNull MinispecVarElement o) {
    visitPsiElement(o);
  }

  public void visitVarLetDecl(@NotNull MinispecVarLetDecl o) {
    visitPsiElement(o);
  }

  public void visitVarName(@NotNull MinispecVarName o) {
    visitPsiElement(o);
  }

  public void visitVarPrimary(@NotNull MinispecVarPrimary o) {
    visitPrimaryExpr(o);
  }

  public void visitVarSimpleDecl(@NotNull MinispecVarSimpleDecl o) {
    visitPsiElement(o);
  }

  public void visitXnorLogicalBinop(@NotNull MinispecXnorLogicalBinop o) {
    visitBinopExpr(o);
  }

  public void visitXorLogicalBinop(@NotNull MinispecXorLogicalBinop o) {
    visitBinopExpr(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
