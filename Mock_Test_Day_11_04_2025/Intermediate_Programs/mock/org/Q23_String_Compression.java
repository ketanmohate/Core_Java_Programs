package mock.org;

/*
 * 23. String Compression
Description: Implement string compression using counts of repeated characters.

Input: "aabcccccaaa"

Output: "a2b1c5a3"
 */

import java.util.*;

public class Q23_String_Compression {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str = sc.nextLine();
		
		char[] chArr = str.toCharArray();
		
		String newStr = "";
		
		int count = 1;
		
		for (int i = 0; i < chArr.length - 1; i++) 
        {
            if (chArr[i] == chArr[i + 1]) 
            {
                count++;
            } 
            else 
            {
                newStr = newStr + chArr[i] + count;
                count = 1;
            }
        }
		newStr = newStr + chArr[chArr.length - 1] + count;
		System.out.println(newStr);
	}

}
