package com.java;

/* 
Pattern
 
   **** 
  *  *  
 *  *   
****    

End
*/

public class Pattern_Q34 
{
	public static void main(String[] args) 
	{
		for(int i = 1 ; i<=4 ; i++)
		{
			for(int j = 1 ; j<=7 ; j++)
			{
				if((j<=3 && j<=4-i) || (j>=4 && j>=9-i) || (i==2 && j>=4 && j<=5) || (i==3 && j>=3 && j<=4))
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println(" ");
		}
	}
}
