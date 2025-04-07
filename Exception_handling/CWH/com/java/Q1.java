package com.java;

import java.util.*;

public class Q1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter the " + (size + 1) + ("in Array Value"));
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the index to find the value of index");
		int index = sc.nextInt();
		
		try {
			System.out.println("Value");
			System.out.println(arr[index]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Sorry this index does not exist");
//			System.out.println(e);
		}

		
		System.out.println("Array Print");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
