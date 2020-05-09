package com.geowang.language;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.*;
import org.jetbrains.annotations.*;

import javax.swing.*;
import java.util.Map;

public class MinispecColorSettingsPage implements ColorSettingsPage {
    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            new AttributesDescriptor("Keyword", MinispecSyntaxHighlighter.KEYWORD),
            new AttributesDescriptor("Bad Value", MinispecSyntaxHighlighter.BAD_CHARACTER)
    };

    @Nullable
    @Override
    public Icon getIcon() {
        return MinispecIcons.FILE;
    }

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new MinispecSyntaxHighlighter();
    }

    @NotNull
    @Override
    public String getDemoText() {
        return "function Bit#(n+1) rcaWithOverflow#(Integer n)(Bit#(n) a, Bit#(n) b, Bit#(1) carryIn);\n" +
                "    if (n==1) begin\n" +
                "        return fullAdder(a,b,carryIn);\n" +
                "    end else begin\n" +
                "        Bit#(n/2+1) lower = rcaWithOverflow#(n/2)(a[n/2-1:0], b[n/2-1:0], carryIn);\n" +
                "        Bit#(n/2+1) upper = rcaWithOverflow#(n/2)(a[n-1:n/2], b[n-1:n/2], lower[n/2]);\n" +
                "        return {upper,lower[n/2-1:0]};\n" +
                "    end\n" +
                "endfunction\n";
    }

    @Nullable
    @Override
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @NotNull
    @Override
    public AttributesDescriptor[] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @NotNull
    @Override
    public ColorDescriptor[] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "Minispec";
    }
}