package mock.org;

/*
 * 3. Array Pair Sum
Description: Write a program to find all pairs in an array whose sum equals a given target.

Input: [1, 4, 5, 3, 2], target 6

Output: [(4, 2), (5, 1)]
 */

import java.util.*;

public class Q3_Array_Pair_Sum {

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
		
		System.out.println("Enter the Target value");
		int target = sc.nextInt();
		
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = i+1; j < arr.length; j++) 
			{
				if(arr[i] + arr[j] == target)
				{
					System.out.println(arr[i] + "," +arr[j]);
				}
			}
		}
	}

}
