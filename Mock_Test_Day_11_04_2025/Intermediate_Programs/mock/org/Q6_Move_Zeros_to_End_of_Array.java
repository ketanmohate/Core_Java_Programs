package mock.org;

import java.util.Scanner;

/*
 6. Move Zeros to End of Array
Description: Move all zero elements of an array to the end while maintaining the order of other elements.

Input: [0, 1, 2, 0, 3, 4]
0
1
2
0
3
4

Output: [1, 2, 3, 4, 0, 0]
 */

public class Q6_Move_Zeros_to_End_of_Array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size");
		int size = sc.nextInt();
		
		int [] arr = new int[size];
		
		System.out.println("Enter the value");
		for(int i=0 ; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i] == 0)
			{
				int temp = arr[i];
				
				for (int j = i; j < arr.length-1; j++) 
				{
					arr[j] = arr[j+1];	
				}
				arr[arr.length-1] = temp;
			}
		}
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println(arr[i]);
		}
	}

}
