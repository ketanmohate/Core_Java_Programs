package Day_11_01_2025;

import java.util.*;

public class Q3_Move_All_Zeros_To_End_Of_Array 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size:");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter the Array Element");
		for(int i=0 ; i<arr.length ; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		for(int i=0 ; i<arr.length ; i++)
		{
			for(int j=i+1 ; j<arr.length ; j++)
			{
				if(arr[i] == 0)
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("Print Array");
		for(int i=0 ; i<arr.length ; i++)
		{
			System.out.println(arr[i]);
		}
	}

}
