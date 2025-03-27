package Array.pdf;

/*1)	WAP to enter the five elements in array and show it*/

import java.util.*;

public class Q1_Show_Array_Elements {
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
		
		System.out.println("Show Array Elements");
		for(int i=0 ; i<arr.length ; i++)
		{
			System.out.print(arr[i] +" ");
		}
	}
}
