package array.prtc.tap;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args)
	{
		int a[]=new int[6];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the elements of an array: ");
		int mul=1;
		
		for(int i=0;i<a.length;i++)
		{
			
			a[i]=sc.nextInt();
			mul=mul*a[i];
		}
		//System.out.println("sum of the array elements is: "+sum);
		System.out.println("multiplication of the array elements is: "+mul);
		
		

	}

}
