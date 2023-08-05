package com.rahul;

public class FindNumberOfDigitsInSuchBase {
    public static void main(String[] args) {

        int n = 10;
        int base = 2;

        int ans = (int) (Math.log(n) / Math.log(base)) + 1;  //log base^n / log n^base

        System.out.println(ans);
    }
}
