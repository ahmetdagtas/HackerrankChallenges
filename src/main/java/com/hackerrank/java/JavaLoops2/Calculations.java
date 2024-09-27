package com.hackerrank.java.JavaLoops2;

public class Calculations {

    private static Calculations instance = null;
    private Calculations(){
    }

    public static synchronized Calculations getInstance(){
        if (instance == null) {
            instance = new Calculations();
        }
        return instance;
    }

    public int getSecondPower(int power) {
        return (int)Math.pow(2, power);
    }

    public int getBEquation(int b, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++)
        {
            sum += getSecondPower(i) * b;
        }
        return sum;
    }

    public String getWholeResult(int a, int b, int n) {
        StringBuilder finalText = new StringBuilder();
        int sum = 0;
        for (int i = 0; i < n; i++)
        {
            System.out.println("a " + a);
            System.out.println("getSecondPower(i) " + getSecondPower(i));
            System.out.println("b " + b);
            sum += a + getSecondPower(i) * b;
            System.out.println("sum = a + getSecondPower(i) * b -> " + sum);
            finalText.append(sum);
            if (i != n-1) {
                finalText.append(" ");
            }

            System.out.println();
        }
        return finalText.toString();
    }
}
