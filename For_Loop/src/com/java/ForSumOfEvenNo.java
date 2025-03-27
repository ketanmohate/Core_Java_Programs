package com.java;
/* 7. Write a java program to find sum of all even numbers between 1 to n. using for loop */

import java.util.*;

public class ForSumOfEvenNo
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
			if(i % 2 == 0)
			{
				sum = sum + i;
			}
		}
		System.out.println("Sum of Even number : " + sum);
	}
}
	