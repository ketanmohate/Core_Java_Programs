package mock.org;

/*
 * 39. Find All Permutations of a String
Description: Find all possible permutations of a string.

Input: "abc"

Output: ["abc", "acb", "bac", "bca", "cab", "cba"]
 */

import java.util.*;

public class Q39_Find_All_Permutations_of_a_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str = sc.next();
		
		char[] chArr = str.toCharArray();
		
		for (int i = 0; i < chArr.length; i++) 
		{
			for (int j = 0; j < chArr.length; j++) 
			{
				if(i==j)
				{
					continue;
				}
				for (int k = 0; k < chArr.length; k++) 
				{
					if(k==i || j==k)
					{
						continue;
					}
					System.out.print(" " + chArr[i] + chArr[j] + chArr[k]);
				}
			}
		}

	}

}
