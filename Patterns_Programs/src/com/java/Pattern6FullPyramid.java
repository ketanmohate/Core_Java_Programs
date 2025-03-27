package com.java;
/* Full Pyramid */

public class Pattern6FullPyramid
{
	public static void main(String args[])
	{
		int i,j;
		
		for(i = 1 ; i <= 6 ; i++)
		{
			for(j = 1 ; j <= 11 ; j++)
			{
				if(j >= 9-i && j<= 5 +i)
				{
					System.out.print(" * ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}