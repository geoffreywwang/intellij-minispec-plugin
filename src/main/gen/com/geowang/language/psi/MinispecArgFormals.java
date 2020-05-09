// This is a generated file. Not intended for manual editing.
package com.geowang.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.geowang.language.psi.completion.Variable;

public interface MinispecArgFormals extends PsiElement {

  @NotNull
  List<MinispecArgFormal> getArgFormalList();

  List<Variable> getVariables();

}
