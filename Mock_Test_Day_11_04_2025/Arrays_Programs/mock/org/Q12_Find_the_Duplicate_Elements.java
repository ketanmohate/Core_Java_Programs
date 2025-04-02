package mock.org;

import java.util.Scanner;

/*
 * 12. Find the Duplicate Elements in Array
Description: Find all the duplicate elements in an array.

Input: [1, 2, 3, 4, 5, 1, 3]

Output: [1, 3]
 */

public class Q12_Find_the_Duplicate_Elements {

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
		
		boolean found = false;
		for(int i=0 ; i<arr.length ; i++)
		{
			for(int j=i+1 ; j<arr.length ; j++)
			{
				if(arr[i] == arr[j])
				{
					System.out.println(arr[i]);
					found = true;
					break;
				}
			}
		}
		if(found == false)
		{
			System.out.println("Not Duplicate");
		}
	}

}
