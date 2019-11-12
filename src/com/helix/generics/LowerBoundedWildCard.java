package com.helix.generics;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class LowerBoundedWildCard {
    public static void showList(List<? super Number> list){
        list.add(new Double("1"));
        list.add(new Float("1"));
       // list.add(new Object("1")); // You can only add element of Number subtype

        for(Object o: list){
            System.out.println(o);
        }
    }
    public static void main(String[] args) {
        List<Serializable> list = new ArrayList<>();
        list.add("Adam");
        list.add("Joe");
        list.add("Jim");
        LowerBoundedWildCard.showList(list);
    }
}
