package Array.pdf;

/*
 * 13)	 Write a program in C to find a pair with given sum in the array.
Expected Output :
The given array : 6 8 4 -5 7 9 The given sum : 15
Pair of elements can make the given sum by the value of index 0 and 5
 */

import java.util.*;

public class Q13_Find_A_Pair_With_Given_Sum_In_The_Array {
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
		
		System.out.println("Enter the Given Sum");
		int sum = sc.nextInt();
		
		System.out.println("Pair Of Indexs Is");
		boolean flag = false;
		
		for(int i=0 ; i<arr.length ; i++)
		{
			for(int j=i+1 ;j<arr.length ; j++)
			{
				if(arr[i] + arr[j] == sum)
				{
					System.out.println(i + " and " + j);
				}
				else
				{
					flag = true;
				}
			}
		}
		if(flag)
		{
			System.out.println("No Any Pair");
		}
	}
}
