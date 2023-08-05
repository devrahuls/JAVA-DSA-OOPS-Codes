package com.rahul;

public class factorial {
    public static void main(String[] args) {
        System.out.println(facto(5));
    }

    static int facto( int n){
        if (n == 0){
            return 1;
        }
        return facto(n - 1) * n;
    }
}
