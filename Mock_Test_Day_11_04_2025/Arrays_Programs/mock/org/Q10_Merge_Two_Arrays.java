package mock.org;

/*
 * 10. Merge Two Arrays
Description: Merge two arrays into one.

Input: [1, 2, 3], [4, 5, 6]

Output: [1, 2, 3, 4, 5, 6]
 */

import java.util.*;

public class Q10_Merge_Two_Arrays {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of first Array");
		int size1 = sc.nextInt();
		
		int [] arr1 = new int[size1];
		
		System.out.println("Enter the value of first array");
		for(int i=0 ; i<arr1.length; i++)
		{
			arr1[i] = sc.nextInt();
		}
		
		System.out.println("Enter the size of second Array");
		int size2 = sc.nextInt();
		
		int [] arr2 = new int[size2];
		
		System.out.println("Enter the value of second array");
		for(int i=0 ; i<arr2.length; i++)
		{
			arr2[i] = sc.nextInt();
		}
		
		int newSize = size1 + size2;
		
		int[] mergeArr = new int[newSize];
		
		int k = 0;
		for(int i=0 ; i<arr1.length ; i++)
		{
			mergeArr[k++] = arr1[i];
		}
		
		for(int i=0 ; i<arr2.length ; i++)
		{
			mergeArr[k++] = arr2[i];
		}
		
		for(int i=0 ; i<mergeArr.length ; i++)
		{
			System.out.println(mergeArr[i]);
		}
	}

}
