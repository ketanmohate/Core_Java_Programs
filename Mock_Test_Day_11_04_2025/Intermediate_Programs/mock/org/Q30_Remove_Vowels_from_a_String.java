package mock.org;

/*
30. Remove Vowels from a String
Description: Remove all vowels from a given string.

Input: "hello"

Output: "hll"
 */

import java.util.*;

public class Q30_Remove_Vowels_from_a_String {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str = sc.nextLine();
		
		String newStr = "";
		
		for (int i = 0; i < str.length(); i++) 
		{
			char ch = str.charAt(i);
			
			if(!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
				ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'))
			{
				newStr = newStr + ch;
			}
		}
		System.out.println(newStr);
	}

}
