package com.java;
/* 4) WAP to insert the element on specified position in array ? */

import java.util.*;

public class Array11_InsertElementSpecificPosition
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[6];
		
		System.out.println("Enter the value");
		
		for(int i = 0 ; i < 5 ; i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("Display the value");
		
		for(int i = 0 ; i < a.length ; i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("Insert value of 2nd Position");
		
		int i = 0;
		for(i = 5 ; i >= 3 ; i--)
		{
			a[i] = a[i-1];
		}
		a[2] = 100;
		
		for( i = 0 ; i < a.length ; i++)
		{
			System.out.println(a[i]);
		}
	}
}