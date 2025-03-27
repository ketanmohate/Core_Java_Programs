package Day_11_01_2025;

/*
 * Q6. WAP to implement the startsWith() method manually?
 */

import java.util.*;

public class P_Q6_startsWith_Method_Manually 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String:");
		String str = sc.nextLine();
		
		System.out.println("Enter the First Character");
		char ch = sc.next().charAt(0);		
		
		if(str.charAt(0) == ch)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}

}
