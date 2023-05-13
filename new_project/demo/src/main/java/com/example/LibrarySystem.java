package main.java.com.example;

import java.io.IOException;
import java.util.Scanner;

/**
 * A class representing a library system that allows users to interact with a
 * library.
 */
public class LibrarySystem {

    /**
     * The main method that runs the library system.
     * 
     * @param args the command line arguments (not used)
     * @throws IOException if an I/O error occurs
     */
    public static void main(String[] args) throws IOException {
        // LibraryFileCreat.Files();
        // File myObj = new File("filename.txt");
        Scanner scanner = new Scanner(System.in);
        FileHandler.create();

        // Scanner myReader = new Scanner(myObj);
        // while (myReader.hasNextLine()) {
        // String data = myReader.nextLine();
        // System.out.println(data);
        // }
        Library library = new Library();
        library.loadBooksToList();
        int choice = 0;
        {
            do {
                System.out.println("1. Add Book\n2. Remove Book\n3. Display Books\n4. Search Book\n5. Exit");
                System.out.print("Enter your choice: ");
                try {
                    choice = scanner.nextInt();
                    scanner.nextLine();
                    switch (choice) {
                        case 1:
                            System.out.print("Enter book id (Numbers Only): ");
                            int id = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Enter book name: ");
                            String name = scanner.nextLine();
                            System.out.print("Enter author name: ");
                            String author = scanner.nextLine();
                            System.out.print("Enter book price (Numbers only) : ");
                            double price = scanner.nextDouble();
                            library.addBook(new Book(id, name, author, price));
                            library.saveBooksToFile();
                            break;
                        case 2:
                            System.out.print("Enter book id (Numbers only) : ");
                            id = scanner.nextInt();
                            library.removeBook(id);
                            library.saveBooksToFile();
                            break;
                        case 3:
                            library.displayBooks();

                            break;
                        case 4:
                            System.out.print("Enter book name: ");
                            name = scanner.nextLine();
                            library.searchBook(name);
                            break;
                        case 5:
                            System.out.println("Exiting...");
                            break;
                        default:
                            System.out.println("Invalid choice");
                    }
                } catch (Exception e) {
                    System.out.println("whoops Something Went Wrong Please Try Again");
                    scanner.nextLine(); // consume the rest of the line to clear the input buffer
                }

            } while (choice != 5);
            scanner.close();

        }

    }

}
