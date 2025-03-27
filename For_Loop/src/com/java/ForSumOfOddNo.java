package com.java;
/* 8. Write a java program to find sum of all odd numbers between 1 to n. using for loop */

import java.util.*;

public class ForSumOfOddNo
{
	public static void main(String args[])
	{
		int num;
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the number");
		num = sc.nextInt();
		int sum = 0;

		for(int i = 1 ; i <= num ; i++)
		{
			if(i % 2 == 1)
			{
				sum = sum + i;
			}
		}
		System.out.println("Sum of Number :" + sum);
	}
} 