package Day_19_02_2025;

/*
 Sum of elements in an array
Calculate the sum of all elements in the array.
 */

import java.util.*;

public class Q4_Sum_Of_Elements {
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
		
		int sum = 0 ;
		for(int i=0 ; i<arr.length ; i++)
		{
			sum = sum + arr[i];
		}
		System.out.println("Sum Is\t " + sum); 
		
	}
}
