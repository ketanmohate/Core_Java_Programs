package Day_15_01_2025;
/*
 * Q1. Program to Add Binary Strings
Input : str1 = "1001"
             str2 = "11"
Output : "1100"
Explanation : "1001" represents for 9 and "11" represents for 3 then result should be 12 which means result = "1100".
 */

import java.util.*;

public class Q1_Add_Binary_Strings_Using_Built_in_Methods
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the First Binary String:");
		String str1 = sc.nextLine();
		
		System.out.println("Enter the Secound Binary String");
		String str2 = sc.nextLine();
		
//		method 1
		
		int decimal1=Integer.parseInt(str1,2);
		int decimal2=Integer.parseInt(str2,2);
//		System.out.println(decimal1);
//		System.out.println(decimal2);
		
		int sumDeciamal = decimal1 + decimal2;
		
		String binary = Integer.toBinaryString(sumDeciamal);
		
		
		System.out.println(binary);
	
	}

}
