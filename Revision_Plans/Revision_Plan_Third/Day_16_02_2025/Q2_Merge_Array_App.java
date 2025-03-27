package Day_16_02_2025;

/*
 Q2. Merge Sorted Array
Problem: Given two sorted integer arrays A and B, merge B into A as one sorted array. Note: You may assume that A has enough space to hold additional elements from B. The number of elements initialized in A and B are m and n respectively. 
Your Task 
__________________________________________________________
You have to create class name as MergeSorted Array with parameterized constructor 
MergeSorted(int a[],int b[]): this constructor can accept the two array as parameter
void merge(): this function can write the merging logics 
int [] getMergedArray(): this function can merge and return the resultant array.
 */

import java.util.*;

class MergeSorted
{
	int arr1[];
	int arr2[];
	int mergeArr[];
	int sum=0;
	
	MergeSorted(int arr1[], int arr2[])
	{
		this.arr1=arr1;
		this.arr2=arr2;
	}
	
	void merge()
	{
		sum = arr1.length + arr2.length;
		
		mergeArr = new int[sum];
		
		int k=0;
		for(int i=0 ; i<arr1.length ; i++)
		{
			mergeArr[k++] = arr1[i]; 
		}
		
		for(int i=0 ; i<arr2.length ; i++)
		{
			mergeArr[k++] = arr2[i];
		}
	}
	
	int [] getMergedArray()
	{
		return mergeArr;
	}
}

public class Q2_Merge_Array_App 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of first Array");
		int size1 = sc.nextInt();
		
		int arr1[] = new int[size1];
		
		System.out.println("Enter the Values");
		for(int i=0 ; i<arr1.length ; i++)
		{
			arr1[i] = sc.nextInt();
		}
		
		System.out.println("Enter the size of secound Array");
		int size2 = sc.nextInt();
		
		int arr2[] = new int [size2];
		
		System.out.println("Enter the Values");
		for(int i=0 ; i<arr2.length ; i++)
		{
			arr2[i] = sc.nextInt();
		}
		
		MergeSorted ms = new MergeSorted(arr1 , arr2);
		ms.merge();
		
		System.out.println("Marge Array");
		for(int i=0 ; i<ms.getMergedArray().length ; i++)
		{
			System.out.println(ms.getMergedArray()[i]);
		}
 	}
}
