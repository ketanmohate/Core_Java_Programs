package Day_11_01_2025;

/*
 * Q5. Write a program to count the frequency of each character in a string using the 
	Character wrapper class and arrays.
	Input: "java"
	Output: j = 1, a = 2, v = 1
 */

import java.util.*;

public class Q5_Count_Frequency_Of_Each_Character 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String:");
		String str = sc.nextLine();
		
		char[] chh = str.toCharArray();
		
		Character[] ch = new Character[chh.length];
		
		for(int i=0 ; i<chh.length ;i++)
		{
			ch[i] = chh[i]; 
		}
		
		
		
		for(int i=0 ; i<ch.length ; i++)
		{
			int count=0;
			for(int j=0 ; j<ch.length ; j++)
			{
				if(ch[i] == ch[j])
				{
					count++;
				}
			}
			
			int flag=0;
			
			for(int k=0 ; k<i ; k++)
			{
				if(ch[k] == ch[i])
				{
					flag=1;
					break;
				}
			}
			
			if(flag==0)
			{
				System.out.println(ch[i] + " --------------------> " + count);
			}
		}
		
		
	}

}
