// This is a generated file. Not intended for manual editing.
package com.geowang.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MinispecStmt extends PsiElement {

  @Nullable
  MinispecBeginEndBlock getBeginEndBlock();

  @Nullable
  MinispecCaseStmt getCaseStmt();

  @Nullable
  MinispecExpressionStmt getExpressionStmt();

  @Nullable
  MinispecForStmt getForStmt();

  @Nullable
  MinispecIfStmt getIfStmt();

  @Nullable
  MinispecRegWrite getRegWrite();

  @Nullable
  MinispecVarAssign getVarAssign();

  @Nullable
  MinispecVarDecl getVarDecl();

}
