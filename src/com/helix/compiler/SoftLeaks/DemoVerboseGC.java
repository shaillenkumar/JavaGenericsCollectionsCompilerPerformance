package com.helix.compiler.SoftLeaks;

import java.util.ArrayList;
import java.util.List;

public class DemoVerboseGC {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        while(true){
            Customer c = new Customer("Melanie");
            customers.add(c);
            if(customers.size()>100){
                for(int i=0; i<10; i++){
                    customers.remove(0);
                }
            }

        }
    }
}
