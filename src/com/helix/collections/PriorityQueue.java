package com.helix.collections;

import java.util.Queue;

public class PriorityQueue {
    public static void main(String[] args) {

        Queue<Person> queue = new java.util.PriorityQueue<>();
        queue.add(new Person("Grey","50"));
        queue.add(new Person("Meridith","25"));
        queue.add(new Person("Lexie","25"));
        queue.add(new Person("Karev","30"));
        queue.add(new Person("Burke","35"));
        queue.add(new Person("Christina","29"));
        queue.add(new Person("Webber","51"));
        queue.add(new Person("Izzy","25"));
        queue.add(new Person("Bailey","40"));
        queue.add(new Person("Warren","39"));

        System.out.println(queue.element()); //returns but does not remove

        while(queue.peek()!=null){
            System.out.println(queue.poll());
        }
    }



}

class Person implements Comparable<Person>{
    private String name;
    private String age;

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person otherPerson) {
        return (this.age.compareTo(otherPerson.age));
    }
}
