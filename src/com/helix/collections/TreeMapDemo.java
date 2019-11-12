package com.helix.collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(3,"Andrew Deluca");
        map.put(4,"George O Malley");
        map.put(1,"Preston Burke");
        map.put(2,"Jo Wilson");

        // map.entrySet()
        for(Map.Entry<Integer, String> entry: map.entrySet()){
            System.out.println(entry.getKey() + " = "+ entry.getValue());
        }
        //map.keySet()
        for(Integer key: map.keySet()){
            System.out.println(key +" -> " + map.get(key));
        }
    }
}
