//include comments where ever required

//part 1
class A
{
	void Show()
	{
		System.out.println("Show () method 1");
	}//show()
}//class A

class B extends A
{
}//class B

class MethodOverriding
{
	public static void main(String[] args) {
		B obj = new B();
		obj.Show();
	}//main
}//class MethodOverriding

//output - show() method 1


//part 2
class A
{
	void Show()
	{
		System.out.println("Show () method 1");
	}
}

class B extends A
{
	void Show()
	{
		System.out.println("Show () method 2");
	}
}
class MethodOverriding
{
	public static void main(String[] args) {
		B obj = new B();
		obj.Show();
	}
}
//ouput - show() method 2






//part 3
class A
{
	void Show()
	{
		System.out.println("Show () method 1");
	}
}

class B extends A
{
	void Show1()	//logical error
	{
		System.out.println("Show () method 2");
	}
}

class MethodOverriding
{
	public static void main(String[] args) {
		B obj = new B();
		obj.Show();
	}
}
//output - show() method 1






//part 4
class A
{
	void Show()
	{
		System.out.println("Show () method 1");
	}
}

class B extends A
{
	@Override
	void Show1()
	{
		System.out.println("Show () method 2");
	}
}

class MethodOverriding
{
	public static void main(String[] args) {
		B obj = new B();
		obj.Show();
	}
}
//output - compile time error - > method does not override or implement a method form a supertype @Override







//part 5
class A
{
	void Show()
	{
		System.out.println("Show () method 1");
	}
}

class B extends A
{
	@Override
	void Show()
	{
		System.out.println("Show () method 2");
	}
}

class MethodOverriding
{
	public static void main(String[] args) {
		B obj = new B();
		obj.Show();
	}
}
//output - show () method 2






//part 6 - using "super" keyword
class A
{
	void Show()
	{
		System.out.println("Show () method 1");
	}
}

class B extends A
{
	@Override
	void Show()
	{
		super.Show();
		System.out.println("Show () method 2");
	}
}

class MethodOverriding
{
	public static void main(String[] args) {
		B obj = new B();
		obj.Show();
	}
}

//output - 	show () method 1
//			show () method 2












class A
{
	void Show()
	{
		System.out.println("Show () method 1");
	}
}

class B extends A
{
	@Override
	void Show()
	{
		super.Show();
		System.out.println("Show () method 2");
	}
}

class MethodOverriding
{
	public static void main(String[] args) {
		B obj = new B();
		obj.Show();
	}
}