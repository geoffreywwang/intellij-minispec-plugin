package com.geowang.language.psi.impl;

import com.geowang.language.psi.*;
import com.geowang.language.psi.completion.Variable;
import com.intellij.lang.ASTNode;

import java.util.ArrayList;
import java.util.List;

public class MinispecPsiImplUtil {
    public static String getVar(MinispecVarElement element) {
        ASTNode valueNode = element.getNode().findChildByType(MinispecTypes.LOWER_CASE_IDENTIFIER);
        if (valueNode != null) {
            return valueNode.getText();
        } else {
            return null;
        }
    }

    // Get list of defined variables and their types
    public static List<Variable> getVariables(MinispecVarSimpleDecl element) {
        MinispecType type = element.getType();
        List<Variable> variableList = new ArrayList<>();
        for(MinispecVarElement varElement: element.getVarElementList()) {
            variableList.add(new Variable(type, varElement.getVarName().getText()));
        }
        return variableList;
    }

    public static List<Variable> getVariables(MinispecVarLetDecl element) {
        List<Variable> variableList = new ArrayList<>();
        for(MinispecVarName varName: element.getVarNameList()) {
            variableList.add(new Variable(null, varName.getText()));
        }
        return variableList;
    }

    public static List<Variable> getVariables(MinispecArgFormals element) {
        List<Variable> variableList = new ArrayList<>();
        for(MinispecArgFormal argFormal: element.getArgFormalList()) {
            variableList.add(new Variable(argFormal.getType(), argFormal.getArgName().getText()));
        }
        return variableList;
    }


//    public static List<Variable> getFunction(MinispecFunctionDef element) {
////        Function function = new Function(name, returnType, parameters, arguments);
//
//        String functionName = element.getFunctionName().getText();
//        MinispecType returnType = element.getType();
//
//        List<Variable> arguments = new ArrayList<>();
//        if (element.getArgFormals() != null) {
//            arguments = element.getArgFormals().getVariables();
//        }
//
////        return variableList;
//    }

}
