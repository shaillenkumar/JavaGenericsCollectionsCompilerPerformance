package com.helix.Sort.ComparatorDemo;

import java.util.Comparator;

public class ComparatorForPrice implements Comparator<Book>{

    @Override
    public int compare(Book book1, Book book2) {
        if(book1.getPrice() > book1.getPrice()) return 1;
        if(book1.getPrice() == book1.getPrice()) return 0;
            else return -1;
    }
}
