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

public class MinispecPackageStmtImpl extends ASTWrapperPsiElement implements MinispecPackageStmt {

  public MinispecPackageStmtImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MinispecVisitor visitor) {
    visitor.visitPackageStmt(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MinispecVisitor) accept((MinispecVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MinispecBsvImportDecl getBsvImportDecl() {
    return findChildByClass(MinispecBsvImportDecl.class);
  }

  @Override
  @Nullable
  public MinispecFunctionDef getFunctionDef() {
    return findChildByClass(MinispecFunctionDef.class);
  }

  @Override
  @Nullable
  public MinispecImportDecl getImportDecl() {
    return findChildByClass(MinispecImportDecl.class);
  }

  @Override
  @Nullable
  public MinispecModuleDef getModuleDef() {
    return findChildByClass(MinispecModuleDef.class);
  }

  @Override
  @Nullable
  public MinispecTypeDecl getTypeDecl() {
    return findChildByClass(MinispecTypeDecl.class);
  }

  @Override
  @Nullable
  public MinispecVarDecl getVarDecl() {
    return findChildByClass(MinispecVarDecl.class);
  }

}
