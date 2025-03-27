package Array.pdf;

import java.util.Scanner;

/*
  19)	Write a program in C to print next greater elements in a given unsorted array. 
  Elements for which no greater element exist, consider next greater element as -1.
Expected Output :
The given array is : 5 3 10 9 6 13 Next Bigger Elements are:
Next bigger element of 5 in the array is: 10 
Next bigger element of 3 in the array is: 10 
Next bigger element of 10 in the array is: 13 
Next bigger element of 9 in the array is: 13 
Next bigger element of 6 in the array is: 13 
Next bigger element of 13 in the array is: -1 
Next Bigger Elements Array:
10 10 13 13 13 -1
 */

public class Q19_Print_Next_Greater_Elements {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of Array");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter the Elements");
		for(int i=0 ; i<arr.length ; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int[] result = new int[size];
		
		for(int i=0 ; i<arr.length ; i++)
		{
			int nextGreater = -1; 
			for(int j=i+1 ; j<arr.length ; j++)
			{
				if(arr[i] < arr[j])
				{
					nextGreater = arr[j];
					break;
				}
			}
			result[i] = nextGreater;
		}
		System.out.println("\nNext Bigger Elements are:");
		for (int i = 0; i < size; i++) 
		{
			System.out.println("Next bigger element of " + arr[i] + " in the array is: " + result[i]);
		}

		System.out.println("Next Bigger Elements Array:");
		for (int num : result) 
		{
			System.out.print(num + " ");
		}
	}
}
