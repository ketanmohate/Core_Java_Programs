package Day_24_01_2025;

/*
 * Q1. WAP to create file and store only even size words in file using BufferedWriter
Example:
Abc Mnop pqr
Demo.txt
_____________________________________________________
Mnop
 */
import java.util.*;
import java.io.*;

public class Q1_Store_Only_Even_Size_Words 
{
	public static void main(String[] args) throws IOException 
	{
		Scanner sc = new Scanner(System.in);
		
		String directoryPath = "C:\\Users\\ketan\\OneDrive\\Desktop\\File_Handling\\abc\\Demo.txt";
		
		Writer fw = new FileWriter(directoryPath,true);
	
		String data;
		
		System.out.println("Enter the Data");
		data = sc.nextLine();
		
		String[] parts = data.split(" ");
		
		for(int i=0 ; i<parts.length ;i++)
		{
			if(parts[i].length() % 2 == 0)
			{
			     fw.write(parts[i]);
			}
		}
		fw.close();
		System.out.println("Data Save Success.....");
	}
}
