package com.helix.Sort.ComparatorDemo;

public class Book {
    private String author;
    private String book;
    private double price;

    public Book(String author, String book, double price) {
        this.author = author;
        this.book = book;
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
