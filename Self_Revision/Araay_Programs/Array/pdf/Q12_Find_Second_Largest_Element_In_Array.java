package Array.pdf;

/* 12)	Write a program in C to find the second largest element in an array ? */

import java.util.*;

public class Q12_Find_Second_Largest_Element_In_Array {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of Array");
		int size = sc.nextInt();
		
        if (size < 2) 
        {
            System.out.println("Array must have at least two elements.");
        }
		
		int[] arr = new int[size];
		
		System.out.println("Enter the Elements");
		for(int i=0 ; i<arr.length ; i++)
		{
			arr[i] = sc.nextInt();
		}

        int firstLargest = arr[0];

        // Finding the maximum element first
        for (int i = 1; i < size; i++) 
        {
            if (arr[i] > firstLargest) 
            {
                firstLargest = arr[i];
            }
        }

        // Finding the second largest element
        
        int secondLargest = arr[0];
        
        boolean found = false;
        
        for (int i = 0; i < size; i++) 
        {
            if (arr[i] != firstLargest) 
            {
                if (!found || arr[i] > secondLargest) 
                {
                    secondLargest = arr[i];
                    found = true;
                }
            }
        }

        // Checking if a second largest element exists
        if (!found) 
        {
            System.out.println("No second largest element found.");
        } 
        else 
        {
            System.out.println("The second largest element is: " + secondLargest);
        }
	}
}
