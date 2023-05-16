package tap.aca.btm;



//StringBuffer

public class Example2 
{

	public static void main(String[] args) 
	{
		StringBuffer sb=new StringBuffer();
		System.out.println(sb);
		sb.append("JAVA");
		System.out.println(sb);
		sb.append(" JAVASCRIPT");
		System.out.println(sb);
		System.out.println(sb.capacity());
		
		sb.append(" JAMESGOSLING");
		System.out.println(sb);
		System.out.println(sb.capacity());
		
		
		sb.delete(1, 10);
		System.out.println(sb);
		
		
		
		
	}

}
