package com.helix.compiler.PerformanceEx1;


public class Main {

    public static void main(String[] args) {
        PrimeNumbers primeNumbers = new PrimeNumbers();
        Integer max = Integer.parseInt(args[0]);
        primeNumbers.generateNumbers(max);
    }

}