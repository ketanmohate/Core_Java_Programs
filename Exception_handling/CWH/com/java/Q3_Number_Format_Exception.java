package com.java;

import java.util.*;

public class Q3_Number_Format_Exception {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String in number format");
		String str = sc.nextLine();
		
		try {
			int num = Integer.parseInt(str);
			System.out.println(num*num);
		}
		catch(NumberFormatException e)
		{
			System.out.println("plz enter a String contion only Digit");
		}
		
		System.out.println("End of Program");

	}

}
