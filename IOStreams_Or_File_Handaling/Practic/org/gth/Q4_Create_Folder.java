package org.gth;

import java.io.*;

public class Q4_Create_Folder 
{
	public static void main(String[] args) 
	{
//		String DirectoryPath = ""
		
		File file = new File("E:\\File_handing","\\subFolder");
		
		if(file.mkdirs())
		{
			System.out.println("Folder Create Successfully...\t" + file.getAbsolutePath());
		}
		else
		{
			System.out.println("Fild...");
		}
	}

}
