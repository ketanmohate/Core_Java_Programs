package com.java;
/* 32. Write a java program to check whether a number is Perfect number or not. */

import java.util.*;

public class ForCheckNoPerfecOrNot
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");
		int num = sc.nextInt();

		int sum = 0;
			
		for(int i = 1 ; i < num ; i++)
		{
			if(num % i == 0)
			{
				sum = sum + i;
			}
 		}
		
		if(sum == num)
		{
			System.out.println("Number is Perfect");
		}
		else
		{
			System.out.println("Number is Not Perfrct");
		}
	}
}
