package mock.org;

/*
 * 20. Check If String is a Valid Number
Description: Write a program to check if a string represents a valid number.

Input: "123.45"

Output: true
 */

import java.util.*;

public class Q20_Check_If_String_is_a_Valid_Number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str = sc.nextLine();
		
		char[] chArr = str.toCharArray();
		
		 boolean isValid = false;
		
		for (int i = 0; i < chArr.length; i++) 
		{
			char ch = chArr[i];
			
			if((ch >= '0' && ch <= '9') || (ch == '-') || (ch == '.') ||(ch == '+')) 
			{
				isValid = true; 
            } 
			else 
			{
				isValid = false;
				break;
			}
		}
		
		if(isValid == false)
		{
			System.out.println("False");
		}
		else
		{
			System.out.println("True");
		}
	}

}
