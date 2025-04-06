package mock.org;

import java.util.Scanner;

/*
 * 21. Find the Missing Number in the Array
Description: Given an array containing n distinct numbers taken from the range 1 to n+1, find the missing number.

Input: [1, 2, 4]

Output: 3
 */

public class Q21_Find_the_Missing_Number_in_the_Array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size:");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the values:");
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = sc.nextInt();
        }
        
        for (int i = 0; i < arr.length-1; i++) 
        {
        	for (int j = arr[i]+1; j < arr[i+1]; j++) 
        	{
        		System.out.println(j);
			}
		}
	}

}
