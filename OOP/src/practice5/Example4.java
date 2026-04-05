package practice5;
import java.util.*;

public class Example4 {
    public static void main(String[] args) {
       double leftOperand, result, rightOperand;
       String leftString, operator, rightString;
       StringTokenizer tokenizer;
       Scanner in = new Scanner(System.in);

       StringTokenizer expressions = new StringTokenizer(in.nextLine());

       while(expressions.hasMoreTokens()) {
    	   String expression = expressions.nextToken();
    	   tokenizer = new StringTokenizer(expression, "+-*/", true);
    	   
    	   try {
        	   leftString = tokenizer.nextToken();
        	   operator = tokenizer.nextToken();
        	   rightString = tokenizer.nextToken();

        	   try {
        		   leftOperand = Double.parseDouble(leftString);
        	   } catch (NumberFormatException e) {
        		   System.out.println("Left operand is not a number: "+leftString);
        		   continue;
        	   }
        	   try {
        		   rightOperand = Double.parseDouble(rightString);
        	   } catch (NumberFormatException e) {
        		   System.out.println("Right operand is not a number: "+rightString);
        		   continue;
        	   }

        	   if (operator.equals("+"))
        		   result = leftOperand + rightOperand;
        	   else if(operator.equals("-"))
        		   result = leftOperand - rightOperand;
        	   else if(operator.equals("*"))
        		   result = leftOperand * rightOperand;
        	   else if(operator.equals("/")) {
        		   if(rightOperand == 0.0) {
        			   System.out.println("Division by 0!");
        			   result = 0.0;
        		   } else {
        			   result = leftOperand/rightOperand;
        		   }
        	   }
        	   else result = 0.0;

        	   System.out.println("Result: " + result);
           } catch (NoSuchElementException nsee) {
        	   System.out.println("Invalid syntax");
           } catch (NumberFormatException nfe) {
        	   System.out.println("One or more operands is not a number");
           }
       }
       
    }
}
