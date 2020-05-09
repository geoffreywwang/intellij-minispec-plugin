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

public class MinispecTypeDefEnumImpl extends ASTWrapperPsiElement implements MinispecTypeDefEnum {

  public MinispecTypeDefEnumImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MinispecVisitor visitor) {
    visitor.visitTypeDefEnum(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MinispecVisitor) accept((MinispecVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<MinispecEnumElement> getEnumElementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MinispecEnumElement.class);
  }

  @Override
  @Nullable
  public MinispecEnumName getEnumName() {
    return findChildByClass(MinispecEnumName.class);
  }

}
