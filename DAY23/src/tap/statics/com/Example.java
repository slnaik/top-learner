package tap.statics.com;

//static using keyword

class Car
{
	String name;
	String getName()
	{
		return name;
	}
}



public class Example 
{

	public static void main(String[] args) 
	{
		Car c=new Car();
		System.out.println(c.getName());
		

	}

}
