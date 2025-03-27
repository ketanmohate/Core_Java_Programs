package Assignment_10_08_2024.com;

/* 
 9)	Write a Java program to find the maximum product of two integers in a given array of integers.  
Example:
Input :
nums = { 2, 3, 5, 7, -7, 5, 8, -5 }
Output:
Pair is (7, 8), Maximum Product: 56

 */

import java.util.*;

public class Array9_Find_maximum_product_of_two_integers 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		
		int a[] = new int[size];
		System.out.println("Enter the value of array");
		for(int i = 0; i < a.length ; i++)
		{
			a[i] = sc.nextInt();		
		}
		
		// Display Original array
		
		System.out.println("Display Original array");
		for(int i = 0 ; i < a.length ; i++)
		{
			System.out.print(a[i] + "\t");
		}
		System.out.println("");
		
		// main logic
		
		// array sort
		System.out.println("Array sort");
		
		for(int i = 0 ; i < a.length ; i++)
		{
			for(int j = i+1 ; j < a.length ; j++)
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
			System.out.print(a[i] + "\t");
		}
		System.out.println("");
		
		// to find the maximum product of two integers  logic
		
		long product = (a[0] * a[1]);
		
		System.out.print("Pair is " + "(" + (a[1]) + "," + (a[0]) + ")" + ",");
		
		System.out.print(" Maximum Product: " + product);
		
	}
	
	// 2	3	5	7	-7	5	8	-5

}
