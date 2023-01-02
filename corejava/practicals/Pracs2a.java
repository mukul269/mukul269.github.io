//Practical 2-a
//Write a Java program to add two binary numbers.
import java.util.Scanner;
class Pracs2a 
{
 	public static void main(String[] args)
 	{
  		long num1, num2;
  		int i = 0, remainder = 0;
  		int[] sum = new int[20];

  		Scanner sc = new Scanner(System.in);

		System.out.println("--------Addition of Binary numbers--------");
  		System.out.print("\nBinary number 1 : ");
  		num1 = sc.nextLong();
  		System.out.print("\nBinary number 2 : ");
  		num2 = sc.nextLong();

  		while (num1 != 0 || num2 != 0) 
  		{
   			sum[i++] = (int)((num1 % 10 + num2 % 10 + remainder) % 2);
   			remainder = (int)((num1 % 10 + num2 % 10 + remainder) / 2);
   			num1 = num1 / 10;
   			num2 = num2 / 10;
  		}//while
  
		if (remainder != 0) 
		{
   			sum[i++] = remainder;
  		}//if
  		--i;
  
		System.out.print("\nAddition of two binary numbers : ");
  		while (i >= 0)  
		{
   			System.out.print(sum[i--]);
  		}//while
   		System.out.print("\n");  
 	}//main()
}//class Pracs2a 
