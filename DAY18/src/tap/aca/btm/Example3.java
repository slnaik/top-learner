package tap.aca.btm;

import java.util.StringTokenizer;

public class Example3 
{

	public static void main(String[] args) 
	{
		String s="JAVA PYTHON SQL AI";
		StringTokenizer	sb=new StringTokenizer(s);
		while(sb.hasMoreTokens())
		{
			System.out.println(sb.nextToken());
		}

	}

}
