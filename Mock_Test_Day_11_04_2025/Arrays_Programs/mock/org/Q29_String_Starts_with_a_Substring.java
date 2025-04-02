package mock.org;

/*
 * 29. Check if String Starts with a Substring
Description: Check if a string starts with a specific substring.

Input: "hello", substring "he"

Output: Starts with "he"
 */

import java.util.*;

public class Q29_String_Starts_with_a_Substring {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str = sc.next();
		
		System.out.println("Enter the Sub String");
		String subStr = sc.next();
		
		
		char[] chArrStr = str.toCharArray();
		char[] chArrSubStr = subStr.toCharArray();
		
		if(str.length() < subStr.length())
		{
			System.out.println("faild");
			return;
		}
		
		int count = 0;
		for (int i = 0; i < chArrSubStr.length; i++) 
		{
			if(chArrSubStr[i] == chArrStr[i])
			{
				count++;
			}
		}
		if(count == subStr.length()) 
		{
			System.out.println("Starts with : \t" + subStr);
		}
		else
		{
			System.out.println("Not Starts with : \t" + subStr);
		}

	}

}
