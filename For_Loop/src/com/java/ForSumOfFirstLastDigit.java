package com.java;
/* 12. Write a java program to find sum of first and last digit of a number. using for loop */

import java.util.*;

public class ForSumOfFirstLastDigit
{
	public static void main(String args[])
	{
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		num = sc.nextInt();
		
		int temp = num;
		int count = 0;
		
		for(; temp > 0 ;)
		{
			temp = temp / 10;
			count++;
		}
			
		int p=1;
		
		for(int i = 1 ;i < count ; i++)
		{
			p = p * 10;
		}

		int firstdigit = num / p;
		int lastdigit = num % 10;

		int sum = firstdigit + lastdigit;

		System.out.println("Sum of First And Last Digit : " + sum);
	}
}