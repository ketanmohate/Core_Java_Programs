package com.java;
/* 8) . Write a program in java to merge two arrays of same size sorted in decending order.
Test Data :
Input the number of elements to be stored in the first array :3
Input 3 elements in the array :
element - 0 : 1
element - 1 : 2
element - 2 : 3
Input the number of elements to be stored in the second array :3
Input 3 elements in the array :
element - 0 : 1
element - 1 : 2
element - 2 : 3
Expected Output :
The merged array in decending order is :
3 3 2 2 1 1 */

import java.util.*;

public class Array21_ArrayMerge
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[3];
		int b[] = new int[3];
		
		System.out.println("Enter the First Array value");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter the Secound array value");
		
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		
		int x[] = new int[6];
		
		System.out.println("merge array");
		
		for(int i=0 ; i<x.length ;i++)
		{
			int k=0;
			for(int j=0 ; j<a.length ;j++)
			{
				x[k] = a[j];	
				k++;
			}
			
			for(int m=0 ; m<b.length ;m++)
			{
				x[k] = b[m];
				k++;
			}
		}
		
		for(int i=0 ;i<x.length;i++)
		{
			System.out.println(x[i]);
		}
		
		System.out.println("merged array in decending order");
		
		for(int i = 0 ; i<x.length ;i++)
		{
			for(int n=i+1 ; n<x.length ; n++)
			{
				if(x[i] < x[n])
				{
					int temp = x[i];
					x[i] = x[n];
					x[n] = temp;
				}
			}
		}
		
		for(int i=0 ;i<x.length;i++)
		{
			System.out.println(x[i]);
		}
	}
}
