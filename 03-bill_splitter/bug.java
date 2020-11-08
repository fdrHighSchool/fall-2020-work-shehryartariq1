import java.util.*;

class Buggy {
  public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the Bill-Splitter");
		System.out.println("Enter the total, pre-tax: ");

    double total = input.nextDouble();


    System.out.println("percent of tax");
    double tax = input.nextDouble();

    tax = ((tax / 100) * total);
    total = total + tax;

    System.out.println("How much tip in total everyone wanna give");
    double tip = input.nextDouble();


		System.out.print("How many people? ");

    double total1 = total + tip;
    //System.out.println(total1);




		int numPeople = input.nextInt();
		double perPerson = total1 / numPeople;

		System.out.println("Each person must pay $" + perPerson );

	}//end main method
}//end class
