package com.java;

/* 
Pattern
 
1 
1 2 1 
1 2 3 2 1 
1 2 3 4 3 2 1 
1 2 3 4 5 4 3 2 1             

End
*/

public class Pattern_Q15 
{
	public static void main(String[] args)
	{					
		for(int i = 1 ; i <= 5 ; i++)
		{	
			for(int j = 1 ; j <= 2 * i - 1 ; j++)
			{
				if(j<=i)
				{
					System.out.print(j + " ");
				}
				else 
				{
                    System.out.print((2 * i - j) + " ");  // Print decreasing part
                }
			}
			System.out.println("");
		}
	}
}
