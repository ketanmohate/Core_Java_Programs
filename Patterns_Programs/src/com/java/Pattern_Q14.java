package com.java;

/* 
Pattern
 
1  2  3  4  5  
2        5     
3     5        
4  5           
5              

End
*/

public class Pattern_Q14 
{
	public static void main(String[] args)
	{	
		int count=5;
		
		for(int i = 1 ; i <= 5 ; i++)
		{	
			for(int j = 1 ; j<=5 ; j++)
			{
				if(i==1 & j<=5) 
				{
					System.out.print(j + "  ");
				}
				else if(j==1 && i<=5)
				{
					System.out.print(i + "  ");
				}
				else if(j==6-i)
				{
					System.out.print(count + "  ");
				}
				else
				{
					System.out.print("   ");
				}
			}
			System.out.println("");
		}
	}
}
