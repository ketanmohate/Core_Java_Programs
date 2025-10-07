package tech.org;

import java.util.*;

/*
 * 8. Find the Second Largest Element in Array
Description: Find the second largest element in an array.

Input: [10, 20, 30, 40, 50]

Output: 40
 */

public class Q6_Second_Largest_Element {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size");
		int size = sc.nextInt();

		int[] arr = new int[size];

		System.out.println("Enter the value");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = arr[0];
		
		for(int i=0 ; i<arr.length ; i++)
		{
			if(max < arr[i])
			{
				max = arr[i];
			}
		}
		
//		System.out.println("Max : "+ max);
		
		int secondLargest = arr[0];
		
		boolean found = false; 
		
		for(int i=0 ; i<arr.length ; i++)
		{
			if(arr[i] != max)
			{
				if(found == false || secondLargest < arr[i])
				{
					secondLargest = arr[i];
					found = true;
				}
			}
		}
		
		if(found) {
			System.out.println("Second Largest Element is : " + secondLargest);
		}else {
			System.out.println("No Second Largest Element");
		}
	}

}
