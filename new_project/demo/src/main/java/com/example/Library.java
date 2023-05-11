package main.java.com.example;

import java.util.ArrayList;
import java.util.List;

/**
 * A class representing a library of books.
 */
public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    String splitter = ",";

    public void loadBooksToList() {
        // use split
        String data = FileHandler.read();
        /*
            data = "1111,sss,sss,111.0\n
                    222,ddd,ddd,222.0\n"
        */
        String[] lines = data.split("\n"); // = {"1111,sss,sss,111.0", "222,ddd,ddd,222.0"}
        for (int i = 0; i < lines.length; i++) {
            String line = lines[i]; // "1111,sss,sss,111.0"
            String[] parts = line.split(splitter); // = {"1111", "sss", "sss", "111.0"}
            Book book = new Book(Integer.parseInt(parts[0]), parts[1], parts[2], Double.parseDouble(parts[3]));
            books.add(book);
        }
    }
    public void saveBooksToFile() {
        String data = "";
        for (int i= 0; i < books.size(); i++) {
            Book element = books.get(i);
            // String data = element.getId() + splitter + element.getName() + 
            data +=  String.join(splitter, Integer.toString(element.getId()), element.getName(), element.getAuthor(), Double.toString(element.getPrice())) + "\n";

            FileHandler.write(data);
        }
    }

    /**
     * Adds a book to the library.
     * @param book the book to add
     */
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully");
    }

    /**
     * Removes a book from the library based on its ID.
     * @param id the ID of the book to remove
     * @return true if the book was successfully removed, false otherwise
     */
    public boolean removeBook(int id) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == id) {
                books.remove(i);
                System.out.println("Book removed successfully");
                return false;
            }
        }
        System.out.println("Book not found");
        return false;
    }

    /**
     * Displays all books in the library.
     */
    public void displayBooks() {
        if (books.size() == 0) {
            System.out.println("No books in the library");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    /**
     * Searches for books in the library based on their name.
     * @param name the name of the book to search for
     * @return a list of all books with the specified name, or an empty list if no books are found
     */
    public List<Book> searchBook(String name) {
        boolean found = false;
        for (Book book : books) {
            if (book.getName().equalsIgnoreCase(name)) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Book not found");
        }
        return books;
    }
}