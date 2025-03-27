package Array.pdf;

import java.util.*;

/*
 * 18)	Write a program in C to find the smallest missing element from a sorted array?
Expected Output :
The given array is : 0 1 3 4 5 6 7 9 The missing smallest element is: 2
 */

public class Q18_Find_The_Smallest_Missing_Element {
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

        boolean found = false;
		for(int i=0 ; i<arr.length-1 ; i++)
		{
			for(int j=arr[i]+1 ; j<arr[i+1] ; j++)
			{
				System.out.println(j);
				found = true;
//				break;
			}
			if(found == true)
			{
				break;
			}
		}
	}
}
