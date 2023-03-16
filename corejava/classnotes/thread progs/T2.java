class MyRunnable implements Runnable
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
public class T2
{
	public static void main(String [] args)
	{
		/*At this point in the program, number of thread =1 ie main() thread */

		MyRunnable r=new MyRunnable();
	
		//r is the target Runnable, called through start() method of the Thread class
		Thread t=new Thread(r);

		//main() thread starts the child thread - MyThread
		t.start();

		/*At this point in the program, number of thread =2 ie 1) main() thread  2) MyThread*/

		//Executing the job of main()
		for(int i=0; i<10;i++)
		{
			System.out.println("main() Thread - main()");
		}//i
	}//main()
}//class T2









