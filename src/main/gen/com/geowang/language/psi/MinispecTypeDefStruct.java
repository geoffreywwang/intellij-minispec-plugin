// This is a generated file. Not intended for manual editing.
package com.geowang.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MinispecTypeDefStruct extends PsiElement {

  @Nullable
  MinispecParamFormals getParamFormals();

  @NotNull
  List<MinispecStructElement> getStructElementList();

  @Nullable
  MinispecTypeName getTypeName();

}
