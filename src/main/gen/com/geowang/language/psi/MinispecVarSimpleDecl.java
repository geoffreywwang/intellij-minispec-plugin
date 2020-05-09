// This is a generated file. Not intended for manual editing.
package com.geowang.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.geowang.language.psi.completion.Variable;

public interface MinispecVarSimpleDecl extends PsiElement {

  @NotNull
  MinispecType getType();

  @NotNull
  List<MinispecVarElement> getVarElementList();

  List<Variable> getVariables();

}
