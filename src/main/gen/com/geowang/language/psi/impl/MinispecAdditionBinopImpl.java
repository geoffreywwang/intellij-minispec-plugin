// This is a generated file. Not intended for manual editing.
package com.geowang.language.psi.impl;

import com.geowang.language.psi.MinispecAdditionBinop;
import com.geowang.language.psi.MinispecBinopExpr;
import com.geowang.language.psi.MinispecVisitor;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class MinispecAdditionBinopImpl extends MinispecBinopExprImpl implements MinispecAdditionBinop {

  public MinispecAdditionBinopImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MinispecVisitor visitor) {
    visitor.visitAdditionBinop(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MinispecVisitor) accept((MinispecVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<MinispecBinopExpr> getBinopExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MinispecBinopExpr.class);
  }

}
