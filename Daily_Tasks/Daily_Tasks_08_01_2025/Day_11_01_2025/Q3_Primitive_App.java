package Day_11_01_2025;

import java.util.*;

/*
 * Q3. Create a method that accepts an array of primitive int values and returns an array 
	of Integer objects.
	Input: {1, 2, 3, 4}
	Output: [1, 2, 3, 4] (Wrapper class array)
 */

public class Q3_Primitive_App 
{
	public static void main(String[] args) 
	{
		int arr[] = {1, 2, 3, 4};
		
		Integer a[] = new Integer[arr.length];
		
		for(int i=0 ; i<arr.length ; i++)
		{
			a[i]=arr[i];
		}
		
		System.out.println("Primitive Array: " + Arrays.toString(arr));
        System.out.println("Wrapper Array: " + Arrays.toString(a));
		
	}

}
