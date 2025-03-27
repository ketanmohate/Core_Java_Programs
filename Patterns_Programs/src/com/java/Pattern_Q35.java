package com.java;

/* 
Pattern
 
    1    
   2 3    
  4 5 6    
 7 8 9 10     

End
*/

public class Pattern_Q35 
{
	public static void main(String[] args) 
	{
		int count=1;
		
		for(int i = 1 ; i<=4 ; i++)
		{
			for(int j = 1 ; j<=7 ; j++)
			{
				if(j<=5 && j>=6-i)
				{
					System.out.print(count + " ");
					count++;
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
