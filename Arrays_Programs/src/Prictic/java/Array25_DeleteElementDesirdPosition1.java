package Prictic.java;

import java.util.Scanner;

/* 10). Write a program in java to delete an element at desired position from an array.
Test Data :
Input the size of array : 5
Input 5 elements in the array in ascending order:
element - 0 : 1
element - 1 : 2
element - 2 : 3
element - 3 : 4
element - 4 : 5
Input the position where to delete: 3
Expected Output :
The new list is : 1 2 4 5
*/

public class Array25_DeleteElementDesirdPosition1 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Eneter the Array Element");
		int a[] = new int[5];
		
		for(int i = 0 ; i < a.length ; i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("The new list is :");
		
		for(int i = 0 ; i < a.length ; i++)
		{
            if (a[i] == a[2]) 
            { 
                continue; 
            } 
            else
            {
            	System.out.println(a[i]);
            }
		}	

	}

}
