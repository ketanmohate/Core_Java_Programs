package com.java;

/*
Write a java program to enter temperature in Celsius and convert it into Fahrenheit.
Formula:
fah (cel9/5) + 32;
*/
import java.util.*;
public class temperatureconvert
{
	public static void main(String args[])
	{
		double fah,cel;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the tempreture in Celsius:");
		cel = scan.nextInt();
		fah=(cel*9/5)+32;
		System.out.println("Convert in to celslus:"+fah);
	}
}
