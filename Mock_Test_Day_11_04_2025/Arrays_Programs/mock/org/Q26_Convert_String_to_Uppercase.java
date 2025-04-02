package mock.org;

/*
 * 26. Convert String to Uppercase
Description: Convert a string to uppercase.

Input: "hello"

Output: "HELLO"
 */

import java.util.*;

public class Q26_Convert_String_to_Uppercase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str = sc.next();
		
		char[] chArr = str.toCharArray();
		
		for (int i = 0; i < chArr.length; i++) 
		{
			if(chArr[i]>=97 && chArr[i]<=122)
			{
				chArr[i] = (char) (chArr[i]-32);
			}
		}
		
		String newStr = new String(chArr);
		
		System.out.println(newStr);
	}

}
