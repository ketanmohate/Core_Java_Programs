package mock.org;

/*
 * 

30. Check if String Ends with a Substring
Description: Check if a string ends with a specific substring.

Input: "hello", substring "lo"

Output: Ends with "lo"
 */

import java.util.*;

public class Q30_Check_if_String_Ends_with_Substring {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str = sc.next();
		
		System.out.println("Enter the sub String");
		String subStr = sc.next();
		
		char[] chArrStr = str.toCharArray();
		char[] charArrSubStr = subStr.toCharArray();
		
		int len = chArrStr.length - charArrSubStr.length;
		
		if (len < 0) 
		{
            System.out.println("Not End with : \t" + subStr);
            return;
        }

        int count = 0;
        for (int i = 0; i < charArrSubStr.length; i++) 
        {
            if (charArrSubStr[i] == chArrStr[len + i]) 
            {
                count++;
            }
        }
		if(count == subStr.length())
		{
			System.out.println("End with : \t" + subStr);
		}
		else
		{
			System.out.println("Not End with : \t" + subStr);
		}
	}

}
