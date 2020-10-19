import java.util.Scanner;
//import to create a variable

class Temperature {
  public static void main(String[] args) {

    double f,c;
    //so the keyboard read the double value when the user put in


    Scanner temperature  = new Scanner (System.in);

    System.out.println("Choose type of conversion \n 1.Fahrenheit to Celsius  \n 2.Celsius to Fahrenheit");
    int b = temperature.nextInt();



      if(b == 1) {
        System.out.println("Enter  Fahrenheit temperature");
        f = temperature.nextDouble();
	    	c = (f-32)*5/9;
	    	System.out.println("Celsius temperature is = "+c);}


        if(b ==2 ) {
          System.out.println("Enter  Celsius temperature");
          c = temperature.nextDouble();
	    	  f=((9*c)/5)+32;
	    	  System.out.println("Fahrenheit temperature is = "+f);}


        else;
        System.out.println("please choose valid choice");

     }
}
