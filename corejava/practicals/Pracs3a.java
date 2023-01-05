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
