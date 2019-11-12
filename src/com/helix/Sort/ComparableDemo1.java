package com.helix.Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo1 {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList();
        bookList.add(new Book("Sapiens","Yuval Noah",13.6));
        bookList.add(new Book("Brief History Of Time","Stephen Hawkings",15.6));
        bookList.add(new Book("Life And Times","Einsten",9.6));

        Collections.sort(bookList);
        System.out.println(bookList);
    }


}

class Book implements Comparable<Book> {
    private String author;
    private String book;
    private double price;

    public Book(String author, String book, double price) {
        this.author = author;
        this.book = book;
        this.price = price;
    }


    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", book='" + book + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Book otherBook) {
        return this.author.compareTo(otherBook.author);
    }
}

