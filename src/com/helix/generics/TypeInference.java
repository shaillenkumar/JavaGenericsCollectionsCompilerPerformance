package com.helix.generics;

import java.util.ArrayList;
import java.util.List;

public class TypeInference {
    public static <T> void addStore(T t, List<Bucket<T>> list){
        Bucket<T> bucket = new Bucket<>();
        bucket.setItem(t);
        list.add(bucket);
        System.out.println(t.toString() + "has been added to the List.. !");
    }

    public static void main(String[] args) {
        ArrayList<Bucket<String>> list = new ArrayList<>();

        //Type Witnessing
        TypeInference.<String>addStore("Eve", list);

        // Type Inferencing - the compiler goes through the addStore and infers <T> in the generic-method addStore()
        // is going to be String since the Bucket parameter <T> is going to be String.
        TypeInference.addStore("Adam", list);
    }
}
class Bucket<T>{
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}



