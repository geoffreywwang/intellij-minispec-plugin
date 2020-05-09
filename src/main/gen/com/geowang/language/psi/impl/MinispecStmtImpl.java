// This is a generated file. Not intended for manual editing.
package com.geowang.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.geowang.language.psi.MinispecTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.geowang.language.psi.*;

public class MinispecStmtImpl extends ASTWrapperPsiElement implements MinispecStmt {

  public MinispecStmtImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MinispecVisitor visitor) {
    visitor.visitStmt(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MinispecVisitor) accept((MinispecVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MinispecBeginEndBlock getBeginEndBlock() {
    return findChildByClass(MinispecBeginEndBlock.class);
  }

  @Override
  @Nullable
  public MinispecCaseStmt getCaseStmt() {
    return findChildByClass(MinispecCaseStmt.class);
  }

  @Override
  @Nullable
  public MinispecExpressionStmt getExpressionStmt() {
    return findChildByClass(MinispecExpressionStmt.class);
  }

  @Override
  @Nullable
  public MinispecForStmt getForStmt() {
    return findChildByClass(MinispecForStmt.class);
  }

  @Override
  @Nullable
  public MinispecIfStmt getIfStmt() {
    return findChildByClass(MinispecIfStmt.class);
  }

  @Override
  @Nullable
  public MinispecRegWrite getRegWrite() {
    return findChildByClass(MinispecRegWrite.class);
  }

  @Override
  @Nullable
  public MinispecVarAssign getVarAssign() {
    return findChildByClass(MinispecVarAssign.class);
  }

  @Override
  @Nullable
  public MinispecVarDecl getVarDecl() {
    return findChildByClass(MinispecVarDecl.class);
  }

}
