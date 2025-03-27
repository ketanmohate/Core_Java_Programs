package com.java;

/* Write a java program to calculate simple interest.*/

import java.util.*;
public class SimpleInterest
{
	public static void main (String args[])
	{
		int principle,rate,time;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the principle amunt:");
		principle = scan.nextInt();
		System.out.println("Enter the Interest rate :");
		rate = scan.nextInt();
		System.out.println("Enter the time of periad :");
		time = scan.nextInt();	
		int Interest = (principle * rate * time)/100;
		System.out.println(" The interest is:" + Interest);
	}
}