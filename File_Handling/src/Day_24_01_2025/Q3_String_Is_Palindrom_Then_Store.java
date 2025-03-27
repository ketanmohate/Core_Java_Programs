package Day_24_01_2025;

/*
 * Q3. WAP to create file and input string from keyboard and if string is palindrom then store in file otherwise not

Example1:
Input Data in file
Aba 
Output:
Aba 

Example2:
Input Data in file
Abc 
Output:
Cannot store in file because string is not palindrome

 */

import java.util.*;
import java.io.*;

public class Q3_String_Is_Palindrom_Then_Store 
{
	public static void main(String[] args)  throws Exception
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Path");
		String path=sc.nextLine();
		
		String directoryPath = path;
		
		Writer fw = new FileWriter(directoryPath); 
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		System.out.println("Enter the String:");
		String data = sc.nextLine();
		
//		method 1
//		String rev = new StringBuilder(data).reverse().toString(); 
		
//		method 2
		
		StringBuilder sb = new StringBuilder(data);
		sb.reverse();
		
		String rev = sb.toString();
		
		if(data.equalsIgnoreCase(rev))
		{
			bw.write(rev);
		}
		bw.close();
	}

}
