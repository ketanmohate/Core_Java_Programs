package Test_P_18_07_2024;

/* Q3. WAP input character from keyboard and check character is alphabet ,digit or special symbol? */

import java.util.*;

public class Q3_CheckCharacterAlphabetDigitSymbol 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the charactor");
		char ch = sc.nextLine().charAt(0);
		
		if(ch >= 'a' && ch <= 'z')
		{
			System.out.println("It Is Alphabet");
		} 	
		else if((ch >= '0' && ch <= '9') || ch == '-')
		{
			System.out.println("It Is Digit");
		}
		else
		{
			System.out.println("It Is Special Symbol");
		}
	}

}
