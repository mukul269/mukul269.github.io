//Practical 3-b
/*
Implement a Java function that calculates the sum of digits for a given char array consisting of the digits '0' to '9'. The function should return the digit sum as a long value.
*/

import java.util.*;
class Pracs3b
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter an integer: ");
		String s=sc.nextLine();
		SumOfDigits(s);
	}//main()

	public static void SumOfDigits(String str)
	{
		int sum=0, d=0;

/*toCharArray() method converts the given string into a sequence of characters. 
The returned array length is equal to the length of the string
*/
		char ch[]=str.toCharArray();
		
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit(ch[i]))
			{
/*java.lang.Character.getNumericValue(char ch) returns the int value that the specified Unicode character represents*/
				sum+=Character.getNumericValue(ch[i]);
			}//if
		}//i
		
		System.out.println("The sum of the digits is "+ sum);
	}//SumOfDigits()
}//class Pracs3b