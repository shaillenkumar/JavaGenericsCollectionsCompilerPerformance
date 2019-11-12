package com.helix.compiler.StringPool;

public class ExploringStrings {
    public static void main(String[] args) {
        String one = "hello";
        String two = "hello";
        System.out.println(one.equals(two));
        System.out.println(one==two);

        String threee="4";
        String fourr= new Integer(4).toString();

        System.out.println(threee.equals(fourr));
        System.out.println(threee==fourr); //four is derived from intermediate calculation.will create a new object

        String three="4";
        String four= new Integer(4).toString().intern();

        System.out.println(three.equals(four));
        System.out.println(three==four);

    }
}
