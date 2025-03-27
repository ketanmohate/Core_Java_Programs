package Array.pdf;

/*7).WAP to enter the five element in array and reverse it ? */

import java.util.*;

public class Q7_Array_Reverce_It {
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
		
		int n = arr.length;
		for(int i=0 ; i<arr.length/2 ; i++)
		{
			int temp = arr[i];
			arr[i] = arr[n - 1 - i];
			arr[n - 1 - i] = temp;
		}
		
		System.out.println("Reverce Array");
		for(int i=0 ; i<arr.length ; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}
