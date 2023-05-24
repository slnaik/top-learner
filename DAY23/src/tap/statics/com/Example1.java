package tap.statics.com;

// static keyword using

class Test
{
	static int a,b;
	static
	{
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		System.out.println("inside static block");
		a=10;
		b=20;
	}
	static void fun1()
	{
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		System.out.println("iside static method");
	}
	int x,y;
	{
		System.out.println("inside instance block");
	}
	void fun2()
	{
		System.out.println("x= "+x);
		System.out.println("y= "+y);

		System.out.println("inside instance method");
	}
	Test()
	{
		System.out.println("x= "+x);
		System.out.println("y= "+y);
		System.out.println("inside constructor");
		x=30;
		y=40;
	}
}


public class Example1 
{

	public static void main(String[] args)
	{
		Test.fun1();
		Test t=new Test();
		t.fun2();

	}

}
