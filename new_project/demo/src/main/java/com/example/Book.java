package main.java.com.example;

/**
 * A class representing a book in a library.
 * Extends the LibraryItem class and includes additional properties for the book's name, author, and price.
 */
public class Book extends LibraryItem {
    private String name;
    private String author;
    private double price;

    /**
     * Constructs a new Book object with the specified ID, name, author, and price.
     * @param id the ID of the book
     * @param name the name of the book
     * @param author the author of the book
     * @param price the price of the book
     */
    public Book(int id, String name, String author, double price) {
        super(id);
        this.name = name;
        this.author = author;
        this.price = price;
    }

    /**
     * Returns the name of the book.
     * @return the name of the book
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the author of the book.
     * @return the author of the book
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Returns the price of the book.
     * @return the price of the book
     */
    public double getPrice() {
        return price;
    }

    /**
     * Returns a string representation of the Book object, including the ID, name, author, and price.
     * @return a string representation of the Book object
     */
    @Override
    public String toString() {
        return  "{ "   +
                "The Book id is: " + getId() +
                " || " + "The Name Of The Book Is: " + name +  
                " || " + "The Author Of The Book Is:" + author +       
                " || " + "The Price: " + price + "$" +
            " }" ;
    }
}