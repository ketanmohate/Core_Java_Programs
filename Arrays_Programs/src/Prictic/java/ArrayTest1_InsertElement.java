package Prictic.java;
/* 4) WAP to insert the element on specified position in array ?
e.g. declare the array of size 6 and store 5 values in it and last block should be empty
 a[0] a[1] a[2] a[3] a[4] a[5]
10 20 30 40 50
Enter the index on which value want to be insert 
e.g. index = 2 
Enter the value which want to store on index 
Value = 100
When we insert the value on index then we need to shift the values from index to next index
e.g.
a[0] a[1] a[2] a[3] a[4]
5 9 11 4 6
10 20 100 30 40 50 */

import java.util.*;

public class ArrayTest1_InsertElement
{
	public static void main(String arga[])
	{
		Scanner sc = new Scanner(System.in);
		
		int a[]	= new int[6];
		
		System.out.println("Enter the value ");
		
		for(int i = 0 ; i < 5 ; i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("Insert value of 2nd Position");
		
		for(int i = a.length-1 ; i >= 3 ; i--)
		{
			a[i] = a[i-1];
		}
		a[2] = 100;
		
		for(int i = 0 ; i < a.length ; i++)
		{
			System.out.println(a[i]);
		}
	}
}