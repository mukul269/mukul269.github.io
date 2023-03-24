//Program 8a
//WAP to write contents into a file using FileWriter class.
import java.io.*;
public class F1
{
	public static void main(String [] args) throws IOException
	{
		File f=new File("D://Degree College//Core Java - FINAL//FilePrograms//WriteFile.txt");

		String str="Hello !!! .... S.Y.B.Sc. (I.T.) Students";

		FileWriter fw=new FileWriter(f);
		fw.write(str);
		fw.close();
		System.out.println("WriteFile.txt is written successfully");
	}//main()
}//class F1


---------------------------------------------------------------------------------------------------------



//WAP to read the contents from a file using BufferedReader class
//Program 8b
import java.io.*;
public class F2
{
	public static void main(String [] args)
	{
		try
		{
			File f=new File ("D://Degree College//Core Java - FINAL//FilePrograms//WriteFile.txt");
			BufferedReader br=new BufferedReader(new FileReader(f));
			String str;
			boolean exists=f.exists();

			if (exists)
			{
				while((str=br.readLine())!=null)
				{
					System.out.println(str);
					System.out.println("exists() returns the value : " +exists);
				}//while
			}//if		
		}//try
		catch(IOException e)
		{
			System.out.println("Sorry!!! No file to read");
		}//catch
	}//main()
}//class F2



---------------------------------------------------------------------------------------------------------



//Program 8c
//Write a java program to copy the contents from one file to other file.

import java.io.*;
public class F3
{
	public static void main(String [] args)
	{
		FileInputStream copy=null;
		FileOutputStream paste=null;

		try
		{
			copy=new FileInputStream("D://Degree College//Core Java - FINAL//FilePrograms//Read.txt");
			paste=new FileOutputStream("D://Degree College//Core Java - FINAL//FilePrograms//Write.txt");
				
			int c;
			while((c=copy.read()) !=-1)
			{
				paste.write(c);
			}//while
		}//try
		catch(IOException e)
		{
		}//catch
		System.out.println("Contents copied to Write.txt successfully");
	}//main()
}//class F3