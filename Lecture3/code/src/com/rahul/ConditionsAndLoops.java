package com.rahul;

import java.util.Scanner;

public class ConditionsAndLoops {
    public static void main(String[] args) {
        //For Loop

        /*
        for loop syntax
        for ( initialisation; condition; increment/decrement){
             body
        }
         */

        //Print number from 1 to n
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//
//        for (int num = 1; num <= n; num++) {
//            System.out.print(" "+ num);
//        }

        //While Loop
        /*
        while(condition){
            //body
        }
         */

//        int i = 1; //initialisation
//        while (i <= 5){    //condition
//            System.out.println("Hello babe"); //body
//            i++; //increment/decrement
//        }


        //Do While Loop

        /*
            do{
               //body
            }while(condition);
         */

        int i = 1;
        do {
            System.out.println("Hello World");
        }while (i != 1);
    }
}
