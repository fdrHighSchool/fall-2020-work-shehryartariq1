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

    /*
   *N: produceAnswer
   *P: solve the equation the user inputs
   *I: user input
   *R: solution to equation
   */
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


      //these 4 variables are created to see if the fraction contains whole number, Numerator and denominator
      int UnderScore = frac1.indexOf("_");//The "_" in the frac1
      int Slash = frac1.indexOf("/");//The "/"" in the frac1
      int UnderScore2 = frac2.indexOf("_");
      int Slash2 = frac2.indexOf("/");


      //these variables are created to get the fraction in inproper form
      int num, den, num2, den2;

      //if the underscore is not equal to -1 that means the underscore is present
      if (UnderScore != -1){
        num = convertToImproper(frac1, UnderScore, Slash);
        den = getDenominator(frac1, Slash);
        System.out.println(num + "/" + den);}

      //if the slash is not equal to -1 that means the slash core is present
      else if (Slash != -1){
        num = Integer.parseInt(frac1.substring(0, Slash));
        den = Integer.parseInt(frac1.substring(Slash + 1));
        System.out.println(num + "/" + den);}

      //if both slash and underscore isn't present that means its a whole number and it get printed with denominator being zero
      else {
        num = Integer.parseInt(frac1);
        den = 1;
        System.out.println(num + "/" + den);
      }



      //if the underscore is not equal to -1 that means the underscore is present
      if (UnderScore2 != -1){
        num2 = convertToImproper(frac2, UnderScore2, Slash2);
        den2 = getDenominator(frac2, Slash2);
        System.out.println(num2 + "/" + den2);}

      //if the slash is not equal to -1 that means the slash core is present
      else if (Slash2 != -1){
        num2 = Integer.parseInt(frac2.substring(0, Slash2));
        den2 = Integer.parseInt(frac2.substring(Slash2 + 1));
        System.out.println(num2 + "/" + den2);}

       //if both slash and underscore isn't present that means its a whole number and it get printed with denominator being zero
       else{
        num2 = Integer.parseInt(frac2);
        den2 = 1;
        System.out.println(num2 + "/" + den2);}


        if (operator == "+") {
          if (den == den2){
            addSameDen(num, den, num2, den2);
          }
          else{
            addDifDen(num, den, num2, den2);
          }
        }

        if (operator == "-"){
          if (den == den2){
            subSameDen(num, den, num2, den2);
          }
          else{
            subDifDen(num, den, num2, den2);
          }
        }

        if (operator == "*") {
          multiply(num, den, num2, den2);
        }
        else {
          divide(num, den, num2, den2);
        }
        return frac2;
    }

    /*
   *N: convertToImproper
   *P: to convert the mixed numbers to improper fraction
   *I: user input
   *R: Fraction as improper
   */

    //using this method to get the fraction in num/deno form
    public static int convertToImproper(String frac, int underscore, int fracSlash){
      int wholeNum = Integer.parseInt(frac.substring(0, underscore));//This takes the whole num from fraction one
      int num = Integer.parseInt(frac.substring(underscore + 1, fracSlash));//Takes the numerator from fraction one
      int den = Integer.parseInt(frac.substring(fracSlash + 1));//Takes the denominator from fraction one

      int Impo  = wholeNum * den + num;
      return Impo;}


      /*
   *N: getDenominator
   *P: get denominator from the user input and separate it
   *I: user input
   *R: denominator
   */

    //using this method to get denominator
    public static int getDenominator(String frac, int fracSlash){
    return Integer.parseInt(frac.substring(fracSlash + 1));}


    /*
   *N: addSameDen
   *P: is to solve  fraction with same denominator
   *I: user input
   *R: solution to addition problem with same denominator
   */
    public static int addSameDen(int num, int den, int num2, int den2) {
    int Nume = num +  num2;
    System.out.println("The result is: " + Nume + "/" + den);
    return 0;}

    /*
   *N: addDifDen
   *P: is to solve fraction with different denominator
   *I: user input
   *R: solution to addition problem with different denominator
   */

  public static int addDifDen(int num, int den, int num2, int den2){
    int Nume1 = num * den2;
    int Nume2 = num2 * den;

    int finalNume = Nume1 + Nume2;
    int finalDeno = den * den2;

    System.out.println("The result is: " + finalNume + "/" + finalDeno);
    return 0;}

    /*
   *N: subSameDen
   *P: is to solve  fraction with same denominator
   *I: user input
   *R: solution to subtraction problem with same denominator
   */


  public static int subSameDen(int num, int den, int num2, int den2){

    int Nume = num -  num2;

    System.out.println("The result is: " + Nume + "/" + den);
    return 0;}

    /*
   *N: subDifDen
   *P: is to solve fraction with different denominator
   *I: user input
   *R: solution to subtraction problem with different denominator
   */


  public static int subDifDen(int num, int den, int num2, int den2) {

    int Nume1 = num * den2;
    int Nume2 = num2 * den;

    int finalNume = Nume1 - Nume2;
    int finalDeno = den * den2;

    System.out.println("The result is: " + finalNume + "/" + finalDeno);
    return 0;}

    /*
   *N: multiply
   *P: is to multiply fraction
   *I: user input
   *R: solution  to multiplication
   */


  public static int multiply(int num, int den, int num2, int den2){

    int finalNume = num * num2;
    int finalDeno = den * den2;

    System.out.println("The result is: " + finalNume + "/" + finalDeno);
    return 0;}

    /*
   *N: divide
   *P: is to divide fraction
   *I: user input
   *R: solution to divison
   */


  public static int divide(int num, int den, int num2, int den2){

    int finalNume = num * den2;
    int finalDeno = num2 * den;

    System.out.println("The result is: " + finalNume + "/" + finalDeno);
    return 0;}
}
