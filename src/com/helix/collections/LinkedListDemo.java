package com.helix.collections;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Joe");
        list.add("Kevin");
        list.add("Carl");
        list.add("Kevin");

        // Converting to 1-D array
        list.toArray();
        System.out.println(list.get(1));// Random access not very fast compared to ArrayList.

        list.remove(3);  // Very efficient used for remove-Heavy applications

        System.out.println(list.size());
        System.out.println(list.isEmpty());
        // Iterating the List
        for (String name: list){
            System.out.println(name);
        }

    }
}
