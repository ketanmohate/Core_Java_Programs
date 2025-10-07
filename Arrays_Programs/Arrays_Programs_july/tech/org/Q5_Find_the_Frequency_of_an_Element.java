package tech.org;

/*
 7. Find the Frequency of an Element in Array
Description: Find how many times an element appears in an array.

Input: [1, 2, 2, 3, 4, 2, 5], element 2

Output: 3 
 
 */

import java.util.*;

public class Q5_Find_the_Frequency_of_an_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size");
		int size = sc.nextInt();

		int[] arr = new int[size];

		System.out.println("Enter the value");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter the number");
		int num = sc.nextInt();

		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				count++;
			}

		}

		System.out.println("frequency is : " + count);

	}

}
