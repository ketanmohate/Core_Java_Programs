package WriterClass.org;

import java.util.*;
import java.io.*;

public class Q2_Write_A_Data_in_File_Using_BufferedWriter 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		String directoryPath = "C:\\Users\\ketan\\OneDrive\\Desktop\\Java_All_Programs\\File_Handling\\Written_Files\\demo2.txt";
		
		try
		{
			FileWriter fw = new FileWriter(directoryPath);
			
			BufferedWriter bf = new BufferedWriter(fw);
			
			System.out.println("Write hire");
			int i = 1;
			while(i<=5)
			{
				bf.write(sc.nextLine());
				bf.newLine();
				i++;
			}
			System.out.println("File Write successfully...");
			bf.close();
			fw.close();
		}
		catch(IOException e)
		{
			System.out.println("Some Problem...");
		}
	}	
}
