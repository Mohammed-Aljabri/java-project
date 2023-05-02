package com.example;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Hello world!
 *
Library library = new Library();

        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 1960);
        Book book3 = new Book("1984", "George Orwell", 1949);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.printBooks();

        library.borrowBook("To Kill a Mockingbird");

        library.printBooks();

        library.returnBook("To Kill a Mockingbird");

        library.printBooks();

        try {
            library.saveToFile("books.txt");
        } catch (IOException e) {
            System.out.println("Error saving file: " + e.getMessage());
        }

        try {
            library.loadFromFile("books.txt");
        } catch (IOException e) {
            System.out.println("Error loading file: " + e.getMessage());
        }

        library.printBooks();

 */
public class App 
{
    
    public static void main( String[] args )
    {

        Library library = new Library();

        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 1960);
        Book book3 = new Book("1984", "George Orwell", 1949);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.printBooks();

        library.borrowBook("To Kill a Mockingbird");

        library.printBooks();

        library.returnBook("To Kill a Mockingbird");

        library.printBooks();

        try {
            library.saveToFile("books.txt");
        } catch (IOException e) {
            System.out.println("Error saving file: " + e.getMessage());
        }

        try {
            library.loadFromFile("books.txt");
        } catch (IOException e) {
            System.out.println("Error loading file: " + e.getMessage());
        }

        library.printBooks();

        

      
    }
    
}
