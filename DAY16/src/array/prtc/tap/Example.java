package array.prtc.tap;



//display the array elements in two dimensional

public class Example 
{

	public static void main(String[] args) 
	{
		int[][] a= {{2,4,1,7,8},{10,29,11,90,17}};
		for(int i=0;i< a.length;i++)
		{
			for(int j=0;j< a[i].length-1;j++)
			{
				System.out.print(a[i][j]+" ");
			
			}
			System.out.println();
		}
		

	}

}
