package mock.org;

/*
 * 31. Find the Frequency of a Character in a String
Description: Find how many times a character appears in a string.

Input: "hello", character l

Output: 2
 */

import java.util.*;

public class Q31_Frequency_of_Character_in_String {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str = sc.next();
		
		System.out.println("Enter the character");
		char ch = sc.next().charAt(0);
		
		char[] chArr = str.toCharArray();
		
		int count = 0;
		for (int i = 0; i < chArr.length; i++) 
		{
			if(chArr[i] == ch)
			{
				count++;
			}
		}
		
		System.out.println(count);
	}

}
