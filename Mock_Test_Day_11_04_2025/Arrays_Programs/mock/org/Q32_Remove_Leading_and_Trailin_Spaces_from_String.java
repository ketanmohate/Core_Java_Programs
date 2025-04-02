package mock.org;

/*
 * 32. Remove Leading and Trailing Spaces from String
Description: Remove any leading and trailing spaces from a string.

Input: " hello "

Output: "hello"
 */

import java.util.*;

public class Q32_Remove_Leading_and_Trailin_Spaces_from_String {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str = sc.next();
		
		String newStr = "";
		
		for (int i = 0; i < str.length(); i++) 
		{
			if(str.charAt(i) != ' ')
			{
				newStr = newStr + str.charAt(i) ;
			}
		}
		
		System.out.println(newStr);
	}

}
