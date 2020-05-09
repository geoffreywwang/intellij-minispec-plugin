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

public class MinispecIndexLValueImpl extends MinispecLValueImpl implements MinispecIndexLValue {

  public MinispecIndexLValueImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MinispecVisitor visitor) {
    visitor.visitIndexLValue(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MinispecVisitor) accept((MinispecVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public MinispecExpression getExpression() {
    return findNotNullChildByClass(MinispecExpression.class);
  }

  @Override
  @NotNull
  public MinispecLValue getLValue() {
    return findNotNullChildByClass(MinispecLValue.class);
  }

}
