package WriterClass.org;

import java.io.*;
import java.util.*;

public class Q1_Write_A_File {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		
		String directoryPath = "C:\\Users\\ketan\\OneDrive\\Desktop\\Java_All_Programs\\File_Handling\\Written_Files\\demo.txt";
		
		FileWriter fileWriter = new FileWriter(directoryPath,true);
		
		fileWriter.write(sc.nextLine());
	
		fileWriter.close();
	}

}
