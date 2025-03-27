package Day_15_01_2025;

/*
 * Q2.Program to Validate an IP address
Input : "125.512.100.1"
Output : Invalid
192.168.123.132
 */

import java.util.*;

public class Q2_Validate_IP_Address_Using_Built_in_Method 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		
		String[] s = str.split("\\.");
		
		if(str.length()==15 && str.charAt(0) != '0')
		{
			if (s.length == 4) 
			{
				System.out.println("Valid");
			}
			else
			{
				System.out.println("In Valid");
			}
		}
		else
		{
			System.out.println("In Valid");
		}
		
	}

}
