package com.helix.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Grey","grey@useremail.com");
        map.put("Jo","jo@useremail.com");
        map.put("arizona","arizona@useremail.com");
        map.put("owenhunt","owenhunt@useremail.com");
        map.put("derek","derek@useremail.com");

        System.out.println(map.get("Jo"));

        for(Map.Entry<String, String> entry: map.entrySet()){
            System.out.print(entry.getKey() +"-");
            System.out.println(entry.getValue());
        }
    }
}
