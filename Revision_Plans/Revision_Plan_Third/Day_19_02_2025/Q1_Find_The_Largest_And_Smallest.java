package Day_19_02_2025;

/*
 Find the largest and smallest element in an array
Write a program to find the maximum and minimum value in an unsorted array.
 */

import java.util.*;

public class Q1_Find_The_Largest_And_Smallest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter the values");
		for(int i=0 ; i<arr.length ; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int min = arr[0];
		int max = arr[0];
		
		for(int i=0 ; i<arr.length ; i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
			if(arr[i] < min)
			{
				min = arr[i];
			}
		}
		
		System.out.println("Largest Element: \t" + max);
		System.out.println("Smalest Element: \t" + min);
	}
}
