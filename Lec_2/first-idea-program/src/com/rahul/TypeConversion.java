package com.rahul;

import java.util.Scanner;

public class TypeConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Type conversion can happen if we give input as an integer and got output as a Float.
//        float decimalValue = input.nextFloat();
//        System.out.println(decimalValue);

//        Narrowing Conversion
        int num = (int) (23.23f);
        System.out.println(num);

        //Automatic type promotion in expression
        int a = 258;
        byte b = (byte) (a); // 258 % 256 = 2
        System.out.println(b);
        // Byte can only store to the value in 256, after that it will store the value in "Input's no. % 25".

        int number = 'A';
        System.out.println(number);
        //It will return the ASCII/Unicode value of the letter A.

        System.out.println(3 * 5.6); //Integer multiplies by a double, will return a double.

        byte Byte = 42;
        char Char = 'A';
        short Short = 1024;
        int Int = 69;
        float Float = 12.3425f;
        double Double = 0.3424222;

        double result = (Float * Byte) + (Int / Char) - (Double * Short);

        System.out.println((Float * Byte) + " " + (Int / Char) + " " + (Double * Short));
        // FLoat * Byte --> Float value, Int / Char --> Int value, Double * Short --> Double value.

        System.out.println(result);
        //Float + Int - Double --> Double


    }
}
