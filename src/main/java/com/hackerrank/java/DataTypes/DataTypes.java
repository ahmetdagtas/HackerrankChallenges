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




}
