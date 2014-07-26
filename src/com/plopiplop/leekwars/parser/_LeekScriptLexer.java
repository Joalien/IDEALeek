/* The following code was generated by JFlex 1.4.3 on 26/07/14 22:23 */

package com.plopiplop.leekwars.parser;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.plopiplop.leekwars.psi.LSTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 26/07/14 22:23 from the specification file
 * <tt>/Users/bastien/Dev/IDEALeek/src/com/plopiplop/leekwars/parser/_LeekScriptLexer.flex</tt>
 */
public class _LeekScriptLexer implements FlexLexer {
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
   */
  private static final String ZZ_CMAP_PACKED =
          "\11\0\1\1\1\2\1\0\1\1\1\1\22\0\1\1\1\54\1\11" +
                  "\2\0\1\41\1\56\1\7\1\44\1\45\1\13\1\37\1\52\1\40" +
                  "\1\6\1\12\12\5\1\43\1\42\1\57\1\53\1\60\2\0\32\4" +
                  "\1\46\1\10\1\47\1\0\1\4\1\0\1\24\1\30\1\17\1\35" +
    "\1\31\1\14\1\26\1\34\1\21\1\4\1\36\1\27\1\4\1\16"+
                  "\1\22\2\4\1\25\1\32\1\20\1\15\1\23\1\33\3\4\1\50" +
                  "\1\55\1\51\54\0\1\3\12\0\1\3\4\0\1\3\5\0\27\3" +
    "\1\0\37\3\1\0\u013f\3\31\0\162\3\4\0\14\3\16\0\5\3"+
    "\11\0\1\3\213\0\1\3\13\0\1\3\1\0\3\3\1\0\1\3"+
    "\1\0\24\3\1\0\54\3\1\0\46\3\1\0\5\3\4\0\202\3"+
    "\10\0\105\3\1\0\46\3\2\0\2\3\6\0\20\3\41\0\46\3"+
    "\2\0\1\3\7\0\47\3\110\0\33\3\5\0\3\3\56\0\32\3"+
    "\5\0\13\3\43\0\2\3\1\0\143\3\1\0\1\3\17\0\2\3"+
    "\7\0\2\3\12\0\3\3\2\0\1\3\20\0\1\3\1\0\36\3"+
    "\35\0\3\3\60\0\46\3\13\0\1\3\u0152\0\66\3\3\0\1\3"+
    "\22\0\1\3\7\0\12\3\43\0\10\3\2\0\2\3\2\0\26\3"+
    "\1\0\7\3\1\0\1\3\3\0\4\3\3\0\1\3\36\0\2\3"+
    "\1\0\3\3\16\0\2\3\23\0\6\3\4\0\2\3\2\0\26\3"+
    "\1\0\7\3\1\0\2\3\1\0\2\3\1\0\2\3\37\0\4\3"+
    "\1\0\1\3\23\0\3\3\20\0\11\3\1\0\3\3\1\0\26\3"+
    "\1\0\7\3\1\0\2\3\1\0\5\3\3\0\1\3\22\0\1\3"+
    "\17\0\2\3\43\0\10\3\2\0\2\3\2\0\26\3\1\0\7\3"+
    "\1\0\2\3\1\0\5\3\3\0\1\3\36\0\2\3\1\0\3\3"+
    "\17\0\1\3\21\0\1\3\1\0\6\3\3\0\3\3\1\0\4\3"+
    "\3\0\2\3\1\0\1\3\1\0\2\3\3\0\2\3\3\0\3\3"+
    "\3\0\10\3\1\0\3\3\113\0\10\3\1\0\3\3\1\0\27\3"+
    "\1\0\12\3\1\0\5\3\46\0\2\3\43\0\10\3\1\0\3\3"+
    "\1\0\27\3\1\0\12\3\1\0\5\3\3\0\1\3\40\0\1\3"+
    "\1\0\2\3\43\0\10\3\1\0\3\3\1\0\27\3\1\0\20\3"+
    "\46\0\2\3\43\0\22\3\3\0\30\3\1\0\11\3\1\0\1\3"+
    "\2\0\7\3\72\0\60\3\1\0\2\3\14\0\7\3\72\0\2\3"+
    "\1\0\1\3\2\0\2\3\1\0\1\3\2\0\1\3\6\0\4\3"+
    "\1\0\7\3\1\0\3\3\1\0\1\3\1\0\1\3\2\0\2\3"+
    "\1\0\4\3\1\0\2\3\11\0\1\3\2\0\5\3\1\0\1\3"+
    "\25\0\2\3\42\0\1\3\77\0\10\3\1\0\42\3\35\0\4\3"+
    "\164\0\42\3\1\0\5\3\1\0\2\3\45\0\6\3\112\0\46\3"+
    "\12\0\51\3\7\0\132\3\5\0\104\3\5\0\122\3\6\0\7\3"+
    "\1\0\77\3\1\0\1\3\1\0\4\3\2\0\7\3\1\0\1\3"+
    "\1\0\4\3\2\0\47\3\1\0\1\3\1\0\4\3\2\0\37\3"+
    "\1\0\1\3\1\0\4\3\2\0\7\3\1\0\1\3\1\0\4\3"+
    "\2\0\7\3\1\0\7\3\1\0\27\3\1\0\37\3\1\0\1\3"+
    "\1\0\4\3\2\0\7\3\1\0\47\3\1\0\23\3\105\0\125\3"+
    "\14\0\u026c\3\2\0\10\3\12\0\32\3\5\0\113\3\25\0\15\3"+
    "\1\0\4\3\16\0\22\3\16\0\22\3\16\0\15\3\1\0\3\3"+
    "\17\0\64\3\43\0\1\3\4\0\1\3\103\0\130\3\10\0\51\3"+
    "\127\0\35\3\63\0\36\3\2\0\5\3\u038b\0\154\3\224\0\234\3"+
    "\4\0\132\3\6\0\26\3\2\0\6\3\2\0\46\3\2\0\6\3"+
    "\2\0\10\3\1\0\1\3\1\0\1\3\1\0\1\3\1\0\37\3"+
    "\2\0\65\3\1\0\7\3\1\0\1\3\3\0\3\3\1\0\7\3"+
    "\3\0\4\3\2\0\6\3\4\0\15\3\5\0\3\3\1\0\7\3"+
    "\164\0\1\3\15\0\1\3\202\0\1\3\4\0\1\3\2\0\12\3"+
    "\1\0\1\3\3\0\5\3\6\0\1\3\1\0\1\3\1\0\1\3"+
    "\1\0\4\3\1\0\3\3\1\0\7\3\3\0\3\3\5\0\5\3"+
    "\u0ebb\0\2\3\52\0\5\3\5\0\2\3\4\0\126\3\6\0\3\3"+
    "\1\0\132\3\1\0\4\3\5\0\50\3\4\0\136\3\21\0\30\3"+
    "\70\0\20\3\u0200\0\u19b6\3\112\0\u51a6\3\132\0\u048d\3\u0773\0\u2ba4\3"+
    "\u215c\0\u012e\3\2\0\73\3\225\0\7\3\14\0\5\3\5\0\1\3"+
    "\1\0\12\3\1\0\15\3\1\0\5\3\1\0\1\3\1\0\2\3"+
    "\1\0\2\3\1\0\154\3\41\0\u016b\3\22\0\100\3\2\0\66\3"+
    "\50\0\14\3\164\0\5\3\1\0\207\3\44\0\32\3\6\0\32\3"+
    "\13\0\131\3\3\0\6\3\2\0\6\3\2\0\6\3\2\0\3\3"+
    "\43\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\2\1\1\5\1\6"+
    "\13\3\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
            "\1\26\1\27\1\30\1\4\1\0\1\31\3\0\1\32" +
            "\1\0\5\3\1\33\1\34\6\3\1\35\1\36\1\37" +
            "\1\40\1\41\1\42\1\43\1\0\1\3\1\44\3\3" +
            "\1\45\5\3\1\46\1\47\1\50\2\3\1\51\1\52" +
            "\3\3\1\53\2\3\1\54\2\3\1\55\1\56\1\3" +
            "\1\57\1\60\1\3\1\61";

