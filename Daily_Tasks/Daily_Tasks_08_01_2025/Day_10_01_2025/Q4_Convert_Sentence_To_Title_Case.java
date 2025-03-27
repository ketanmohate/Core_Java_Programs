package Day_10_01_2025;

/* 
4.	Convert a Sentence to Title Case ?
Input: "java is fun"
Output: "Java Is Fun"

 */

import java.util.*;

public class Q4_Convert_Sentence_To_Title_Case 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		
		char ch[] = str.toCharArray();
		
		int flag=0;
		
		for(int i=0; i<ch.length ;i++)
		{
			if (i == 0 && ch[i] >= 97 && ch[i] <= 122)
			{
	            ch[i] = (char) (ch[i] - 32); 
			} 
			else if (ch[i] == ' ' && i + 1 < ch.length && ch[i + 1] >= 97 && ch[i + 1] <= 122) 
			{
	            ch[i + 1] = (char) (ch[i+1]-32);
			}
		}
		for(int i=0 ; i<ch.length;i++)
		{
			System.out.print(ch[i]);
		}
	}

}
