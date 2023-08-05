package com.rahul;

import java.util.ArrayList;

public class StringOperator {
    public static void main(String[] args) {
        System.out.println('a' + 'b'); //Adding ASCII values of a and b

        System.out.println("a" + "b"); // Adding two strings.

        System.out.println((char) ('a' + 1)); // Adding ASCII value of a and 1 (97 + 1), that makes 98, i.e, b.

        System.out.println("a" + 1); //Adding a string to integer, then that int converts to its wrapper class Integer,
        // that will call toString and makes this int as String value.

        System.out.println("Rahul" + new ArrayList<>()); //Adding String and a wrapper class.

        System.out.println("Rahul" + new Integer(69)); // Adding String and a wrapper class.


        //System.out.println(new ArrayList<>() + new Integer(69));

        /* This will gives error because, in Java, the + operator, is only defined for 'Primitives' & when any of the value
          is of String data type. And, in this case, both the values are Classes, neither String nor Primitives. Hence, error! */


        String ans = new ArrayList<>() + "" + new Integer(56); // Adding "" , double quotes will make it as String value.
        System.out.println(ans);
    }
}
