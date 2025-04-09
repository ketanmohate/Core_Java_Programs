package WriterClass.org;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MultiLineFileWriter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text (type 'exit' to stop):");

        try (FileWriter writer = new FileWriter("C:\\Users\\ketan\\OneDrive\\Desktop\\Java_All_Programs\\File_Handling\\Written_Files\\demo.txt", true)) 
        { // 'true' for appending
            String line;
            while (true) 
            {
                line = scanner.nextLine();
                if (line.equalsIgnoreCase("exit")) 
                { // Exit condition
                    break;
                }
                writer.write(line + System.lineSeparator()); // Write to file
            }
            System.out.println("File writing completed.");
        } catch (IOException e) {
            System.err.println("Error occurred: " + e.getMessage());
        }

        scanner.close();
    }
}