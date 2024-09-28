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


    public void whatCanItFit(int testInput) {
        System.out.print(testInput);
        willItFitByte(testInput);
    }

    private void willItFitByte(int testInput) {
        if ((testInput >= -128) && (testInput <= 127)){
            System.out.println(" can be fitted in:* byte");
        }
    }

}
