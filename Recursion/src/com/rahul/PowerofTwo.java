package com.rahul;

public class PowerofTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(15));
    }

    static boolean isPowerOfTwo(int n) {
        if (n == 0){
            return true;
        }
        if (Math.pow(2, Math.sqrt(n)) == n){
            return true;
        }
        return false;
    }
}
