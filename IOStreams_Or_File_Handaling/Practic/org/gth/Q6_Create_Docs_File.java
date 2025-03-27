package org.gth;

import java.io.*;

public class Q6_Create_Docs_File {

	public static void main(String[] args) throws IOException {
		
		String directoryPath = "E:\\File_handing";
		
		File file = new File(directoryPath,"\\ketan.doc");
		
		boolean b = file.createNewFile();
		
		if(b)
		{
			System.out.println("File Create Successfully...\t" + file.getAbsolutePath());
		}
		else
		{
			System.out.println("Faild...");
		}
	}

}
