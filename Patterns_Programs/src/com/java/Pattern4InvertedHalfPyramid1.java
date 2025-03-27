package com.java;
/* Inverted Half Pyramid */

public class Pattern4InvertedHalfPyramid1
{
	public static void main(String args[])
	{
		int i,j;
		
		for(i = 1 ; i <= 6 ; i++)
		{
			for(j = 6 ; j >= i ; j--)
				
			{
				if(i==1 || j==1 || j==6 ||j==i) {
				   System.out.print("*");
				}
				else {
					 System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}