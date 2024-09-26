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

    }
}
