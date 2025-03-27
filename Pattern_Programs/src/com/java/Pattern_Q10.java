package com.java;

/* 
Pattern
 
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 

End
*/

public class Pattern_Q10 
{
	public static void main(String[] args) 
	{
		int count=1;
		
		for(int i = 1 ; i <= 5 ; i++)
		{	
			for(int j = 1 ; j <=5 ; j++)
			{
				if(j>=i)
				{
					System.out.print(count + " ");
					count++;
				}
			}
			count=1;
			System.out.println("");
		}
	}

}
