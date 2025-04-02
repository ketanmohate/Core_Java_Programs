package mock.org;

import java.util.Scanner;

/*
 * 4. Sum of Elements in Array
Description: Calculate the sum of all elements in an array.

Input: [1, 2, 3, 4, 5]

Output: 15
 */

public class Q4_Sum_of_Elements_in_Array {

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
		
		for(int i=0 ; i<arr.length ; i++)
		{
			sum = sum + arr[i];
		}
		System.out.println("Sum \t" + sum);
	}
}

