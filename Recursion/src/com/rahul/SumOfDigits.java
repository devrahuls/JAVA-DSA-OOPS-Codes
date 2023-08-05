package com.rahul;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sum(1342));  // 1 + 3 + 4 + 2
        System.out.println(prod(55));
    }

    static int sum(int n){

        if (n == 0){
            return 0;
        }

        return sum(n / 10) + n % 10;
    }

    //Multiplication
    static int prod(int n){

        if (n % 10 == n){
            return n;
        }

        return prod(n / 10) * (n % 10);
    }
}
