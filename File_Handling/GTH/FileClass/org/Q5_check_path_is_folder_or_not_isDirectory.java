package FileClass.org;

import java.io.*;

public class Q5_check_path_is_folder_or_not_isDirectory 
{
	public static void main(String[] args) 
	{	
		String directoryPath = "C:\\Users\\ketan\\OneDrive\\Desktop\\Java_All_Programs\\File_Handling\\Written_Files";
		
		File file = new File(directoryPath);
		
		if(file.isDirectory())
		{
			System.out.println("Yes it is a folder");
		}
		else
		{
			System.out.println("No it is not a folder");
		}
	}
}