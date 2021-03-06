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

public class MinispecInputDefImpl extends ASTWrapperPsiElement implements MinispecInputDef {

  public MinispecInputDefImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MinispecVisitor visitor) {
    visitor.visitInputDef(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MinispecVisitor) accept((MinispecVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MinispecInputDefaultVal getInputDefaultVal() {
    return findChildByClass(MinispecInputDefaultVal.class);
  }

  @Override
  @NotNull
  public MinispecInputName getInputName() {
    return findNotNullChildByClass(MinispecInputName.class);
  }

  @Override
  @NotNull
  public MinispecType getType() {
    return findNotNullChildByClass(MinispecType.class);
  }

}
