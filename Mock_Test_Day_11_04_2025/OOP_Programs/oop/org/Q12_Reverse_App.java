package oop.org;
/*
 * 
Q12. Write a java program to create class name ReverseApp using constructor name as :

	ReverseApp(int [ ])
	{
		//  perform integer reverse array logic.
	}
	
	ReverseApp(String )
	{
		//  perform string reverse logic.
	}
 */

import java.util.*;

class ReverseApp
{
	ReverseApp(int[] arr)
	{
		for (int i = 0; i < arr.length/2; i++) 
		{
			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length -1 -i] = temp;
		}
		
		System.out.println("Reverse Array");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	ReverseApp(String str)
	{
		String newStr = "";
		
		for (int i = 0; i < str.length(); i++) 
		{
			char ch = str.charAt(i);
			
			newStr = ch + newStr;
		}
		System.out.println("Reverse String");
		System.out.println(newStr);
	}
}

public class Q12_Reverse_App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter the value");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		sc.nextLine();
		
		System.out.println("Enter the String");
		String str = sc.nextLine();
		
		ReverseApp revApp = new ReverseApp(arr);
		
		revApp = new ReverseApp(str);
	}

}
