package com.helix.Sort.ComparatorDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Book> books = new ArrayList();
        books.add(new Book("Sapiens","Yuval Noah",13.6));
        books.add(new Book("Brief History Of Time","Stephen Hawkings",15.6));
        books.add(new Book("Life And Times","Einsten",9.6));
        Collections.sort(books, new ComparatorForPrice());
       // Collections.sort(books,new BookComparator().reversed());
       // Collections.sort(books,new BookComparator());
        for(Book b: books) {
            System.out.println(b.getAuthor()+" - "+b.getPrice());
        }
    }
}
