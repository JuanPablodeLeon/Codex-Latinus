package org.example.MatchColors;
import java.io.*;
import javax.swing.text.Segment;

import org.fife.ui.rsyntaxtextarea.*;

%%

%public
%class CodexLatinusColorsLenguaje
%extends AbstractJFlexCTokenMaker
%unicode
%type org.fife.ui.rsyntaxtextarea.Token

%{
   public CodexLatinusColorsLenguaje() {
   }

   private void addHyperlinkToken(int start, int end, int tokenType) {
      int so = start + offsetShift;
      addToken(zzBuffer, start, end, tokenType, so, true);
   }

   private void addToken(int tokenType) {
      addToken(zzStartRead, zzMarkedPos-1, tokenType);
   }

   private void addToken(int start, int end, int tokenType) {
      int so = start + offsetShift;
      addToken(zzBuffer, start, end, tokenType, so, false);
   }

   public void addToken(char[] array, int start, int end, int tokenType,
                  int startOffset, boolean hyperlink) {
      super.addToken(array, start, end, tokenType, startOffset, hyperlink);
      zzStartRead = zzMarkedPos;
   }

   public String[] getLineCommentStartAndEnd() {
      return new String[] { "//", null };
   }

   public Token getTokenList(Segment text, int initialTokenType, int startOffset) {

      resetTokenList();
      this.offsetShift = -text.offset + startOffset;

      int state = Token.NULL;
      switch (initialTokenType) {
                  case Token.COMMENT_MULTILINE:
            state = MLC;
            start = text.offset;
            break;

         default:
            state = Token.NULL;
      }

      s = text;
      try {
         yyreset(zzReader);
         yybegin(state);
         return yylex();
      } catch (IOException ioe) {
         ioe.printStackTrace();
         return new TokenImpl();
      }

   }

   private boolean zzRefill() {
      return zzCurrentPos >= s.offset + s.count;
   }

   public final void yyreset(Reader reader) {
      zzBuffer = s.array;
      zzStartRead = s.offset;
      zzEndRead = zzStartRead + s.count - 1;
      zzCurrentPos = zzMarkedPos = zzPushbackPos = s.offset;
      zzLexicalState = YYINITIAL;
      zzReader = reader;
      zzAtBOL  = true;
      zzAtEOF  = false;
   }

%}

Letter = [A-Za-z]
Digit = ([0-9])
AnyCharacterButApostropheOrBackSlash = ([^\\'\r\n])
AnyCharacterButDoubleQuoteOrBackSlash = ([^\\\"\r\n])
NonSeparator = ([^\t\f\r\n\ \(\)\{\}\[\]\;\,\.\=\>\<\!\~\?\:\+\-\*\/\&\|\^\%\"\']|"#"|"\\")
IdentifierStart = ({Letter}|"_")
IdentifierPart = ({IdentifierStart}|{Digit})
WhiteSpace = ([ \t\f]+)

CharLiteral = ([\']({AnyCharacterButApostropheOrBackSlash})[\'])
UnclosedCharLiteral = ([\'][^\'\r\n]*)
ErrorCharLiteral = ({UnclosedCharLiteral}[\'])
StringLiteral = ([\"] ({AnyCharacterButDoubleQuoteOrBackSlash} | [\\].)* [\"])
UnclosedStringLiteral = ([\"] ({AnyCharacterButDoubleQuoteOrBackSlash} | [\\].)* [^\"]?)
ErrorStringLiteral = ({UnclosedStringLiteral}[\"])

MLCBegin = "##"
MLCEnd = "##"
LineCommentBegin = "//"

IntegerLiteral = ({Digit}+)
DoubleLiteral = ({IntegerLiteral}"."{IntegerLiteral})
ErrorNumberFormat = (({IntegerLiteral}|{DoubleLiteral}){NonSeparator}+)

Separator = ([\(\)\{\}\[\]])
Separator2 = ([;,.:])

Identifier = ({IdentifierStart}{IdentifierPart}*)

%state MLC

%%

<YYINITIAL> {

   /* Keywords */
   "non" |
   "esto" |
   "series" |
   "si" |
   "aliter" |
   "dum" |
   "facere" |
   "perge" |
   "per" |
   "interrumpe" |
   "reddere"      { addToken(Token.RESERVED_WORD); }

   /* Data types */
   "textum" |
   "decimalis" |
   "numerus" |
   "littera" |
   "bool"      { addToken(Token.DATA_TYPE); }

   /* Functions */
   "actio" |
   "ratio" |
   "<<" |
   ">>" |
   "VARIABILES" |
   "MUNERA" |
   "MAIOR" |
   "FINISUP" |
   "structura" |
   "finis"      { addToken(Token.FUNCTION); }

   /* Boolean literals */
   "verum" |
   "falsus"      { addToken(Token.LITERAL_BOOLEAN); }

   {Identifier}            { addToken(Token.IDENTIFIER); }

   {WhiteSpace}            { addToken(Token.WHITESPACE); }

   /* String/Character literals. */
   {CharLiteral}            { addToken(Token.LITERAL_CHAR); }
   {UnclosedCharLiteral}      { addToken(Token.ERROR_CHAR); addNullToken(); return firstToken; }
   {ErrorCharLiteral}         { addToken(Token.ERROR_CHAR); }
   {StringLiteral}            { addToken(Token.LITERAL_STRING_DOUBLE_QUOTE); }
   {UnclosedStringLiteral}      { addToken(Token.ERROR_STRING_DOUBLE); addNullToken(); return firstToken; }
   {ErrorStringLiteral}      { addToken(Token.ERROR_STRING_DOUBLE); }

   /* Comment literals. */
   {MLCBegin}               { start = zzMarkedPos-2; yybegin(MLC); }
   {LineCommentBegin}.*      { addToken(Token.COMMENT_EOL); addNullToken(); return firstToken; }

   /* Separators. */
   {Separator}               { addToken(Token.SEPARATOR); }
   {Separator2}            { addToken(Token.SEPARATOR); }

   /* Operators. */
   "++" |
   "--" |
   "+" |
   "-" |
   "*" |
   "/" |
   "==" |
   "!=" |
   "<=" |
   ">=" |
   "<" |
   ">" |
   "&&" |
   "||" |
   "="      { addToken(Token.OPERATOR); }

   /* Numbers */
   {DoubleLiteral}         { addToken(Token.LITERAL_NUMBER_FLOAT); }
   {IntegerLiteral}         { addToken(Token.LITERAL_NUMBER_DECIMAL_INT); }
   {ErrorNumberFormat}         { addToken(Token.ERROR_NUMBER_FORMAT); }

   /* Ended with a line not in a string or comment. */
   \r\n | \r | \n |
   <<EOF>>                  { addNullToken(); return firstToken; }

   /* Catch any other (unhandled) characters. */
   .                     { addToken(Token.IDENTIFIER); }

}

<MLC> {
   [^\n#]+            {}
   "#"               {}
   {MLCEnd}         { yybegin(YYINITIAL); addToken(start,zzStartRead+2-1, Token.COMMENT_MULTILINE); }
   \r\n | \r | \n |
   <<EOF>>            { addToken(start,zzStartRead-1, Token.COMMENT_MULTILINE); return firstToken; }
}