
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
    "\000\037\000\002\002\004\000\002\002\005\000\002\003" +
    "\005\000\002\003\003\000\002\016\004\000\002\016\004" +
    "\000\002\017\005\000\002\017\003\000\002\020\006\000" +
    "\002\020\006\000\002\020\003\000\002\004\003\000\002" +
    "\004\004\000\002\005\004\000\002\005\003\000\002\005" +
    "\004\000\002\006\003\000\002\013\003\000\002\013\005" +
    "\000\002\013\005\000\002\013\005\000\002\013\005\000" +
    "\002\013\005\000\002\013\005\000\002\014\003\000\002" +
    "\014\003\000\002\010\005\000\002\015\003\000\002\015" +
    "\003\000\002\011\011\000\002\012\004" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\072\000\006\006\004\007\007\001\002\000\004\005" +
    "\011\001\002\000\004\002\073\001\002\000\004\010\023" +
    "\001\002\000\004\005\011\001\002\000\004\010\ufffe\001" +
    "\002\000\030\010\ufff7\011\ufff7\013\016\016\ufff7\021\ufff7" +
    "\022\ufff7\023\ufff7\024\ufff7\025\ufff7\026\ufff7\027\ufff7\001" +
    "\002\000\006\010\ufffc\011\014\001\002\000\006\010\ufffa" +
    "\011\ufffa\001\002\000\004\005\011\001\002\000\006\010" +
    "\ufffb\011\ufffb\001\002\000\006\004\017\005\020\001\002" +
    "\000\004\014\022\001\002\000\004\014\021\001\002\000" +
    "\026\010\ufff8\011\ufff8\016\ufff8\021\ufff8\022\ufff8\023\ufff8" +
    "\024\ufff8\025\ufff8\026\ufff8\027\ufff8\001\002\000\026\010" +
    "\ufff9\011\ufff9\016\ufff9\021\ufff9\022\ufff9\023\ufff9\024\ufff9" +
    "\025\ufff9\026\ufff9\027\ufff9\001\002\000\016\005\011\006" +
    "\004\007\007\030\034\031\024\032\030\001\002\000\004" +
    "\015\uffe5\001\002\000\004\010\072\001\002\000\004\010" +
    "\uffff\001\002\000\016\002\ufff3\005\ufff3\020\ufff3\030\ufff3" +
    "\031\ufff3\032\ufff3\001\002\000\004\005\011\001\002\000" +
    "\004\021\067\001\002\000\016\002\ufff6\005\ufff6\020\ufff6" +
    "\030\ufff6\031\ufff6\032\ufff6\001\002\000\004\010\066\001" +
    "\002\000\004\015\uffe6\001\002\000\004\015\040\001\002" +
    "\000\014\002\000\005\011\030\034\031\024\032\030\001" +
    "\002\000\016\002\ufff5\005\ufff5\020\ufff5\030\ufff5\031\ufff5" +
    "\032\ufff5\001\002\000\006\004\041\005\011\001\002\000" +
    "\022\010\uffe9\016\uffe9\022\uffe9\023\uffe9\024\uffe9\025\uffe9" +
    "\026\uffe9\027\uffe9\001\002\000\022\010\uffe8\016\uffe8\022" +
    "\uffe8\023\uffe8\024\uffe8\025\uffe8\026\uffe8\027\uffe8\001\002" +
    "\000\004\016\062\001\002\000\022\010\ufff1\016\ufff1\022" +
    "\053\023\051\024\050\025\047\026\046\027\052\001\002" +
    "\000\022\010\ufff0\016\ufff0\022\ufff0\023\ufff0\024\ufff0\025" +
    "\ufff0\026\ufff0\027\ufff0\001\002\000\006\004\041\005\011" +
    "\001\002\000\006\004\041\005\011\001\002\000\006\004" +
    "\041\005\011\001\002\000\006\004\041\005\011\001\002" +
    "\000\006\004\041\005\011\001\002\000\006\004\041\005" +
    "\011\001\002\000\022\010\uffea\016\uffea\022\uffea\023\uffea" +
    "\024\uffea\025\uffea\026\uffea\027\uffea\001\002\000\022\010" +
    "\uffec\016\uffec\022\uffec\023\uffec\024\uffec\025\uffec\026\uffec" +
    "\027\uffec\001\002\000\022\010\uffeb\016\uffeb\022\uffeb\023" +
    "\uffeb\024\uffeb\025\uffeb\026\uffeb\027\uffeb\001\002\000\022" +
    "\010\uffee\016\uffee\022\uffee\023\uffee\024\uffee\025\uffee\026" +
    "\uffee\027\uffee\001\002\000\022\010\uffef\016\uffef\022\uffef" +
    "\023\uffef\024\uffef\025\uffef\026\uffef\027\uffef\001\002\000" +
    "\022\010\uffed\016\uffed\022\uffed\023\uffed\024\uffed\025\uffed" +
    "\026\uffed\027\uffed\001\002\000\004\017\063\001\002\000" +
    "\012\005\011\030\034\031\024\032\030\001\002\000\014" +
    "\005\011\020\065\030\034\031\024\032\030\001\002\000" +
    "\016\002\uffe4\005\uffe4\020\uffe4\030\uffe4\031\uffe4\032\uffe4" +
    "\001\002\000\016\002\ufff2\005\ufff2\020\ufff2\030\ufff2\031" +
    "\ufff2\032\ufff2\001\002\000\006\004\041\005\011\001\002" +
    "\000\004\010\uffe7\001\002\000\004\010\uffe3\001\002\000" +
    "\016\002\ufff4\005\ufff4\020\ufff4\030\ufff4\031\ufff4\032\ufff4" +
    "\001\002\000\004\002\001\001\002\000\006\010\ufffd\011" +
    "\014\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\072\000\010\002\004\003\005\016\007\001\001\000" +
    "\006\017\073\020\012\001\001\000\002\001\001\000\002" +
    "\001\001\000\006\017\011\020\012\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\020\014\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\022\004\035\005\031\010\024\011" +
    "\026\012\032\015\034\016\025\020\030\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\020\070\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\016\005\036\010\024\011\026\012\032\015\034" +
    "\020\030\001\001\000\002\001\001\000\012\006\042\013" +
    "\043\014\044\020\041\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\006\014\060\020\041\001\001\000\006\014\057" +
    "\020\041\001\001\000\006\014\056\020\041\001\001\000" +
    "\006\014\055\020\041\001\001\000\006\014\054\020\041" +
    "\001\001\000\006\014\053\020\041\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\020\004\063\005\031\010\024\011\026\012\032\015\034" +
    "\020\030\001\001\000\016\005\036\010\024\011\026\012" +
    "\032\015\034\020\030\001\001\000\002\001\001\000\002" +
    "\001\001\000\012\006\067\013\043\014\044\020\041\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001" });

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




    public int label = 0;
    public void report_error(String message, Object info) {
        System.err.print("ERROR: Syntax error");
        if (info instanceof Symbol)
            if (((Symbol)info).left != -1){
                int line = (((Symbol)info).left)+1;
                int column = (((Symbol)info).right)+1;
                System.err.print(" (line "+line+", column "+column+"): ");
            } else System.err.print(": ");
        else System.err.print(": ");
    }

    // Return semantic value of symbol in position (position)
    public Object stack(int position) {
        return (((Symbol)stack.elementAt(tos+position)).value);
    }

    public int genLabel(){
        label++;
        return label;
    };



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
          case 1: // program ::= declarations_list SC operation_list 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("program",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // declarations_list ::= declarations_list SC declaration 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("declarations_list",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // declarations_list ::= declaration 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("declarations_list",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // declaration ::= DOUBLE_TYPE var_list 
            {
              String RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("declaration",12, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // declaration ::= INT_TYPE var_list 
            {
              String RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("declaration",12, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // var_list ::= var_list C variable 
            {
              String RESULT =null;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String x = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 String data_type = (String) parser.stack(-3); System.out.println(data_type.toUpperCase() + " " + x); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("var_list",13, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // var_list ::= variable 
            {
              String RESULT =null;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String x = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 String data_type = (String) parser.stack(-1); System.out.println(data_type.toUpperCase() + " " + x); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("var_list",13, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // variable ::= ID OSBRACKET NUM CSBRACKET 
            {
              String RESULT =null;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		String x = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int yleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int yright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Double y = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = x + "[" + y.toString() + "]"; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("variable",14, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // variable ::= ID OSBRACKET ID CSBRACKET 
            {
              String RESULT =null;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		String x = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		 RESULT = x; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("variable",14, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // variable ::= ID 
            {
              String RESULT =null;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String x = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = x; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("variable",14, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // operation_list ::= operation 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("operation_list",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // operation_list ::= operation_list operation 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("operation_list",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // operation ::= assignment SC 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("operation",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // operation ::= condition 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("operation",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // operation ::= function SC 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("operation",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // expression_list_marker ::= expression_list 
            {
              Object RESULT =null;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object x = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 System.out.println("EVAL : " + x); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expression_list_marker",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // expression_list ::= expression 
            {
              Object RESULT =null;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object x = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = x.toString(); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expression_list",9, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // expression_list ::= expression_list PLUS expression 
            {
              Object RESULT =null;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object x = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int yleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int yright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object y = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = x.toString() + " " + "+" + y.toString(); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expression_list",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // expression_list ::= expression_list MINUS expression 
            {
              Object RESULT =null;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object x = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int yleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int yright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object y = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = x.toString() + " " + "-" + y.toString(); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expression_list",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // expression_list ::= expression_list STAR expression 
            {
              Object RESULT =null;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object x = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int yleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int yright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object y = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = x.toString() + " " + "*" + y.toString(); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expression_list",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // expression_list ::= expression_list DIVIDED expression 
            {
              Object RESULT =null;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object x = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int yleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int yright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object y = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = x.toString() + " " + "/" + y.toString(); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expression_list",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // expression_list ::= expression_list SMALLER expression 
            {
              Object RESULT =null;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object x = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int yleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int yright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object y = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = x.toString() + " " + "< " + y.toString();
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expression_list",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // expression_list ::= expression_list BIGGER expression 
            {
              Object RESULT =null;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object x = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int yleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int yright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object y = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = x.toString() + " " + ">" + y.toString(); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expression_list",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // expression ::= NUM 
            {
              Object RESULT =null;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Double x = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = x; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expression",10, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // expression ::= variable 
            {
              Object RESULT =null;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String x = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = x; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expression",10, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // assignment ::= variable EQ expression_list_marker 
            {
              Object RESULT =null;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String x = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		 System.out.println("ASS " + x); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("assignment",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // cond ::= IF 
            {
              Object RESULT =null;
		 System.out.print("L"+ genLabel()+" : "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("cond",11, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // cond ::= WHILE 
            {
              Object RESULT =null;
		 System.out.print("L"+ genLabel()+" : "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("cond",11, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // condition ::= cond OBRACKET expression_list_marker CBRACKET OGBRACKET operation_list SGBRACKET 
            {
              Object RESULT =null;
		int yleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int yright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		Object y = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("condition",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // function ::= PRINTFUNC variable 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("function",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
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