package com.java;

/* 
Pattern
 
    *     
   *      
  *       
 *        
********* 
 *        
  *       
   *      
    *

End
*/

public class Pattern_Q32 
{
	public static void main(String[] args) 
	{
		for(int i = 1 ; i<=10 ; i++)
		{
			for(int j = 1 ; j<=9 ; j++)
			{
				if((i==5) || (j<=5 && j==6-i) || (j<=5 && i>=6 && j==i-4))
				{
					System.out.print("*");
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
