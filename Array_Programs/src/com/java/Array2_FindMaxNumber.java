package com.java;

/* Q. WAP to create array of size 5 and find the max and min value from array? */

import java.util.*;

public class Array2_FindMaxNumber
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the 5 value ");
		
		int a[];
		a = new int[5];
		
		for(int i = 0 ; i < a.length ; i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Maximum value");
		
		int max = a[0]; 
		
		for(int i = 0 ; i < a.length ;i++)
		{
			if(a[i] > max)
			{
				max = a[i];
			}
		}
		System.out.println(max);
		
		System.out.println("Minumum value");
		
		int min = a[0]; 
		
		for(int i = 0 ; i < a.length ;i++)
		{
			if(a[i] < min)
			{
				min = a[i];
			}
		}
		System.out.println(min);
	}
}