package com.geowang.language.psi;

import com.geowang.language.*;
import org.jetbrains.annotations.NotNull;
import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;

public class MinispecFile extends PsiFileBase {
    public MinispecFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, MinispecLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return MinispecFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Minispec File";
    }
}