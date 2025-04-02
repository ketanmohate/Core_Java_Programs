package mock.org;

import java.util.Scanner;

/*
 * 13. Sort Array in Ascending Order
Description: Sort the elements of the array in ascending order.

Input: [10, 2, 30, 4, 5]

Output: [2, 4, 5, 10, 30]
 */

public class Q13_Sort_Array_in_Ascending_Order {

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
		
		for(int i=0 ; i<arr.length ; i++)
		{
			for(int j=i+1 ; j<arr.length ; j++)
			{
				if(arr[i] > arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i=0 ; i<arr.length ; i++)
		{
			System.out.println(arr[i]);
		}
	}

}
