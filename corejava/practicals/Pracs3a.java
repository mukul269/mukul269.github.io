//Practical 3-a
//Write a Java program to count the letters, spaces, numbers and other characters of an input string.
/*
There are many ways to read data from the keyboard -
	- InputStreamReader
	- Console
	- Scanner
	- DataInputStream 
1) BufferedReader class can be used to read data line by line by readLine() method.
2) InputStreamReader class can be used to read data from keyboard.It performs two tasks:
     - connects to input stream of keyboard
     - converts the byte-oriented stream into character-oriented stream
*/
import java.io.*;
class Pracs3a
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
		System.out.print("Enter a string : ");
		
		String str=br.readLine();
		int i, len, letters=0, digits=0, others=0, spaces=0;
		char ch;
		len=str.length();
		
		for(i=0; i<len; i++)
		{
			ch=str.charAt(i);
//java.lang.Character.isLetter(char ch) determines if the specified character is a letter
			if(Character.isLetter(ch))
				++letters;
// java.lang.Character.isDigit(char ch) determines if the specified character is a digit.
			else if(Character.isDigit(ch))
				++digits;
			else if(ch==' ')
				++spaces;
			else
				++others;
		}//i

		System.out.println("\nNumber of - ");
		System.out.println("\nLetters = " + letters);
		System.out.println("Digits = " + digits);
		System.out.println("Spaces = " + spaces);
		System.out.println("Other characters = " + others);
	}//main()
}//class Pracs3a



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



//Practical 3-c
//Find the smallest and largest element from the array

import java.util.*;
class Pracs3c
{
	public static void main(String args[])
	{
		int large,small,i;
		int a[] = new int[]{101, 2023, 333, 409, 5102};
		int n = a.length;
		large=small=a[0];

		for(i=1;i<n;++i)
		{
			if(a[i]>large)
				large=a[i];

			if(a[i]<small)
				small=a[i];
		}//i
	
		System.out.print("Smallest element : " + small);
		System.out.print("\n\nLargest element : " + large);
	}//main()
}//class Pracs3c