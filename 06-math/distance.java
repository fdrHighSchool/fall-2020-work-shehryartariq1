import java.util.*;
class Distance {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);

      System.out.print("Enter point 1: ");
      String point1 = s.nextLine();

      System.out.print("Enter point 2: ");
      String point2 = s.nextLine();


      int x1 = getX(point1);
      int x2 = getX(point2);
      int y1 = getY(point1);
      int y2 = getY(point2);

      cartesianDistance(x1, x2, y1, y2);
      taxicabDistance(x1, x2, y1, y2);
    }//end public


    public static void cartesianDistance(int x1, int x2, int y1, int y2){

      double cartDistance = Math.sqrt(Math.pow((x2-x1), 2)+ Math.pow((y2-y1), 2));
      System.out.println("The distance between 2 points: " + cartDistance);

    }//end cartesianDistance


    public static double taxicabDistance(int x1,int x2,int y1,int y2){

      double CabDistance = Math.abs(x2 - x1) + Math.abs(y2 - y1);
      System.out.println("The distance between 2 points: " + CabDistance);
      return CabDistance;

    }//end taxicabDistance


    public static int getX(String point){

      //locate the comma
      int comma = point.indexOf(",");

    //we know the x-value in the String starts at index 1
    //we now know where the comma is
    //so, the x-value is from index 1 to the location of the comma
      String x = point.substring(1, comma);
    //System.out.println(x);

      return Integer.parseInt(x);

    }//end getX method
    public static int getY(String point){
      int ClosingBra = point.indexOf(")");

      int comma = point.indexOf(",");

      String y = point.substring(comma + 2, ClosingBra);
      return Integer.parseInt(y);

    }//end getY method
}//end
