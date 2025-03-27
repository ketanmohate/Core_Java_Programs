package Day_10_01_2025;

/*1.	Find the First Non-Repeated Character  ?
		  Input: "swiss"
		  Output: 'w'
		  */

import java.util.*;

public class Q1_First_Non_Repeated_Character 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		
		char[] ch = str.toCharArray();
		
		
		
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
			if(count==1)
			{
				System.out.println(ch[i]);
				break;
			}
		}
	}

}
