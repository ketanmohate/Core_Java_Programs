package org.gth;

import java.io.*;

public class Q3_Create_Folder 
{
	public static void main(String[] args) 
	{
		String directoryPath = "E:\\File_handing\\ParantFolder\\ChildFolder";
		
		File file = new File(directoryPath);
		
		if(file.mkdirs())
		{
			System.out.println("Folder Create Successfully...\t" + file.getAbsolutePath());
		}
		else
		{
			System.out.println("Faild....");
		}
	}
}
