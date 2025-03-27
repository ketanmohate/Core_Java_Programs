package Array.pdf;

/*
 * 15)	Write a program in C to rotate an array by N positions ?
Expected Output :
The given array is : 0 3 6 9 12 14 18 20 22 25 27
From 4th position the values of the array are : 12 14 18 20 22 25 27 Before 4th position the values of the array are : 0 3 6 9
After rotating from 4th position the array is:
12 14 18 20 22 25 27 0 3 6 9
 */

import java.util.*;

public class Q15_Rotate_An_Array {
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
		
		System.out.println("Enter the Position");
		int posi = sc.nextInt();
		
        // Handle large values of posi
//        posi = posi % size;
		
		for(int i=0 ; i<posi ; i++)
		{
			int temp = arr[0];
			for(int j=0 ; j<arr.length-1 ; j++)
			{
				arr[j] = arr[j+1];
			}
			arr[arr.length-1] = temp;
		}
		
		System.out.println("Show Roted Array Elements");
		for(int i=0 ; i<arr.length ; i++)
		{
			System.out.print(arr[i] +" ");
		}
	}
}
