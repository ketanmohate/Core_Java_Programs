package com.java;

import java.util.*;
public class AccessCREDapp
{
	public static void main(String args[])
	{
		int userscore ,score=750;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the credit score:");
		userscore = scan.nextInt();
		if(score < userscore)
		{
			System.out.println("YES");
		}
		else if(score > userscore)
		{
			System.out.println("NO");
		}
		else
		{
			System.out.println("YES");
		}
	}
}