// This is a generated file. Not intended for manual editing.
package com.geowang.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MinispecModuleDef extends PsiElement {

  @Nullable
  MinispecArgFormals getArgFormals();

  @NotNull
  MinispecModuleName getModuleName();

  @NotNull
  List<MinispecModuleStmt> getModuleStmtList();

  @Nullable
  MinispecParamFormals getParamFormals();

}
