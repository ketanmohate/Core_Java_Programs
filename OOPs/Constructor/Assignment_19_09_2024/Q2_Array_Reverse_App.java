package Assignment_19_09_2024;

import java.util.*;

class Array_Reverse
{
	Array_Reverse(int arr[])
	{
		for(int i=0 ; i<(arr.length/2) ; i++)
		{
			int temp=arr[i];
		 	arr[i]=arr[i+1];
		 	arr[i+1]=temp;
		}
	}
	
	Array_Reverse(String arr[])
	{
		//  perform string reverse logic.
	}

}

public class Q2_Array_Reverse_App 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter The Size Of Integer Array");
		int intSize=sc.nextInt();
		
		int intArr[] = new int[intSize];
		
		for(int i=0;i<intArr.length;i++)
		{
			intArr[i]=sc.nextInt();
		}
		
		System.out.println("Enter The Size Of String Array");
		int strSize=sc.nextInt();
		
		String strArr[] = new String[strSize];
		
		for(int i=0;i<strArr.length;i++)
		{
			strArr[i]=sc.nextLine();
		}
		
		Array_Reverse obj1 = new Array_Reverse(intArr);
		Array_Reverse obj2 = new Array_Reverse(strArr);		
	}

}
