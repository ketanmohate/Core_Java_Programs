package com.java;

/*
Write a C program to enter temperature In Fahronhelt and convert to Colslus.
Formula:-
cel (fah-32)*5/9
*/

import java.util.*;
public class CovertTemperatureCel
{
	public static void main(String args[])
	{
		double fah,cel;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the tempreture");
		fah = scan.nextInt();
		cel=(fah-32)*5/9;
		System.out.println("Convert in to celslus:"+cel);
	}
}