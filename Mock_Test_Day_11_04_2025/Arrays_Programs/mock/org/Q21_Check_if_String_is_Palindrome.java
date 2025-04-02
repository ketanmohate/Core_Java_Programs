package mock.org;

/*
 * 21. Check if a String is Palindrome
Description: Check if the given string is a palindrome.

Input: "madam"

Output: Palindrome
 */

import java.util.*;

public class Q21_Check_if_String_is_Palindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str = sc.nextLine();
		
		String rev = "";
		
		char[] ch = str.toCharArray();
		
		for(int i=0 ; i<ch.length ; i++)
		{
			rev = ch[i] + rev ;
		}
		
		if(rev.equals(str))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}

}
