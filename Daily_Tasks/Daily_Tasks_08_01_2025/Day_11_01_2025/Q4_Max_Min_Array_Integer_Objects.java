package Day_11_01_2025;

/*
 * Q4. Write a program to find the maximum and minimum numbers in an array of Integer objects.
	Input: {12, 4, 56, 8, 3}
	Output: Max = 56, Min = 3
 */

import java.util.*;

public class Q4_Max_Min_Array_Integer_Objects 
{
	public static void main(String[] args) 
	{
		Integer[] arr = {12, 4, 56, 8, 3};
		
		int min=arr[0];
		int max=arr[0];
		
		for(int i=0 ; i<arr.length ; i++)
		{
			if(arr[i] > max)
			{
				max=arr[i];
			}
			if(arr[i] < min)
			{
				min=arr[i];
			}
		}
		
		System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
	}

}
