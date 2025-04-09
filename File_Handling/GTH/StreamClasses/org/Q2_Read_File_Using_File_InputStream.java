package StreamClasses.org;

import java.util.*;
import java.io.*;

public class Q2_Read_File_Using_File_InputStream 
{
	public static void main(String[] args) 
	{
		
		String directoryPath = "C:\\Users\\ketan\\OneDrive\\Desktop\\Java_All_Programs\\File_Handling\\Written_Files\\StreamWriteFile.txt";

		try {
			FileInputStream fos = new FileInputStream(directoryPath);
			
			try {
				int data;
				
				while((data = fos.read())!=-1)
				{
					System.out.println(data);
				}
			}
			catch(IOException e)
			{
				System.out.println(e.getMessage());
			}
			System.out.println("Data read successfully");
		}
		catch(FileNotFoundException e){
			System.out.println(e.getMessage());
		}
		
		
	}

}
