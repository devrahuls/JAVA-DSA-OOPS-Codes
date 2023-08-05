package com.rahul;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];
        arr[0] = 2;
        arr[1] = 245;
        arr[2] = 232;
        arr[3] = 26;
        arr[4] = 257;

        System.out.println(arr[2]);


////        Input using for loops
//        System.out.print("Enter the length of the array: ");
//        int[] arr1 = new int[in.nextInt()];
//        System.out.println("Please enter the elements of the array:");
//        for (int i = 0; i < arr1.length; i++) {
//            arr1[i] = in.nextInt();
//        }
////        System.out.print(Arrays.toString(arr1) + "\t");
////                      OR
//        //For each loop
//        for (int num: arr1) {   //for every element in the array, print the element.
//            System.out.print(num + " "); //here num represents the elements of the array.
//        }


        //Arrays of Objects
        String[] str = new String[3];

        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

        //Modify
        str[1] = "Rahul";
        System.out.println(Arrays.toString(str));


    }


}
