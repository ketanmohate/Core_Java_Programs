package ObjectOutputStreamClass;

import java.io.*;

public class Q2_Deserialization_App {

	public static void main(String[] args) throws IOException, ClassNotFoundException, FileNotFoundException {

		String directoryPath = "C:\\Users\\ketan\\OneDrive\\Desktop\\Java_All_Programs\\File_Handling\\Written_Files\\serialize.txt";

		FileInputStream fis = new FileInputStream(directoryPath);
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Employee data = (Employee)ois.readObject();
		
		try {
			while(true)
			{
				System.out.println(data.getId() + "\t" + data.getName() + "\t" + data.getSalary());
				data = (Employee) ois.readObject();
			}
		}
		catch(EOFException e)
		{
//			System.out.println(e);
		}
	}
}
