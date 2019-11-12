package com.helix.generics;

public class BoundedTypeParam {
    // This method accepts t1,t2 of type T. The <T> must extend Comparable.
    public static <T extends Comparable<T>> T calculateMin(T t1, T t2){
        if(t1.compareTo(t2)<0){
            return t1;
        }
        return t2;
    }

    public static void main(String[] args) {
        System.out.println( calculateMin(100,200));
    }
}
