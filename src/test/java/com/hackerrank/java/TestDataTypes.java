package com.hackerrank.java;

import com.hackerrank.java.DataTypes.DataTypes;
import org.junit.Test;

import java.util.Scanner;

public class TestDataTypes {

    DataTypes dataTypes;

    public TestDataTypes(){
        dataTypes = DataTypes.getInstance();
    }

    @Test
    public void testByte(){
        //DataTypes.getInstance().whatCanItFit(213333333333333333333333333333333333);
    }


    @Test
    public void testByteHackerrank(){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {
            boolean canBeFitted = false;
            try
            {
                byte x=sc.nextByte();
                printCanBeFitted(canBeFitted, x);
                if(x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) System.out.println("* byte");
                canBeFitted = true;
            }
            catch (Exception e) {}

            try
            {
                short x=sc.nextShort();
                printCanBeFitted(canBeFitted, x);
                if(x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) System.out.println("* short");
                canBeFitted = true;
            }
            catch (Exception e) {}

            try
            {
                int x=sc.nextInt();
                printCanBeFitted(canBeFitted, x);
                if(x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) System.out.println("* integer");
                canBeFitted = true;
            }
            catch (Exception e) {}

            try
            {
                long x=sc.nextLong();
                printCanBeFitted(canBeFitted, x);
                if(x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) System.out.println("* long");
                canBeFitted = true;
            }
            catch (Exception e) {}

            if (!canBeFitted) {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }

    private static void printCanBeFitted(boolean canBeFitted, long x) {
        if(!canBeFitted) System.out.println(x +" can be fitted in:");
    }
}
