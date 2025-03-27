package Assignment_18_09_2024;

/*
 Q.3 WAP to Create a class name as Majority with a parameterised constructor and one function int getMajority( ).
Majority(int [ ])
{
// this constructor can accept the array.
}

int getMajority()
{
//this function can use if it's yes then return 1 otherwise return 0.
}
 */

import java.util.*;

class Majority
{
	int arr[];
	
	public Majority(int arr[])
	{
		this.arr=arr;
	}
	
	public int getMajority()
	{
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i] == arr[j])
				{
					count++;
				}
			}
			if(count > (arr.length/2))
			{
				return arr[i];
			}
		}
		return 0;
	}
}

public class Q3_Majority_App 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of Array");
		int size=sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter the value of array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		Majority obj = new Majority(arr);
		
		if(obj.getMajority() > 0)
		{
			System.out.println("Majority Element:\t"+obj.getMajority());

		}	
		else
		{
			System.out.println("No Majority Element");

		}
	}
}
