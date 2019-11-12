package com.helix.generics;

import java.util.Arrays;
import java.util.List;

public class UpperBoundedWildCardEx2 {
//  The term List<Number> is more restrictive than List<? extends Number> because the former matches a list of type Number
//  only,whereas the latter matches a list of type Number or any of its subclasses.
    public static void sum(List<? extends Number> list){
        double sum = 0.0;
        for(Number n:list){
            sum = sum  + n.doubleValue();
        }
        System.out.println(sum);
        ///list.add(1);   // cannot add new element
    }
    public static void main(String[] args) {
        sum(Arrays.asList(1,3,5,8.5,10));
    }
}
