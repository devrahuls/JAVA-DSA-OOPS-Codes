package com.rahul;

import java.lang.String;
import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        double b = in.nextDouble();
        String str = String.valueOf(in.hasNext());

        System.out.println(str);
        System.out.println(b);
        System.out.println(a);

    }
}
