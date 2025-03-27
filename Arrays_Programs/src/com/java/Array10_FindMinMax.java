package com.java;
/* 2) WAP to enter the five elements in array and find out the maximum and minimum elements */

import java.util.*;

public class Array10_FindMinMax
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the valuve");
		
		int a[] = new int[5];
		
		for(int i = 0 ; i < a.length ; i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("Max valuve");
		
		int max = 0;

		for(int i = 0 ; i < a.length ; i++)
		{
			if(max < a[i])
			{
				max = a[i];
			}
			
		}
		System.out.println(max);
		
		System.out.println("Min value");
		
		int min = a[0];
		
		for(int i = 0 ; i < a.length ; i++)
		{
			if(a[i] < min)
			{
				min = a[i];
			}
		}
		
		System.out.println(min);
		
	}
}