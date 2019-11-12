package com.helix.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class BoundedWildCard {
    public static void main(String[] args) {
        List<Circle> circles = new ArrayList<>();
        BoundedWildCard.print(circles);
    }
    public static void print(Collection<? extends Shape> c){  // this means Shape is the upper bound of wildcard.
        for(Shape o : c){
            System.out.println(o);
        }
    }
}

class Shape{
    public  void draw(){
        System.out.println("Draw Common");
    }
}
class Circle extends Shape{
    public  void draw(){
        System.out.println("Draw Circle");
    }
}
class Rectangle extends Shape{
    public  void draw(){
        System.out.println("Draw Rectangle");
    }
}
