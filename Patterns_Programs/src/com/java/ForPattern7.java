package com.java;
import java.util.*;

public class ForPattern7
{
	public static void main (String args[])
	{	
		int i,j,k=1;

		for(i=1;i<=5;i++)
		{
			for(j=1;j<=7;j++)
			{
				if(i==1 || i==5 || j==1 || j==7)
				{
					System.out.print(" *");
				}
				else
				{
					System.out.print(" "+k);
					k++;
				}
			}
			k=i;
		System.out.println(" ");
		}
	}
}