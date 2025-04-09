package ReaderClass.org;

import java.io.*;

public class Q2_Read_One_Line_frome_file_using_readLine_Method {

	public static void main(String[] args){

		String directoryPath = "C:\\Users\\ketan\\OneDrive\\Desktop\\Java_All_Programs\\File_Handling\\Written_Files\\demo.txt";
		
		try {
			
			FileReader fr = new FileReader(directoryPath);
			
			BufferedReader br = new BufferedReader(fr);
			
			String line;
			
			try
			{
				while((line = br.readLine()) != null)
				{
					System.out.println(line);
				}
			}
			catch(IOException e)
			{
				System.out.println("Some problem....");
			}
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Some Problem....");
		}
			
		
	}

}
