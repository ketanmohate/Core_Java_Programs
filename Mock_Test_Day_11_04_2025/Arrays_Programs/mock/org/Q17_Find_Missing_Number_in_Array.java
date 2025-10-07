package mock.org;

import java.util.Iterator;
import java.util.Scanner;

/*
 * 17. Find Missing Number in Array
Description: Find the missing number in an array containing numbers from 1 to n.

Input: [1, 2, 4, 5]

Output: 3
 */

public class Q17_Find_Missing_Number_in_Array {

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
		
//		main logic
		for(int i=0 ; i<arr.length-1 ; i++)
		{
			for(int j=arr[i]+1 ; j<arr[i+1] ; j++)
			{
				System.out.println(j);
			}
		}
	}

}
