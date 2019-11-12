package com.helix.generics;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundedWildCard2 {


    public static void addCat(List<? super Cat> catList) {
        //catList.add(new Tiger());
        System.out.println("Cat Added");
    }

    public static void main(String[] args) {
        List<Animal> animalList= new ArrayList<Animal>();
        List<Cat> catList= new ArrayList<Cat>();
        List<Tiger> tigerCatList= new ArrayList<Tiger>();
        List<Dog> DogList= new ArrayList<Dog>();

        addCat(animalList);
        addCat(catList);

        //compile time error
        //can not add list of subclass Tiger of Cat class
        // addCat(tigerCatList);

        //compile time error
        //can not add list of subclass Dog of Superclass Animal
        // addCat(DogList)


    }
    class Animal{ }
    class Cat extends Animal{ }
    class Tiger extends Cat{ }
    class Dog extends Animal { }
}