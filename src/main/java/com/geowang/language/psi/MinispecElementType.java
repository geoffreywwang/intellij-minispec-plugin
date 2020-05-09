package com.geowang.language.psi;

import com.geowang.language.MinispecLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class MinispecElementType extends IElementType {
    public MinispecElementType(@NotNull @NonNls String debugName) {
        super(debugName, MinispecLanguage.INSTANCE);
    }
}
