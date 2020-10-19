import java.util.*;
class Area {

  public static void main(String[] args) {
    Scanner area = new Scanner (System.in);

    //user input for the sides of square
    System.out.println("Write the side of the square");
		int side = area.nextInt();
    int squ = square(side);

    System.out.println("The area of square is " + squ);
    System.out.println();


    ///user input for the base and height of triangle
    System.out.println("What's the base of the triangle");
		int base = area.nextInt();
    System.out.println("What's the height of the triangle");
		int height = area.nextInt();
    int tri = triangle(base, height);

    System.out.println("The area of triangle is " + tri);
    System.out.println();


    ///user input for the width and length of rectangle
    System.out.println("What's the width of the triangle");
		int width = area.nextInt();
		System.out.println("What's the Length of the triangle");
		int Length = area.nextInt();
    int rec = rectangle(width, Length);

    System.out.println("The area of rectangle is " + rec);
    System.out.println();


    ///user input for the radius of circle
    System.out.println("What's the radius of the circle");
		double radius = area.nextDouble();
    double cir = circle(radius);

    System.out.println("The area of circle is " + cir);
    System.out.println();


    System.out.println("What's the edge of the cube");
    double edge = area.nextDouble();
    double cub = cube(edge);

    System.out.println("The area of cube is " + cub);
    System.out.println();


    double rad = sphere(radius);

    System.out.println("The area of sphere is " + rad);
    System.out.println();


    int rec2 = rectangularPrism(Length, width, height);

    System.out.println("The area of reactangular prism is " + rec2);
    System.out.println();


    System.out.println("What's the first side of triangle prism");
    int firstside = area.nextInt();
    System.out.println("What's the second side of triangle prism");
    int secondside = area.nextInt();
    System.out.println("What's the third side of triangle prism");
    int thirdside = area.nextInt();
    System.out.println("What's the prism height");
    int prismheight = area.nextInt();
    int tri2 = trianguarPrism(firstside, secondside, thirdside, prismheight, base, height);

    System.out.println("The area of triangular prism is " + tri2);
    System.out.println();

  }


    public static int square(int side){
		  int area1 = side * side;
      return(area1);

	  }

    public static int triangle(int base, int height){

		  int area2 = ((base * height)/2);
      return(area2);

	  }

    public static int rectangle(int width, int Length){
      int area3 = width * Length;
      return(area3);

    }

    public static double circle(double radius){
      double area4 = Math.PI * Math.pow(radius, 2);
      return(area4);

    }
    public static double cube(double edge){
      double area5 = 6 * Math.pow(edge,2);
      return(area5);
    }
    public static double sphere(double radius){
      double area6 = 4*Math.PI * Math.pow(radius, 2);
      return(area6);
    }
    public static int rectangularPrism(int length, int width, int height){
      int area7 = 2 * ((length * width) + (width * height) + (length * height));
      return(area7);
    }
    public static int trianguarPrism(int firstside, int secondside, int thirdside, int prismheight, int base, int height){
      int area8 = ((base * height) + (firstside + secondside + thirdside) * prismheight);
      return(area8);
    }



}
