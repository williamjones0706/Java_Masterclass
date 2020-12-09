package com.company;

public class Main {

    public static void main(String[] args) {
    
        float myMinFloat = Float.MIN_VALUE;
        float myMaxFloat = Float.MAX_VALUE;
        System.out.println("Min float value: " + myMinFloat);
        System.out.println("Max float value: " + myMaxFloat);

        double myMinDouble = Double.MIN_VALUE;
        double myMaxDouble = Double.MAX_VALUE;
        System.out.println("Min double value: " + myMinDouble);
        System.out.println("Max double value: " + myMaxDouble);

        int myIntValue  = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5.00 / 3.00;
//        The double is more precise and is treated as the default. The Int will not even include the decimal for operations
        System.out.println("MyIntValue= " + myIntValue);
        System.out.println("MyFloatValue= " + myFloatValue);
        System.out.println("MyDoubleValue= " + myDoubleValue);

//        Challenge Floating Point Precision
        double pounds = 200d;
        double kilograms = pounds * 0.45359237d;
        System.out.println(pounds + " Pounds is equal to " + kilograms + " Kilograms");

        double pi = 3.1415927d;
        double anotherNumer = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumer);

//        For precise calculations use BigDecimal data type

    }
}
