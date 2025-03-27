package com.java;
/* Q.2. UPSC Conducting physical Test for Ips Candidates, as, per UPSC standards Candidates should pass running Test, After running Test, Every candidates Oxygen Level Checked by Team-
- We have to write a java program to Check Candidates eligibility for next Round .
Candidates eligible when he/she Completed running test (1000 m) in S and Oxygen level should be greater than 90.*/

import java.util.*;

public class UPSCRountPass
{
	public static void main(String args[])
	{
		String name;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the candidate name:");
		name = scan.nextLine();
		System.out.println("Enter how many meter run Candidate:");
		double meter = scan.nextDouble();
		System.out.println("Enter the Oxygen Lever of candidate:");
		double oxygen = scan.nextDouble();
		
		if(meter >= 1000)
		{
			if(oxygen >= 90)
			{
				System.out.println(" candidate: " + name + ": Pass test");
			}
			else
			{
				System.out.println(" candidate: " + name + ": Not pass the test becouse Oxygen level is Low");
			}
		}
		else 
		{
			System.out.println(" candidate: " + name + ": Nt pass the test becouse running is incomplitad");
		}
	}
} 