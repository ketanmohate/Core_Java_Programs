package com.java;

/*Write a C program to check whether a character is uppercase or lowercase alphabet.*/
import java.util.*;
public class CheckUpeerOrLovercase
{
	public static void main(String x[])
	{
		char ch;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Charactor:");
		ch = scan.next().charAt(0);
		String check = (ch >= 'A' && ch <= 'Z') ? "It is Uppercase" : (ch >= 'a' && ch <= 'z') ? "IT is Lovercase":"Not a letter";
		System.out.println(check);
	}
}