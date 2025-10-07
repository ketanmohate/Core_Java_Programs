package tech.org;

import java.util.Scanner;

/*
 * 
Q3. Move all zeros to end of array

Given an array of integers arr[], the task is to move all the zeros to the end of the array while maintaining the relative order of all non-zero elements.
Examples: 
Input: arr[] = [1, 2, 0, 4, 3, 0, 5, 0]
Output: arr[] = [1, 2, 4, 3, 5, 0, 0, 0]
Explanation: There are three 0s that are moved to the end.
 */

public class Q3_Move_all_zeros_to_end_of_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of array");
		int size = sc.nextInt();

		int[] arr = new int[size];

		System.out.println("Enter the values");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int j = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				if (i != j) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				j++;
			}
		}
		
//		other method
		
//        for (int i = 0; i < size; i++) {
//            if (arr[i] != 0) {
//                arr[index] = arr[i];
//                index++;
//            }
//        }
//
// 
//        while (index < size) {
//            arr[index] = 0;
//            index++;
//        }


		System.out.println("Result Array");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
