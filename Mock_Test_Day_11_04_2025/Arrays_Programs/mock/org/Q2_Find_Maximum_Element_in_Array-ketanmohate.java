package mock.org;

/*
 * 2. Find Maximum Element in Array
Description: Find the largest element in an array.

Input: [12, 34, 56, 78, 23]

Output: 78
 */

import java.util.*;

public class Q2_Find_Maximum_Element_in_Array {

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
		
		int max = arr[0];
		
		for(int i=0 ; i<arr.length ; i++)
		{
			if(max < arr[i])
			{
				max = arr[i];
			}
		}
		System.out.println(max);
	}

}
