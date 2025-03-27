package com.java;
/* 5). Write a program to enter the 5 values in ascending order and store in array and find out the 
missing element from array? */

import java.util.*;

public class Array12_MissingElementInArray
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[5];
		
		System.out.println("Enter the value");
		
		for(int i = 0 ; i < a.length ; i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("find element");
		
		for(int i = 0 ; i < a.length-1 ; i++)
		{
			for(int j = a[i]+1 ; j < a[i+1] ; j++)
			{
				System.out.println(j);
			}
		}
	}
}