package com.company;

public class Main {

    public static void main(String[] args) {
	// byte
    // short
    // int most common
    // long
    // float
    // double most common
    // char
    // boolean most common

// The string is a data type in Java but is not a primitive type.
// It's actually a class but is treated differently in Java for ease of use
// Strings in Java are immuteable, any time it is changed, a new string is created, NOT simply appended to a list for instance


        String myString  = "This is a string";
        System.out.println("My string is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("My string is equal to " + myString);
        myString = myString + " \u00A9 2019";
        System.out.println("My string is equal to " + myString);

        System.out.println("--------------");

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);
//        The result of this sout is simply the first string plus the next string immediately afterwards,
//        it does not actually perform the mathematical operation

        System.out.println("--------------");

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);
//        Java effectively converts the int to a string and appends it purely as text, again no mathematical operation
//        In a later template you will see a better method to append to strings called a StringBuffer

    }
}
