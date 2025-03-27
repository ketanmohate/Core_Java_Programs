package com.java;

/*Write a java program to Input any alphabet and check whether it is vowel or consonant.*/
import java.util.*;
public class VowelsANDConsonat
{
	public static void main(String args[])
	{
		char ch;
		String result;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a charactor");
		ch = scan.nextLine().charAt(0);
		result = (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')?"It is vowels":"It is consonat";
		System.out.println(result);
	}
}