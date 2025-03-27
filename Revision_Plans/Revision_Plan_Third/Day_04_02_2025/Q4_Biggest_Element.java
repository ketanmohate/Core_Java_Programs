package Day_04_02_2025;

/*
 Q4. Create a class Biggest that contains a single-dimensional array as a data member and a 
 method display() to find and display the largest element of the array.
 */

import java.util.*;

class Biggest
{
	int[] arr;
	
	Biggest(int[] arr)
	{
		this.arr=arr;
	}
	
	void display()
	{
//		for(int i=0 ; i<arr.length;i++)
//		{
//			for(int j=(i+1) ;j<arr.length; j++)
//			{
//				if(arr[i] < arr[j])
//				{
//					int temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
//		
//		System.out.println("Biggest Element is:\t" + arr[0]);
		
		
		// method 2
		int max = arr[0]; // Assume first element is the largest
		for(int i=1 ; i<arr.length ; i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		System.out.println("Biggest Element is:\t" + max);
	}
}

public class Q4_Biggest_Element 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Size Of Array");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter Array Elements");
		for(int i=0 ; i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		Biggest b = new Biggest(arr);
		b.display();
	}
}
