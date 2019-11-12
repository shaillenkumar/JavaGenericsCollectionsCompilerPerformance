package com.helix.collections;

import java.util.Stack;

// Stack follows the LIFO structure.

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(50); // First IN
        stack.push(40);
        stack.push(20);
        stack.push(30);
        stack.push(10); // Last IN



        System.out.println("peek : "+stack.peek()); // return top of stack element does not delete.
        System.out.println("pop  : "+ stack.pop()); // deletes and returns top of stack element.

        for(Integer i: stack){
            System.out.println(i);
        }
    }
}
