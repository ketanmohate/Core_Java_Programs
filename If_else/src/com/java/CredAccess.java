package com.java;

import java.util.Scanner;

public class CredAccess	
{
	public static void main(String[] args) 
	{
		int creditScore;
        	Scanner scanner = new Scanner(System.in);
        	System.out.print("Enter your credit score: ");
        	creditScore = scanner.nextInt();
        	if (creditScore >= 750) 
		{
			System.out.println("YES");
		} 
		else 
		{
			System.out.println("NO");
		}
	}
}