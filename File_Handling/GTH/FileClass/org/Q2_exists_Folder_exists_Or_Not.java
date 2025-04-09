package FileClass.org;

import java.io.*;

public class Q2_exists_Folder_exists_Or_Not {

	public static void main(String[] args) {

		String directoryPath = "C:\\Users\\ketan\\OneDrive\\Desktop\\Java_All_Programs\\File_Handling\\Written_Files\\demo.txt";
		
		File file = new File(directoryPath);
		
		if(file.exists()) 
		{
			System.out.println("File/Folder is exists");
		}
		else
		{
			System.out.println("File/Folder is not exists");
		}
	}

}
