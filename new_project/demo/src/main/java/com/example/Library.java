package com.example;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void removeBook(Book book) {
        this.books.remove(book);
    }

    public void printBooks() {
        for (Book book : this.books) {
            System.out.println(book.toString());
        }
    }

    public void borrowBook(String title) {
        for (Book book : this.books) {
            if (book.getTitle().equals(title)) {
                if (book.isBorrowed()) {
                    System.out.println("Sorry, this book is already borrowed.");
                } else {
                    book.setBorrowed(true);
                    System.out.println("You have successfully borrowed " + book.getTitle() + ".");
                }
                return;
            }
        }
        System.out.println("Sorry, we don't have that book.");
    }

    public void returnBook(String title) {
        for (Book book : this.books) {
            if (book.getTitle().equals(title)) {
                book.setBorrowed(false);
                System.out.println("You have successfully returned " + book.getTitle() + ".");
                return;
            }
        }
        System.out.println("Sorry, we don't have that book.");
    }

    public void saveToFile(String filename) throws IOException {
        FileWriter writer = new FileWriter(filename);
        for (Book book : this.books) {
            writer.write(book.getTitle() + "," + book.getAuthor() + "," + book.getYear() + "," + book.isBorrowed() + "\n");
        }
        writer.close();
    }

    public void loadFromFile(String filename) throws IOException {
        Scanner scanner = new Scanner(new File(filename));
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(",");
            String title = parts[0];
            String author = parts[1];
            int year = Integer.parseInt(parts[2]);
            boolean borrowed = Boolean.parseBoolean(parts[3]);
            Book book = new Book(title, author, year);
            book.setBorrowed(borrowed);
            this.books.add(book);
        }
        scanner.close();
    }
}