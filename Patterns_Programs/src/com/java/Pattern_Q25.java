package com.java;

/* 
Pattern
 
*
* 1 *
* 1 2 1 *
* 1 2 3 2 1 *
* 1 2 1 *
* 1 *
* 

End
*/

public class Pattern_Q25 
{
	public static void main(String[] args)
	{		
		for(int i = 1 ; i <=4 ; i++)
		{	
			int count=1;
			int count1=(1 + (i-3));
			
			for(int j = 1 ; j<=7 ; j++)
			{	
				if(j<=1)
				{
					System.out.print("* ");
				}
				else if(j>=1 && i>=j)
				{
					System.out.print(count + " ");
					count++;
				}
				else if(j< i*2-1)
				{
					System.out.print(count1 + " ");
					count1--;
				}
				else if(i>=2 && j%2 != 0)
				{
					System.out.print("* ");
					break;
				}
			}
			System.out.println("");
		}
		
		
		for(int i = 5 ; i <=7 ; i++)
		{	
			int count=2;
			
			for(int j = 1 ; j<=5 ; j++)
			{	
				if(j<=1)
				{
					System.out.print("* ");
				}
				else if(j<=i && j>=i-1 && i == 5)
				{
					System.out.print(count + " ");
					count++;
				}
				else if(j<=9-i)
				{
					System.out.print("1 ");
				}
				
			}
			System.out.println("");
		}
	}
}