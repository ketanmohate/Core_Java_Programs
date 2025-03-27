package Day_11_01_2025;

import java.util.Scanner;

/*
 * Q8. WAP to implement the substring() method manually?
 */

public class P_Q7_Substring_Method_Manually_1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String:");
		String str = sc.nextLine();
		
		System.out.println("Enter the begin Index:");
		int beginIndex = sc.nextInt();
		
		System.out.println("Enter the End Index:");
		int endIndex = sc.nextInt();		
		
		if (str == null || str.isEmpty() || (beginIndex>str.length() || endIndex>str.length() || beginIndex<0 || endIndex<0)) 
		{
			System.out.println("String cannot be null or empty.");
		}
		
		else
		{
			char[] ch = str.toCharArray();
			
			int size = endIndex-beginIndex;
			
			char[] arrSubString = new char[size];  
			
			int k=0;
			
			for(int i=beginIndex ; i<endIndex; i++)
			{
				arrSubString[k] = ch[i];
				k++;
			}
			
			String subString = new String(arrSubString);
			
			System.out.println(subString + " ");
		}
	}
}
