package com.java;

/* 
Pattern
 
    *    
   * *   
  *   *  
 *     * 
*       *
*       *
 *     * 
  *   *  
   * *   
    * 

End
*/

public class Pattern_Q20 
{
	public static void main(String[] args)
	{	
		for(int i = 1 ; i <=5 ; i++)
		{	
			for(int j = 1 ; j<=9 ; j++)
			{
				if((j<=5 && j==6-i) || (j>=5 && j==4+i))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		for(int i = 1 ; i <=5 ; i++)
		{	
			for(int j = 1 ; j<=9 ; j++)
			{
				if((j<=5 && j==i) ||(j>=5 && j==10-i))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}
