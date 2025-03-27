package org.gth;

import java.io.*;

public class Q_1 
{
	public static void main(String[] args) 
	{
		String directoryPath = "E:\\File_handing\\abs";
			
		File file = new File(directoryPath);
		
		if(file.exists())
		{
			System.out.println("folder flrady exist" + file.getAbsolutePath());
		}
		else
		{
			if(file.mkdir())
			{
				System.out.println("Folder create succsesfully \t" + file.getAbsolutePath());
			}
			else
			{
				System.out.println("Faild to create folder...");
			}
		}
	}
}
