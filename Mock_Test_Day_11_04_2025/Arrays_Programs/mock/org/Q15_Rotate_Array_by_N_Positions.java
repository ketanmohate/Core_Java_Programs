package mock.org;

import java.util.Scanner;

/*
 * 15. Rotate Array by N Positions
Description: Rotate the array by n positions to the right.

Input: [1, 2, 3, 4, 5], n = 2

Output: [4, 5, 1, 2, 3]
 */

public class Q15_Rotate_Array_by_N_Positions {

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
		
		System.out.println("Enter the Number of rotations");
		int nRotation = sc.nextInt();
		
		for(int rotation = 0 ; rotation<=nRotation ; rotation++)
		{
			for(int i=0 ; i<arr.length ; i++)
			{
				int temp = arr[0];
				
				for(int j=0 ; j<arr.length-1 ; j++)
				{
					arr[j] = arr[j+1];
				}
				arr[arr.length-1] = temp;
			}
		}

		for(int i=0 ; i<arr.length ; i++)
		{
			System.out.println(arr[i]);
		}
	}

}
