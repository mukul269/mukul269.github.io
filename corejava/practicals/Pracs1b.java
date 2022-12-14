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


s1b