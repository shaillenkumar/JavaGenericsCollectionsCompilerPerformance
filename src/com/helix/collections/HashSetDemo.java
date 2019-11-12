package com.helix.collections;

import java.util.Set;
import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Christina");
        set.add("George O Malley");
        set.add("Preston Burke");
        set.add("Jo Wilson");

        for(String greyChar: set){
            System.out.println(greyChar);
        }
    }
}
