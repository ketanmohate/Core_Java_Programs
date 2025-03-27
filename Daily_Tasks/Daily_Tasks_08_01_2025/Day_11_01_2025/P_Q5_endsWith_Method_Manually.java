package Day_11_01_2025;

/*
 Q5. WAP to implement the endsWith() method manually?
 */

import java.util.*;

public class P_Q5_endsWith_Method_Manually 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String:");
		String str = sc.nextLine();
		
		System.out.println("Enter the Ends Character:");
		char ch=sc.next().charAt(0);
		
		char chArr[] = str.toCharArray();
		
		if(chArr[chArr.length-1] == ch)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}

}
