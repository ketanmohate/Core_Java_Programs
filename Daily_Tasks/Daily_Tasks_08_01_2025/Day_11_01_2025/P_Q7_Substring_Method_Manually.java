package Day_11_01_2025;

/*
 * Q8. WAP to implement the substring() method manually?
 */

import java.util.*;

public class P_Q7_Substring_Method_Manually 
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
			StringBuilder result = new StringBuilder();
			
	        for (int i = beginIndex; i < endIndex; i++) 
	        {
	            result.append(str.charAt(i));
	        }
	        
	        System.out.println(result +" ");
		}
		
	}

}
