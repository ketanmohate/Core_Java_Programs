package mock.org;

/*
 * 25. Replace All Occurrences of a Character in String
Description: Replace all occurrences of a character in a string with another character.

Input: "hello", o -> x

Output: "hellx"
 */

import java.util.*;

public class Q25_Replace_All_Occurrences_of_a_Character_in_String {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str = sc.nextLine();
		
		System.out.println("Enter the charator to repalace in String");
		char ch1 = sc.next().charAt(0);
		
		System.out.println("Enter the to replace");
		char ch2 = sc.next().charAt(0);
		
		char [] chArr = str.toCharArray();

		for(int i=0 ; i<chArr.length ; i++)
		{
			if(chArr[i] == ch1)
			{
				chArr[i] = ch2;
			}
		}
		
		String newStr = new String(chArr);
		
		System.out.println(newStr);
	}

}
