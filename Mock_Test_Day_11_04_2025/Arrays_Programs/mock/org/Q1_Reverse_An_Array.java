package mock.org;

/*
 * 1. Reverse an Array
Description: Reverse the order of elements in an array.

Input: [1, 2, 3, 4, 5]

Output: [5, 4, 3, 2, 1]
 */

import java.util.*;

public class Q1_Reverse_An_Array {

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

		for(int i=0 ; i<arr.length/2 ; i++)
		{
			int temp = arr[i];
			arr[i] = arr[size -1 -i];
			arr[size -1 - i] = temp;
		}
		
		System.out.println("Reverse array");
		for(int i=0 ; i<arr.length ; i++) 
		{
			System.out.println(arr[i]);
		}
	}

}
