// This is a generated file. Not intended for manual editing.
package com.geowang.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.geowang.language.psi.MinispecTypes.*;
import com.geowang.language.psi.*;

public class MinispecUnopBinopImpl extends MinispecBinopExprImpl implements MinispecUnopBinop {

  public MinispecUnopBinopImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MinispecVisitor visitor) {
    visitor.visitUnopBinop(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MinispecVisitor) accept((MinispecVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MinispecPrimaryExpr getPrimaryExpr() {
    return findChildByClass(MinispecPrimaryExpr.class);
  }

  @Override
  @Nullable
  public MinispecUnopExpressionOpBit getUnopExpressionOpBit() {
    return findChildByClass(MinispecUnopExpressionOpBit.class);
  }

  @Override
  @Nullable
  public MinispecUnopExpressionOpMath getUnopExpressionOpMath() {
    return findChildByClass(MinispecUnopExpressionOpMath.class);
  }

}
