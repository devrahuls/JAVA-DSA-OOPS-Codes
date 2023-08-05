package com.rahul;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        Syntax:

//        datatype[] variable_name = new datatype[size]
        int[] arr = new int[5];
        System.out.println(Arrays.toString(arr));

//        or Directly- datatype[] variable_name = { collection of data of same dataypes}
        int[] arr1 = {1 ,34 ,5 ,4 ,9};
        System.out.println(Arrays.toString(arr1));


        int[] ros; //Declaration of the array. reference variable 'ros' is being stored in the stack memory.
        ros = new int[5]; //initialisation: Actually, here object is being created stored in the heap memory.

        System.out.println(ros[3]);

        String[] arr2 = new String[5];
        System.out.println(arr2[0]);  //Returns null.


    }
}