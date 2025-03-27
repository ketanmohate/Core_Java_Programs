package com.java;
/* Q. WAP to create array of size 5 and arrange all in ascending and descending order? */

import java.util.*;

public class Array5_ArrayAscendingAndDescendingOrder
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ennter the number");
		
		int a[] ;
		a = new int[5];
		
		for(int i = 0 ; i < a.length ; i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Disply Array");
		
		for(int i = 0 ; i < a.length ; i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("Soft array Ascending ");
		
		for(int i = 0 ; i < a.length ; i++)
		{
			for(int j = (1+i) ; j < a.length ; j++)
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
		
		System.out.println("Soft array Descending ");
		
		for(int i = 0 ; i < a.length ; i++)
		{
			for(int j = (i+1) ; j < a.length ; j++)
			{
				if(a[i] < a[j])
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
	}
}