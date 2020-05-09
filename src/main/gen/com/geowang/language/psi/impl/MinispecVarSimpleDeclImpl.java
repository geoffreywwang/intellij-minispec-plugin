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
import com.geowang.language.psi.completion.Variable;

public class MinispecVarSimpleDeclImpl extends ASTWrapperPsiElement implements MinispecVarSimpleDecl {

  public MinispecVarSimpleDeclImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MinispecVisitor visitor) {
    visitor.visitVarSimpleDecl(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MinispecVisitor) accept((MinispecVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public MinispecType getType() {
    return findNotNullChildByClass(MinispecType.class);
  }

  @Override
  @NotNull
  public List<MinispecVarElement> getVarElementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MinispecVarElement.class);
  }

  @Override
  public List<Variable> getVariables() {
    return MinispecPsiImplUtil.getVariables(this);
  }

}
