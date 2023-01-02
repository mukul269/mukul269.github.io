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