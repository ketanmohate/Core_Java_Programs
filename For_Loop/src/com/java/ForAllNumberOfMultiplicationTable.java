package com.java;
/* Write a java program to all table from m to n. using for loop */

import java.util.*;

public class ForAllNumberOfMultiplicationTable
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);	
		
		System.out.println("Enter the munimul number of table");
		int min = sc.nextInt();
	
		System.out.println("Enter the maximum number of table");
		int max = sc.nextInt();
		
		System.out.println("Multiplication table ");		

		for(int i = min ; i <= max ; i++)
		{
			for(int j = 1 ; j <= 10 ; j++)
			{
				System.out.print("  " + i*j);
			}	
			System.out.println();
		}
	}
}