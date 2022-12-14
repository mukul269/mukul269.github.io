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

















