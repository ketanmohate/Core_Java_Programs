package Day_10_01_2025;

/*
5.	Remove Duplicate Characters from a String
Input: "programming"
Output: "progamin"
 */

import java.util.*;

public class Q5_Remove_Duplicate_Characters_From_String 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String:");
		String str = sc.nextLine();
		
		char ch[] = str.toCharArray();
		
		int length = ch.length;
		
		char chh[] =  new char[length];
		
		int k=0;
		
		for(int i=0 ; i<length; i++)
		{
			boolean flag = false;
			
			for(int j = 0 ; j < k ; j++)
			{
				if(ch[i] == chh[j])
				{
					flag = true;
					break;
				}
			}
			if(flag == false)
			{
				chh[k]=ch[i];
				k++;
			}
		}
		
		for(int i=0 ; i<k ; i++)
		{
			System.out.print(chh[i]);
		}
		
	}

}
