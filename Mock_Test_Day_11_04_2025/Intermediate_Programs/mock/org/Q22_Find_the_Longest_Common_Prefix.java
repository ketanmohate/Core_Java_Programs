package mock.org;

/*
 * 22. Find the Longest Common Prefix
Description: Find the longest common prefix string amongst an array of strings.

Input: ["flower", "flow", "flight"]

Output: "fl"
 */

import java.util.*;

public class Q22_Find_the_Longest_Common_Prefix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size");
		int size = sc.nextInt();
		
		String[] strArr = new String[size]; 
		
		System.out.println("Enetr the values");
		for (int i = 0; i < strArr.length; i++) {
			strArr[i] = sc.nextLine();
		}		
		
		String str = "";
		
		for (int i = 0; i < strArr.length; i++) 
		{
			char[] chArr = strArr[i].toCharArray();
			
			for (int j = 0; j < chArr.length; j++) 
			{
				char ch = chArr[j];
				
				for (int k = 0; k < k+1; k++) 
				{
					if(ch == chArr[k])
					{
						str = str + ch;
					}
					else
					{
						break;
					}
				}
			}
		}
		
		System.out.println(str);
		
	}

}
