package com.java;

/* 
Pattern
 
1         
1 2       
1   3     
1     4   
1 2 3 4 5  

End
*/

public class Pattern_Q11 
{
	public static void main(String[] args) 
	{
		for(int i = 1 ; i <= 5 ; i++)
		{
			for(int j = 1 ; j <=5 ; j++)
			{
				if((i==j)||(j<=1)||(i==5))
				{
					System.out.print(j + " ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
	}

}
