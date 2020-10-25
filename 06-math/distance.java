import java.util.*;
class Distance {
    public static void main(String[] args) {
		
        cartesianDistance();
        //taxiCabDistance();
	}
	

    public static void cartesianDistance(){
		
        Scanner input = new Scanner(System.in);
        int X1,X2,Y2,Y1;
        double cartDistance;

        System.out.print("Enter the first x1 point: ");
        X1 = input.nextInt();

        System.out.print("Enter the first x2 point: ");
        X2 = input.nextInt();

        System.out.print("Enter the first y1 point: ");
        Y1 = input.nextInt();

        System.out.print("Enter the first y2 point: ");
        Y2 = input.nextInt();

        cartDistance = Math.sqrt(Math.pow(X2-X1,2)) + (Math.pow(Y2-Y1,2));
        //cartDistance = Math.sqrt((X2-X1)*(X2-X1)) + ((Y2-Y1)*(Y2-Y1));
        System.out.println("The distance between 2 points: " + cartDistance);
	}
	
}
