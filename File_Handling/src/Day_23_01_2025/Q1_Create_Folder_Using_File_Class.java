package Day_23_01_2025;

/* Q1. Create folder using File class */

import java.io.*;

public class Q1_Create_Folder_Using_File_Class 
{
	public static void main(String[] args) 
	{
//		method 1
		
		String folderName = "MyNewFolder";
		
		File f = new File("C:\\Users\\ketan\\OneDrive\\Desktop\\File_Handling\\" + folderName);
		
//		method 2
//		File f = new File("C:\\Users\\ketan\\OneDrive\\Desktop\\File_Handling\\abc");
		
		if(f.exists())
		{
			System.out.println("Folder already exists: " + f.getAbsolutePath());		
		}
		
		else
		{
			if (f.mkdir()) 
			{
                System.out.println("Folder created successfully: " + f.getAbsolutePath());
			}
			else
			{
				 System.out.println("Failed to create the folder.");
			}
			
		}
	}

}
