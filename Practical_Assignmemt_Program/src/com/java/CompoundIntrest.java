package com.java;
/*Write a java program to calculate the compound intrest.*/
import java.util.*;
public class CompoundIntrest
{
	public static void main(String args[])
	{
		Double num,intrestrate,comintrest,year;
		//Double nftitreast;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		num = scan.nextDouble();
		System.out.println("Enter the intrest rate:");
		intrestrate = scan.nextDouble();
		System.out.println("Enter the period of time(years):");
		year = scan.nextDouble();
		//System.our.println("Enter the number of time interest is compound per year:");
		//nftinreast = scan.nextDuble();
		comintrest = num*(Math.pow((1+intrestrate/100),year))-num;
		System.out.println("The compound interast is :" + comintrest);
	}
}

