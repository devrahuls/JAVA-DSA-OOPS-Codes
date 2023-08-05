package com.rahul;

import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter your desired number: ");
        int n = in.nextInt();

        System.out.print("Enter the number that you wanna count: ");
        int number = in.nextInt();

        int count = 0;

        while (n > 0){
            int rem = n % 10;
            if ( rem == number){
                count++;
            }
            n = n / 10;
        }

        System.out.println("The number of occurence of "+ number+" is "+count);
    }
}
