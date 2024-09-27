package com.hackerrank.java;

import com.hackerrank.java.JavaLoops2.Calculations;
import org.junit.Assert;
import org.junit.Test;

public class TestCalculations {

    Calculations calculationInstance;

    public TestCalculations(){
        calculationInstance = Calculations.getInstance();
    }
    @Test
    public void TestSecondPower(){

        int result = calculationInstance.getSecondPower(0);
        Assert.assertEquals(1, result);

        result = calculationInstance.getSecondPower(1);
        Assert.assertEquals(2, result);

        result = calculationInstance.getSecondPower(2);
        Assert.assertEquals(4, result);

        result = calculationInstance.getSecondPower(3);
        Assert.assertEquals(8, result);

        result = calculationInstance.getSecondPower(4);
        Assert.assertEquals(16, result);

        result = calculationInstance.getSecondPower(5);
        Assert.assertEquals(32, result);

        result = calculationInstance.getSecondPower(6);
        Assert.assertEquals(64, result);

    }

    @Test
    public void calculateBEquation(){
        int b = 2;
        int n = 1;
        int bEquationResult = calculationInstance.getBEquation(b, n);
        Assert.assertEquals(2, bEquationResult);

        b= 2;
        n = 2;
        bEquationResult = calculationInstance.getBEquation(b, n);
        Assert.assertEquals(6, bEquationResult);

        b= 2;
        n = 3;
        bEquationResult = calculationInstance.getBEquation(b, n);
        Assert.assertEquals(14, bEquationResult);

        b= 3;
        n = 1;
        bEquationResult = calculationInstance.getBEquation(b, n);
        Assert.assertEquals(3, bEquationResult);

        b= 3;
        n = 2;
        bEquationResult = calculationInstance.getBEquation(b, n);
        Assert.assertEquals(9, bEquationResult);

        b= 3;
        n = 3;
        bEquationResult = calculationInstance.getBEquation(b, n);
        Assert.assertEquals(21, bEquationResult);

        b= 3;
        n = 4;
        bEquationResult = calculationInstance.getBEquation(b, n);
        Assert.assertEquals(45, bEquationResult);

        b= 3;
        n = 5;
        bEquationResult = calculationInstance.getBEquation(b, n);
        Assert.assertEquals(93, bEquationResult);
    }

    @Test
    public void calculateFirstEquation(){
        int a = 0;
        int b = 2;
        int n = 10;
        String wholeResult = calculationInstance.getWholeResult(a, b, n);
        Assert.assertEquals("2 6 14 30 62 126 254 510 1022 2046", wholeResult);
    }
    @Test
    public void calculateSecondEquation(){
        int a = 5;
        int b = 3;
        int n = 5;
        String wholeResult = calculationInstance.getWholeResult(a, b, n);
        Assert.assertEquals("8 14 26 50 98", wholeResult);
    }
}
