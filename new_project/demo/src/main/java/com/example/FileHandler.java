package main.java.com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * A utility class for handling file operations.
 */
public class FileHandler {

    /** The path to the file to be handled. */
    public static final String filePath = "books.txt";

    /**
     * Creates a new file at the specified file path, if it does not already exist.
     */
    public static void create() {
        try {
            File myObj = new File(filePath);
            if (myObj.createNewFile()) {
                // File created successfully.
            }
        } catch (IOException e) {
            // An error occurred while creating the file.
            e.printStackTrace();
        }
    }

    /**
     * Reads the contents of the file at the specified file path.
     *
     * @return The contents of the file as a string.
     */
    public static String read() {
        File Library = new File(filePath);
        Scanner myReader;
        String data = "";
        try {
            myReader = new Scanner(Library);
        } catch (FileNotFoundException e) {
            // Return empty string if file not found.
            return data;
        }
        while (myReader.hasNextLine()) {
            String line = myReader.nextLine();
            data += line + "\n";
        }
        myReader.close();

        return data;
    }

    /**
     * Writes data to the file at the specified file path, overwriting any existing data.
     *
     * @param data The data to be written to the file.
     */
    public static void write(String data) {
        try {
            FileWriter myWriter = new FileWriter(filePath);
            myWriter.write(data);
            myWriter.close();
        } catch (IOException e) {
            // An error occurred while writing to the file.
            e.printStackTrace();
        }
    }
}