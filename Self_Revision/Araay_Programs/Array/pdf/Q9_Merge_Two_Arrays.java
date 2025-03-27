package Array.pdf;

/* 9)	. Write a program in C to merge two arrays of same size sorted in decending order. */

import java.util.*;

public class Q9_Merge_Two_Arrays {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of first Array");
		int size1 = sc.nextInt();
		
		int[] arr1 = new int[size1];
		
		System.out.println("Enter the Elements");
		for(int i=0 ; i<arr1.length ; i++)
		{
			arr1[i] = sc.nextInt();
		}
		
		System.out.println("Enter the size of Secound Array");
		int size2 = sc.nextInt();
		
		int[] arr2 = new int[size2];
		
		System.out.println("Enter the Elements");
		for(int i=0 ; i<arr2.length ; i++)
		{
			arr2[i] = sc.nextInt();
		}
		
		int size = size1 + size2;
		
		int[] merge = new int[size];
		
		int k=0;
		for(int i=0 ; i<arr1.length ; i++)
		{
			merge[k++] = arr1[i];
		}
		for(int i=0 ; i<arr2.length ; i++)
		{
			merge[k++] = arr2[i];
		}
		
		for(int i=0 ; i<merge.length ; i++)
		{
			for(int j=i+1 ;j<merge.length ; j++)
			{
				if(merge[i] < merge[j])
				{
					int temp = merge[i];
					merge[i] = merge[j];
					merge[j] = temp;
				}
			}
		}
		
		System.out.println("Marge Array in decending Order");
		for(int i=0 ; i<merge.length ; i++)
		{
			System.out.print(merge[i] +" ");
		}
	}
}
