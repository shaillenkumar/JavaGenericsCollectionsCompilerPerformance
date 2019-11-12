package com.helix.Sort;

import java.util.*;

public class Sorting {
    public static void main(String[] args) {

        // Sorting Arrays
        int[] num = {5,-1,4,10,2,1};
        String[] names = {"Izzi","George","Derek","Bailey","Weber","Jackson","Waren"};
        // quicksort for primitive
        // mergesort for objects
        Arrays.sort(names);
        for(String n:names){
            System.out.println(n);
        }
        System.out.println("-------");
        // Sorting objects in Collection
        List<String>  list = new LinkedList<>();
        list.add("v");
        list.add("s");
        list.add("c");
        list.add("a");
        list.add("m");
        Collections.sort(list);
        for(String m:list){
            System.out.println(m);
        }

    }
}
