package Day_10_01_2025;

/* 2.	Replace All Vowels with a Specific Character ?
Input: "hello", replacement = '*'
Output: "h*ll*"
*/

import java.util.*;

public class Q2_Replace_All_Vowels_with_Specific_Character 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String:");
		String str = sc.nextLine();
		
		char ch[] = str.toCharArray();
		
		for(int i=0 ; i<ch.length;i++)
		{
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u' || ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U')
			{
				ch[i] = '*';
			}
		}
		
		for(int i=0 ; i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
	}
}
