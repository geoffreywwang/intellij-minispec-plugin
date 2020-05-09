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

public class MinispecModuleStmtImpl extends ASTWrapperPsiElement implements MinispecModuleStmt {

  public MinispecModuleStmtImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MinispecVisitor visitor) {
    visitor.visitModuleStmt(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MinispecVisitor) accept((MinispecVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MinispecInputDef getInputDef() {
    return findChildByClass(MinispecInputDef.class);
  }

  @Override
  @Nullable
  public MinispecMethodDef getMethodDef() {
    return findChildByClass(MinispecMethodDef.class);
  }

  @Override
  @Nullable
  public MinispecRuleDef getRuleDef() {
    return findChildByClass(MinispecRuleDef.class);
  }

  @Override
  @Nullable
  public MinispecStmt getStmt() {
    return findChildByClass(MinispecStmt.class);
  }

  @Override
  @Nullable
  public MinispecSubmoduleDecl getSubmoduleDecl() {
    return findChildByClass(MinispecSubmoduleDecl.class);
  }

}
