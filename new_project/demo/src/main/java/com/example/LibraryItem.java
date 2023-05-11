package main.java.com.example;

/**
 * An abstract class representing a library item.
 */
public abstract class LibraryItem {
    private int id;

    /**
     * Constructs a new LibraryItem object with the specified ID.
     * @param id the ID of the library item
     */
    public LibraryItem(int id) {
        this.id = id;
    }

    /**
     * Returns the ID of the library item.
     * @return the ID of the library item
     */
    public int getId() {
        return id;
    }

    /**
     * Returns the name of the library item.
     * @return the name of the library item
     */
    public abstract String getName();
}