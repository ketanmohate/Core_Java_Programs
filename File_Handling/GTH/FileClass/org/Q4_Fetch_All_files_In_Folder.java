package FileClass.org;

import java.io.*;

public class Q4_Fetch_All_files_In_Folder {

	public static void main(String[] args) {
		
		String directoryPath = "C:\\Users\\ketan\\OneDrive\\Desktop\\Java_All_Programs\\File_Handling\\GTH\\GTH\\org";
		
		File file = new File(directoryPath);
		
		File[] fileArr = file.listFiles();
		
		for (int i = 0; i < fileArr.length; i++) 
		{
			System.out.println(fileArr[i]);
		}
	}

}
