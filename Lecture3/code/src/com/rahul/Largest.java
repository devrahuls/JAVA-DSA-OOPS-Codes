package com.rahul;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        /*
        Q. Take three inputs from the user and then finds the largest number amongst those numbers.
         */

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

//        if (a > b && a > c){
//            System.out.println(a + " is the bigger number");
//        } else if (b > a && b > c) {
//            System.out.println(b + " is the bigger number");
//        }else {
//            System.out.println(c + " is the bigger number");
//        }

//        int max = a;
//        if (b > max){
//            max = b;
//        }
//        if ( c > max){
//            max = c;
//        }
//        System.out.println(max + " is the largest number.");


        int max = Math.max(c , Math.max(a , b) );
        System.out.println(max + " is the largest number.");
    }
}
