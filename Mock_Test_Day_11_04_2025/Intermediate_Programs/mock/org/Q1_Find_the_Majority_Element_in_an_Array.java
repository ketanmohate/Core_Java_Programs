package mock.org;

/*
 1. Find the Majority Element in an Array
Description: Write a program to find the element that appears more than n/2 times in the array. If no such element exists, return -1.

Input: [3, 3, 4, 2, 4, 4, 2, 4, 4]
3
3
4
2
4
4
2
4
4

Output: 4
 */

import java.util.*;

public class Q1_Find_the_Majority_Element_in_an_Array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size");
		int size = sc.nextInt();
		
		int [] arr = new int[size];
		
		System.out.println("Enter the value");
		for(int i=0 ; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int n = arr.length/2;
		boolean found = false;
		
		for(int i=0 ; i<arr.length ; i++)
		{
			int count = 0;
			for (int j = 0; j < arr.length; j++) 
			{
				if(arr[i] == arr[j])
				{
					count++;
				}
			}
			if(count > n)
			{
				System.out.println(arr[i]);
				found = true;
				break;
			}
		}
		if (!found) {
	        System.out.println("-1");
	    }
	}

}
