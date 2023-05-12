
//----------------------------------------------------
// The following code was generated by CUP v0.11b beta 20140226
//----------------------------------------------------

import java_cup.runtime.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b beta 20140226 generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\033\000\002\002\004\000\002\002\006\000\002\006" +
    "\004\000\002\006\003\000\002\017\011\000\002\011\005" +
    "\000\002\011\003\000\002\020\013\000\002\020\012\000" +
    "\002\012\017\000\002\015\006\000\002\015\005\000\002" +
    "\003\003\000\002\003\003\000\002\004\004\000\002\004" +
    "\004\000\002\004\004\000\002\004\003\000\002\005\004" +
    "\000\002\005\003\000\002\007\004\000\002\007\003\000" +
    "\002\021\006\000\002\022\005\000\002\023\005\000\002" +
    "\023\003\000\002\024\013" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\112\000\004\006\006\001\002\000\006\006\006\010" +
    "\064\001\002\000\004\002\063\001\002\000\004\004\010" +
    "\001\002\000\006\006\ufffe\010\ufffe\001\002\000\012\004" +
    "\ufff0\006\ufff0\012\ufff0\013\ufff0\001\002\000\012\004\013" +
    "\006\012\012\014\013\015\001\002\000\004\025\016\001" +
    "\002\000\012\004\ufff3\006\ufff3\012\ufff3\013\ufff3\001\002" +
    "\000\012\004\ufff2\006\ufff2\012\ufff2\013\ufff2\001\002\000" +
    "\012\004\ufff1\006\ufff1\012\ufff1\013\ufff1\001\002\000\004" +
    "\023\017\001\002\000\004\005\023\001\002\000\006\011" +
    "\ufffb\012\ufffb\001\002\000\006\011\061\012\060\001\002" +
    "\000\004\007\042\001\002\000\004\005\024\001\002\000" +
    "\004\025\025\001\002\000\004\005\026\001\002\000\004" +
    "\005\027\001\002\000\004\025\030\001\002\000\006\004" +
    "\032\005\033\001\002\000\006\004\032\005\033\001\002" +
    "\000\016\004\ufff4\005\ufff4\007\ufff4\011\ufff4\012\ufff4\025" +
    "\ufff4\001\002\000\016\004\ufff5\005\ufff5\007\ufff5\011\ufff5" +
    "\012\ufff5\025\ufff5\001\002\000\006\004\032\005\033\001" +
    "\002\000\006\004\032\005\033\001\002\000\006\004\032" +
    "\005\033\001\002\000\004\025\040\001\002\000\006\004" +
    "\032\005\033\001\002\000\010\007\ufff8\011\ufff8\012\ufff8" +
    "\001\002\000\004\006\043\001\002\000\004\004\010\001" +
    "\002\000\012\004\013\006\045\012\014\013\015\001\002" +
    "\000\004\007\046\001\002\000\004\005\050\001\002\000" +
    "\006\005\052\007\051\001\002\000\016\004\uffee\005\uffee" +
    "\007\uffee\011\uffee\012\uffee\030\uffee\001\002\000\010\011" +
    "\ufff9\012\ufff9\031\053\001\002\000\016\004\uffef\005\uffef" +
    "\007\uffef\011\uffef\012\uffef\030\uffef\001\002\000\004\031" +
    "\055\001\002\000\006\011\ufffa\012\ufffa\001\002\000\004" +
    "\005\050\001\002\000\012\004\057\005\052\011\ufff6\012" +
    "\ufff6\001\002\000\006\011\ufff7\012\ufff7\001\002\000\004" +
    "\005\023\001\002\000\006\006\ufffd\010\ufffd\001\002\000" +
    "\006\011\ufffc\012\ufffc\001\002\000\004\002\001\001\002" +
    "\000\004\010\066\001\002\000\006\006\uffff\010\uffff\001" +
    "\002\000\004\006\067\001\002\000\004\004\010\001\002" +
    "\000\006\002\uffec\006\uffec\001\002\000\004\007\074\001" +
    "\002\000\006\002\000\006\067\001\002\000\006\002\uffed" +
    "\006\uffed\001\002\000\004\005\050\001\002\000\006\005" +
    "\052\030\103\001\002\000\006\011\101\012\100\001\002" +
    "\000\006\011\uffe8\012\uffe8\001\002\000\004\005\050\001" +
    "\002\000\006\002\uffeb\006\uffeb\001\002\000\006\011\uffe9" +
    "\012\uffe9\001\002\000\004\005\050\001\002\000\006\005" +
    "\052\030\105\001\002\000\004\005\106\001\002\000\004" +
    "\005\107\001\002\000\004\005\110\001\002\000\004\005" +
    "\111\001\002\000\004\005\023\001\002\000\006\011\uffe7" +
    "\012\uffe7\001\002\000\012\004\013\006\114\012\014\013" +
    "\015\001\002\000\004\007\uffea\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\112\000\010\002\004\006\003\017\006\001\001\000" +
    "\004\017\064\001\001\000\002\001\001\000\004\004\010" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\010\011\020\012" +
    "\021\020\017\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\003\030\001\001\000\004\003\033\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\003\034\001\001\000\004" +
    "\003\035\001\001\000\004\003\036\001\001\000\002\001" +
    "\001\000\004\003\040\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\004\043\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\005\046\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\015\053\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\005\055" +
    "\001\001\000\002\001\001\000\002\001\001\000\006\012" +
    "\021\020\061\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\010\007\071\021\067\022\070\001\001\000\004\004\112" +
    "\001\001\000\002\001\001\000\002\001\001\000\006\021" +
    "\072\022\070\001\001\000\002\001\001\000\010\005\074" +
    "\023\075\024\076\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\006\005\074\024\101\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\005\103\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\012\111\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= program EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // program ::= first_section DIVIDER DIVIDER second_section 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("program",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // first_section ::= first_section writer 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("first_section",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // first_section ::= writer 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("first_section",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // writer ::= QUOTE word QUOTE MINUS BIGGER books_list SC 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("writer",13, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // books_list ::= books_list C book 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("books_list",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // books_list ::= book 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("books_list",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // book ::= ISBN_c HC QUOTE word QUOTE HC integer HC collocation 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("book",14, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-8)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // book ::= ISBN_c HC QUOTE word QUOTE HC integer HC 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("book",14, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-7)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // ISBN_c ::= DIGIT DIGIT MINUS DIGIT DIGIT MINUS hexadecimal hexadecimal hexadecimal hexadecimal hexadecimal MINUS hexadecimal 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ISBN_c",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-12)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // collocation ::= KEYWORDS KEYWORDS integer LETTER 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("collocation",11, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // collocation ::= KEYWORDS KEYWORDS integer 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("collocation",11, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // hexadecimal ::= DIGIT 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("hexadecimal",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // hexadecimal ::= LETTER 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("hexadecimal",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // word ::= word LETTER 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("word",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // word ::= word C 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("word",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // word ::= word DOT 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("word",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // word ::= LETTER 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("word",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // integer ::= integer DIGIT 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("integer",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // integer ::= DIGIT 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("integer",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // second_section ::= second_section user 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("second_section",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // second_section ::= user 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("second_section",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // user ::= user_name HC loans_list SC 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("user",15, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // user_name ::= QUOTE word QUOTE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("user_name",16, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // loans_list ::= loans_list C loan 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("loans_list",17, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // loans_list ::= loan 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("loans_list",17, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // loan ::= integer DIVIDED integer DIVIDED DIGIT DIGIT DIGIT DIGIT ISBN_c 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("loan",18, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-8)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}