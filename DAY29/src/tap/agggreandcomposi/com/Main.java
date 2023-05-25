package tap.agggreandcomposi.com;


class student
{
	Heart myHeart;
	Brain myBrain;
	Bike MyBike ;
	Book myBook;
	student()
	{	
	myHeart=new Heart(150.0f,72);
	myBrain = new Brain(4000.0f,"grey");
	}
	public void setMyBike(Bike myBike) 
	{
		this.MyBike = myBike;
	}
	public void setMyBook(Book myBook)
	{
		this.myBook = myBook;
	}
	
}



class Heart
{
	float weight;
	int bpm;
	public Heart(float weight, int bpm) 
	{
		super();
		this.weight = weight;
		this.bpm = bpm;
	}	
}
class Brain
{
	float weight;
	String color;

public Brain(float weight, String color) {
		super();
		this.weight = weight;
		this.color = color;
	}
}
class Bike
{
	String Brand;
	int mileage;
	

public Bike(String brand, int mileage) {
		super();
		Brand = brand;
		this.mileage = mileage;
	}
}
class Book
{
	String name;
	String Author;
	
public Book(String name, String Author) {
		super();
		this.name = name;
		this.Author = Author;
	}
}



public class Main 
{

	public static void main(String[] args)
	{
		student s=new student();
	System.out.println(s.myHeart.weight);
	System.out.println(s.myHeart.bpm);
	System.out.println(s.myBrain.weight);
	System.out.println(s.myBrain.color);
	Bike b=new Bike("jawa",20);
	s.setMyBike(b);
	System.out.println(b.Brand);
	System.out.println(b.mileage);
	Book bk=new Book("economics","laxmikanth");
	s.setMyBook(bk);
	System.out.println(bk.Author);
	System.out.println(bk.name);
	
	}
}
