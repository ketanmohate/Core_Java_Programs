package ReaderClass.org;

import java.io.*;

public class Q4_Copy_IMG_Using_Reader_And_Writer_Class 
{
	public static void main(String[] args) 
	{
		String copyDirectoryPath = "C:\\Users\\ketan\\OneDrive\\Pictures\\1671011416043.jpg";
		String pasteDirectoryPath = "C:\\Users\\ketan\\OneDrive\\Desktop\\Java_All_Programs\\File_Handling\\Written_Files\\Reader_Img.jpg";
		
		try {
			FileReader fr = new FileReader(copyDirectoryPath);
			
			try {
				FileWriter fw = new FileWriter(pasteDirectoryPath);
				
				int data;
				while((data = fr.read()) !=-1)
				{
					fw.write(data);
				}
				System.out.println("Copy Img Successfully... but can not show peoperly becouse file we use filereader ");
			}
			catch(IOException e){
				System.out.println(e.getMessage());
			}
		}
		catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
