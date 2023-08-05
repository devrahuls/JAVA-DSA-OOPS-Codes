package com.rahul;

public class FindAnyNoRecursion {
    public static void main(String[] args) {

//        for (int i = 0; i < 11; i++) {
//            System.out.println(fiboFormula(i));
//        }

        System.out.println(fiboFormula(50));

    }

    //Formula to find nth number of fibonacci.
    static int fiboFormula(int n){
        return (int) (
                (  Math.pow(((1 + Math.sqrt(5)) / 2), n ) ) / Math.sqrt(5)
        );
    }
}
