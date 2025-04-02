package mock.org;

import java.util.Scanner;

public class Q27_Convert_String_to_Lowercase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str = sc.next();
		
		char[] chArr = str.toCharArray();
		
		for (int i = 0; i < chArr.length; i++) 
		{
			if(chArr[i]>=65 && chArr[i]<=90)
			{
				chArr[i] = (char) (chArr[i]+32);
			}
		}
		
		String newStr = new String(chArr);
		
		System.out.println(newStr);

	}

}
