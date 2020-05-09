package com.geowang.language.psi.completion;

import com.geowang.language.psi.MinispecType;

public class Variable {

    private MinispecType type;
    private String name;

    public Variable(MinispecType type, String name) {
        this.type = type;
        this.name = name;
    }

    public MinispecType getType() {
        return type;
    }

    public String getName() {
        return name;
    }
}
