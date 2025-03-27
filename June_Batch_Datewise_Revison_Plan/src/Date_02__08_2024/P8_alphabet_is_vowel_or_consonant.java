package Date_02__08_2024;

/* 8.Write a C program to input any alphabet and check whether it is vowel or consonant. */

import java.util.*;

public class P8_alphabet_is_vowel_or_consonant 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Any alphabet");
		char ch = sc.nextLine().charAt(0);

		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch== 'U')
		{
			System.out.println("Alphabet is Vowel");
		}
		else
		{
			System.out.println("Alphabet is Consonant");
		}
	}

}
