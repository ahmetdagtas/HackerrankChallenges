package com.hackerrank.java;

import com.hackerrank.java.JavaLoops2.Calculations;
import org.junit.Assert;
import org.junit.Test;

public class TestCalculations {

    @Test
    public void TestSecondPower(){

        int result = Calculations.getInstance().getSecondPower(0);
        Assert.assertEquals(1, result);

        result = Calculations.getInstance().getSecondPower(1);
        Assert.assertEquals(2, result);

        result = Calculations.getInstance().getSecondPower(2);
        Assert.assertEquals(4, result);

        result = Calculations.getInstance().getSecondPower(3);
        Assert.assertEquals(8, result);

        result = Calculations.getInstance().getSecondPower(4);
        Assert.assertEquals(16, result);

        result = Calculations.getInstance().getSecondPower(5);
        Assert.assertEquals(32, result);

        result = Calculations.getInstance().getSecondPower(6);
        Assert.assertEquals(64, result);

    }

    @Test
    public void calculateBEquation(){
        int b = 2;
        int power = 1;
        int bEquationResult = Calculations.getInstance().getBEquation(b, power);

        Assert.assertEquals(2, bEquationResult);
    }
}
