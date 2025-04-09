package FileClass.org;

import java.io.*;

public class Q5_Check_path_is_file_or_not_Using_isFile {

	public static void main(String[] args) {
		
		String directoryPath = "C:\\Users\\ketan\\OneDrive\\Desktop\\Java_All_Programs\\File_Handling\\Written_Files\\demo.tx";
		
		File file = new File(directoryPath);

		if(file.isFile())
		{
			System.out.println("It is a file");
		}
		else {
			System.out.println("It is not file");
		}
	}

}
