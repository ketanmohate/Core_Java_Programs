package com.java;

/* Write a C program swap two number using third variable.*/
import java.util.*;
public class Swapnumber
{
	public static void main(String []x)
	{
		int a,b,c;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the two number");
		a = scan.nextInt();
		b = scan.nextInt();
		c = a;
		a = b;
		b = c;
		System.out.println("After swaping");
		System.out.println(a);
		System.out.println(b);
	}
}