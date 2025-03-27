package Day_10_01_2025;

/*3.	Check if a String Contains Only Digits ?
Input: "12345"
Output: true
*/

import java.util.*;

public class Q3_Check_String_Contains_Only_Digits 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		
		char ch[] = str.toCharArray();
		
		int count=0;
		
		for(int i=0 ; i<ch.length ;i++)
		{
			if(ch[i]>= 48 && ch[i] <=57)
			{
				count++;
			}
		}
		
		if(count == ch.length)
		{
			System.out.println("True");
		}
		else 
		{
			System.out.println("False");
		}
	}
}
