package com.java;

/*Write a java program swap two number without using third variable.*/
import java.util.*;
public class SwapWithiutThirdVariable
{
	public static void main(String x[])
	{
		int a,b;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Tow number:");
		a = scan.nextInt();	
		b = scan.nextInt();
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After swaping :");
		System.out.println(a);
		System.out.println(b);
	}
}