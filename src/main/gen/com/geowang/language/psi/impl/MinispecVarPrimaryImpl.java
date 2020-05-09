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

public class MinispecVarPrimaryImpl extends MinispecPrimaryExprImpl implements MinispecVarPrimary {

  public MinispecVarPrimaryImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MinispecVisitor visitor) {
    visitor.visitVarPrimary(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MinispecVisitor) accept((MinispecVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MinispecParams getParams() {
    return findChildByClass(MinispecParams.class);
  }

  @Override
  @Nullable
  public PsiElement getDollarIdentifier() {
    return findChildByType(DOLLAR_IDENTIFIER);
  }

  @Override
  @Nullable
  public PsiElement getLowerCaseIdentifier() {
    return findChildByType(LOWER_CASE_IDENTIFIER);
  }

  @Override
  @Nullable
  public PsiElement getUpperCaseIdentifier() {
    return findChildByType(UPPER_CASE_IDENTIFIER);
  }

}
