package WriterClass.org;

import java.io.*;
import java.util.*;

public class Q3_Write_A_CSV_file 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		String directoryPath = "C:\\Users\\ketan\\OneDrive\\Desktop\\Java_All_Programs\\File_Handling\\Written_Files\\ABC.csv";
		
		try {
			FileWriter fw = new FileWriter(directoryPath);
			
			BufferedWriter bf = new BufferedWriter(fw);
			
			int i=0;
			System.out.println("Write a data");
			while(i<4)
			{
				bf.write(sc.nextLine());
				bf.newLine();
				i++;
			}
			
			System.out.println("Write Successfully....");
			bf.close();
			fw.close();
		}
		catch(IOException e)
		{
			System.out.println("Some problem...");
		}	
	}

}
