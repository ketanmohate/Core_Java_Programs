package mock.org;

import java.util.Scanner;

/*
 * 8. Find the Second Largest Element in Array
Description: Find the second largest element in an array.

Input: [10, 20, 30, 40, 50]

Output: 40
 */

public class Q8_Find_the_Second_Largest_Element {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size");
		int size = sc.nextInt();
		
		int [] arr = new int[size];
		
		System.out.println("Enter the value");
		for(int i=0 ; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int firstLargest = arr[0];
		
		for(int i=0 ; i<arr.length ; i++)
		{
			if(firstLargest < arr[i])
			{
				firstLargest = arr[i];
			}
		}
		System.out.println(firstLargest);
		
		int secondLargest = arr[0];
		
		boolean found = false;
		
		for(int i=0 ; i<arr.length ; i++)
		{
			if(arr[i] != firstLargest)
			{
				if(found == false || secondLargest < arr[i])
				{
					secondLargest = arr[i];
					found = true;
				}
			}
		}

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
