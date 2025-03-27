package com.java;
/* 36. Write a Java program to print Fibonacci series up to n terms. 

For Example: 0, 1, 1, 2, 3, 5, 8, 13, 21, … , (n-1th + n-2th)
*/

import java.util.*;

public class ForPrintFibonacciSeries
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter starting term: ");
		int start = sc.nextInt();

		System.out.println("Enter end term: ");
		int end = sc.nextInt();

		int a = 0;
		int b = 1;
		int c = 0;
		int i ,j ;

		for(j = start ; j <= end ; j++)
		{
			a = b;     // Copy n-1 to n-2
			b = c;     // Copy current to n-1
			c = a + b; // New term

			System.out.println(c);
		
		}
	}
}