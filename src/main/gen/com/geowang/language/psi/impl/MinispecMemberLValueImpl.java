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

public class MinispecMemberLValueImpl extends MinispecLValueImpl implements MinispecMemberLValue {

  public MinispecMemberLValueImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MinispecVisitor visitor) {
    visitor.visitMemberLValue(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MinispecVisitor) accept((MinispecVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public MinispecLValue getLValue() {
    return findNotNullChildByClass(MinispecLValue.class);
  }

  @Override
  @NotNull
  public PsiElement getLowerCaseIdentifier() {
    return findNotNullChildByType(LOWER_CASE_IDENTIFIER);
  }

}
