package com.java;

import java.util.*;

public class Q5_Finally_Block {

	public static int calDiv(int num1, int num2)
	{
		try {
			int dev = num1 / num2;
			return dev;
		}
		catch(Exception e){
			System.out.println("Error is" + e);
		}
		finally {
			System.out.println("Method end");
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Tow Numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println(calDiv(num1, num2));
	}

}
