package Day_24_01_2025;

/*
 * Q4. WAP to create file and input string from keyboard and store only capital letter , vowel in file 
 */

import java.util.*;
import java.io.*;

public class Q4_Store_Only_Capital_Letter_Vowel 
{
	public static void main(String[] args) throws IOException 
	{
		Scanner sc = new Scanner(System.in);
		
		String directory = "C:\\Users\\ketan\\OneDrive\\Desktop\\File_Handling\\vowel.txt";
		
		Writer fw = new FileWriter(directory,true);
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		System.out.println("Enter the Data:");
		String data = sc.nextLine();
		
		char ch[] = data.toCharArray();
		
		for(int i=0 ; i<ch.length ; i++)
		{
			if(ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U')
			{
				fw.write(ch[i]);
			}
		}
		bw.close();
		fw.close();
		System.out.println("Data Save Success.....");
	}

}
