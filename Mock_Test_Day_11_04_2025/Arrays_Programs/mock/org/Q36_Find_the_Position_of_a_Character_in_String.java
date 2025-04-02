package mock.org;

/*
 * 36. Find the Position of a Character in a String
Description: Find the index of a specific character in a string.

Input: "hello", character o

Output: 4
 */

import java.util.*;

public class Q36_Find_the_Position_of_a_Character_in_String {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str = sc.nextLine();
		
		System.out.println("Enter the Character");
		char ch = sc.next().charAt(0);
		
		char[] chArr = str.toCharArray();
		
		for(int i=0 ; i<chArr.length ; i++)
		{
			if(chArr[i] == ch) 
			{
				System.out.println(i);
			}
		}
	}

}
