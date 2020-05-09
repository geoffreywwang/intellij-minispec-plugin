package com.geowang.language;

import com.geowang.language.grammer._MinispecLexer;
import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

public class MinispecLexerAdapter extends FlexAdapter {
    public MinispecLexerAdapter() {
        super(new _MinispecLexer((Reader) null));
    }
}