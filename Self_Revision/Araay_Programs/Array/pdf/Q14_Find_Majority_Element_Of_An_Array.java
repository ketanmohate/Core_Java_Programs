package Array.pdf;

/*
 * 14)	Write a program in C to find the majority element of an array ?
A majority element in an array A[] of size n is an element that appears more than n/2 times (and hence there is at most one such element).
Expected Output :
The given array is : 4 8 4 6 7 4 4 8
There are no Majority Elements in the given array.
 */

import java.util.*;

public class Q14_Find_Majority_Element_Of_An_Array {
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
		
		int n = arr.length/2; 
		int count = 0;
		
		boolean flag = false;
		
		for(int i=0 ; i<arr.length ; i++)
		{
			count = 0;
			for(int j=0 ; j<arr.length ; j++)
			{
				if(arr[i] == arr[j])
				{
					count++;
				}
			}
			if(count>n)
			{
				System.out.println("Majority Is:-");
				System.out.println(arr[i]);
				flag = false;
				break;
			}
			else
			{
				flag = true;
			}
		}
		if(flag)
		{
			System.out.println("no Majority Elements in the given array");
		}
	}
}
