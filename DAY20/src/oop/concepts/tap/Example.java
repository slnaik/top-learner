package oop.concepts.tap;

class customer
{
	String name;
	int cin;
	float balance;
	
	void setName(String nm)
	{
		name=nm;
	}
	void setCin(int num)
	{
		cin=num;
	}
	void setBalance(float bal)
	{
		if(bal>0)
		{
			balance=bal;
		}
		
		
	}
	String getName()
	{
		return name;
	}
	int getCin()
	{
		return cin;
	}
	float getBalance()
	{
		return balance;
	}
}








public class Example
{

	public static void main(String[] args)
	{
		customer c=new customer();
		c.setName("shankar");
		c.setCin(10010);
		c.setBalance(10000);
		System.out.println(c.getName());
		System.out.println(c.getCin());
		System.out.println(c.getBalance());
	}

}
