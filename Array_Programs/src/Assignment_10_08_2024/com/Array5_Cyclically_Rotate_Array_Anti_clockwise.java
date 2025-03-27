package Assignment_10_08_2024.com;

/* 5)	 Write a Java program to cyclically rotate a given array anti-clockwise by n.  
Input- 1 2 3 4 5 6
Rotate array by 1
Output- 2 3 4 5 6 1
Rotate array by 2
Output- 5 6 1 2 3 4
*/

import java.util.*;

public class Array5_Cyclically_Rotate_Array_Anti_clockwise 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array size");
		int size = sc.nextInt();
		
		int a[] = new int[size];
		System.out.println("Enter the array value");
		for(int i = 0 ; i < a.length ; i++)
		{
			a[i] = sc.nextInt();
		}
		
		// Display Original Array
		
		System.out.println("Display Original Array");
		for(int i = 0 ; i < a.length ; i++)
		{
			System.out.println(a[i]);
		}
		
		// main logic 
		
		System.out.println("Enter How Many Time Array Rotate");
		int Rotation = sc.nextInt();
		
		for(int n = 0 ; n < Rotation ; n++)
		{
			int temp = a[0];
			
			for(int i = 0 ; i < a.length-1 ; i++)
			{
				a[i] = a[i+1];
			}
			a[a.length-1] = temp;
		}
		
		// Display array 
		
		System.out.println("Rotate Array Anti clockwise");
		
		for(int i = 0 ; i < a.length ; i++)
		{
			System.out.print(a[i] + " ");
		}
	}
}
