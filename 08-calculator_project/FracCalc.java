//Project#01
import java.util.*;
class FracCalc {
    /**
     * Prompts user for input, passes that input to produceAnswer, then outputs the result.
     * @param args - unused
     */
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);//creating scanner to store user input
      System.out.println("Enter the problem:");//get the user input
      String calc =input.nextLine();
      System.out.println(calc);
      produceAnswer(calc);

      //int secondOperand = SepFrac2(frac2);

        // TODO: Read the input from the user and call produceAnswer with an equation
        // Checkpoint 1: Create a Scanner, read one line of input, pass that input to produceAnswer, print the result.
        // Checkpoint 2: Accept user input multiple times.
    }//end main method

    /**
     * produceAnswer - This function takes a String 'input' and produces the result.
     * @param input - A fraction string that needs to be evaluated.  For your program, this will be the user input.
     *      Example: input ==> "1/2 + 3/4"
     * @return the result of the fraction after it has been calculated.
     *      Example: return ==> "1_1/4"
     */

    //method where fraction first get separated then breaks down into whole number, num, deno
    public static String produceAnswer(String input){

      //Checkpoint 1: Return the second operand.  Example "4/5 * 1_2/4" returns "1_2/4".

      //substring takes in 2 values and we are using it to separate where the frac1 starts and then where it ends using indexof
      String frac1 = input.substring(0, input.indexOf(' '));
      System.out.println("Fraction 1:" + frac1);
      //finding operator in the fraction using indexof that where in the equation it is
      String operator = input.substring(frac1.length() + 1,frac1.length() + 2);
      System.out.println("operator:" + operator);
      //similar to frac1
      String frac2 = input.substring(frac1.length() + 3);
      System.out.println("Fraction 2:" + frac2);


      //Checkpoint 2: Return the second operand as a string representing each part.


      int UnderScore = frac2.indexOf("_");
      int Slash = frac2.indexOf("/");

      if (UnderScore != -1){
        String WholeNum = frac2.substring(0, UnderScore);
        String Nume = frac2.substring(UnderScore + 1, Slash);
        String Deno = frac2.substring(Slash + 1);
        System.out.println("Whole Number: "+ WholeNum);
        System.out.println("Numerator: "+ Nume);
        System.out.println("Denominator: "+ Deno);
      }

      else{
        String WholeNum =  frac2;
        System.out.println("Whole Number: "+ WholeNum);
      }
      return frac2;
    }
}










        // TODO: Implement this function to produce the solution to the input
        // Checkpoint 1: Return the second operand.  Example "4/5 * 1_2/4" returns "1_2/4".
        // Checkpoint 2: Return the second operand as a string representing each part.
        //               Example "4/5 * 1_2/4" returns "whole:1 numerator:2 denominator:4".
        // Checkpoint 3: Evaluate the formula and return the result as a fraction.
        //               Example "4/5 * 1_2/4" returns "6/5".
        //               Note: Answer does not need to be reduced, but it must be correct.
        // Final project: All answers must be reduced.
        //               Example "4/5 * 1_2/4" returns "1_1/5".

        //return "";
    //}//end produceAnswer method
    //public static int SepFrac2(String frac2){
      //int WholeNumber = frac2.indexOf("_");
      //int Numerator = frac2.indexof("/");
      //int denominator = frac2.indexof(" ");

      //System.out.println(wholeNumber);

     //System.out.println(numerator);

     //System.out.println(denominator);
    //}





//}
    // TODO: Fill in the space below with helper methods

    /**
     * greatestCommonDivisor - Find the largest integer that evenly divides two integers.
     *      Use this helper method in the Final Checkpoint to reduce fractions.
     * @param a - First integer.
     * @param b - Second integer.
     * @return The GCD.

    public static int greatestCommonDivisor(int a, int b){


    }//end greatestCommonDivisor method

    /**
     * leastCommonMultiple - Find the smallest integer that can be evenly divided by two integers.
     *      Use this helper method in Checkpoint 3 to evaluate expressions.
     * @param a - First integer.
     * @param b - Second integer.
     * @return The LCM.

    public static int leastCommonMultiple(int a, int b){

    }//end leastCommonMultiple

}//end class */
