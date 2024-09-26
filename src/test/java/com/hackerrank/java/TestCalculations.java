package com.hackerrank.java;

import com.hackerrank.java.JavaLoops2.Calculations;
import org.junit.Assert;
import org.junit.Test;

public class TestCalculations {

    @Test
    public void TestSecondPower(){
        int result = Calculations.getSecondPower(0);
        Assert.assertEquals(result, 1);

        result = Calculations.getSecondPower(1);
        Assert.assertEquals(result, 2);

        result = Calculations.getSecondPower(2);
        Assert.assertEquals(result, 4);

        result = Calculations.getSecondPower(3);
        Assert.assertEquals(result, 8);

        result = Calculations.getSecondPower(4);
        Assert.assertEquals(result, 16);

        result = Calculations.getSecondPower(5);
        Assert.assertEquals(result, 32);

        result = Calculations.getSecondPower(6);
        Assert.assertEquals(result, 64);

    }
}
