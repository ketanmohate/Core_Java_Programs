package com.java;
/* 32. Write a java program to check whether a number is Perfect number or not. */

import java.util.*;

public class CheckNoPerfecOrNot
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");
		int num = sc.nextInt();

		int sum = 0;
			
		int i = 1 ;

		while(i < num)
		{
			if(num % i == 0)
			{
				sum = sum + i;
			}
			i++;
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
