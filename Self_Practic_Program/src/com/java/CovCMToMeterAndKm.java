package com.java;
import java.util.*;
public class CovCMToMeterAndKm {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Centimeter : ");
		double cm = scan.nextDouble();
        double meter = cm / 100;
        double km = cm / 100000;
		System.out.println("Convert into Meter : " + meter);
		System.out.println("Convert into kilometer : " + km);
		//Enter the Centimeter : 
			//100000
			//Convert into Meter : 1000
			//Convert into kilometer : 1
	}
}
