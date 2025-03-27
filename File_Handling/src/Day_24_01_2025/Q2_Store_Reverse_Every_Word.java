package Day_24_01_2025;

import java.util.*;
import java.io.*;

public class Q2_Store_Reverse_Every_Word 
{
	public static void main(String[] args) throws IOException 
	{
		Scanner sc = new Scanner(System.in);
		
		String directoryPath = "C:\\Users\\ketan\\OneDrive\\Desktop\\File_Handling\\Demo.txt";
		
		Writer fw = new FileWriter(directoryPath); 
	
		System.out.println("Enter the Data");
		String data;
		data = sc.nextLine();
		
		String[] words = data.split(" ");
		
		StringBuffer st = new StringBuffer();
		
		StringBuilder result = new StringBuilder();
		
		for (String word : words) {
            result.append(new StringBuilder(word).reverse()).append(" ");
        }	
		String rev = result.toString().trim();

		fw.write(rev);
		fw.close();

	}
}
