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

public class MinispecCaseStmtElementImpl extends ASTWrapperPsiElement implements MinispecCaseStmtElement {

  public MinispecCaseStmtElementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MinispecVisitor visitor) {
    visitor.visitCaseStmtElement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MinispecVisitor) accept((MinispecVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<MinispecExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MinispecExpression.class);
  }

  @Override
  @NotNull
  public MinispecStmt getStmt() {
    return findNotNullChildByClass(MinispecStmt.class);
  }

}
