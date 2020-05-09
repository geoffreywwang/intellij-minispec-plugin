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

public class MinispecEnumElementImpl extends ASTWrapperPsiElement implements MinispecEnumElement {

  public MinispecEnumElementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MinispecVisitor visitor) {
    visitor.visitEnumElement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MinispecVisitor) accept((MinispecVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public MinispecEnumLabelName getEnumLabelName() {
    return findNotNullChildByClass(MinispecEnumLabelName.class);
  }

  @Override
  @Nullable
  public MinispecEnumLabelVal getEnumLabelVal() {
    return findChildByClass(MinispecEnumLabelVal.class);
  }

}
