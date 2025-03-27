package com.java;
/* 2. Write a Java program to find sum of first and last digit of a number.*/

import java.util.*;

public class SumOfFirstAndLastDigitApp
{
	public static void main(String args[])
	{
		int num;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number");
		num = scan.nextInt();

		int count = 0;
		int temp = num;
		
		while(temp > 0) 
		{
			temp = temp / 10;
			count++;
		}
		
		int x = 1;
		int i = 1;

		while(i < count)
		{
			x = x * 10;
			i++;
		}	

		int firstdigit = num / x;
		
		int lastdigit = num % 10;

		int sum = firstdigit + lastdigit;
		System.out.println("Sum of first digit last digit :" + sum);
	}
}

	