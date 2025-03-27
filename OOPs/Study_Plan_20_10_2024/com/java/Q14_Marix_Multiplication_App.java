package com.java;

/*
 14).WAP to create the class name as MarixMultiplication with a following methods 
 */

import java.util.*;

class MarixMultiplication
{
	int arr[][];
	
	void acceptTowDArray(int arr[][])
	{
		this.arr=arr;
	}
	
	void showMarixMultiplication()
	{
		System.out.println("Multiplication of Matrix:");
		
		long mul=1;
		for(int i=0;i<arr.length;i++)
		{	
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
				mul = mul * arr[i][j];
			}
			System.out.println("");
		}
		System.out.print("\t="+mul);
	}
}

public class Q14_Marix_Multiplication_App 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of row");
		int row=sc.nextInt();
		
		System.out.println("Enter the size of Column");
		int column=sc.nextInt();
		
		int arr[][] = new int[row][column];
		
		System.out.println("Enter the value of matrix");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
			System.out.println("");
		}
		
		MarixMultiplication objMarixMultiplication = new MarixMultiplication();
		objMarixMultiplication.acceptTowDArray(arr);
		objMarixMultiplication.showMarixMultiplication();
	}

}
