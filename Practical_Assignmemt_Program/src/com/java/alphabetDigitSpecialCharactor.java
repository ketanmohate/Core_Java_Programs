package com.java;

/*Write a java program to Input any character and check whether it is alphabet, digit or special character.*/
import java.util.*;
public class alphabetDigitSpecialCharactor
{
	public static void main(String args[])
	{
		//String ch,digit;
		char ch;
		String 	result;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the alphabet digit specialchar:");
		ch = scan.nextLine().charAt(0);
		result = (ch>='a' && ch<='z')?((ch=='1'||ch=='2'||ch=='3'||ch=='4'||ch=='5'||ch=='6'||ch=='7'||ch=='8'||ch=='9'||ch=='0')?"it is charactor":"it is Digit"):"it is special charactor";
		System.out.println(result);
	}
}