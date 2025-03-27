package com.java;

/* Q11. Write a java program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer, calculate percentage and grade according to given conditions:
percentage >= 90% : Grade A
percentage >= 80% : Grade B
percentage >= 70% : Grade C
percentage >= 60% : Grade D
percentage >= 40% : Grade E
percentage < 40% : Grade F */

import java.util.*;
public class SubPercentageAndGrade
{
	public static void main(String args[])
	{
		int Physics, Chemistry, Biology, Mathematics ,Computer;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Five(5) Subject matks:");
		Physics = scan.nextInt(); 
		Chemistry = scan.nextInt(); 
		Biology = scan.nextInt(); 
		Mathematics = scan.nextInt(); 
		Computer = scan.nextInt(); 
		double total = Physics + Chemistry + Biology + Mathematics + Computer;
		double per = (total/500)*100;
		System.out.println("Percentage:" + per);
		if(per >= 90)
		{
			System.out.println("Grade A");
		}
		else if(per >= 80)
		{
			System.out.println("Grade B");
		}
		else if(per >= 70)
		{
			System.out.println("Grade C");
		}
		else if(per >= 60)
		{
			System.out.println("Grade D");
		}
		else if(per >= 40)
		{
			System.out.println("Grade E");
		}
		else
		{
			System.out.println("Grade F");
		}
	}
}