package top.pattern.com;

public class Example7 {

	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5-(i-1);j++)
			{
				System.out.print( i + j-1);
				System.out.print(" ");
			}
			System.out.println();
		}
		

	}

}