  private static int [] zzUnpackAction() {
      int[] result = new int[101];
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
          "\0\0\0\61\0\142\0\223\0\304\0\365\0\u0126\0\u0157" +
                  "\0\61\0\u0188\0\u01b9\0\u01ea\0\u021b\0\u024c\0\u027d\0\u02ae" +
                  "\0\u02df\0\u0310\0\u0341\0\u0372\0\61\0\61\0\61\0\61" +
                  "\0\61\0\61\0\61\0\61\0\61\0\61\0\61\0\61" +
                  "\0\u03a3\0\u03d4\0\u0405\0\u0436\0\u0467\0\u0498\0\u04c9\0\365" +
                  "\0\61\0\u04fa\0\u0126\0\u052b\0\u055c\0\u058d\0\u05be\0\u05ef" +
                  "\0\u0620\0\u0651\0\u0682\0\223\0\223\0\u06b3\0\u06e4\0\u0715" +
                  "\0\u0746\0\u0777\0\u07a8\0\223\0\u07d9\0\u080a\0\61\0\61" +
                  "\0\61\0\61\0\u083b\0\u086c\0\223\0\u089d\0\u08ce\0\u08ff" +
                  "\0\223\0\u0930\0\u0961\0\u0992\0\u09c3\0\u09f4\0\61\0\61" +
                  "\0\61\0\u0a25\0\u0a56\0\223\0\223\0\u0a87\0\u0ab8\0\u0ae9" +
                  "\0\223\0\u0b1a\0\u0b4b\0\223\0\u0b7c\0\u0bad\0\223\0\223" +
                  "\0\u0bde\0\223\0\223\0\u0c0f\0\223";

  private static int [] zzUnpackRowMap() {
      int[] result = new int[101];
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
    "\1\2\2\3\2\4\1\5\1\2\1\6\1\2\1\7"+
            "\1\10\1\11\1\12\1\4\1\13\1\4\1\14\1\15" +
            "\1\4\1\16\1\4\1\17\1\20\1\4\1\21\1\22" +
            "\1\4\1\23\1\4\1\24\1\4\1\25\1\26\1\27" +
            "\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37" +
            "\1\40\1\41\1\42\1\43\1\44\1\45\1\46\62\0" +
            "\2\3\62\0\2\4\6\0\23\4\27\0\1\5\1\47" +
            "\52\0\7\50\1\51\1\52\50\50\10\53\1\54\1\51" +
            "\47\53\12\0\1\55\1\56\51\0\2\4\6\0\1\4" +
            "\1\57\4\4\1\60\1\4\1\61\12\4\26\0\2\4" +
            "\6\0\1\4\1\62\21\4\26\0\2\4\6\0\11\4" +
            "\1\63\11\4\26\0\2\4\6\0\1\64\1\4\1\65" +
            "\20\4\26\0\2\4\6\0\10\4\1\66\12\4\26\0" +
            "\2\4\6\0\15\4\1\67\5\4\26\0\2\4\6\0" +
            "\13\4\1\70\7\4\26\0\2\4\6\0\11\4\1\71" +
            "\11\4\26\0\2\4\6\0\13\4\1\72\7\4\26\0" +
            "\2\4\6\0\20\4\1\73\2\4\26\0\2\4\6\0" +
            "\6\4\1\74\14\4\75\0\1\75\60\0\1\76\62\0" +
            "\1\77\61\0\1\100\55\0\1\101\60\0\1\102\12\0" +
            "\1\47\53\0\2\50\1\0\56\50\2\53\1\0\56\53" +
            "\2\55\1\0\56\55\13\56\1\103\45\56\4\0\2\4" +
            "\6\0\2\4\1\104\20\4\26\0\2\4\6\0\11\4" +
            "\1\105\11\4\26\0\2\4\6\0\13\4\1\106\7\4" +
            "\26\0\2\4\6\0\13\4\1\107\7\4\26\0\2\4" +
            "\6\0\1\4\1\110\21\4\26\0\2\4\6\0\11\4" +
            "\1\111\11\4\26\0\2\4\6\0\4\4\1\112\16\4" +
            "\26\0\2\4\6\0\6\4\1\113\14\4\26\0\2\4" +
            "\6\0\15\4\1\114\5\4\26\0\2\4\6\0\16\4" +
            "\1\115\4\4\26\0\2\4\6\0\5\4\1\116\15\4" +
            "\75\0\1\117\60\0\1\120\5\0\12\56\1\121\46\56" +
            "\4\0\2\4\6\0\3\4\1\122\17\4\26\0\2\4" +
            "\6\0\16\4\1\123\4\4\26\0\2\4\6\0\13\4" +
            "\1\124\7\4\26\0\2\4\6\0\15\4\1\125\5\4" +
            "\26\0\2\4\6\0\1\4\1\126\21\4\26\0\2\4" +
            "\6\0\14\4\1\127\6\4\26\0\2\4\6\0\10\4" +
            "\1\130\12\4\26\0\2\4\6\0\15\4\1\131\5\4" +
            "\26\0\2\4\6\0\13\4\1\132\7\4\26\0\2\4" +
            "\6\0\4\4\1\133\16\4\26\0\2\4\6\0\15\4" +
            "\1\134\5\4\26\0\2\4\6\0\11\4\1\135\11\4" +
            "\26\0\2\4\6\0\10\4\1\136\12\4\26\0\2\4" +
            "\6\0\22\4\1\137\26\0\2\4\6\0\15\4\1\140" +
            "\5\4\26\0\2\4\6\0\5\4\1\141\15\4\26\0" +
            "\2\4\6\0\2\4\1\142\20\4\26\0\2\4\6\0" +
            "\13\4\1\143\7\4\26\0\2\4\6\0\6\4\1\144" +
            "\14\4\26\0\2\4\6\0\2\4\1\145\20\4\22\0";

  private static int [] zzUnpackTrans() {
      int[] result = new int[3136];
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
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
          "\1\0\1\11\6\1\1\11\13\1\14\11\7\1\1\0" +
                  "\1\11\3\0\1\1\1\0\20\1\4\11\1\0\13\1" +
                  "\3\11\24\1";

  private static int [] zzUnpackAttribute() {
      int[] result = new int[101];
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

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

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

  /* user code: */
  public _LeekScriptLexer() {
    this((java.io.Reader)null);
  }


  public _LeekScriptLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public _LeekScriptLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 1222) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
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
   * Returns the character at position <tt>pos</tt> from the
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
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
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
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
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
              zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 18:
          { return OP_COMMA;
          }
          case 50:
              break;
          case 35:
          { return OP_GE;
          }
          case 51:
              break;
          case 37:
          { return KW_VAR;
          }
          case 52:
              break;
          case 40:
          { return MULTILINE_COMMENT;
          }
          case 53:
              break;
          case 11: {
              return OP_COLON;
          }
          case 54:
              break;
          case 29: {
              return KW_DO;
          }
          case 55:
              break;
          case 24:
          { return OP_GT;
          }
          case 56:
              break;
        case 7: 
          { return OP_PLUS;
          }
          case 57:
              break;
          case 30:
          { return OP_EQUALS;
          }
          case 58:
              break;
          case 14:
          { return OP_LBRACKET;
          }
          case 59:
              break;
          case 19:
          { return OP_ASSIGN;
          }
          case 60:
              break;
          case 46:
          { return KW_WHILE;
          }
          case 61:
              break;
          case 21:
          { return OP_BINARY_OR;
          }
          case 62:
              break;
        case 4: 
          { return NUMBER;
          }
          case 63:
              break;
          case 31:
          { return OP_NOT_EQUALS;
          }
          case 64:
              break;
        case 9: 
          { return OP_MODULO;
          }
          case 65:
              break;
          case 48:
          { return KW_GLOBAL;
          }
          case 66:
              break;
          case 45:
          { return KW_BREAK;
          }
          case 67:
              break;
          case 26:
          { return COMMENT;
          }
          case 68:
              break;
          case 49:
          { return KW_FUNCTION;
          }
          case 69:
              break;
        case 8: 
          { return OP_MINUS;
          }
          case 70:
              break;
          case 41:
          { return KW_NULL;
          }
          case 71:
              break;
          case 34:
          { return OP_LE;
          }
          case 72:
              break;
        case 6: 
          { return OP_TIMES;
          }
          case 73:
              break;
          case 27:
          { return KW_IF;
          }
          case 74:
              break;
        case 5: 
          { return OP_DIVIDE;
          }
          case 75:
              break;
        case 10: 
          { return OP_SEMICOLON;
          }
          case 76:
              break;
          case 47:
          { return KW_RETURN;
          }
          case 77:
              break;
          case 12:
          { return OP_LPAREN;
          }
          case 78:
              break;
          case 23:
          { return OP_LT;
          }
          case 79:
              break;
          case 13:
          { return OP_RPAREN;
          }
          case 80:
              break;
          case 32:
          { return OP_LOGICAL_OR;
          }
          case 81:
              break;
          case 43:
          { return KW_ELSE;
          }
          case 82:
              break;
          case 15:
          { return OP_RBRACKET;
          }
          case 83:
              break;
          case 42:
          { return KW_TRUE;
          }
          case 84:
              break;
          case 25:
          { return STRING;
          }
          case 85:
              break;
          case 44:
          { return KW_FALSE;
          }
          case 86:
              break;
        case 2: 
          { return com.intellij.psi.TokenType.WHITE_SPACE;
          }
          case 87:
              break;
          case 16:
          { return OP_LBRACE;
          }
          case 88:
              break;
          case 36:
          { return KW_FOR;
          }
          case 89:
              break;
        case 3: 
          { return IDENTIFIER;
          }
          case 90:
              break;
          case 17:
          { return OP_RBRACE;
          }
          case 91:
              break;
          case 28: {
              return KW_IN;
          }
          case 92:
              break;
          case 38: {
              return OP_IDENTITY_EQUALS;
          }
          case 93:
              break;
          case 20:
          { return OP_NOT;
          }
          case 94:
              break;
          case 39:
          { return OP_IDENTITY_NOT_EQUALS;
          }
          case 95:
              break;
        case 1: 
          { return com.intellij.psi.TokenType.BAD_CHARACTER;
          }
          case 96:
              break;
          case 22:
          { return OP_BINARY_AND;
          }
          case 97:
              break;
          case 33:
          { return OP_LOGICAL_AND;
          }
          case 98:
              break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
