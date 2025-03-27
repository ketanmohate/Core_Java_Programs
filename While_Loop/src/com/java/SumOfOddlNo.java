package com.java;
/* 8. Write a C program to find sum of all odd numbers between 1 to n. */

import java.util.*;

public class SumOfOddlNo
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);	
		System.out.println("Enter the number:");	
		int num = scan.nextInt();
		
		int i = 1,sum = 0;
		
		while(i <=num)
		{
			if(i % 2 == 1)
			{
				sum = sum + i ;
			}
		i++;			
		}
		System.out.println("Sum Of Odd Numbar :" + sum);
	}
}