package main.java.com.example;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class LibraryFile{
  /**
   * @param args
   * @throws FileNotFoundException
   */
  public static void LibraryFiles () throws FileNotFoundException  {
    File Library = new File("LibraryFiles");
    Scanner myReader = new Scanner (Library);
    while (myReader.hasNextLine()) {
      String data = myReader.nextLine();
      System.out.println(data);
    }
    myReader.close();
  }
}