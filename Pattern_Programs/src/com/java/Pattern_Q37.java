package com.java;

/* 
Pattern
 
1        1
12      21
123    321
1234  4321
1234554321

End
*/

public class Pattern_Q37 
{
	public static void main(String[] args) 
	{	
		int count=1;
		
		for(int i = 1 ; i<=5 ; i++)
		{	
			for(int j = 1 ; j<=10 ; j++)
			{
				if(j<=i && j<=5 )
				{
					System.out.print(count);
					count++;
				}
				else if(j>=11-i && j>5)
				{
					--count;
					System.out.print(count);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}
}