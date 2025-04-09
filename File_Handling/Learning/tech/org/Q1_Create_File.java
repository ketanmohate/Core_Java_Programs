package tech.org;

import java.io.*;

public class Q1_Create_File {

	public static void main(String[] args) {

		String directoryPath = "C:\\Users\\ketan\\OneDrive\\Desktop\\Java_All_Programs\\File_Handling\\Written_Files\\demo.txt";
		
		File file = new File(directoryPath);
	
		try
		{
			if(file.createNewFile())
			{
				System.out.println("file Created");
			}
			else
			{
				System.out.println("faild");
			}
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}	
