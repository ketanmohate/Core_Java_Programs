package Array.pdf;

/*
 * 16)	Write a program in C to find the ceiling in a sorted array?
Given a sorted array in ascending order and a value x, the ceiling of x is the smallest element in array greater than or equal to x, and the floor is the greatest element smaller than or equal to x.
Expected Output :
The given array is : 1 3 4 7 8 9 9 10
The ceiling of 5 is: 7
 */

import java.util.*;

public class Q16_Find_Ceiling_Array {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        // Take the array size as input
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        
        // Create the array and take its elements as input
        int[] arr = new int[n];
        
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++)
        {
            arr[i] = scanner.nextInt();
        }
        
        //sort array
        for(int i=0 ; i<arr.length ; i++)
		{
			for(int j=i+1 ; j<arr.length ; j++)
			{
				if(arr[i] > arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
        
        // Take the target value as input
        System.out.print("Enter the target value: ");
        int target = scanner.nextInt();
        
        int left = 0; 
        int right = arr.length - 1;
        int result = -1;

        // Function to find the ceiling of a given number in a sorted array
        while (left <= right) 
        {
            int mid = left + (right - left) / 2;

            // If the element at mid is equal to the target, return it as the ceiling
            if (arr[mid] == target) 
            {
                result = arr[mid];
                break;
            }
            // If the element at mid is less than the target, move to the right side
            else if (arr[mid] < target) 
            {
                left = mid + 1;
            }
            // If the element at mid is greater than the target, move to the left side
            else 
            {
                result = arr[mid];
                right = mid - 1;
            }
        }

        // Return the ceiling value found
        if (result != -1) 
        {
            System.out.println("The ceiling of " + target + " is: " + result);
        } 
        else 
        {
            System.out.println("No ceiling found.");
        }
    }
}
