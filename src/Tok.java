//Coded By SULEMAN QAMAR BUTT 
import java.io.*; //Importing InputOutput package for StreamTokenizer
import java.util.ArrayList; //Importing ArrayList class 
public class Tok {

   public static void main(String[] args) {
	   //Creating Arraylists
	   ArrayList<String> id = new ArrayList<String>();
	   ArrayList<String> op = new ArrayList<String>();
	   ArrayList<String> dl = new ArrayList<String>();
	   ArrayList<Integer> lt = new ArrayList<Integer>();


      try {
 //Taking in a text file and passing it to StreamTokenizer
         StreamTokenizer s = new StreamTokenizer(new FileReader("input.txt"));//New StreamTokenizer

         boolean eof = false; // Setting End Of Line value to false
         
         do {
            int token = s.nextToken(); //Using nextToken method of StreamTokenizer
            
            switch (token) { //Using Switch
               case StreamTokenizer.TT_EOF:
                  System.out.println("End of File encountered.");
                  eof = true;
                  break;
                  
               case StreamTokenizer.TT_EOL:
                  System.out.println("End of Line encountered.");
                  break;
                 
               case StreamTokenizer.TT_WORD: //Identifier Case
                  System.out.println("Identifier: " + s.sval);
                  id.add(s.sval);
                  break;
                  
               case StreamTokenizer.TT_NUMBER: //Literal Case
                  System.out.println("Literal: " + s.nval);
                  lt.add((int) s.nval);
                  break;
                  //Operators cases
               case '+' : //for plus
            	   System.out.println("Operator : +");
            	   op.add("+");
            	   break;
            	   
               case '-' ://for minus
            	   System.out.println("Operator : -");
            	   op.add("-");
            	   break;
            	   
               case '*' ://for Multiply
            	   System.out.println("Operator : *");
            	   op.add("*");
            	   break;
            	   
               case '=' ://for Equal to
            	   System.out.println("Operator : =");
            	   op.add("=");
            	   break;
            	   
               case '/' ://for Divide 
            	   System.out.println("Operator : /");
            	   op.add("/");
            	   break;
            //Delimiter Cases	              	  
               case ';' ://for Semicolon
            	   System.out.println("Delimiter : ;");
            	   dl.add(";");
            	   break;
            	   
               case ':' ://for Colon
            	   System.out.println("Delimiter : :");
            	   dl.add(":");
            	   break; 
            	   
               case '(' ://for Left Parenthesis
            	   System.out.println("Delimiter : (");
            	   dl.add("(");
            	   break;
            	   
               case ')' ://for Right Parenthesis
            	   System.out.println("Delimiter : )");
            	   dl.add(")");
            	   break;
            	   
               case ']' ://for Left Square Bracket
            	   System.out.println("Delimiter : ]");
            	   dl.add("]");
            	   break;
            	   
               case '[' ://for Right Square Bracket
            	   System.out.println("Delimiter : [");
            	   dl.add("[");
            	   break;
            	   
               default://Default case
                  System.out.println((char) token + " encountered.");
                  
                  if (token == '!') {
                     eof = true;
                  }
            }
         } while (!eof);

      } catch (Exception ex) {
         ex.printStackTrace();
      }
      System.out.println("Number of Identifiers: " + id.size());//No of Identifiers
      System.out.println("Identifiers: " + id);//there names

      System.out.println("Number of Operators: " + op.size());//No of Operators
      System.out.println("Operators: " + op);
      
      System.out.println("Number of Delimiters: " + dl.size());//No of Delimiters
      System.out.println("Delimiters: " + dl);
      
      System.out.println("Number of Literals: " + lt.size());//No of Literals
      System.out.println("Literals: " + lt);
	   }
}