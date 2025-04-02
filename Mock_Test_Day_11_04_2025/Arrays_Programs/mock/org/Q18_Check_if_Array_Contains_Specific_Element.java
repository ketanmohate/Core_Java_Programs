package mock.org;

import java.util.Scanner;

/*
 * 18. Check if Array Contains a Specific Element
Description: Check if a specific element exists in an array.

Input: [1, 2, 3, 4], element 3

Output: Found
 */

public class Q18_Check_if_Array_Contains_Specific_Element {

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
		
		System.out.println("Enter the Search Element");
		int element = sc.nextInt();
		
		boolean found = false;
		
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i] == element)
			{
				found = true;
			}
		}
		if(found)
		{
			System.out.println("Found");
		}
		else
		{
			System.out.println("Not Found");
		}
	}

}
