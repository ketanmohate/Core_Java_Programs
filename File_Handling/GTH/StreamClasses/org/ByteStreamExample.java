package StreamClasses.org;
import java.io.*;

public class ByteStreamExample 
{
    public static void main(String[] args) throws IOException 
    {
        FileInputStream fis = new FileInputStream("C:\\Users\\ketan\\OneDrive\\Desktop\\Java_All_Programs\\File_Handling\\Written_Files\\demo3.txt");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\ketan\\OneDrive\\Desktop\\Java_All_Programs\\File_Handling\\Written_Files\\demo2.txt");

        int data;
        while ((data = fis.read()) != -1) 
        {
            fos.write(data); 
        }

        fis.close();
        fos.close();
        System.out.println("File copied using byte streams.");
    }
}
