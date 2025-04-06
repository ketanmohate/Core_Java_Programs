package mock.org;

/*
 * 
19. Find the Longest Consecutive Sequence
Description: Find the length of the longest consecutive elements sequence.

Input: [100, 4, 200, 1, 3, 2]

Output: 4
 */

import java.util.*;

public class Q19_Find_the_Longest_Consecutive_Sequence {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size");
		int size = sc.nextInt();
		
		int [] arr = new int[size];
		
		System.out.println("Enter the value");
		for(int i=0 ; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}	
		
		Arrays.sort(arr);
				
		int count = 1;
		int pervCount = 1;
		
		for (int i = 0; i < arr.length-1; i++) 
		{
			if(arr[i] == arr[i+1])
			{
				continue;
			}
			
			else if(arr[i]+1 == arr[i+1])
			{
				count++;
			}
			else
			{
				if(count > pervCount)
				{
					pervCount = count;
				}
				count = 1;
			}
		}
		
		if(count > pervCount)
		{
			pervCount = count;
		}
		
		System.out.println(pervCount);
	}

}
