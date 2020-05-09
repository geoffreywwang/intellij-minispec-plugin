package com.geowang.language;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.*;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

import com.geowang.language.psi.MinispecTypes;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class MinispecSyntaxHighlighter extends SyntaxHighlighterBase {
    public static final TextAttributesKey COMMA =
            createTextAttributesKey("MINISPEC_COMMA", DefaultLanguageHighlighterColors.COMMA);
    public static final TextAttributesKey SEMICOLON =
            createTextAttributesKey("MINISPEC_SEMICOLON", DefaultLanguageHighlighterColors.SEMICOLON);
    public static final TextAttributesKey DOT =
            createTextAttributesKey("MINISPEC_DOT", DefaultLanguageHighlighterColors.DOT);
    public static final TextAttributesKey PARENTHESES =
            createTextAttributesKey("MINISPEC_PARENTHESES", DefaultLanguageHighlighterColors.PARENTHESES);
    public static final TextAttributesKey BRACKETS =
            createTextAttributesKey("MINISPEC_BRACKETS", DefaultLanguageHighlighterColors.BRACKETS);
    public static final TextAttributesKey BRACES =
            createTextAttributesKey("MINISPEC_BRACES", DefaultLanguageHighlighterColors.BRACES);
    public static final TextAttributesKey LOGIC_SYMBOLS =
            createTextAttributesKey("MINISPEC_LOGIC_SYMBOLS", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey OPERATION_SYMBOLS =
            createTextAttributesKey("MINISPEC_OPERATION_SYMBOLS", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey RELATIONAL_SYMBOLS =
            createTextAttributesKey("MINISPEC_RELATIONAL_SYMBOLS", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey COMMENT =
            createTextAttributesKey("MINISPEC_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey BAD_CHARACTER =
            createTextAttributesKey("MINISPEC_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);
    public static final TextAttributesKey STRING =
            createTextAttributesKey("MINISPEC_STRING_LITERAL", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey NUMBER =
            createTextAttributesKey("MINISPEC_INT_LITERAL", DefaultLanguageHighlighterColors.NUMBER);
    public static final TextAttributesKey KEYWORD =
            createTextAttributesKey("MINISPEC_IDENTIFIER", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey FUNCTION_CALL =
            createTextAttributesKey("MINISPEC_FUNCTION_CALL", DefaultLanguageHighlighterColors.FUNCTION_CALL);
    public static final TextAttributesKey PARAMETER =
            createTextAttributesKey("MINISPEC_PARAMETER", DefaultLanguageHighlighterColors.PARAMETER);
    public static final TextAttributesKey TYPE =
            createTextAttributesKey("MINISPEC_TYPE", DefaultLanguageHighlighterColors.CLASS_NAME);
    public static final TextAttributesKey VARIABLE =
            createTextAttributesKey("MINISPEC_VARIABLE", DefaultLanguageHighlighterColors.IDENTIFIER);
    public static final TextAttributesKey SYSTEM_FUNCTION =
            createTextAttributesKey("MINISPEC_SYSTEM_FUNCTION", DefaultLanguageHighlighterColors.LABEL);

    private static final TextAttributesKey[] COMMA_KEYS = new TextAttributesKey[]{COMMA};
    private static final TextAttributesKey[] SEMICOLON_KEYS = new TextAttributesKey[]{SEMICOLON};
    private static final TextAttributesKey[] DOT_KEYS = new TextAttributesKey[]{DOT};
    private static final TextAttributesKey[] PARENTHESES_KEYS = new TextAttributesKey[]{PARENTHESES};
    private static final TextAttributesKey[] BRACKETS_KEYS = new TextAttributesKey[]{BRACKETS};
    private static final TextAttributesKey[] BRACES_KEYS = new TextAttributesKey[]{BRACES};
    private static final TextAttributesKey[] LOGIC_SYMBOLS_KEYS = new TextAttributesKey[]{LOGIC_SYMBOLS};
    private static final TextAttributesKey[] OPERATION_SYMBOLS_KEYS = new TextAttributesKey[]{OPERATION_SYMBOLS};
    private static final TextAttributesKey[] RELATIONAL_SYMBOLS_KEYS = new TextAttributesKey[]{RELATIONAL_SYMBOLS};
    private static final TextAttributesKey[] STRING_KEYS = new TextAttributesKey[]{STRING};
    private static final TextAttributesKey[] NUMBER_KEYS = new TextAttributesKey[]{NUMBER};
    private static final TextAttributesKey[] KEYWORD_KEYS = new TextAttributesKey[]{KEYWORD};
    private static final TextAttributesKey[] FUNCTION_CALL_KEYS = new TextAttributesKey[]{FUNCTION_CALL};
    private static final TextAttributesKey[] PARAMETER_KEYS = new TextAttributesKey[]{PARAMETER};
    private static final TextAttributesKey[] TYPE_KEYS = new TextAttributesKey[]{TYPE};
    private static final TextAttributesKey[] VARIABLE_KEYS = new TextAttributesKey[]{VARIABLE};
    private static final TextAttributesKey[] SYSTEM_FUNCTION_KEYS = new TextAttributesKey[]{SYSTEM_FUNCTION};

    private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[]{BAD_CHARACTER};
    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new MinispecLexerAdapter();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(MinispecTypes.BEGIN) ||
            tokenType.equals(MinispecTypes.BSV_IMPORT) ||
            tokenType.equals(MinispecTypes.CASE) ||
            tokenType.equals(MinispecTypes.DEFAULT) ||
            tokenType.equals(MinispecTypes.ELSE) ||
            tokenType.equals(MinispecTypes.END) ||
            tokenType.equals(MinispecTypes.END_CASE) ||
            tokenType.equals(MinispecTypes.END_FUNCTION) ||
            tokenType.equals(MinispecTypes.END_METHOD) ||
            tokenType.equals(MinispecTypes.END_MODULE) ||
            tokenType.equals(MinispecTypes.END_RULE) ||
            tokenType.equals(MinispecTypes.ENUM) ||
            tokenType.equals(MinispecTypes.FOR) ||
            tokenType.equals(MinispecTypes.FUNCTION) ||
            tokenType.equals(MinispecTypes.IF) ||
            tokenType.equals(MinispecTypes.IMPORT) ||
            tokenType.equals(MinispecTypes.INPUT) ||
            tokenType.equals(MinispecTypes.LET) ||
            tokenType.equals(MinispecTypes.METHOD) ||
            tokenType.equals(MinispecTypes.MODULE) ||
            tokenType.equals(MinispecTypes.RETURN) ||
            tokenType.equals(MinispecTypes.RULE) ||
            tokenType.equals(MinispecTypes.STRUCT) ||
            tokenType.equals(MinispecTypes.TYPE_KEYWORD) ||
            tokenType.equals(MinispecTypes.TYPEDEF)) {
            return KEYWORD_KEYS;
        } else if (tokenType.equals(MinispecTypes.COMMA)) {
            return COMMA_KEYS;
        } else if (tokenType.equals(MinispecTypes.SEMI)) {
            return SEMICOLON_KEYS;
        } else if (tokenType.equals(MinispecTypes.DOT)) {
            return DOT_KEYS;
        } else if (tokenType.equals(MinispecTypes.LP) || tokenType.equals(MinispecTypes.RP)) {
            return PARENTHESES_KEYS;
        } else if (tokenType.equals(MinispecTypes.LB) || tokenType.equals(MinispecTypes.RB)) {
            return BRACKETS_KEYS;
        } else if (tokenType.equals(MinispecTypes.LC) || tokenType.equals(MinispecTypes.RC)) {
            return BRACES_KEYS;
        } else if ( tokenType.equals(MinispecTypes.NOT) ||
                    tokenType.equals(MinispecTypes.INVERT) ||
                    tokenType.equals(MinispecTypes.BIT_AND) ||
                    tokenType.equals(MinispecTypes.BIT_NAND) ||
                    tokenType.equals(MinispecTypes.BIT_OR) ||
                    tokenType.equals(MinispecTypes.BIT_NOR) ||
                    tokenType.equals(MinispecTypes.XOR) ||
                    tokenType.equals(MinispecTypes.XNOR) ) {
            return LOGIC_SYMBOLS_KEYS;
        } else if ( tokenType.equals(MinispecTypes.EXPO) ||
                    tokenType.equals(MinispecTypes.MUL) ||
                    tokenType.equals(MinispecTypes.DIV) ||
                    tokenType.equals(MinispecTypes.MOD) ||
                    tokenType.equals(MinispecTypes.ADD) ||
                    tokenType.equals(MinispecTypes.SUB) ||
                    tokenType.equals(MinispecTypes.LS) ||
                    tokenType.equals(MinispecTypes.RS) ) {
            return OPERATION_SYMBOLS_KEYS;
        } else if ( tokenType.equals(MinispecTypes.LT) ||
                    tokenType.equals(MinispecTypes.LEQ) ||
                    tokenType.equals(MinispecTypes.GT) ||
                    tokenType.equals(MinispecTypes.GEQ) ||
                    tokenType.equals(MinispecTypes.BOOL_EQ) ||
                    tokenType.equals(MinispecTypes.BOOL_NEQ) ||
                    tokenType.equals(MinispecTypes.BOOL_AND) ||
                    tokenType.equals(MinispecTypes.BOOL_OR) ) {
            return RELATIONAL_SYMBOLS_KEYS;
        } else if (tokenType.equals(MinispecTypes.STRING_LITERAL)) {
            return STRING_KEYS;
        } else if (tokenType.equals(MinispecTypes.INT_LITERAL)) {
            return NUMBER_KEYS;
        } else if (tokenType.equals(MinispecTypes.DOLLAR_IDENTIFIER)) {
            return SYSTEM_FUNCTION_KEYS;
        } else if (tokenType.equals(MinispecTypes.INLINE_COMMENT)) {
            return COMMENT_KEYS;
        } else if (tokenType.equals(MinispecTypes.ONE_LINE_COMMENT)) {
            return COMMENT_KEYS;
        } else if (tokenType.equals(TokenType.BAD_CHARACTER)) {
            return BAD_CHAR_KEYS;
        } else {
            return EMPTY_KEYS;
        }
    }
}