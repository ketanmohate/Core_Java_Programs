package org.gth;

import java.io.*;

public class Q5_Create_Folder {

	public static void main(String[] args) throws IOException 
	{
		
		String directoryPath = "E:\\File_handing";
		
		File file = new File(directoryPath , "\\demo.txt");
		
		boolean b = file.createNewFile();
		
		if(b)
		{
			System.out.println("File Create Successfully...\t" + file.getAbsolutePath());
		}
		else
		{
			System.out.println("Faild");
		}
	}

}
