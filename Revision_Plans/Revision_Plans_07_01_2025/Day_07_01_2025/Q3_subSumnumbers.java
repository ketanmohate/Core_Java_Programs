package Day_07_01_2025;

import java.util.*;

public class Q3_subSumnumbers
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the tow Number:");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		System.out.println("Enter the tow decimal Number:");
		double num3=sc.nextDouble();
		double num4=sc.nextDouble();
		
		System.out.println((num1+num2) + "\t" + (num1-num2));
		System.out.println((num3+num4) + "\t" + (num3-num4));
	}
}