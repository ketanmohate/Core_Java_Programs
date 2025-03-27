package Day_19_02_2025;

/*
 Find the second largest element in an array
Find the second largest element in an unsorted array.
 */

import java.util.*;

public class Q5_Second_Largest_Element {
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
		
		int firstLargest = arr[0];
		
		for(int i=0 ; i<arr.length ; i++)
		{
			if(arr[i] > firstLargest)
			{
				firstLargest = arr[i];
			}
		}
		
//		System.out.println(firstLargest);
		
		int secondLargest = arr[0]; 
		boolean found = false;
		
		for(int i=0 ; i<arr.length ; i++)
		{
			if(arr[i] != firstLargest)
			{
				if(!found || arr[i] > secondLargest)
				{
					found = true;
					secondLargest = arr[i];
				}
			}
		}
		
		if(found)
		{
			System.out.println("Secound Largest Element is:\t" + secondLargest);
		}
		else
		{
			System.out.println("No Second Largest element");
		}
	}
}
