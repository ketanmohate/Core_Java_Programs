package com.java;

/* 
Pattern
 
1
2*3
4*5*6
7*8*9*10
7*8*9*10
4*5*6
2*3
1

End
*/

public class Pattern_Q24 
{
	public static void main(String[] args)
	{		
		int count=1;
		
		for(int i = 1 ; i <=4 ; i++)
		{	
			for(int j = 1 ; j<=7 ; j++)
			{	
				if(j<=i*2-1)
				{
					if(j%2 !=0)
					{
						System.out.print(count);
						count++;
					}
					else 
					{
						System.out.print("*");
					}
				}
			}
			System.out.println("");
		}
		
		int count1=7;
		
		for(int i = 4 ; i>=1 ; i--)
		{
			for(int j = 1 ; j <= 7 ;j++)
			{
				if(j<=i*2-1)
				{
					if(j%2 !=0)
					{
						System.out.print(count1);
						count1++;
					}
					else 
					{
						System.out.print("*");
					}
				}
			}
			count1 = count1 - (i * 2 - 1);
			System.out.println("");
		}
	}
}