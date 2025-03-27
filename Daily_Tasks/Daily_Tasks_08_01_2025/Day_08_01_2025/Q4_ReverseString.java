package Day_08_01_2025;

import java.util.*;

public class Q4_ReverseString 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String:");
		String str = sc.nextLine();
			
		String newString = "";
		
		for (int i = str.length() - 1; i >= 0; i--) 
		{
            newString = newString + str.charAt(i);
        }
		System.out.println("Reversed String: " + newString);
	}

}
