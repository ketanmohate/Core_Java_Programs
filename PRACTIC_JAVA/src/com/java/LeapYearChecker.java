package com.java;

/*Write a java program to check whether a year is leap year or not.*/
import java.util.Scanner;
public class LeapYearChecker 
{
    public static void main(String[] args) 
	{
		int year;
        	Scanner scanner = new Scanner(System.in);
        	System.out.print("Enter the year: ");
        	year = scanner.nextInt();
        	String result = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? "Leap year" : "Not a leap year";
       		System.out.println(result);
   	 }
}