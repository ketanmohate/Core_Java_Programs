package mock.org;

/*
 * 38. Replace Substring in String
Description: Replace a part of a string with another substring.

Input: "hello world", old substring "world", new substring "java"

Output: "hello java"
 */

import java.util.*;

public class Q38_Replace_Substring_in_String {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str = sc.nextLine();
		
		System.out.println("Enter the Old sub String");
		String oldStr = sc.nextLine();
		
		System.out.println("Enter the new sub String");
		String newStr = sc.nextLine();
		
		String [] strArr = str.split(" ");
		
		String newString = "";
		
		for (int i = 0; i <strArr.length; i++) 
		{
			if(strArr[i].equals(oldStr))
			{
				strArr[i] = newStr;
			}
			newString = newString + strArr[i] + " ";
		}
		System.out.println(newString);
	}

}
