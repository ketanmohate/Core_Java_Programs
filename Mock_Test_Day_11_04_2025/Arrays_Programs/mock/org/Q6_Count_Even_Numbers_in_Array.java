package mock.org;

import java.util.Scanner;

/*
 * 6. Count Even Numbers in Array
Description: Count how many even numbers are in an array.

Input: [1, 2, 3, 4, 5, 6]

Output: 3
 */

public class Q6_Count_Even_Numbers_in_Array {

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

		int count = 0;
		for(int i=0 ; i<arr.length ; i++)
		{
			if(arr[i]%2 == 0)
			{
				count++;
			}
		}
		System.out.println(count);
		
		
	}

}
