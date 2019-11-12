package com.helix.collections;

import java.util.List;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        /*
        final int intialCapacity=10;
        final int incrementalCapacity=15;
        List<Integer> vector = new Vector<>(intialCapacity,incrementalCapacity);
        */
        List<Integer> vector = new Vector<>();
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(50);

        for(Integer i: vector){
            System.out.println("Integer: "+i);
        }
    }

}
