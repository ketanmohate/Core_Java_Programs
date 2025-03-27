package com.java;
/* 17) Write a program in java to find the smallest missing element from a sorted array?
Expected Output :
The given array is : 0 1 3 4 5 6 7 9
The missing smallest element is: 2 */

import java.util.*;

public class Array19_FindSmallestMissingElement
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		
		int a[] = new int[size];
		
		System.out.println("Enter the array Element");
		
		for(int i = 0 ; i < a.length ; i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("Soft array");
		
		for(int i = 0 ; i < a.length ; i++)
		{
			for(int j = i+1 ; j < a.length ; j++)
			{
				if(a[i] > a[j])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		for(int i = 0 ; i < a.length ; i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("Missing smallest element");
		
		int deff = 0;
		
		for(int i = 0 ; i < a.length-1 ; i++)
		{
			deff = a[i+1]-a[i];
			
			if(deff > 1)
			{
				System.out.println(a[i]+1);
				break;
			}
		}
	}
}