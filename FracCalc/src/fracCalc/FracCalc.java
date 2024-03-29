package fracCalc;

import java.util.Scanner;

public class FracCalc {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	String temp = input.next();
    	while(!temp.equals("quit")) {
    		System.out.println(produceAnswer(temp));
    		//print result
    		temp = input.next();
    	}
    	input.close();
        // TODO: Read the input from the user and call produceAnswer with an equation
    }
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String input) { 
    	String[] arr = input.split(" ");
    	String firstOp = arr[0];
    	String operator = arr[1];
    	String secondOp = arr[2];
    	
    	Fraction operand1 = new Fraction(firstOp);
    	Fraction operand2 = new Fraction(secondOp);
    	Fraction answer = new Fraction();
    	answer = operand1.doMath(operator, operand2);
        // TODO: Implement this function to produce the solution to the input
        
        return answer.toString();
    }

    // TODO: Fill in the space below with any helper methods that you think you will need
    
}
