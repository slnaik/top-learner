package dAY.tap.academy;




//diffrent way's to compare Strings

public class Example
{

	public static void main(String[] args)
	{
		
		String s1="java";
		//String s2="java";
		String s2=new String("java");
		
		//String s1=new String("TAP");
		//String s2=new String("BTM");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.compareTo(s2));
		
		
		
	
		

	}

}
