package oop.org;

/*
 * Q14. Write a java program to create class name as ArrayOperation using contsructor overloading name as :

	ArrayOperation(int [ ])
	{
		//  Sort Array Ascending and Descending Order.
	}
	
	ArrayOperation(int a[ ] , int b[ ])
	{
		//  Merge Two Array and display it.
	}
 */

import java.util.*;

class ArrayOperation
{
	ArrayOperation(int[] arr)
	{
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Ascending Array");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i] <arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("descending Array");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	ArrayOperation(int[] arr1, int[] arr2)
	{
		int length = arr1.length + arr2.length;
		
		int[] mergeArr = new int[length];
		
		int k = 0;
		
		for (int i = 0; i < arr1.length; i++) {
			mergeArr[k++] = arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			mergeArr[k++] = arr2[i];
		}
		
		System.out.println("Merge Array");
		for (int i = 0; i < mergeArr.length; i++) {
			System.out.println(mergeArr[i]);
		}
	}
}

public class Q14_Array_Operation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first size of array");
		int size1 = sc.nextInt();
		
		int[] arr1 = new int[size1];
		
		System.out.println("Enter the value");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}

		System.out.println("Enter the second size of array");
		int size2 = sc.nextInt();
		
		int[] arr2 = new int[size2];
		
		System.out.println("Enter the value");
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}
		
		ArrayOperation arrOperation = new ArrayOperation(arr1);
		arrOperation = new ArrayOperation(arr1,arr2);

	}

}
