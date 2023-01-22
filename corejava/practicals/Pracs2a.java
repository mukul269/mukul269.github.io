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



//Practical 2-b
//Write a Java program to convert a decimal number to binary number and vice versa.
import java.util.Scanner;
class Pracs2b
{
    	public static void main(String[] args) 
	{
        		Scanner scan = new Scanner(System.in);

			System.out.println("--------Decimal number to Binary number--------");
			System.out.print("\nEnter decimal number : ");
      		int num1 = scan.nextInt();
        		long binary = DecimalToBinary(num1);
        		System.out.println("\n" + num1 + " in decimal = " + binary + " in binary");
		
			System.out.println("\n--------Binary number to Decimal number--------");
			System.out.print("\nEnter binary number : ");
      		int num2 = scan.nextInt();
			int decimal = BinaryToDecimal(num2);
        		System.out.println("\n" + num2 + " in binary = " + decimal + " in decimal ");
    	}//main()

    	public static long DecimalToBinary(int num1)
    	{
        		long binaryNo = 0;
        		int remainder, i = 1, step = 1;

        		while (num1 !=0)
        		{
            			remainder = num1 % 2;
            			num1 /= 2; 
            			binaryNo += remainder * i;
            			i *= 10;
        		}//while
        		return binaryNo;
    	}//DecimalToBinary

	public static int BinaryToDecimal(long num2)
    	{
        		int decimalNo = 0, i = 0;
        		long remainder;
        		while (num2 != 0)
        		{
            			remainder = num2 % 10;
            			num2 /= 10;
            			decimalNo += remainder * Math.pow(2, i);
            			++i;
        		}//while
        		return decimalNo;
    	}//BinaryToDecimal
}//class Pracs2b




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