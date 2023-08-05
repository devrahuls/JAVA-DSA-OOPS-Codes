package com.rahul;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
//        String fruits = in.next();

//        switch (fruits) {
//            case "Mango" -> System.out.println("King of the fruit.");
//            case "Apple" -> System.out.println("A sweet round fruit.");
//            case "Orange" -> System.out.println("A round fruit.");
//            case "Grapes" -> System.out.println("A small fruit.");
//            default -> System.out.println("Please enter a fruit name!!");
//        }

        int day = in.nextInt();

//        switch (day){
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Weekdays");
//                break;
//
//            case 6:
//            case 7:
//                System.out.println("Weekend");
//                break;
//        }

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekdays");
            case 6, 7 -> System.out.println("Weekend");
        }






        //Debug it, and you will find why the if else condition is bad in time complexity in comparison to switch cases.
//        if (fruits.equals("Apple")){
//            System.out.println("Noiceeee");
//        }if (fruits.equals("Mango")){
//            System.out.println("Hueheuheueu");
//        }if (fruits.equals("Grapes")){
//            System.out.println("Lojidhvudf");
//        }


    }
}