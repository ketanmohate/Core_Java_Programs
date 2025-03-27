package Assignment_16_09_2024;

/*
 Write a C program to check whether an alphabet is vowel or consonant using if else. How to check 
vowels and consonants using if else in C programming. C Program to input a character from user 
and check whether it is vowel or consonant. Logic to check vowel or consonant in C programming. 
 */

import java.util.*;

public class Q8_Alphabet_Is_Vowel_Or_Consonant 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Alphabet");
		char ch=sc.nextLine().charAt(0);
		
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || 
				ch == 'I' || ch == 'O' || ch == 'U')
		{
			System.out.println("Vowel");
		}
		else
		{
			System.out.println("Consonant");
		}
	}

}
