package com.java;

/* 
Pattern
 
    *    
   * *   
  * * *  
 * * * * 
* * * * *
* * * * *
 * * * * 
  * * *  
   * *   
    *     

End
*/

public class Pattern_Q19 
{
	public static void main(String[] args)
	{	
		int flag=0;
		
		for(int i = 1 ; i <=5 ; i++)
		{	
			for(int j = 1 ; j<=9 ; j++)
			{
				if((j<=5 && j>=6-i && flag==0) || (j>=6 && j<=4+i && flag==0) )
				{
					System.out.print("*");
					flag=1;
				}
				else
				{
					System.out.print(" ");
					flag=0;
				}
			}
			System.out.println("");
		}
		for(int i = 1 ; i <=5 ; i++)
		{	
			int flag1=0;
			for(int j = 1 ; j<=9 ; j++)
			{
				if((j<=5 && i<=j && flag1==0) || (j>=6 && j<=10-i && flag1==0))
				{
					System.out.print("*");
					flag1=1;
				}
				else
				{
					System.out.print(" ");
					flag1=0;
				}
			}
			System.out.println("");
		}
	}
}
