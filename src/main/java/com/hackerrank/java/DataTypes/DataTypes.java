package com.hackerrank.java.DataTypes;

public class DataTypes {

    private static DataTypes instance = null;
    private DataTypes(){
    }

    public static synchronized DataTypes getInstance(){
        if (instance == null) {
            instance = new DataTypes();
        }
        return instance;
    }


    public void whatCanItFit(long testInput) {
        System.out.print(testInput);
        willItFitByte(testInput);
        willItFitShort(testInput);
    }

    private void willItFitByte(long testInput) {
        if ((testInput >= -Math.pow(2,7)) && (testInput <= Math.pow(2,7)-1)){
            System.out.println(" can be fitted in:\n* byte");
        }
    }
    private void willItFitShort(long testInput) {
        if ((testInput >= -Math.pow(2,15)) && (testInput <= Math.pow(2,15)-1)){
            System.out.println(" can be fitted in:\n* short");
        }
    }

}
