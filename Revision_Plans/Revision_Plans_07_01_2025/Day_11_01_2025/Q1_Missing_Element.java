package Day_11_01_2025;

/*
Q1. WAP to input the five elements in the array in ascending order and find the missing element from the array?
Example:   1    4     8      12       15
Output:   2     3     5     6    7    9    10    11     13     14
 */

import java.util.*;

public class Q1_Missing_Element 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array:");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter the element:");
		for(int i=0 ; i<arr.length ; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		// element soft in ascending order
	
		for(int i=0 ; i<arr.length ; i++)	
		{
			for(int j=i+1 ; j<arr.length ; j++)
			{
				if(arr[i] >= arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
//		System.out.println("Sort Array");
//		for(int i=0 ; i<arr.length ;i++)
//		{
//			System.out.println(arr[i]);
//		}
		
		System.out.println("Missing element:");
		for(int i=0 ; i<arr.length-1 ; i++)
		{
			for(int j=arr[i]+1 ; j<arr[i+1] ; j++)
			{
				System.out.print(j+"\t");
			}
		}
	}
}
