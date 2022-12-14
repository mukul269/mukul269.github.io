//Practical 1-c
//Write a Java program to print the area and perimeter of a circle.

import java.util.Scanner; //Package
import java.text.DecimalFormat; // text - Package, DecimalFormat - class
import java.math.RoundingMode;

class Pracs1c
{
	//The java.text.DecimalFormat class is used to format numbers using a formatting pattern you specify yourself
	private static DecimalFormat df2 = new DecimalFormat("#.##");

	public static void main(String [] args)
   	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the radius of circle : ");
		double radius = sc.nextDouble();
		   
		System.out.println("\n--------Area of a Circle--------");   		
      
      	double area = Math.PI * (radius * radius);
      	System.out.println("Area of Circle is " + df2.format(area));

		System.out.println("\n--------Perimeter of a Circle--------");
      
      	double perimeter= 2 * Math.PI *radius;
      	System.out.println("Perimeter of the circle is "+ df2.format(perimeter));
   	}//main()
}//class Pracs1c
