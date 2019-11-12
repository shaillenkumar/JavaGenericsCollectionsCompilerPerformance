package com.helix.collections;

import java.util.Date;
import java.util.HashMap;
import java.util.Objects;

public class HashMapCustomHashCode {
    public static void main(String[] args) {

    Date start = new Date();

    HashMap<Integer, Booklets> books = new HashMap<>();

    Booklets b1 = new Booklets(1, "Shonda Rhimes", "Greys Anatomy",14.99);
    Booklets b2 = new Booklets(2, "Shonda Rhimes", "Greys Anatomy",14.99);
    System.out.println(b1.hashCode());
    System.out.println(b2.hashCode());

    Date end = new Date();

    System.out.println("Elapsed Time: "+ (end.getTime()-start.getTime()));
}

}

class Booklets{
    int id;
    String title;
    String author;
    double price;

    public Booklets(int id, String title, String author, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Booklets booklets = (Booklets) o;

        if (id != booklets.id) return false;
        if (Double.compare(booklets.price, price) != 0) return false;
        if (title != null ? !title.equals(booklets.title) : booklets.title != null) return false;
        return author != null ? author.equals(booklets.author) : booklets.author == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
