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

public class MinispecTypeDefStructImpl extends ASTWrapperPsiElement implements MinispecTypeDefStruct {

  public MinispecTypeDefStructImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MinispecVisitor visitor) {
    visitor.visitTypeDefStruct(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MinispecVisitor) accept((MinispecVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MinispecParamFormals getParamFormals() {
    return findChildByClass(MinispecParamFormals.class);
  }

  @Override
  @NotNull
  public List<MinispecStructElement> getStructElementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MinispecStructElement.class);
  }

  @Override
  @Nullable
  public MinispecTypeName getTypeName() {
    return findChildByClass(MinispecTypeName.class);
  }

}
