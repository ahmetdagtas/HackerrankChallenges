package com.hackerrank.java;

import org.junit.Assert;
import org.junit.Test;

public class TestCalculations {

    @Test
    private void TestSecondPower(){
        int result = Calculations.getSecondPower(0);
        Assert.assertEquals(result, 1);

    }
}
