package main.java.com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandler {

    public static final String filePath = "books.txt";

    public static void create() {
        try {
            File myObj = new File(filePath);
            if (myObj.createNewFile()) {
                // System.out.println("File created: " + myObj.getName());
            } else {
                // System.out.println("File already exists.");
            }
        } catch (IOException e) {
            // System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static String read() {
        File Library = new File(filePath);
        Scanner myReader;
        String data = "";
        try {
            myReader = new Scanner(Library);
        } catch (FileNotFoundException e) {
            // System.out.println("Error: " + e);
            return data;
        }
        while (myReader.hasNextLine()) {
            String line = myReader.nextLine();
            data += line + "\n";
        }
        myReader.close();

        return data;
    }

    public static void write(String data) {
        try {
            FileWriter myWriter = new FileWriter(filePath);
            myWriter.write(data);
            myWriter.close();
            // System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            // System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}