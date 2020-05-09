package com.geowang.language;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class MinispecFileType extends LanguageFileType {
    public static final MinispecFileType INSTANCE = new MinispecFileType();

    private MinispecFileType() {
        super(MinispecLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Minispec file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Minispec language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "ms";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return MinispecIcons.FILE;
    }
}
