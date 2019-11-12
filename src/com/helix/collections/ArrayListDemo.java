package com.helix.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

    // ArrayList is similar to Vectors but it is not synchronized

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Joe");
        list.add("Kevin");
        list.add("Carl");
        list.add("Kevin");

        // Collection can be converted to 1 Dimensional Array
        Object[] arr = list.toArray();

        // Remove operation is not very efficient in ArrayList because of shifing to new indexing
        list.remove(1);

        String name = list.get(2); // Random Access is very fast..

        // Iterating List - using Iterator
        Iterator<String> iter = list.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        // Iterating List - using For-Loop
        for(String stud: list){
            System.out.println(stud);
        }

    }
}
