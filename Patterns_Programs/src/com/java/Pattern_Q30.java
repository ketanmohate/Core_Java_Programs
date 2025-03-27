package com.java;

/* 
Pattern
 
    *     
   ***    
  * * *   
 *  *  *  
********* 
 *  *  *  
  * * *   
   ***    
    *

End
*/

public class Pattern_Q30 
{
	public static void main(String[] args) 
	{
		for(int i = 1 ; i<=5 ; i++)
		{
			for(int j = 1 ; j<=9 ; j++)
			{
				if(j==6-i || j==5 || i==5 || j==4+i)
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
		
		for(int i = 6 ; i<=9 ; i++)
		{
			for(int j = 1 ; j<=9 ; j++)
			{
				if((j==5 || j==14-i) || (j<=5 && j==i-4))
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
