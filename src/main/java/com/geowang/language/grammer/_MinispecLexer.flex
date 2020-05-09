package com.geowang.language.grammer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.geowang.language.psi.MinispecTypes.*;

%%

%{
  public _MinispecLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _MinispecLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
//WHITE_SPACE=\s+

XNOR=("~\^")|("\^~")
UPPER_CASE_IDENTIFIER=[A-Z][a-zA-Z0-9_]*
LOWER_CASE_IDENTIFIER=[a-z_][a-zA-Z0-9_]*
DOLLAR_IDENTIFIER=[$][a-z][a-zA-Z0-9_$]*
INT_LITERAL=([1-9][0-9]*)?(('h[0-9a-fA-F_]+)|('d[0-9_]+)|('b[0-1_]+))|([0-9_]+)
STRING_LITERAL=\"([^\f\n\r\t\"])*\"
ONE_LINE_COMMENT="//".*
INLINE_COMMENT="/"\*(.|[ \t\n\x0B\f\r])*?\*"/"
WHITE_SPACE=[ \f\n\r\t]

%%
<YYINITIAL> {
  {WHITE_SPACE}                { return WHITE_SPACE; }

  "="                          { return EQ; }
  ","                          { return COMMA; }
  "."                          { return DOT; }
  ":"                          { return COLON; }
  ";"                          { return SEMI; }
  "?"                          { return QMARK; }
  "#"                          { return HASH; }
  ")"                          { return RP; }
  "("                          { return LP; }
  "]"                          { return RB; }
  "["                          { return LB; }
  "}"                          { return RC; }
  "{"                          { return LC; }
  "!"                          { return NOT; }
  "~"                          { return INVERT; }
  "&"                          { return BIT_AND; }
  "~&"                         { return BIT_NAND; }
  "|"                          { return BIT_OR; }
  "~|"                         { return BIT_NOR; }
  "^"                          { return XOR; }
  "**"                         { return EXPO; }
  "*"                          { return MUL; }
  "/"                          { return DIV; }
  "%"                          { return MOD; }
  "+"                          { return ADD; }
  "-"                          { return SUB; }
  "<<"                         { return LS; }
  ">>"                         { return RS; }
  "<"                          { return LT; }
  "<="                         { return LEQ; }
  ">"                          { return GT; }
  ">="                         { return GEQ; }
  "=="                         { return BOOL_EQ; }
  "!="                         { return BOOL_NEQ; }
  "&&"                         { return BOOL_AND; }
  "||"                         { return BOOL_OR; }
  "begin"                      { return BEGIN; }
  "bsvimport"                  { return BSV_IMPORT; }
  "case"                       { return CASE; }
  "default"                    { return DEFAULT; }
  "else"                       { return ELSE; }
  "end"                        { return END; }
  "endcase"                    { return END_CASE; }
  "endfunction"                { return END_FUNCTION; }
  "endmethod"                  { return END_METHOD; }
  "endmodule"                  { return END_MODULE; }
  "endrule"                    { return END_RULE; }
  "enum"                       { return ENUM; }
  "for"                        { return FOR; }
  "function"                   { return FUNCTION; }
  "if"                         { return IF; }
  "import"                     { return IMPORT; }
  "input"                      { return INPUT; }
  "let"                        { return LET; }
  "method"                     { return METHOD; }
  "module"                     { return MODULE; }
  "return"                     { return RETURN; }
  "rule"                       { return RULE; }
  "struct"                     { return STRUCT; }
  "type"                       { return TYPE_KEYWORD; }
  "typedef"                    { return TYPEDEF; }

  {XNOR}                       { return XNOR; }
  {UPPER_CASE_IDENTIFIER}      { return UPPER_CASE_IDENTIFIER; }
  {LOWER_CASE_IDENTIFIER}      { return LOWER_CASE_IDENTIFIER; }
  {DOLLAR_IDENTIFIER}          { return DOLLAR_IDENTIFIER; }
  {INT_LITERAL}                { return INT_LITERAL; }
  {STRING_LITERAL}             { return STRING_LITERAL; }
  {ONE_LINE_COMMENT}           { return ONE_LINE_COMMENT; }
  {INLINE_COMMENT}             { return INLINE_COMMENT; }
  {WHITE_SPACE}                { return WHITE_SPACE; }

}

[^] { return BAD_CHARACTER; }
