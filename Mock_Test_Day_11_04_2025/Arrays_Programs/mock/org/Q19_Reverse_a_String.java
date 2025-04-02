package mock.org;

/*
 * 19. Reverse a String
Description: Reverse the given string.

Input: "hello"

Output: "olleh"
 */

import java.util.*;

public class Q19_Reverse_a_String {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str = sc.nextLine();
		
		char[] chArr = str.toCharArray();
		
		String newStr = "";
				
		for (int i = 0; i < chArr.length; i++) 
		{
			newStr = chArr[i] + newStr;
		}
		
		System.out.println(newStr);
	}

}
