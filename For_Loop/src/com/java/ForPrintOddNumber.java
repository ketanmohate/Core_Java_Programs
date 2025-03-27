package com.java;
/* 5. Write a java program to print all odd number between 1 to 100 using for loop */

import java.util.*;

public class ForPrintOddNumber
{
	public static void main(String args[])
	{
		int num;
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the number");
		num = sc.nextInt();	

		System.out.println("print all odd number");

		for(int i = 1 ; i <= num ; i++)
		{
			if(i % 2 != 0)
			{
				System.out.println(i);
			}
		}
	}
}
