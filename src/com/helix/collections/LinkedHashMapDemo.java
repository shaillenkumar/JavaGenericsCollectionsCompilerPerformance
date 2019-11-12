package com.helix.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1,"Preston Burke");
        map.put(2,"Jo Wilson");
        map.put(3,"Andrew Deluca");
        map.put(4,"George O Malley");

        for(Map.Entry<Integer, String> entry: map.entrySet() ){
            System.out.println(entry.getKey() +"-"+ entry.getValue());
        }
    }
}
