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

public class Pattern_Q31 
{
	public static void main(String[] args) 
	{
		for(int i = 1 ; i<=10 ; i++)
		{
			for(int j = 1 ; j<=9 ; j++)
			{
				if((i==5) || (j>=5 && j==4+i) || (j>=5 && i>=6 && j==14-i))
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
