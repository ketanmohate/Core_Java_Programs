package com.java;
/* 7) WAP to enter the 10 element array and print the occurrence of every element ? */

import java.util.*;

public class Array13_PrintOccurrenceOfElement
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value");
		
		int a[] = new int[10];
		
		
		for(int i = 0 ; i < a.length ; i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("Display the Array");
		
		for(int i = 0 ; i < a.length ; i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("Ocurrence of every element");
		
		int count = 0; 
		int count1 = 0; 
		int count2 = 0; 
		int count3 = 0; 
		
		for(int i = 0 ; i < a.length ; i++)
		{
			{	
				if(10 == a[i])
				{
					count++;
				}
				
				if(20 == a[i])
				{
					count1++;
				}
				
				if(30 == a[i])
				{
					count2++;
				}
				
				if(50 == a[i])
				{
					count3++;
				}
			}
		}
		System.out.println("10" + "----------------->" + count);
		System.out.println("20" + "----------------->" + count1);
		System.out.println("30" + "----------------->" + count2);
		System.out.println("50" + "----------------->" + count3);
	}
}
	