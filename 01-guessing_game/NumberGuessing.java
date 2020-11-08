//RandomNumberGuessingGame


import java.util.Scanner;

class NumberGuessing {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    //chooses the random # beween 1 to 10
    int number = 1 + (int)(10 * Math.random());


   System.out.println("Welcome to the Random Number Guessing game");

    //# of tries you have to guess the random number
    int tries = 5;
    int i, guess;

    System.out.println("A number is chosen between 1 to 10." +  " Guess the number within 5 tries. ");


    for (i = 0; i < tries; i++) {

      System.out.println( "Guess the number:");
      guess = sc.nextInt();

        // If the number is guessed
        if (number == guess) {
          System.out.println( "Congratulations!"+ " You guessed the number in " + tries + " tries");
          break;
        }
            //i != tries -1 purpose is that if guess isn't equal to random number you subtract 5 -1
            else if (number > guess && i != tries - 1) {
              System.out.println( "The number is greater than " + guess);
            }

            else if (number < guess && i != tries - 1) {
                System.out.println( "The number is" + " less than " + guess);
            }//else if statement ends
        }
        if (i == tries) {
          System.out.println( "Sorry you lost, The number was " + number);
        }//if statement ends


  }//main method ends
}//class NumberGuessing ends
