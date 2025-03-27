package com.java;

/* 
Pattern
 
123454321
1234321
12321
121
1 

End
*/

public class Pattern_Q38 
{
	public static void main(String[] args) 
	{	
		for(int i = 1 ; i<=5 ; i++)
		{
			int count=1;
			int count1=( 5-i);
			
			for(int j = 1 ; j<=9 ; j++)
			{
				if(j<=5 && j>=i )
				{
					System.out.print(count);
					count++;
				}
				else if(j>=5 && j<=10-i)
				{
					System.out.print(count1);
					count1--;
				}
			}
			System.out.println(" ");
		}
	}
}