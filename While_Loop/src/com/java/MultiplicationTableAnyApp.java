package com.java;
/* 9. Write a Java program to print multiplication table of any number.*/
	
import java.util.*;

public class MultiplicationTableAnyApp
{
	public static void main(String args[])
	{
		int num;
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Enter the number:");
		num = scan.nextInt();
	
		int i = 1;

		System.out.println("Multiplication Table Of :" + num);

		while(i <= 10)
		{
			System.out.println(num + " * " + i + " = " + num * i);
			i++;
		}
	}
}	