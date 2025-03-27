package org.gth;

import java.io.*;

public class Q2_Create_Folder 
{
	public static void main(String[] args) 
	{
		String directoryPath = "E:\\File_handing\\practic1";
		
		File file = new File(directoryPath);
		
		if(file.exists())
		{
			System.out.println("Folder allrady exist...");
			return;
		}
		
		if(file.mkdir())
		{
			System.out.println("Folder create succseccfully\t" + file.getAbsolutePath());
		}
		else
		{
			System.out.println("Faild");
		}
	}
}
