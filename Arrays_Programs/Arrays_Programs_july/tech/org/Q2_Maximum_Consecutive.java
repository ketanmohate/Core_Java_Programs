package tech.org;

/*
 * 
 Q2. Given a binary array, find the count of a maximum number of consecutive 1s present in the array.
Examples : 
Input: arr[] = {1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1}
Output: 4
Explanation: The maximum number of consecutive 1’s in the array is 4 from index 8-11.
 */

import java.util.*;

public class Q2_Maximum_Consecutive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of array");
		int size = sc.nextInt();

		int[] arr = new int[size];

		System.out.println("Enter the values");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter (like 1 | 0)");
		int num = sc.nextInt();
		
		int maxCount = 0;
		int currentCount = 0;
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i] == num) 
			{
				currentCount ++;
				if(currentCount > maxCount)
				{
					maxCount = currentCount;
				}
			}
			else {
				currentCount = 0;
			}
		}
		System.out.println("Maximum number of consecutive 1s: " + maxCount);
	}

}
