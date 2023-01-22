//Practical 1-a
//Write a Java program that takes a number as input and prints its multiplication table upto 10.
import java.util.Scanner; //util - Predefind Package
 
class Pracs1a
{ 
 	public static void main(String[] args) 
	{
		//The Scanner class is used to get user input, and it is found in the java.util package
		Scanner sc = new Scanner(System.in);
   
		System.out.println("--------Multiplication Table--------");
  		System.out.print("Enter a number: ");
  		int num = sc.nextInt();
   
  		for (int i=0; i<10; i++)
		{
   			System.out.println(num + " x " + (i+1) + " = " + (num * (i+1)));
  		}//i
 	}//main()
}//class Pracs1a


//Practical 1-b
/*Write a Java program to display the following pattern
	Reversed Pyramid Star Pattern*/

	class Pracs1b
	{
			public static void main(String[] args)
		{
				int i, j, k, n=5;
		 
				for (i= 0; i<=n-1; i++)
				{
						for (j=0; j<=i; j++) 
						{	
								System.out.print(" ");  //Space
						}//j
						for (k=0; k<=n-1-i; k++)
						{
								System.out.print("*" + " ");
						}//k
						System.out.println(); //Leave a line
				}//i     
		}//main()
	}//class Prac


	

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











