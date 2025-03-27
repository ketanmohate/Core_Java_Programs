package Day_19_02_2025;

/*
 Check if an array is sorted
Determine if the given array is sorted in ascending or descending order.
 */

import java.util.*;

public class Q3_Check_If_Array_Is_Sorted {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter the values");
		for(int i=0 ; i<arr.length ; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		boolean assending = false;
		boolean descending = false;
		
		for(int i=0 ; i<arr.length-1 ; i++)
		{
			if(arr[i] < arr[i + 1])
			{
				assending = true;
			}
			if(arr[i] > arr[i + 1])
			{
				descending = true;
			}
			else
			{
				assending = false;
				descending = false;
			}
		}
		
		if(assending)
		{
			System.out.println("Assending Array");
		}
		else if(descending) 
		{
			System.out.println("Descending Array");
		}
		else 
		{
			System.out.println("Unsorted Array");
		}
	}
}
