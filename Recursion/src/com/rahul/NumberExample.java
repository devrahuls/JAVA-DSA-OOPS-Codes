package com.rahul;

public class NumberExample {
    public static void main(String[] args) {
        //Write a function that takes in a number and prints it.
        //print first five numbers: 1 2 3 4 5.
        number1(1);
    }

    static void number1(int n){
        System.out.println(n);
        number2(2);
    }
    static void number2(int n){
        System.out.println(n);
        number3(3);
    }
    static void number3(int n){
        System.out.println(n);
        number4(4);
    }
    static void number4(int n){
        System.out.println(n);
        number5(5);
    }
    static void number5(int n){
        System.out.println(n);
    }
}
