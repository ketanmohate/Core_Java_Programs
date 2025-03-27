package com.java;
/* Q. WAP to create array of size 5 and input single value from keyboard and search value present in array or not? */

import java.util.*;

public class Array3_SearchInputeSingleVaule
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value");
			
		int a[];
		
		a = new int[5];
		
		for(int i = 0 ; i < a.length ; i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter a single value to search");
		int search = sc.nextInt();
		int flag = 0; 
		
		for(int i = 0 ; i < a.length ; i++)
		{
			if(a[i] == search)
			{
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("search value is present in array: \t" + search);	
		}
		else
		{
			System.out.println("search value is Not present in array:\t" + search);	
		}
	}
}