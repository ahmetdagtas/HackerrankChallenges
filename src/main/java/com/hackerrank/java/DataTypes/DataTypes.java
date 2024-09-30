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
        boolean isFitInPrinted = false;
        isFitInPrinted = willItFitByte(testInput, isFitInPrinted);
        isFitInPrinted = willItFitShort(testInput, isFitInPrinted);
        isFitInPrinted = willItFitInt(testInput, isFitInPrinted);

        if (!isFitInPrinted)
            System.out.print(" can't be fitted anywhere.");
    }

    private boolean printFitIn(boolean isFitInPrinted){
        if (!isFitInPrinted) {
            System.out.print(" can be fitted in:\n");
        }
        return true;
    }

    private boolean willItFitByte(long testInput, boolean isFitInPrinted) {
        if ((testInput >= Byte.MIN_VALUE) && (testInput <= Byte.MAX_VALUE)){
            isFitInPrinted = printFitIn(isFitInPrinted);
            System.out.println("* byte");
        }
        return isFitInPrinted;
    }
    private boolean willItFitShort(long testInput, boolean isFitInPrinted) {
        if ((testInput >= Short.MIN_VALUE) && (testInput <= Short.MAX_VALUE)){
            isFitInPrinted = printFitIn(isFitInPrinted);
            System.out.println("* short");
        }
        return isFitInPrinted;
    }

    private boolean willItFitInt(long testInput, boolean isFitInPrinted) {
        if ((testInput >= Integer.MIN_VALUE) && (testInput <= Integer.MAX_VALUE)){
            isFitInPrinted = printFitIn(isFitInPrinted);
            System.out.println("* int");
        }
        return isFitInPrinted;
    }


}
