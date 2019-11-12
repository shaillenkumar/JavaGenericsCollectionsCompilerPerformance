package com.helix.generics;

public class StoreWithMultiParam<K,V> {
    private K key;
    private V value;

    StoreWithMultiParam(K k, V v){
        this.key=k;
        this.value=v;
    }
    @Override
    public String toString() {
        return "StoreWithMultiParam{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}

class App1{
    public static void main(String[] args) {
        StoreWithMultiParam<Integer, String> store = new StoreWithMultiParam<>(100,"Hundred");
        System.out.println(store);
    }
}
