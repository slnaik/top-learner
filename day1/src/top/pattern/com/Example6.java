package top.pattern.com;

public class Example6 {

	public static void main(String[] args) 
	{

		for(int i=1;i<=5;i++)
		{
			for(int k=1;k<=5-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				if(j==1||i==j||i==5)
				{
					System.out.print(i+" " );
				}
				else
				{
					System.out.print("  ");
				}
			
				
			}
			System.out.println();
		}
	

	}

}
