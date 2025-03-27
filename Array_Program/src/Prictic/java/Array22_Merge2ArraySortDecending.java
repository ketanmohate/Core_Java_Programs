package Prictic.java;

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

public class Array22_Merge2ArraySortDecending {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[3];
		int b[] = new int[3];
		int mergedArray[] = new int[6];
		
		// first  array input 
		
		System.out.println("Enter the First Array Element");
		
		for(int i = 0 ; i < a.length ; i++)
		{
			a[i] = sc.nextInt();
		}
		
		// second array input
		
		System.out.println("Enter the second Array  Element");
		for(int i = 0 ; i < a.length ;i++)
		{
			b[i] = sc.nextInt();
		}
		
		// merged array
		
		int k = 0 ;
			
		for(int i = 0 ; i < a.length ; i++)
		{
			mergedArray[k] = a[i];
			k++;
		}
			
		for(int j = 0 ; j < b.length ; j++)
		{
			mergedArray[k] = b[j];
			k++;
		}
		
		System.out.println("The merged array in decending order is :");
		
		for(int i = 0 ; i < mergedArray.length ; i++)
		{
			for(int j = i+1 ; j < mergedArray.length ; j++)
			{
				if(mergedArray[i] < mergedArray[j])
				{
					int temp = mergedArray[i];
							mergedArray[i] = mergedArray[j];
							mergedArray[j] = temp;
				}
			}
		}
		
		for(int i = 0 ; i < mergedArray.length ; i++)
		{
			System.out.print(mergedArray[i] + "\t");
		}

	}

}
