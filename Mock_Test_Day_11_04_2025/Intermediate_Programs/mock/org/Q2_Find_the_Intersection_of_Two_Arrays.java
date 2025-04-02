package mock.org;

/*
 * 2. Find the Intersection of Two Arrays
Description: Write a program to find the common elements in two arrays.

Input: [1, 2, 2, 1], [2, 2]

Output: [2, 2]
 */

import java.util.*;

public class Q2_Find_the_Intersection_of_Two_Arrays {

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
		
		boolean[] visited = new boolean[size2];
		
		for (int i = 0; i < arr1.length; i++) 
		{
			for (int j = 0; j < arr2.length; j++) 
			{
				if(visited[j]==false && arr1[i] == arr2[j])
				{
					System.out.print(arr1[i] +" ");
					visited[j] = true; 
					break;
				}
			
			}
		}
				
	}

}
