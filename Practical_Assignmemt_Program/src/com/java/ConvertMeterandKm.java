package com.java;

/*Write a java program to enter length in centimeter and convert Into meter and kilometer.*/
import java.util.*;
public class ConvertMeterandKm
{
	public static void main(String args[])
	{
		double cm,km,meter;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length");
		cm = scan.nextDouble();
		meter=cm/100;
		System.out.println("convert the meter:"+meter);
		km=meter/1000;		
		System.out.println("convert the km:"+km);
	}
}