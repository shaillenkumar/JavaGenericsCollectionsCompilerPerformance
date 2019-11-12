package com.helix.collections;

import java.util.LinkedList;
import java.util.Queue;
//Queues operate in the FIFO structure.

public class QueuedLinkedList {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("Grey");
        queue.add("Meridith");
        queue.add("Karev");
        queue.add("Burke");
        queue.add("Christina");
        queue.add("Webber");
        queue.add("Izzy");

        System.out.println(queue.poll()); // element removes and returns the FIRST element in the queue

        System.out.println(queue.element()); // element returns the FIRST element

        for(String greysanatomy: queue){
            System.out.println("- "+greysanatomy);
        }
    }
}
