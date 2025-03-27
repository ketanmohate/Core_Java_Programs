package Day_19_02_2025;

/*
 Reverse an array
Reverse the elements of an array in place
 */

import java.util.*;

public class Q2_Reverse_An_Array {
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
		
		int n = arr.length;
		
		for(int i=0 ; i<arr.length/2 ; i++)
		{
			int temp = arr[i];
			arr[i] = arr[n - i -1]; 
			arr[n - i -1] = temp;
		}
		
		System.out.println("Reverse Array");
		for(int i=0 ; i<arr.length ; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}
