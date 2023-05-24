package top.cnstctr.chain;

class Test
{
	int x,y;
	 public Test()
	{
		x=100;
		y=200;
	}
	public Test(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
}
class Test2 extends Test
{
	int a,b;
	Test2()
	{
		this(9,99);
		a=300;
		b=400;
	}
	public Test2(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	void disp()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(a);
		System.out.println(b);



	}
	
}




public class Example {

	public static void main(String[] args) 
	{
		Test2 t2=new Test2();
		//Test2 t2=new Test2(9,99);
		t2.disp();

	}

}
