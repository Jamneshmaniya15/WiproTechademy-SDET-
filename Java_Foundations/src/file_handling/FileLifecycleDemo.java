package file_handling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileLifecycleDemo {

    private static final String FILE_NAME = "Wipro_Training_Log.txt";

    public static void main(String[] args) {
        System.out.println("--- Starting File Lifecycle Demonstration ---");

        // 1. Create a new file
        if (createNewFile(FILE_NAME)) {
            
            // 2. Initial Write
            writeToFile(FILE_NAME, "Initial Record: SDET Training Started.");

            // 3. Append new data
            appendToFile(FILE_NAME, "\nUpdate: Java Foundations Module Completed.");

            // 4. Read and Display content
            readFile(FILE_NAME);
    
        } else {
            System.out.println("Setup could not be completed.");
        }
    }

    public static boolean createNewFile(String path) {
        try {
            File file = new File(path);
            if (file.createNewFile()) {
                System.out.println("File Created: " + path);
                return true;
            } else {
                System.out.println("File already exists.");
                return true;
            }
        } catch (IOException e) {
            System.err.println("[ERROR] Could not create file.");
            e.printStackTrace();
            return false;
        }
    }

    public static void writeToFile(String path, String content) {
        try (FileWriter writer = new FileWriter(path)) {
            writer.write(content);
            System.out.println("[WRITE] Data written to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void appendToFile(String path, String content) {
        try (FileWriter writer = new FileWriter(path, true)) {
            writer.write(content);
            System.out.println("New data added to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFile(String path) {
        System.out.println("\n--- Reading File Content ---");
        try (FileReader reader = new FileReader(path)) {
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            System.out.println("\n--- End of File ---\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void deleteFile(String path) {
        File file = new File(path);
        if (file.delete()) {
            System.out.println("File removed successfully.");
        } else {
            System.out.println("File not found or could not be deleted.");
        }
    }
}