package com.java;
/* Q. WAP to create array of size 5 and reverse it means shift value of its index? */

import java.util.*;

public class Array4_ArrayRevers
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int a[];
		a = new int[5];
		
		System.out.println("Enter the number:");
		
		for(int i = 0 ; i < a.length ; i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Original array:");
		
        for (int i = 0; i < a.length; i++) 
		{
            System.out.println(a[i]);
        }
		
		System.out.println("Print Array in reverse");
		
		for(int i = a.length-1 ; i >= 0 ; i--)
		{
			System.out.println(a[i]);
		}
	}
}