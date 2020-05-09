package com.geowang.language;

import com.intellij.lang.Language;

public class MinispecLanguage extends Language{
    public static final MinispecLanguage INSTANCE = new MinispecLanguage();

    private MinispecLanguage() {
        super("Minispec");
    }
}
