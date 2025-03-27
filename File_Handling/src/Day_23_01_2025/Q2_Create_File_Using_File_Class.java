package Day_23_01_2025;
/*
 * Q2. Create File using File class?
 */
import java.io.*;

public class Q2_Create_File_Using_File_Class 
{
	public static void main(String[] args) throws IOException 
	{
		String fileName = "xyz.doc";
		
		File f = new File("C:\\Users\\ketan\\OneDrive\\Desktop\\File_Handling\\" + fileName);
		
		if(f.exists())
		{
			System.out.println("Some Problem!" + f.getAbsolutePath());
		}
		else
		{
			if (f.createNewFile())
			{
				System.out.println("Folder Create successfully" + f.getAbsolutePath());
			}
			else
			{
				System.out.println("Failed to create the file.");
			}
		}
			
	}

}
