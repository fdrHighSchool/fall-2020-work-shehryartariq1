//RandomNumberGuessingGame


import java.util.Scanner;

class NumberGuessing {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int number = 1 + (int)(10 * Math.random());


   System.out.println("Welcome to the Random Number Guessing game");

    int K = 5;
    int i, guess;

    System.out.println("A number is chosen between 1 to 10." +  " Guess the number within 5 tries. ");


    for (i = 0; i < K; i++) {

      System.out.println( "Guess the number:");
      guess = sc.nextInt();

        // If the number is guessed
        if (number == guess) {
          System.out.println( "Congratulations!"+ " You guessed the number.");
          break;
            }

            else if (number > guess && i != K - 1) {
              System.out.println( "The number is greater than " + guess);
            }

            else if (number < guess && i != K - 1) {
                System.out.println( "The number is" + " less than " + guess);
            }
        }
        if (i == K) {
          System.out.println( "Sorry you lost, The number was " + number);
        }


  }
}
