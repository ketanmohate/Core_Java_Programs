package com.java;
/* Q5. WAP to create array of size 5 and calculate sum of all values. */

import java.util.*;

public class Array6_SumOfAllValues
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[5];
		
		System.out.println("Enter the values");
		
		for(int i = 0 ; i < a.length ; i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("Display the array");
		
		for(int i = 0 ; i < a.length ; i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("Sum of values");
		
		int sum=0;
		
		for(int i = 0 ; i < a.length ; i++)
		{
			sum = sum + a[i];
		}
		
		System.out.println(sum);
	}
}
		
	