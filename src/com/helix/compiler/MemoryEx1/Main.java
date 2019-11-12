package com.helix.compiler.MemoryEx1;

public class Main {

    public static void main(String args[]) {
        Main main = new Main();
        main.start();
    }

    public void start() {
        String last = "Z";
        Container container = new Container();
        container.setInitial("C");
        another(container,last);                                        //C
        System.out.print(container.getInitial());                       //B
    }

    public void another(Container initialHolder, String newInitial) {
        newInitial.toLowerCase();                                       //z
        initialHolder.setInitial("B");                                  //B
        Container initial2 = new Container();
        initialHolder=initial2;                                         //A
        System.out.print(initialHolder.getInitial());                   //A
        System.out.print(newInitial);                                   //C
    }
}