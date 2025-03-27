package Array.pdf;

/* 10)	Write a program in C to separate odd and even integers in separate arrays ? */

import java.util.*;

public class Q10_Separate_Odd_And_Even_Array {
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
		
		int evenCount = 0;
		int oddCount = 0;
		
		for(int i = 0 ; i<arr.length ;i++)
		{
			if(arr[i]%2 == 0)
			{
				evenCount++;
			}
			else
			{
				oddCount++;
			}
		}
		
		int[] even = new int[evenCount];
		int[] odd = new int[oddCount];
		
		int k = 0;
		int m = 0;
		for(int i = 0 ; i<arr.length ;i++)
		{
			if(arr[i]%2 == 0)
			{
				even[k++] = arr[i];
			}
			else
			{
				odd[m++] = arr[i];
			}
		}
		
		System.out.println("Show Even Array Elements");
		for(int i=0 ; i<even.length ; i++)
		{
			System.out.print(even[i] +" ");
		}
		
		System.out.println("");
		
		System.out.println("Show Odd Array Elements");
		for(int i=0 ; i<odd.length ; i++)
		{
			System.out.print(odd[i] +" ");
		}
	}
}
