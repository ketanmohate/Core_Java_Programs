package Day_23_01_2025;
import java.io.File;
import java.util.Scanner;

public class DynamicFolderStructureDisplay 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input the folder path
        System.out.println("Enter the folder path:");
        String path = scanner.nextLine();

        File rootFolder = new File(path);

        if (rootFolder.exists() && rootFolder.isDirectory()) 
        {
            System.out.println(rootFolder.getName() + " (parent1)");
            fetchFolderContents(rootFolder, 0, true);
        }
        else 
        {
            System.out.println("The specified path is invalid or not a directory.");
        }
    }

    /**
     * Recursive method to fetch and display folder and file contents
     *
     * @param folder      Current folder
     * @param level       Depth level for formatting
     * @param isTopLevel  Flag to handle direct child files distinctly
     */
    public static void fetchFolderContents(File folder, int level, boolean isTopLevel) 
    {
        File[] files = folder.listFiles();

        if (files != null) 
        {
            for (File file : files) 
            {
                if (file.isDirectory()) 
                {
                    // Print subfolder with proper formatting
                    System.out.println();
                    System.out.println(file.getName() + " (subparent level " + (level + 1) + ")");
                    System.out.println("========================================");
                    // Recursive call for subfolder
                    fetchFolderContents(file, level + 1, false);
                } 
                else 
                {
                    // Print files
                    if (isTopLevel) 
                    {
                        System.out.println(file.getName() + " (direct child file)");
                    } 
                    else 
                    {
                        System.out.println(file.getName());
                    }
                }
            }
        }
    }
}
