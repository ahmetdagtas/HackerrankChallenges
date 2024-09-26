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

    public int getBEquation(int b, int power) {
        int sum = 0;
        for (int i = 0; i < power; i++)
        {
            sum += getSecondPower(i) * b;
        }
        return sum;
    }
}
