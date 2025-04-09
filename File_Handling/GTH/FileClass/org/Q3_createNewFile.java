package FileClass.org;

import java.io.*;

public class Q3_createNewFile 
{
	public static void main(String[] args) 
	{
		String directoryPath = "C:\\Users\\ketan\\OneDrive\\Desktop\\Java_All_Programs\\File_Handling\\Written_Files";
		
		File file = new File(directoryPath,"Q3_.txt");
		
		try
		{
			if(file.createNewFile())
			{
				System.out.println("File Create Successfully");
			}
			else {
				System.out.println("Some Problem....");
			}
		}
		catch(IOException e){
			System.out.println(e);
		}

	}
}
