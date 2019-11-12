package com.helix.collections;

import java.sql.SQLOutput;
import java.util.Date;
import java.util.HashMap;

public class HashMapResize {

    public static void main(String[] args) {

        Date start = new Date();

        // HashMap<Integer, Book> books = new HashMap<>(); // uncomment this to see more resizing execution time will be slightly greater
        HashMap<Integer, Book> books = new HashMap(500000, 0.6f); // To simulate less resizing and hence verify lesser time to execute
        for( int i=0; i < 10000000; i++){
            books.put(i, new Book(i, "Shonda Rhimes", "Greys Anatomy",14.99));
        }

        Date end = new Date();

        System.out.println("Elapsed Time: "+ (end.getTime()-start.getTime()));
    }

}

class Book{
    int id;
    String title;
    String author;
    double price;

    public Book(int id, String title, String author, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }
}
