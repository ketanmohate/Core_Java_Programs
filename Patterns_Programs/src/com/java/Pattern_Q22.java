package com.java;

/* 
Pattern
 
3       
4 4     
5 5 5   
6 6 6 6 
5 5 5 
4 4   
3 

End
*/

public class Pattern_Q22
{
	public static void main(String[] args)
	{		
		for(int i = 1 ; i <=4 ; i++)
		{	
			for(int j = 1 ; j<=4 ; j++)
			{
				int count=i;
				
				if((i>=j))
				{
					count+=2;
					System.out.print(count + " ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
		
		int count=5;
		
		for(int i = 3 ; i >=1 ; i--)
		{	
			for(int j = 1 ; j<=3 ; j++)
			{	
				if(j<=i*2-i)
				{
					System.out.print(count + " ");
				}
				else		
				{
					System.out.print("  ");
				}
			}
			System.out.println("");
			count--;;
		}
	}
}
