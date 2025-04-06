package mock.org;
/*
 * 28. Check if a String is a Subsequence of Another
Description: Check if a string is a subsequence of another string.

Input: "abc", "ahbgdc"

Output: true
 */

import java.util.*;

public class Q28_Check_if_a_String_is_a_Subsequence_of_Another {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str = sc.nextLine();
		
		System.out.println("Enter the sub String");
		String subStr = sc.nextLine();
		
		int count = 0;
		
		for (int i = 0; i < subStr.length(); i++) 
		{
			char subCh = subStr.charAt(i);
			
			for (int j = 0; j < str.length(); j++) 
			{
				char ch = str.charAt(j);
				
				if(subCh == ch)
				{
					count++;
				}
			}
		}

		if(count >= subStr.length())
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}

}
