// This is a generated file. Not intended for manual editing.
package com.geowang.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MinispecForStmt extends PsiElement {

  @NotNull
  List<MinispecExpression> getExpressionList();

  @NotNull
  MinispecStmt getStmt();

  @NotNull
  MinispecType getType();

  @NotNull
  List<MinispecVarName> getVarNameList();

}
