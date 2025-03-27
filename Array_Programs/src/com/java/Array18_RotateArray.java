package com.java;
/* 14) Write a program in java to rotate an array by N positions ?
Expected Output :
The given array is : 0 3 6 9 12 14 18 20 22 25 27
From 4th position the values of the array are : 12 14 18 20 22 25 27
Before 4th position the values of the array are : 0 3 6 9
After rotating from 4th position the array is:
12 14 18 20 22 25 27 0 3 6 9
*/

import java.util.*;

public class Array18_RotateArray
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int m = sc.nextInt();

		int a[] = new int[m];
		
		System.out.println("Enter the number");
		
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter the number of rotation");
		int ratation = sc.nextInt();
		
		for(int n = 0 ; n < ratation ; n++)
		{
			
			int temp = a[0];
		
			for(int i = 0 ; i < a.length-1 ; i++)
			{
				{
					a[i] = a[i+1];
					
				}
			}
			
			a[a.length-1] = temp;
		}
		
		System.out.println("Rotate Array");
		
		for(int i = 0 ; i < a.length ; i++)
		{
			System.out.println(a[i]);
		}
	}
}