package com.java;
/* Finding second highest value of array using sorting technique */
// mejor eshuu doublicat value are not consider

import java.util.*;

public class Array7_FindSecundHighestValue
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[5];
		
		System.out.println("Enter the number");
		
		for(int i = 0 ; i < a.length ; i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("Display the value");
		
		for(int i = 0 ; i < a.length ; i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("Second highest value");
		
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
		
		int second = 0;
		
		for(int i = 0 ; i < a.length-1 ; i++)
		{
			second = a[i];
		}
		System.out.println(second);
	}
}