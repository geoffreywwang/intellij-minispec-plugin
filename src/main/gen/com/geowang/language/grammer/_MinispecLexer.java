/* The following code was generated by JFlex 1.7.0 tweaked for IntelliJ platform */

package com.geowang.language.grammer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.geowang.language.psi.MinispecTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>_MinispecLexer.flex</tt>
 */
public class _MinispecLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [9, 6, 6]
   * Total runtime size is 1568 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>12]|((ch>>6)&0x3f)]<<6)|(ch&0x3f)];
  }

  /* The ZZ_CMAP_Z table has 272 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\100\1\200\u010d\100");

  /* The ZZ_CMAP_Y table has 192 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\1\2\175\3\1\4\77\3");

  /* The ZZ_CMAP_A table has 320 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\23\1\2\1\25\2\2\22\0\1\27\1\45\1\22\1\36\1\10\1\50\1\46\1\13\1\40"+
    "\1\37\1\26\1\51\1\31\1\52\1\32\1\24\1\6\1\21\10\12\1\33\1\34\1\53\1\30\1\54"+
    "\1\35\1\0\6\15\24\5\1\42\1\0\1\41\1\4\1\7\1\0\1\71\1\20\1\70\1\17\1\55\1\16"+
    "\1\56\1\14\1\57\2\11\1\73\1\63\1\60\1\65\1\64\1\11\1\66\1\61\1\67\1\72\1\62"+
    "\2\11\1\74\1\11\1\44\1\47\1\43\1\3\6\0\1\1\242\0\2\1\26\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\1\1\6\1\1\3\7\1\1\1\10\1\11\1\12"+
    "\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22"+
    "\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32"+
    "\1\33\1\34\1\35\1\36\10\7\1\37\1\40\1\41"+
    "\1\42\4\0\5\7\1\0\1\43\1\44\1\0\1\45"+
    "\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55"+
    "\2\7\1\56\12\7\2\6\1\57\4\7\1\0\1\60"+
    "\13\7\1\61\4\7\1\62\4\7\1\63\1\64\6\7"+
    "\1\65\1\66\1\67\2\7\1\70\6\7\1\71\16\7"+
    "\1\72\1\73\1\74\1\75\1\76\2\7\1\77\4\7"+
    "\1\100\1\101\1\102\1\103\4\7\1\104\1\7\1\105"+
    "\1\106\1\7\1\107";

  private static int [] zzUnpackAction() {
    int [] result = new int[176];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\75\0\75\0\172\0\267\0\364\0\u0131\0\u016e"+
    "\0\u01ab\0\u01e8\0\u0225\0\u0262\0\u029f\0\u02dc\0\u0319\0\u0356"+
    "\0\u0393\0\u03d0\0\75\0\75\0\75\0\75\0\75\0\75"+
    "\0\75\0\75\0\75\0\75\0\75\0\75\0\u040d\0\u044a"+
    "\0\u0487\0\75\0\75\0\75\0\u04c4\0\u0501\0\u053e\0\u057b"+
    "\0\u05b8\0\u05f5\0\u0632\0\u066f\0\u06ac\0\u06e9\0\75\0\75"+
    "\0\75\0\u0726\0\u0225\0\u0763\0\u0131\0\u07a0\0\u07dd\0\u081a"+
    "\0\u0857\0\u0894\0\u08d1\0\u0319\0\75\0\u090e\0\u094b\0\75"+
    "\0\75\0\75\0\75\0\75\0\75\0\75\0\75\0\75"+
    "\0\u0988\0\u09c5\0\u016e\0\u0a02\0\u0a3f\0\u0a7c\0\u0ab9\0\u0af6"+
    "\0\u0b33\0\u0b70\0\u0bad\0\u0bea\0\u0c27\0\u0763\0\u07a0\0\u016e"+
    "\0\u0c64\0\u0ca1\0\u0cde\0\u0d1b\0\u0d58\0\u0d95\0\u0dd2\0\u0e0f"+
    "\0\u0e4c\0\u0e89\0\u0ec6\0\u0f03\0\u0f40\0\u0f7d\0\u0fba\0\u0ff7"+
    "\0\u1034\0\u016e\0\u1071\0\u10ae\0\u10eb\0\u1128\0\u094b\0\u1165"+
    "\0\u11a2\0\u11df\0\u121c\0\u016e\0\u016e\0\u1259\0\u1296\0\u12d3"+
    "\0\u1310\0\u134d\0\u138a\0\u016e\0\u13c7\0\u016e\0\u1404\0\u1441"+
    "\0\u016e\0\u147e\0\u14bb\0\u14f8\0\u1535\0\u1572\0\u15af\0\u016e"+
    "\0\u15ec\0\u1629\0\u1666\0\u16a3\0\u16e0\0\u171d\0\u175a\0\u1797"+
    "\0\u17d4\0\u1811\0\u184e\0\u188b\0\u18c8\0\u1905\0\u016e\0\u016e"+
    "\0\u016e\0\u016e\0\u016e\0\u1942\0\u197f\0\u016e\0\u19bc\0\u19f9"+
    "\0\u1a36\0\u1a73\0\u016e\0\u016e\0\u016e\0\u016e\0\u1ab0\0\u1aed"+
    "\0\u1b2a\0\u1b67\0\u016e\0\u1ba4\0\u016e\0\u016e\0\u1be1\0\u016e";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[176];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\2\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\10\1\12\1\13\1\10\1\6\1\14\1\15\1\16"+
    "\1\12\1\17\1\3\1\20\1\2\1\21\1\3\1\22"+
    "\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32"+
    "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42"+
    "\1\43\1\44\1\45\1\46\1\47\1\10\1\50\1\10"+
    "\1\51\1\10\1\52\2\10\1\53\1\54\1\55\2\10"+
    "\1\56\1\10\101\0\1\57\41\0\1\60\1\61\30\0"+
    "\1\57\76\0\3\6\1\0\2\6\1\0\6\6\33\0"+
    "\20\6\6\0\2\7\2\0\1\7\6\0\1\7\60\0"+
    "\3\10\1\0\2\10\1\0\6\10\33\0\20\10\11\0"+
    "\1\62\2\0\1\62\1\0\3\62\34\0\20\62\6\0"+
    "\1\12\1\7\2\0\1\12\1\63\5\0\1\12\67\0"+
    "\1\64\2\0\1\65\1\66\61\0\3\10\1\0\2\10"+
    "\1\0\6\10\33\0\10\10\1\67\4\10\1\70\2\10"+
    "\5\0\3\10\1\0\2\10\1\0\6\10\33\0\1\71"+
    "\17\10\5\0\3\10\1\0\2\10\1\0\6\10\33\0"+
    "\1\72\3\10\1\73\13\10\2\74\1\0\17\74\1\75"+
    "\1\0\51\74\24\0\1\76\1\0\1\77\74\0\1\100"+
    "\76\0\1\101\74\0\1\102\112\0\1\103\75\0\1\104"+
    "\55\0\1\105\22\0\1\106\51\0\1\107\23\0\1\110"+
    "\25\0\3\10\1\0\2\10\1\0\6\10\33\0\3\10"+
    "\1\111\12\10\1\112\1\10\5\0\3\10\1\0\2\10"+
    "\1\0\2\10\1\113\3\10\33\0\3\10\1\114\2\10"+
    "\1\115\11\10\5\0\3\10\1\0\2\10\1\0\6\10"+
    "\33\0\12\10\1\116\5\10\5\0\3\10\1\0\2\10"+
    "\1\0\6\10\33\0\1\117\7\10\1\120\7\10\5\0"+
    "\3\10\1\0\2\10\1\0\6\10\33\0\1\121\14\10"+
    "\1\122\2\10\5\0\3\10\1\0\2\10\1\0\6\10"+
    "\33\0\17\10\1\123\5\0\3\10\1\0\2\10\1\0"+
    "\6\10\33\0\14\10\1\124\3\10\5\0\3\10\1\0"+
    "\2\10\1\0\6\10\33\0\1\125\17\10\5\0\6\62"+
    "\1\0\6\62\33\0\20\62\6\0\2\126\2\0\1\126"+
    "\2\0\5\126\33\0\1\126\12\0\2\126\11\0\2\127"+
    "\11\0\1\127\60\0\3\10\1\0\2\10\1\0\6\10"+
    "\33\0\11\10\1\130\6\10\5\0\3\10\1\0\2\10"+
    "\1\0\6\10\33\0\3\10\1\131\14\10\5\0\3\10"+
    "\1\0\2\10\1\0\2\10\1\132\3\10\33\0\20\10"+
    "\5\0\3\10\1\0\2\10\1\0\6\10\33\0\1\10"+
    "\1\133\16\10\5\0\3\10\1\0\2\10\1\0\6\10"+
    "\33\0\5\10\1\134\12\10\1\76\2\0\22\76\1\0"+
    "\47\76\1\77\1\0\24\77\1\135\46\77\5\0\3\10"+
    "\1\0\2\10\1\0\3\10\1\136\2\10\33\0\15\10"+
    "\1\137\2\10\5\0\3\10\1\0\2\10\1\0\6\10"+
    "\33\0\4\10\1\140\13\10\5\0\3\10\1\0\2\10"+
    "\1\0\6\10\33\0\7\10\1\141\10\10\5\0\3\10"+
    "\1\0\2\10\1\0\6\10\33\0\7\10\1\142\10\10"+
    "\5\0\3\10\1\0\2\10\1\0\6\10\33\0\11\10"+
    "\1\143\6\10\5\0\3\10\1\0\2\10\1\0\6\10"+
    "\33\0\12\10\1\144\5\10\5\0\3\10\1\0\2\10"+
    "\1\0\3\10\1\145\2\10\33\0\20\10\5\0\3\10"+
    "\1\0\2\10\1\0\6\10\33\0\12\10\1\146\5\10"+
    "\5\0\3\10\1\0\2\10\1\0\6\10\33\0\16\10"+
    "\1\147\1\10\5\0\3\10\1\0\2\10\1\0\6\10"+
    "\33\0\7\10\1\150\10\10\5\0\3\10\1\0\2\10"+
    "\1\0\6\10\33\0\4\10\1\151\13\10\5\0\3\10"+
    "\1\0\2\10\1\0\6\10\33\0\12\10\1\152\5\10"+
    "\5\0\3\10\1\0\2\10\1\0\6\10\33\0\13\10"+
    "\1\153\4\10\5\0\3\10\1\0\2\10\1\0\6\10"+
    "\33\0\14\10\1\154\3\10\5\0\3\10\1\0\2\10"+
    "\1\0\6\10\33\0\2\10\1\155\15\10\5\0\3\10"+
    "\1\0\2\10\1\0\6\10\33\0\2\10\1\156\15\10"+
    "\1\77\1\0\22\77\1\157\1\77\1\135\46\77\5\0"+
    "\3\10\1\0\2\10\1\0\2\10\1\160\3\10\33\0"+
    "\6\10\1\161\2\10\1\162\1\10\1\163\4\10\5\0"+
    "\3\10\1\0\2\10\1\0\6\10\33\0\6\10\1\164"+
    "\11\10\5\0\3\10\1\0\2\10\1\0\6\10\33\0"+
    "\1\165\17\10\5\0\3\10\1\0\2\10\1\0\6\10"+
    "\33\0\15\10\1\166\2\10\5\0\3\10\1\0\2\10"+
    "\1\0\6\10\33\0\10\10\1\167\7\10\5\0\3\10"+
    "\1\0\2\10\1\0\6\10\33\0\15\10\1\170\2\10"+
    "\5\0\3\10\1\0\2\10\1\0\1\171\5\10\33\0"+
    "\20\10\5\0\3\10\1\0\2\10\1\0\6\10\33\0"+
    "\15\10\1\172\2\10\5\0\3\10\1\0\2\10\1\0"+
    "\6\10\33\0\15\10\1\173\2\10\5\0\3\10\1\0"+
    "\2\10\1\0\6\10\33\0\1\174\17\10\5\0\3\10"+
    "\1\0\2\10\1\0\6\10\33\0\1\175\17\10\5\0"+
    "\3\10\1\0\2\10\1\0\6\10\33\0\1\176\17\10"+
    "\5\0\3\10\1\0\2\10\1\0\6\10\33\0\12\10"+
    "\1\177\5\10\5\0\3\10\1\0\2\10\1\0\6\10"+
    "\33\0\15\10\1\200\2\10\5\0\3\10\1\0\2\10"+
    "\1\0\6\10\33\0\3\10\1\201\14\10\5\0\3\10"+
    "\1\0\2\10\1\0\6\10\33\0\6\10\1\202\11\10"+
    "\5\0\3\10\1\0\2\10\1\0\6\10\33\0\15\10"+
    "\1\203\2\10\5\0\3\10\1\0\2\10\1\0\6\10"+
    "\33\0\1\204\7\10\1\205\7\10\5\0\3\10\1\0"+
    "\2\10\1\0\6\10\33\0\15\10\1\206\2\10\5\0"+
    "\3\10\1\0\2\10\1\0\6\10\33\0\14\10\1\207"+
    "\3\10\5\0\3\10\1\0\2\10\1\0\6\10\33\0"+
    "\12\10\1\210\5\10\5\0\3\10\1\0\2\10\1\0"+
    "\6\10\33\0\11\10\1\211\6\10\5\0\3\10\1\0"+
    "\2\10\1\0\6\10\33\0\13\10\1\212\4\10\5\0"+
    "\3\10\1\0\2\10\1\0\6\10\33\0\10\10\1\213"+
    "\7\10\5\0\3\10\1\0\2\10\1\0\6\10\33\0"+
    "\16\10\1\214\1\10\5\0\3\10\1\0\2\10\1\0"+
    "\6\10\33\0\11\10\1\215\6\10\5\0\3\10\1\0"+
    "\2\10\1\0\3\10\1\216\2\10\33\0\20\10\5\0"+
    "\3\10\1\0\2\10\1\0\6\10\33\0\2\10\1\217"+
    "\15\10\5\0\3\10\1\0\2\10\1\0\6\10\33\0"+
    "\16\10\1\220\1\10\5\0\3\10\1\0\2\10\1\0"+
    "\6\10\33\0\7\10\1\221\10\10\5\0\3\10\1\0"+
    "\2\10\1\0\6\10\33\0\3\10\1\222\14\10\5\0"+
    "\3\10\1\0\2\10\1\0\6\10\33\0\12\10\1\223"+
    "\5\10\5\0\3\10\1\0\2\10\1\0\3\10\1\224"+
    "\2\10\33\0\20\10\5\0\3\10\1\0\2\10\1\0"+
    "\6\10\33\0\16\10\1\225\1\10\5\0\3\10\1\0"+
    "\2\10\1\0\6\10\33\0\4\10\1\226\13\10\5\0"+
    "\3\10\1\0\2\10\1\0\6\10\33\0\12\10\1\227"+
    "\5\10\5\0\3\10\1\0\2\10\1\0\6\10\33\0"+
    "\12\10\1\230\5\10\5\0\3\10\1\0\2\10\1\0"+
    "\3\10\1\231\2\10\33\0\20\10\5\0\3\10\1\0"+
    "\2\10\1\0\6\10\33\0\1\232\17\10\5\0\3\10"+
    "\1\0\2\10\1\0\6\10\33\0\3\10\1\233\14\10"+
    "\5\0\3\10\1\0\2\10\1\0\6\10\33\0\1\234"+
    "\17\10\5\0\3\10\1\0\2\10\1\0\6\10\33\0"+
    "\10\10\1\235\7\10\5\0\3\10\1\0\2\10\1\0"+
    "\6\10\33\0\12\10\1\236\5\10\5\0\3\10\1\0"+
    "\2\10\1\0\6\10\33\0\10\10\1\237\7\10\5\0"+
    "\3\10\1\0\2\10\1\0\6\10\33\0\13\10\1\240"+
    "\4\10\5\0\3\10\1\0\2\10\1\0\1\241\5\10"+
    "\33\0\20\10\5\0\3\10\1\0\2\10\1\0\6\10"+
    "\33\0\15\10\1\242\2\10\5\0\3\10\1\0\2\10"+
    "\1\0\6\10\33\0\1\243\17\10\5\0\3\10\1\0"+
    "\2\10\1\0\6\10\33\0\1\244\17\10\5\0\3\10"+
    "\1\0\2\10\1\0\2\10\1\245\3\10\33\0\20\10"+
    "\5\0\3\10\1\0\2\10\1\0\6\10\33\0\3\10"+
    "\1\246\14\10\5\0\3\10\1\0\2\10\1\0\6\10"+
    "\33\0\11\10\1\247\6\10\5\0\3\10\1\0\2\10"+
    "\1\0\6\10\33\0\12\10\1\250\5\10\5\0\3\10"+
    "\1\0\2\10\1\0\6\10\33\0\10\10\1\251\7\10"+
    "\5\0\3\10\1\0\2\10\1\0\6\10\33\0\16\10"+
    "\1\252\1\10\5\0\3\10\1\0\2\10\1\0\6\10"+
    "\33\0\12\10\1\253\5\10\5\0\3\10\1\0\2\10"+
    "\1\0\6\10\33\0\2\10\1\254\15\10\5\0\3\10"+
    "\1\0\2\10\1\0\3\10\1\255\2\10\33\0\20\10"+
    "\5\0\3\10\1\0\2\10\1\0\6\10\33\0\1\256"+
    "\17\10\5\0\3\10\1\0\2\10\1\0\6\10\33\0"+
    "\10\10\1\257\7\10\5\0\3\10\1\0\2\10\1\0"+
    "\6\10\33\0\3\10\1\260\14\10";

  private static int [] zzUnpackTrans() {
    int [] result = new int[7198];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\2\11\17\1\14\11\3\1\3\11\12\1\3\11"+
    "\1\1\4\0\5\1\1\0\1\11\1\1\1\0\11\11"+
    "\24\1\1\0\123\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[176];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  public _MinispecLexer() {
    this((java.io.Reader)null);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _MinispecLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      {@code false}, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position {@code pos} from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return BAD_CHARACTER;
            } 
            // fall through
          case 72: break;
          case 2: 
            { return WHITE_SPACE;
            } 
            // fall through
          case 73: break;
          case 3: 
            { return INVERT;
            } 
            // fall through
          case 74: break;
          case 4: 
            { return XOR;
            } 
            // fall through
          case 75: break;
          case 5: 
            { return UPPER_CASE_IDENTIFIER;
            } 
            // fall through
          case 76: break;
          case 6: 
            { return INT_LITERAL;
            } 
            // fall through
          case 77: break;
          case 7: 
            { return LOWER_CASE_IDENTIFIER;
            } 
            // fall through
          case 78: break;
          case 8: 
            { return DIV;
            } 
            // fall through
          case 79: break;
          case 9: 
            { return MUL;
            } 
            // fall through
          case 80: break;
          case 10: 
            { return EQ;
            } 
            // fall through
          case 81: break;
          case 11: 
            { return COMMA;
            } 
            // fall through
          case 82: break;
          case 12: 
            { return DOT;
            } 
            // fall through
          case 83: break;
          case 13: 
            { return COLON;
            } 
            // fall through
          case 84: break;
          case 14: 
            { return SEMI;
            } 
            // fall through
          case 85: break;
          case 15: 
            { return QMARK;
            } 
            // fall through
          case 86: break;
          case 16: 
            { return HASH;
            } 
            // fall through
          case 87: break;
          case 17: 
            { return RP;
            } 
            // fall through
          case 88: break;
          case 18: 
            { return LP;
            } 
            // fall through
          case 89: break;
          case 19: 
            { return RB;
            } 
            // fall through
          case 90: break;
          case 20: 
            { return LB;
            } 
            // fall through
          case 91: break;
          case 21: 
            { return RC;
            } 
            // fall through
          case 92: break;
          case 22: 
            { return LC;
            } 
            // fall through
          case 93: break;
          case 23: 
            { return NOT;
            } 
            // fall through
          case 94: break;
          case 24: 
            { return BIT_AND;
            } 
            // fall through
          case 95: break;
          case 25: 
            { return BIT_OR;
            } 
            // fall through
          case 96: break;
          case 26: 
            { return MOD;
            } 
            // fall through
          case 97: break;
          case 27: 
            { return ADD;
            } 
            // fall through
          case 98: break;
          case 28: 
            { return SUB;
            } 
            // fall through
          case 99: break;
          case 29: 
            { return LT;
            } 
            // fall through
          case 100: break;
          case 30: 
            { return GT;
            } 
            // fall through
          case 101: break;
          case 31: 
            { return XNOR;
            } 
            // fall through
          case 102: break;
          case 32: 
            { return BIT_NAND;
            } 
            // fall through
          case 103: break;
          case 33: 
            { return BIT_NOR;
            } 
            // fall through
          case 104: break;
          case 34: 
            { return DOLLAR_IDENTIFIER;
            } 
            // fall through
          case 105: break;
          case 35: 
            { return STRING_LITERAL;
            } 
            // fall through
          case 106: break;
          case 36: 
            { return ONE_LINE_COMMENT;
            } 
            // fall through
          case 107: break;
          case 37: 
            { return EXPO;
            } 
            // fall through
          case 108: break;
          case 38: 
            { return BOOL_EQ;
            } 
            // fall through
          case 109: break;
          case 39: 
            { return BOOL_NEQ;
            } 
            // fall through
          case 110: break;
          case 40: 
            { return BOOL_AND;
            } 
            // fall through
          case 111: break;
          case 41: 
            { return BOOL_OR;
            } 
            // fall through
          case 112: break;
          case 42: 
            { return LEQ;
            } 
            // fall through
          case 113: break;
          case 43: 
            { return LS;
            } 
            // fall through
          case 114: break;
          case 44: 
            { return GEQ;
            } 
            // fall through
          case 115: break;
          case 45: 
            { return RS;
            } 
            // fall through
          case 116: break;
          case 46: 
            { return IF;
            } 
            // fall through
          case 117: break;
          case 47: 
            { return FOR;
            } 
            // fall through
          case 118: break;
          case 48: 
            { return END;
            } 
            // fall through
          case 119: break;
          case 49: 
            { return LET;
            } 
            // fall through
          case 120: break;
          case 50: 
            { return INLINE_COMMENT;
            } 
            // fall through
          case 121: break;
          case 51: 
            { return ENUM;
            } 
            // fall through
          case 122: break;
          case 52: 
            { return ELSE;
            } 
            // fall through
          case 123: break;
          case 53: 
            { return RULE;
            } 
            // fall through
          case 124: break;
          case 54: 
            { return TYPE_KEYWORD;
            } 
            // fall through
          case 125: break;
          case 55: 
            { return CASE;
            } 
            // fall through
          case 126: break;
          case 56: 
            { return BEGIN;
            } 
            // fall through
          case 127: break;
          case 57: 
            { return INPUT;
            } 
            // fall through
          case 128: break;
          case 58: 
            { return IMPORT;
            } 
            // fall through
          case 129: break;
          case 59: 
            { return STRUCT;
            } 
            // fall through
          case 130: break;
          case 60: 
            { return METHOD;
            } 
            // fall through
          case 131: break;
          case 61: 
            { return MODULE;
            } 
            // fall through
          case 132: break;
          case 62: 
            { return RETURN;
            } 
            // fall through
          case 133: break;
          case 63: 
            { return DEFAULT;
            } 
            // fall through
          case 134: break;
          case 64: 
            { return END_RULE;
            } 
            // fall through
          case 135: break;
          case 65: 
            { return END_CASE;
            } 
            // fall through
          case 136: break;
          case 66: 
            { return TYPEDEF;
            } 
            // fall through
          case 137: break;
          case 67: 
            { return FUNCTION;
            } 
            // fall through
          case 138: break;
          case 68: 
            { return BSV_IMPORT;
            } 
            // fall through
          case 139: break;
          case 69: 
            { return END_METHOD;
            } 
            // fall through
          case 140: break;
          case 70: 
            { return END_MODULE;
            } 
            // fall through
          case 141: break;
          case 71: 
            { return END_FUNCTION;
            } 
            // fall through
          case 142: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
