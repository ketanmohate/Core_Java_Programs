package mock.org;

/*
 * 28. Find the Length of a String
Description: Find the length of a given string.

Input: "hello"

Output: 5
 */

import java.util.*;

public class Q28_Find_the_Length_of_a_String {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str = sc.next();
		
		char[] chArr = str.toCharArray();
		
		int count=0;
		for(char ch : chArr)
		{
			count++;
		}
		System.out.println(count);
	}

}
