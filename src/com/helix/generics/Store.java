package com.helix.generics;
// <T> is the type parameter passed to the class
public class Store<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Store{" +
                "item=" + item +
                '}';
    }

}

 class App{
    public static void main(String[] args) {
        //Avoid raw type
        //Store store = new Store();
        //store.setItem(45);

        Store<String> storeForString = new Store<>();       // Diamond Operator
        storeForString.setItem("HELLO !!");           // No need to type cast
        System.out.println(" -> "+storeForString.getItem());

        // We can Reuse the Store for String , Double , Integer or Custom Type Objects
        Store<Integer> storeForInt =  new Store<>();
        storeForInt.setItem(10);
        System.out.println(" -> "+storeForInt.getItem());
    }
}