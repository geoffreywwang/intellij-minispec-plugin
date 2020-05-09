// This is a generated file. Not intended for manual editing.
package com.geowang.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MinispecFunctionDef extends PsiElement {

  @Nullable
  MinispecArgFormals getArgFormals();

  @Nullable
  MinispecExpression getExpression();

  @NotNull
  MinispecFunctionName getFunctionName();

  @Nullable
  MinispecParamFormals getParamFormals();

  @NotNull
  List<MinispecStmt> getStmtList();

  @NotNull
  MinispecType getType();

}
