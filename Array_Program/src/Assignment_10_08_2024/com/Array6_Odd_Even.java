package Assignment_10_08_2024.com;

/* 6)	 Write a Java program to separate even and odd numbers from a given array of integers. Put all even numbers first, and then odd numbers.  
Input – 20 12 23 17 7 8 10 2 1 0
Output- 20 12 0 2 10 8 7 17 1 23
*/

import java.util.*;

public class Array6_Odd_Even 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		
		int a[] = new int[size];
		System.out.println("Enter the value of array");
		for(int i = 0 ; i < a.length ; i++)
		{
			a[i] = sc.nextInt();
		}

		// Display Original array
		System.out.println("Display Original Array");
		for(int i = 0 ; i < a.length ; i++)
		{
			System.out.print(a[i] + "\t");
		}
		System.out.println("");
		
		// main logic
		System.out.println("Even Odd Array Element");
		for(int i = 0 ; i < a.length ; i++)
		{
			if(a[i]%2 == 0)
			{
				System.out.print(a[i] + "\t");
			}
		}
		for(int i = 0 ; i < a.length ; i++)
		{
			if(a[i]%2 != 0)
			{
				System.out.print(a[i] + "\t");
			}
		}
	}

}
