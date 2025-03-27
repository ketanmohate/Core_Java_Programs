package com.java;
/* Q.8. Kirloskar Steel Company wants to Check quality of steels according to some Parameters:- Hardness, Carbon, Tensile strength.
((1) Hardness > 50
2) Carbon < 0.7                                                     
3) Tensile Strength > 5.600)good quality Steel)

Grade	         parameters
Grade 10       	1 && 2 && 3
Grade 9 	1 && 2
Grade 8 	2 && 3
Grade 7 	1 && 3
Grade 6 	1 || 2 || 3 */

import java.util.*;

public class CheckSteelsQuality
{
	public static void main(String args[])
	{
			
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Enter the Hardness of Steel:");
		double hardness = scan.nextDouble();
			
		System.out.println("Enter the carbon contain include:");
		double carbon = scan.nextDouble();
		
		System.out.println("Enter the tensile strength of steel:");
		double TensileStrength = scan.nextDouble();
		
		if(hardness > 50 && carbon < 0.7 && TensileStrength > 5.600)
		{
			System.out.println("Good Quality Steel");
			System.out.println("Grade 10");
		}	
		else if(hardness > 50 && carbon < 0.7)
		{
			System.out.println("Grade 9");
		}
		else if(carbon < 0.7 && TensileStrength > 5.600)
		{
			System.out.println("Grade 8");
		}
		else if(hardness > 50 && TensileStrength > 5.600)
		{
			System.out.println("Grade 7");
		}
		else if(hardness > 50 || carbon < 0.7 || TensileStrength > 5.600)
		{
			System.out.println("Grade 6");
		}
		else
		{
			System.out.println("Invalid");
		}
	}
}