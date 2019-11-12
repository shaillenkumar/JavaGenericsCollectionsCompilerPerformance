package com.helix.generics;

public class GenericMethods {

    // this method accepts argument of type <T>
    public <T> void showItem(T t){
        System.out.println("This item is : "+t.toString());
    }

    // this method accepts argument of Array of type <T>[]
    public <T> void showArray(T[] myArr){
        for(T item: myArr){
            System.out.println(item.toString());
        }
    }

    public static void main(String[] args) {
        GenericMethods genericMethods = new GenericMethods();
        genericMethods.showItem(100);

        Integer[] arr = {2,3,4,8};
        genericMethods.showArray(arr);
    }
}
