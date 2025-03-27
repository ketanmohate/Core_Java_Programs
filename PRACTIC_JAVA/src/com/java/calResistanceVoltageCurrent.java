package com.java;

/*Write a java program to accept Input from user and calculate the Resistance, Current and Voltage.
Formula :
calculatedResistance = voltage/current 
calculatedCurrent = voltage/resistance
calculatedVoltage = current*resistance
*/
import java.util.*;
public class calResistanceVoltageCurrent
{
	public static void main(String args[])
	{
		double resistance,voltage,current;
		double calculatedResistance,calculatedCurrent,calculatedVoltage;
		Scanner scan = new Scanner(System.in);
	    System.out.print("Enter the value of Resistance (in Ohms): ");
	    resistance = scan.nextDouble();
	    System.out.print("Enter the value of Current (in Amperes): ");
	    current = scan.nextDouble();
	    System.out.print("Enter the value of Voltage (in Volts): ");
 	    voltage = scan.nextDouble();
		calculatedResistance = voltage/current; 
		System.out.println("The resistance is :" + calculatedResistance);
		calculatedCurrent = voltage/resistance;
		System.out.println("The current is :" + calculatedCurrent);
		calculatedVoltage = current*resistance;
		System.out.println("The voltage is :" + calculatedVoltage);
	}
}