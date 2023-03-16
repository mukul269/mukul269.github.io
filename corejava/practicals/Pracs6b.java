//Pracs 6 b
//Write a java program to add two matrices and print the resultant matrix.
import java.util.*;

class Pracs6b
{
	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);
      int i,j,m,n;
		System.out.print("Enter number of Row : ");
	 	m=in.nextInt();
		System.out.print("\nEnter number of  Column : ");
	 	n=in.nextInt();

		int a[][]=new int[m][n];
		int b[][]=new int[m][n];
		int c[][]=new int[m][n];
		System.out.println("\nEnter a first matrix:");
  		
		for(i=0;i<m;i++)
		{
   			for(j=0;j<n;j++)
			{
    				a[i][j]=in.nextInt();
    			}
  		}
 
		System.out.println("\nEnter a Second matrix:");
  		
		for(i=0;i<m;i++)
		{
   			for(j=0;j<n;j++)
			{
    				b[i][j]=in.nextInt();
    			}
  		}

		System.out.println("\nAddition of matrix:");
  		
		for(i=0;i<m;i++)
		{
   			for(j=0;j<n;j++)
			{
     				c[i][j]=a[i][j]+b[i][j];
     
     				System.out.print(c[i][j]+" ");
    			}
   			System.out.println();
   		}
   	}
}
