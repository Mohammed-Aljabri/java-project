package com.example;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Book {
    private String title;
    private String author;
    private int year;
    private boolean borrowed;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.borrowed = false;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getYear() {
        return this.year;
    }

    public boolean isBorrowed() {
        return this.borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    public String toString() {
        String status = this.borrowed ? "borrowed" : "available";
        return this.title + " by " + this.author + " (" + this.year + ") - " + status;
    }
}