package com.rahul;

import java.util.Scanner;

public class Parameters {
    public static void main(String[] args) {
        int ans = sum( 10 , 20);
        System.out.println(ans);

        String greeting = greet("Rahul");
        System.out.println(greeting);
    }

    static int sum( int a , int b){
        int sum = a + b;
        return sum;
    }

    static String greet(String name){
        String msg = "Hello " + name;
        return msg;
    }
}
