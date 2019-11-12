package com.helix.Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo3 {
    public static void main(String[] args) {
        List<Book2> bookList = new ArrayList();
        bookList.add(new Book2("Sapiens","Yuval Noah",13.6));
        bookList.add(new Book2("Brief History Of Time","Stephen Hawkings",15.6));
        bookList.add(new Book2("Life And Times","Einsten",9.6));

        Collections.sort(bookList);
        System.out.println(bookList);
    }

}

class Book2 implements Comparable<Book2>{
    private String author;
    private String book;
    private double price;

    public Book2(String author, String book, double price) {
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

    // To print in Descending Order
    @Override
    public int compareTo(Book2 otherBook) {
        if(otherBook.price > this.price) return 1;
        if(otherBook.price == this.price) return 0;
        else
            return -1;
    }
}

