package Array.pdf;

/*8)	WAP to enter the 10 element array and print the occurrence of every element ? */

import java.util.*;

public class Q8_Print_The_Occurrence_Of_Array {
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
		
		boolean[] visited = new boolean[size];
		
		for(int i=0 ; i<arr.length ; i++)
		{	
			if(visited[i] == false)
			{
				int count = 0;
				for(int j=0 ; j<arr.length ; j++)
				{
					if(arr[i] == arr[j])
					{
						count++;
						visited[j] = true;
					}
				}
				System.out.println(arr[i] + "------>" + count);
			}
		}
	}
}
