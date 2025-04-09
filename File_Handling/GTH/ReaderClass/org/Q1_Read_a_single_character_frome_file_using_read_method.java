package ReaderClass.org;

import java.io.*;

public class Q1_Read_a_single_character_frome_file_using_read_method {

	public static void main(String[] args) {

		String directoryPath = "C:\\Users\\ketan\\OneDrive\\Desktop\\Java_All_Programs\\File_Handling\\Written_Files\\demo2.txt";
		
		try {
			
			FileReader fr = new FileReader(directoryPath);
			
			int data;
			
			while((data = fr.read()) != -1)
			{
				System.out.print((char) data);
			}
			
			fr.close();
			
		}
		catch(IOException e)
		{
			System.out.println("Some Peoblem.....");
		}
		
	}

}
