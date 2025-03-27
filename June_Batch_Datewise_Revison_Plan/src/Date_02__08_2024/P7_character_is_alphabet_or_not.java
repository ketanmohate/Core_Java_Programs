package Date_02__08_2024;

/* 7.Write a C program to check whether a character is alphabet or not. */

import java.util.*;

public class P7_character_is_alphabet_or_not 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the charactor");
		char ch = sc.nextLine().charAt(0);
		
		if((ch >= 'a' && ch <='z') || (ch >= 'A' && ch <= 'Z'))
		{
			System.out.println("Charactor is Alphabet");
		}
		else
		{
			System.out.println("Charactor in not alphabet");
		}
				
	}

}
