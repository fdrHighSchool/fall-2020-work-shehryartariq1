// Bryant Luna Ramos / Shehryar Tariq

import java.util.*;

class Coins {

  static Scanner S = new Scanner (System.in);
  static int coins = 100;
  // start scanner/coins in the beginning to make it global since we are using it constantly throughout the program

  public static void main(String[] args) {
    boolean go = true;// initialize game by boolean

    while(go == true){// while loop to have a continuous game
      System.out.println("Choose option to input  \n 1.Play  \n 2.Shop \n 3.Quit");
      int user = S.nextInt();

      if(user == 1){
        play();
        System.out.println();
      }
      else if (user == 2){
        shop();
        System.out.println();
      }
      else{// if the 3rd option is chosen then the boolean that initializes  will then be false, ending the while loop
        go = false;
      }//else statement ends
    }//while loop ends
  }


  public static int play(){
    Random rand = new Random();
    //System.out.println("\n Get the coins");

    int CoinsEarned = rand.nextInt(100);
    coins = CoinsEarned + coins;
    System.out.println("You just got " + CoinsEarned + " coins!");// Print coins earned

    // Random integer in the range of 100 will be added onto the user's total coins


    System.out.println("Wow "  + "You earned " + coins + " coins!");



    return CoinsEarned;
  }


  public static int shop (){
    System.out.println("\nHello, welcome to shop. You can spend your coins that you earned here or purchase items with real world cash.");

    System.out.println("TOTAL COINS: "  + coins);

    System.out.println("\nItems: \n 1. 100 coins \n 2. 200 coins \n 3. 300 coins \n 4. Exit");
    int choice = S.nextInt();
    int shop = 0;


    if (choice == 1){
      if (shop >= 100){
        shop = 100;
      }
      else{// if user doesn't have enough coins
        System.out.println("You need more coins before purchasing this item");
      }
    }
    else if(choice == 2){
      if (shop >= 200){
        shop = 200;
      }
      else if(coins < 200){// if user doesn't have enough coins
        System.out.println("You need more coins before purchasing this item");
      }
    }
    else if(choice == 3){
      if (shop >= 300){
        shop = 300;
      }
      else{// if user doesn't have enough coins
        System.out.println("You need more coins before purchasing this item");
      }
    }
    else if(choice == 4){
      shop = 0;
    }

    S.close();
    return shop;
  }
}
