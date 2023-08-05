package com.rahul;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int a = 0, b = 1, count = 2;

        while (count <= n){
            int temp = b;
            b = a + b;
            a = temp;
            count++;
        }

        System.out.println(b);
    }
}
