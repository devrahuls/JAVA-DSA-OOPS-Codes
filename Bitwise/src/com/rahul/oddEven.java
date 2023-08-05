package com.rahul;

public class oddEven {
    public static void main(String[] args) {
        System.out.println("Is the given number is odd? " + findOddEven(69));
    }

    private static boolean findOddEven(int n) {

        if ((n & 1) == 1){
            return true;
        }
        return false;
    }
}