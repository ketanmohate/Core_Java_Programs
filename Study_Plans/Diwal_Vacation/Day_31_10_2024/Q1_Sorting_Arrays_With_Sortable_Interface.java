package Day_31_10_2024;

/*
 * Q1. Sorting Arrays with Sortable Interface 
 
Objective: Implement an interface and two classes to sort arrays of integers and strings. 
Requirements: 
Define an Interface: 
Create an interface named Sortable with a method sort(). 
Implementing Classes: 
Create a class named IntegerArray that: 
Contains a private array of integers. 
Implements the Sortable interface and provides the implementation for the sort() method 
to sort the integer array in ascending order. 
Includes a method printArray() to display the contents of the integer array. 
Create a class named StringArray that: 
Contains a private array of strings. 
Implements the Sortable interface and provides the implementation for the sort() method 
to sort the string array in alphabetical order. 
Includes a method printArray() to display the contents of the string array. 
Demonstration: 
In the main method of a separate class, create an instance of IntegerArray with an array of 
integers. 
Create an instance of StringArray with an array of strings. 
Call the sort() method on both instances to sort the arrays. 
Print the sorted arrays using the printArray() method. 
Expected Output: 
The program should display the sorted integer and string arrays when executed. For 
example: 
Sorted Integer Array: [1, 2, 3, 5, 8] 
Sorted String Array: [apple, banana, kiwi, orange] 
 */

import java.util.*;

interface Sortable
{
	void sort();
}

class IntegerArray implements Sortable
{
	private int[] arrInt;
	
	IntegerArray(int arrInt[])
	{
		this.arrInt=arrInt;
	}
	
	public void sort()
	{
		for(int i=0 ; i<arrInt.length ; i++)
		{
			for(int j= i+1 ; j<arrInt.length ; j++)
			{
				if(arrInt[i] > arrInt[j])
				{
					int temp = arrInt[i];
					arrInt[i] = arrInt[j];
					arrInt[j] = temp;
				}
			}
		}
	}
	
	void printArray()
	{
		System.out.println("Sorted Integer Array:-");
		for(int i=0 ; i<arrInt.length ; i++)
		{
			System.out.print(arrInt[i] +" ");
		}
		System.out.println();
	}
}

class StringArray implements Sortable
{
	private String[] arrStr;
	
	StringArray(String[] arrCh)
	{
		this.arrStr = arrCh;
	}
	
	public void sort()
	{
		for(int i=0 ; i<arrStr.length-1 ; i++)
		{
			for(int j=0 ; j<arrStr.length -1 -i ; j++)
			{

				if(arrStr[j].compareTo(arrStr[j + 1]) > 0)
				{
					String temp = arrStr[j];
					arrStr[j] = arrStr[j +1];
					arrStr[j + 1] = temp;
				}
			}
		}
	}
	void printArray()
	{
		System.out.println("Sorted Charector Array:-");
		for(int i=0 ; i<arrStr.length ; i++)
		{
			System.out.print(arrStr[i] + " ");
		}
	}
}

public class Q1_Sorting_Arrays_With_Sortable_Interface 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of Interger Array");
		int sizeOfInt = sc.nextInt();
		
		int arrInt[] = new int[sizeOfInt];
		
		System.out.println("Enter the value of Array:");
		for(int i=0 ; i<arrInt.length ; i++)
		{
			arrInt[i] = sc.nextInt();
		}
		
		System.out.println("Enter the size of String Array");
		int sizeOfStr = sc.nextInt();
		
		String arrStr[] = new String[sizeOfStr];
		
		System.out.println("Enter the value of Array:");
		for(int i=0 ; i<arrStr.length ; i++)
		{
			arrStr[i] = sc.nextLine();
		}
		
		IntegerArray i = new IntegerArray(arrInt);
		
		StringArray s = new StringArray(arrStr);
	
		i.sort();
		i.printArray();
		
		s.sort();
		s.printArray();
	}

}

