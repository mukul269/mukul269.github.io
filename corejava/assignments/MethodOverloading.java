class MethodOverloading
{
	void Show()
	{
		System.out.println("Show () method 1");
	}//show()method 1

	void Show(int a)		//method overloaded
	{
		System.out.println("Show () method 2");
	}

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.Show();
	}
}

//output - show () method 1

class MethodOverloading
{
	void Show()
	{
		System.out.println("Show () method 1");
	}//show()method 1

	void Show(int a)		//method overloaded
	{
		System.out.println("Show () method 2");
	}

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.Show(10);			//interger type input
	}
}

//output - show () method 2