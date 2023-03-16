//Practical 4a
//Designed a class SortData that contains the method asec() and desc().
import java.util.*;
class SortData
{
	Scanner sc=new Scanner(System.in);
	int num,i, arr[], temp=0;
	
	public void GetData()
	{
		System.out.print("Enter the size of the array : ");
		num=sc.nextInt();
		arr=new int[num];
		System.out.println("");

		for(i=0;i<num;i++)
		{
			System.out.print("Enter number "+ (i+1) + " : ");
			arr[i]=sc.nextInt();
		}
	}//GetData

	void SetData()
	{
		System.out.println("\nEntered numbers are : ");
		
		for(i=0;i<num;i++)
		{
			System.out.println(arr[i]);
		}
	}//SetData

	void asec()
	{
	
		for(i=0;i<num;i++)
		{
			for(int j=i+1;j<num;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}//if
			}//j
		}//i
	
		System.out.println("\n-------Ascending order-------");

		for(int i=0;i<num;i++)
		{
			System.out.println(arr[i]);
		}//i
	}//asec()

	void desc()
	{
		for(i=0;i<num;i++)
		{
			for(int j=i+1;j<num;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}//if
			}//j
		}//i

		System.out.println("\n-------Descending order-------");

		for(int i=0;i<num;i++)
		{
			System.out.println(arr[i]);
		}//i
	}//desc()

	public static void main(String args[])
	{
		SortData obj=new SortData();
		obj.GetData();
		obj.SetData();
		obj.asec();
		obj.desc();
	}//main()
}//SortData
