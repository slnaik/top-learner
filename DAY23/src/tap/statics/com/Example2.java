package tap.statics.com;

class Test2
{
	static
	int x,y;
	public Test2(int x)
	{
		this();
		this.x=x;
		
	}
	static 
	{
		System.out.println("static block-1");
	}
	void fun1() {
		System.out.println("instance method");
	}
	static void fun2() {
		System.out.println("static method");
	}
	{
		System.out.println("instance block-1");
	}
	static
	{
		x=50;
		System.out.println("static block2");
		System.out.println(x);
	}
	Test2()
	{
		y=100;
		x=200;
		System.out.println("zero parameterized constructor");
	}
	{
		System.out.println("instance block2");
		System.out.println("x= "+x);
		System.out.println("y= "+y);
	}
}



public class Example2 {

	public static void main(String[] args) {
		Test2 t=new Test2(10);
		t.fun1();
		t.fun2();

	}

}
