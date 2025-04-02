package mock.org;

/*
 * 11. Check if Array is Palindrome
Description: Check if an array is the same when reversed.

Input: [1, 2, 3, 2, 1]

Output: Palindrome
 */

import java.util.*;

public class Q11_Check_if_Array_is_Palindrome {

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
		
		int[] newArr = new int[size];
		
		int k=0;
		for(int i=0 ; i<arr.length ; i++)
		{
			newArr[k++] = arr[i];
		}
		
		for(int i=0 ; i<arr.length/2 ; i++)
		{
			int temp = arr[i];
			arr[i] = arr[size -1 - i];
			arr[size -1 -i] = temp;
		}
		
		boolean palondrome = true;
		
		for(int i=0 ; i<arr.length ; i++)
		{
			if(arr[i] != newArr[i])
			{
				palondrome = false;
				break;
			}
		}
		
		if(palondrome)
		{
			System.out.println("Palondrome");
		}
		else
		{
			System.out.println("Not Palondrome");
		}
	}

}
