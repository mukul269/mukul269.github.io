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