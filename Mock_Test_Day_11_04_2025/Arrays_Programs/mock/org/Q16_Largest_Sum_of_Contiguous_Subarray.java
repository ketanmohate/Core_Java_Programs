package mock.org;

import java.util.Scanner;

/*
 * 16. Find the Largest Sum of Contiguous Subarray
Description: Find the largest sum of a contiguous subarray in a given array.

Input: [-2, 1, -3, 4, -1, 2, 1, -5, 4]

-2
1
-3
4
-1
2
1
-5
4
Output: 6
 */

public class Q16_Largest_Sum_of_Contiguous_Subarray {

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
		
		int sum = 0;
		int maxSum =0;
		
		for(int i=0 ; i<arr.length ; i++)
		{
			sum = arr[i];
			for(int j=i ; j<arr.length ; j++)
			{
				sum = sum + arr[j];
			}
			if(maxSum <sum)
			{
				maxSum = sum;
			}
		}
		System.out.println(maxSum);
	}

}
