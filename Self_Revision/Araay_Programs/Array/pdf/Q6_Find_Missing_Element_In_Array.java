package Array.pdf;

/*
 6)	Write a program to enter the 5 values in ascending order and store in array and 
 find out the missing element from array?
 */

import java.util.*;

public class Q6_Find_Missing_Element_In_Array {
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
		System.out.println("Messing Element");
		for(int i=0 ; i<arr.length-1 ; i++)
		{
			for(int j=arr[i]+1 ; j<arr[i+1] ; j++)
			{
				System.out.println(j);
			}
		}
	}
}
