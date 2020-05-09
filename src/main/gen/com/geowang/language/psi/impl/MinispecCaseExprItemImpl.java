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

public class MinispecCaseExprItemImpl extends ASTWrapperPsiElement implements MinispecCaseExprItem {

  public MinispecCaseExprItemImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MinispecVisitor visitor) {
    visitor.visitCaseExprItem(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MinispecVisitor) accept((MinispecVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MinispecCaseExprItemBody getCaseExprItemBody() {
    return findChildByClass(MinispecCaseExprItemBody.class);
  }

  @Override
  @NotNull
  public List<MinispecPrimaryExpr> getPrimaryExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MinispecPrimaryExpr.class);
  }

}
