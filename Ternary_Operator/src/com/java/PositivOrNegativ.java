/*Write a Java program check whether number is positive , negative or zero.*/
package com.java;
import java.util.*;
public class PositivOrNegativ {
	public static void main(String []x)
	{
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number :");
		num = scan.nextInt();
		String result = (num > 0) ? "Number is positive" : (num < 0) ? "Number is negative" : "Number is Zero";
		System.out.println(result);
	}
}
