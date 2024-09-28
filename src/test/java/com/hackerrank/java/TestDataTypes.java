package com.hackerrank.java;

import com.hackerrank.java.DataTypes.DataTypes;
import org.junit.Test;

public class TestDataTypes {

    DataTypes dataTypes;

    public TestDataTypes(){
        dataTypes = DataTypes.getInstance();
    }

    @Test
    public void testByte(){

        int testInput = -126;
        DataTypes.getInstance().whatCanItFit(testInput);
    }
}
