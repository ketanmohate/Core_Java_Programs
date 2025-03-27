package Array.pdf;

/* 11)	Write a program in C to delete an element at desired position from an array. */

import java.util.*;

public class Q11_Delete_An_Element_At_Desired_Position {
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
	        
		System.out.print("Enter the position (0-based index): ");
		int position = sc.nextInt();
		
        if (position < 1 || position > size) 
        {
            System.out.println("Invalid position!" + size);
        }
        else
        {
        	for(int i=position ; i<arr.length-1 ; i++)
    		{
    			arr[i] = arr[i+1];
    		}
        }
		
		System.out.println("Show Array Elements");
		for(int i=0 ; i<arr.length-1 ; i++)
		{
			System.out.print(arr[i] +" ");
		}
	}
}
