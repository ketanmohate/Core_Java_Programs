package mock.org;

/*
 * 9. Find the Common Elements in Two Arrays
Description: Find the common elements between two arrays.

Input: [1, 2, 3, 4], [3, 4, 5, 6]

Output: [3, 4]
 */

import java.util.*;

public class Q9_Find_the_Common_Elements_in_Two_Arrays {

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
		
		boolean[] b = new boolean[size1];
		
		for(int i=0 ; i<arr1.length ; i++)
		{
			if(b[i] == false)
			{
				for(int j=0 ; j<arr2.length ; j++)
				{
					if(b[j] == false)
					{
						if(arr1[i] == arr2[j])
						{
							System.out.println(arr1[i]);
							b[i] = true;
							b[j] = true;
							break;
						}
					}
				}
			}
		}
	}
}
