package com.helix.Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo2 {
    public static void main(String[] args) {
        List<Book1> bookList = new ArrayList();
        bookList.add(new Book1("Sapiens","Yuval Noah",13.6));
        bookList.add(new Book1("Brief History Of Time","Stephen Hawkings",15.6));
        bookList.add(new Book1("Life And Times","Einsten",9.6));

        Collections.sort(bookList);
        System.out.println(bookList);
    }

}

class Book1 implements Comparable<Book1>{
    private String author;
    private String book;
    private double price;

    public Book1(String author, String book, double price) {
        this.author = author;
        this.book = book;
        this.price = price;
    }

    @Override
    public int compareTo(Book1 otherBook) {
        return Double.compare(this.price, otherBook.price);
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", book='" + book + '\'' +
                ", price=" + price +
                '}';
    }

}

