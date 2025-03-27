package Array.pdf;
	
/*3)	WAP to enter the five elements in array and find out the maximum and minimum elements */

import java.util.*;

public class Q3_Find_Max_And_Min_In_Array {
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
		
		int min = arr[0];
		int max = arr[0];
		
		for(int i=0 ; i<arr.length ; i++)
		{
			if(arr[i] < min)
			{
				min = arr[i];
			}
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		System.out.println("Min Value is:\t" + min);
		System.out.println("Max Value is:\t" + max);
	}
}
