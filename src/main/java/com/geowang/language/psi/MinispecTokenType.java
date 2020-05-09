package com.geowang.language.psi;

import com.geowang.language.MinispecLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.*;

public class MinispecTokenType extends IElementType {
    public MinispecTokenType(@NotNull @NonNls String debugName) {
        super(debugName, MinispecLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "MinispecTokenType." + super.toString();
    }
}
