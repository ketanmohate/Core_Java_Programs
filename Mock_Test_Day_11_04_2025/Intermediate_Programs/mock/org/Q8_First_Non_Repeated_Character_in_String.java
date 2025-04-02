package mock.org;

/*
 * 8. Find the First Non-Repeating Character in a String
Description: Find the first non-repeating character in a string.

Input: "swiss"

Output: w
 */

import java.util.*;

public class Q8_First_Non_Repeated_Character_in_String {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str = sc.nextLine();
		
		char[] ch = str.toCharArray();
		
		boolean found = false;
		for (int i = 0; i < ch.length; i++) 
		{
			int count = 0;
			for (int j = 0; j < ch.length; j++) 
			{
				if(ch[i] == ch[j])
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println(ch[i]);
				found = true;
				break;
			}
		}
		if(!found) {
			System.out.println("No Repete elemet");
		}
	}

}
