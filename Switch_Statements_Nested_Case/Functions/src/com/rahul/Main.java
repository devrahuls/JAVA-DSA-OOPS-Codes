package com.rahul;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Take the input of two numbers and print the sum.

        int ans = sum2();
        System.out.println(ans);

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of times you wanna run: ");
        int i = in.nextInt();
        for (int n = 0; n < i ; n++){
            sum();
        }
    }

    static int sum2(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number 1: ");
        int num1 = input.nextInt();
        System.out.println("Enter the number 2: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        return sum;
        //After this nothing will gonna execute.
//        System.out.println("This will not execute.");
    }

    static void sum(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number 1: ");
        int num1 = input.nextInt();
        System.out.println("Enter the number 2: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum of the number is :"+sum);
    }
}