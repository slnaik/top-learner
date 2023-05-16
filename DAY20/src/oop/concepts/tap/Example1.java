package oop.concepts.tap;

/* create a employee class and make data variables in private using setters and getters method an
 * and same name as in setters the fields as follow
 * name
 * email
 * phone
 * salary
 * eid 
 * city 
 * 
 *  
 *  in this case we have shadowing prabloms occures
 *  because the same name of the local and instance variable
 *  in this prablomes overcomre through the using this keyword  */



class employee
{
	String name;
	String email;
	int phone;
	int salary;
	int eid;
	String city;
	void setName(String name)
	{
		this.name=name;
	}
	void setEmail(String email)
	{
		this.email=email;
	}
	void setPhone(int phone)
	{
		this.phone=phone;
	}
	void setSalary(int salary)
	{
		this.salary=salary;
	}void setEid(int eid)
	{
		this.eid=eid;
	}
	void setCity(String city)
	{
		this.city=city;
	}
	String getName()
	{
		return name;
	}
	String getEmail()
	{
		return email;
	}
	int getphone()
	{
		return phone;
	}
	int getSalary()
	{
		return salary;
	}
	int getEid()
	{
		return eid;
	}
	String getCity()
	{
		return city;
	}
}






public class Example1 
{

	public static void main(String[] args)
	{
		employee e=new employee();
		e.setName("shankar");
		e.setEmail("slnaik@gmail.com");
		e.setPhone(974038339);
		e.setSalary(200000);
		e.setEid(101);
		e.setCity("shimoga");
		System.out.println(e.getName());
		System.out.println(e.getEmail());
		System.out.println(e.getphone());
		System.out.println(e.getSalary());
		System.out.println(e.getEid());
		System.out.println(e.getCity());





		
	}

}
