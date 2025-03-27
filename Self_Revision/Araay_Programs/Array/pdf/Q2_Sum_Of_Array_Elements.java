package Array.pdf;

/*2)	WAP to enter the five elements in array and calculate the sum of all elements */

import java.util.*;

public class Q2_Sum_Of_Array_Elements {
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
		
		int sum = 0;
		for(int i=0 ; i<arr.length ; i++)
		{
			sum = sum + arr[i];
		}
		System.out.println("Sum Is:\t" + sum);
	}
}
