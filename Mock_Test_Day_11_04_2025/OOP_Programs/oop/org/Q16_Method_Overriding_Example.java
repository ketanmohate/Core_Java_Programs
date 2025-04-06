package oop.org;

/*
 * Q16. Write Program to perform method overriding you have to create class name as ArrParent with method
void setValue(int arr[]): this method can accept array as parameter
void arrangeSeq(): this method can display array as per user input sequence You have to create two child 
class name as ArrangeAscendingOrder and you have to inherit ArrParent class in it and override arrangeSeq() 
method in ArrangeAscendingOrder and sort array and display in ascending order and you have to 
create one more class name ReverseArray and override arrangeSeq() method from ArrParent 
 reverse array and display it.
 */

import java.util.*;

class ArrParent 
{
	int arr[];
	void setValue(int arr[])
	{
		this.arr = arr;
	}
	
	void arrangeSeq() 
	{
		
	}
}

class ArrangeAscendingOrder extends ArrParent
{
	void arrangeSeq()
	{		
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = i+1; j < arr.length; j++) 
			{
				if(arr[i] > arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Array Sort in Assending Order");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}

class ReverseArray extends ArrParent
{
	void arrangeSeq()
	{
		for (int i = 0; i < arr.length/2; i++) 
		{
			int temp = arr[i];
			arr[i] = arr[arr.length -1 -i];
			arr[arr.length -1 - i] = temp;
		}
		System.out.println("Reverse Array");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}

public class Q16_Method_Overriding_Example {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of Array");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter the Values");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		ArrParent arrParent = new ArrParent();
	
		
		do {
			System.out.println("====================================================");
			System.out.println("Menu");
			System.out.println("====================================================");
			
			System.out.println("Case 1: Ascending Order");
			System.out.println("Case 2: Reverse Array");
			System.out.println("Case 3: exit");
			System.out.println("-----------------------------------------------------");
			System.out.println("Enter the choice");
			int choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
					arrParent = new ArrangeAscendingOrder();
					arrParent.setValue(arr);
					arrParent.arrangeSeq();
					break;
					
				case 2:
					arrParent = new ReverseArray();
					arrParent.setValue(arr);
					arrParent.arrangeSeq();
					break;
					
				case 3:
					System.exit(0);
					
				default :
					System.out.println("Invalid inpute");
					
			}
			
		}while(true);
		
	}

}
