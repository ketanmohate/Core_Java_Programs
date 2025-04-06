package mock.org;

/*
 * 18. Implement a Basic Calculator
Description: Write a program to evaluate a simple expression string containing numbers and basic operators (+, -, *, /).

Input: "3+2*2"

Output: 7
 */

import java.util.*;

public class Q18_Implement_a_Basic_Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str = sc.nextLine();
		
		char[] chArr = str.toCharArray();
		
		int opration = 0;
		
		for (int i = 0; i < chArr.length; i++) 
		{
			if(chArr[i]>=37 && chArr[i]<=47)
			{
				opration = chArr[i-1] + chArr[i] + chArr[i+1];
			}
		}
		
		System.out.println(opration);
	}

}
