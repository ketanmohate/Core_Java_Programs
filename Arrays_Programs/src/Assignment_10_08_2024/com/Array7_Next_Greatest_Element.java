package Assignment_10_08_2024.com;

/* 7)	Write a Java program to replace every element with the next greatest element (from the right side) in a given array of integers.
There is no element next to the last element, therefore replace it with -1. 

Input- Original Array 
[45, 20, 100, 23, -5, 2, -6]
Output- The modified array:
[100, 100, 23, 2, 2, -6, -1]
 */

import java.util.*;

public class Array7_Next_Greatest_Element 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Size of Array");
		int size = sc.nextInt();
		
		int a[] = new int[size];
		System.out.println("Enter the value of array");
		for(int i = 0 ; i < a.length ; i++)
		{
			a[i] = sc.nextInt();
		}
		
		// Display Original Array
		System.out.println("Display Original Array");
		for(int i = 0 ; i < a.length ; i++)
		{
			System.out.print(a[i] + "\t");
		}
		System.out.println("");
		
		// main logic
		
		System.out.println("Next Greatest Element");
		
		int nextGArry[] = new int[size];
		int k=0;
		
		for(int i = 0 ; i < a.length ; i++)
		{
			int flag = 0;
			
			nextGArry[i] = 0;
			
			for(int j = i+1 ; j < a.length ; j++)
			{
				if(a[i] < a[j])
				{
					nextGArry[k] = a[j];
					k++;
					flag=1;
				}
				else
				{
					flag=0;
				}
			}
		}
		
		for(int i = 0 ; i < nextGArry.length ; i++)
		{
			System.out.print(nextGArry[i] + "\t");
		}
		System.out.println("");
	}

}
