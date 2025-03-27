package Day_16_02_2025;

/*
Q1. Rotate an array of n elements to the right by k steps. 
For example, with n
= 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
Your Task: You have to create class name as RotateArray with parameterized constructor 
RotateArray(int a[]): this constructor can accept array as parmaeter 
void rotateArray(): this function can rotate array from right hand side to left hand side.
Int [] getResult(): this function can return the resultant array means after rotation of array
 */

import java.util.*;

class RotateArray
{
	Scanner sc = new Scanner(System.in);
	int[] arr;
	
	RotateArray(int[] arr)
	{
		this.arr=arr;
	}
	
	void rotateArray()
	{
		System.out.println("Enter the how Many stap Rotate");
		int nRotation = sc.nextInt();
		
		for(int n = 0 ; n <= nRotation ; n++)
		{
			int temp = arr[0];
			for(int i = 0 ; i < arr.length-1 ; i++)
			{
				{
					arr[i] = arr[i+1];
				}
			}
			arr[arr.length-1] = temp;
		}
		
		System.out.println("print");
		for(int i=0 ; i<arr.length ; i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	int [] getResult()
	{
		return arr;
	}
}

public class Q1_Rotate_Array_App 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter the values");
		for(int i=0 ; i<arr.length ; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		RotateArray ra = new RotateArray(arr);
		ra.rotateArray();
		
		System.out.println("After Rotate Array");
		for(int i=0 ; i<ra.getResult().length ; i++)
		{
			System.out.println(ra.getResult()[i]);
		}
	}
}
