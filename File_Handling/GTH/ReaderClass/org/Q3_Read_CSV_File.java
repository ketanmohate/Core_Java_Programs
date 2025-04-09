package ReaderClass.org;

import java.io.*;

public class Q3_Read_CSV_File 
{
	public static void main(String[] args) 
	{
		String directiryPath = "C:\\Users\\ketan\\OneDrive\\Desktop\\Java_All_Programs\\File_Handling\\Written_Files\\ABC.csv";
		
		
		try {
			
			FileReader fr = new FileReader(directiryPath);
			
			BufferedReader bf = new BufferedReader(fr);
			
			String line;
			
			try
			{
				while((line = bf.readLine()) !=null)
				{
					String[] strArr = line.split(",");
					
					for (String str : strArr) 
					{
						System.out.print(str + "\t\t");
					}
					System.out.println();
				}
			}
			catch(IOException e) {
				System.out.println("Some Problem...");
			}
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File Not Found...");
		}
		
		
		
	}

}
