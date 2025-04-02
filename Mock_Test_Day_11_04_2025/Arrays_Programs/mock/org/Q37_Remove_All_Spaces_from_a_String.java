package mock.org;

/*
 * 

37. Remove All Spaces from a String
Description: Remove all spaces from a string.

Input: "hello world"

Output: "helloworld"
 */

import java.util.*;

public class Q37_Remove_All_Spaces_from_a_String {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Sting");
		String str = sc.nextLine();
		
		char[] ch = str.toCharArray();
		
		String newStr = "";
		
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i] != ' ')
			{
				newStr = newStr + ch[i];
			}
		}
		System.out.println(newStr);

	}

}
