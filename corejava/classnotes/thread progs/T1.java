class MyThread extends Thread
{
	public void run()
	{
		//Executing the job of MyThread class
		for(int i=0; i<10;i++)
		{
			System.out.println("Child Thread - MyThread");
		}//i
	}//run()
}//class MyThread
public class T1
{
	public static void main(String [] args)
	{
		/*At this point in the program, number of thread =1 ie main() thread */

		MyThread t=new MyThread(); 

		//main() thread starts the child thread - MyThread
		t.start();

		/*At this point in the program, number of thread =2 ie 1) main() thread  2) MyThread*/

		//Executing the job of main()
		for(int i=0; i<10;i++)
		{
			System.out.println("main() Thread - main()");
		}//i
	}//main()
}//class T1









