//Practical 2-c
//Write a Java program to reverse a string.
import java.util.*; 
class Pracs2c
{
   	public static void main(String args[])
   	{
      		String str, rev = "";
      		Scanner scan = new Scanner(System.in);
 
			System.out.println("--------Reverse a String--------");
      		System.out.print("\nEnter a string : ");
      		str = scan.nextLine();
 
      		int len = str.length();
 
      		for (int i = len - 1 ; i >= 0 ; i--)
         			rev = rev + str.charAt(i);
 
      		System.out.println("\nReverse of " + str + " is " + rev);
   	}//main()
}//class Pracs2c