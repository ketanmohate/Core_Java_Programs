package mock.org;

import java.util.Scanner;

/*
 * . Find Minimum Element in Array
Description: Find the smallest element in an array.


Input: [10, 20, 30, 5, 15]


Output: 5
 */

import java.util.*;

public class Q3_Find_Minimum_Element_in_Array {

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
		
		int min = arr[0];
		
		for(int i=0 ; i<arr.length ; i++)
		{
			if(min > arr[i])
			{
				min = arr[i];
			}
		}
		System.out.println(min);

	}

}
