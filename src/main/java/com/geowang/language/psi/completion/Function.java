package com.geowang.language.psi.completion;

import com.geowang.language.psi.MinispecType;

import java.util.List;

public class Function {
    private String name;
    private MinispecType returnType;
    private List<Variable> parameters;
    private List<Variable> arguments;

    public Function(String name, MinispecType returnType, List<Variable> parameters, List<Variable> arguments) {
        this.name = name;
        this.returnType = returnType;
        this.parameters = parameters;
        this.arguments = arguments;
    }

    public String getName() {
        return name;
    }

    public MinispecType getReturnType() {
        return returnType;
    }

    public List<Variable> getParameters() {
        return parameters;
    }

    public List<Variable> getArguments() {
        return arguments;
    }
}
