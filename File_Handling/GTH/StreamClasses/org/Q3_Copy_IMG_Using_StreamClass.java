package StreamClasses.org;

import java.io.*;

public class Q3_Copy_IMG_Using_StreamClass 
{
	public static void main(String[] args) 
	{
		String copyDirectoryPath = "C:\\Users\\ketan\\OneDrive\\Pictures\\1671011416043.jpg";
		String pasteDirectoryPath = "C:\\Users\\ketan\\OneDrive\\Desktop\\Java_All_Programs\\File_Handling\\Written_Files\\img.jpg"; 
		
		try {
			FileInputStream fis = new FileInputStream(copyDirectoryPath);
			
			FileOutputStream fos = new FileOutputStream(pasteDirectoryPath);
			
			int data; 
			
			try {
				while((data = fis.read()) !=-1)
				{
					fos.write(data);
				}
			}
			catch(IOException e)
			{
				System.out.println(e.getMessage());
			}
			System.out.println("File Copy Successfully");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Sorry File Not Found");
			System.out.println(e.getLocalizedMessage());
		}
		
	}

}
