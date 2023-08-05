package com.rahul;

import java.util.Arrays;
import java.util.Scanner;

public class MutidimensionalArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

////        int[][] arr = new int[3][];
//
//        int[][] arr1 = {
//                {1 , 2 ,3},
//                {4 , 5 ,6},
//                {7, 8 , 9}
//        };
//        System.out.println(Arrays.toString(arr1[0]));
//        System.out.println(Arrays.toString(arr1[1]));
//        System.out.println(Arrays.toString(arr1[2]));
//
//        System.out.println(arr1[0][1]);
//
//        int[][] arr2 = {
//                {1 , 2 ,3}, //0th index
//                {4 , 5},    //1st index
//                {6 ,7, 8 , 9} //3rd index
//        };
//        System.out.println(Arrays.toString(arr2[0]));
//        System.out.println(Arrays.toString(arr2[1]));
//        System.out.println(Arrays.toString(arr2[2]));


        //Input of the Array.
        System.out.print("Enter the number of row: \t");
        int r = in.nextInt();
        System.out.print("Enter the number of column: \t");
        int c = in.nextInt();

        int[][] arr3 = new int[r][c]; //if we do arr3.length here then it returns the length of the row only.

        for (int row = 0; row < arr3.length; row++) {
            for (int col = 0; col < arr3[row].length ; col++) {
                arr3[row][col] = in.nextInt();
            }
        }
        //Output of the Array.
//        for (int row = 0; row < arr3.length; row++) {
//            for (int col = 0; col < arr3[row].length ; col++) {
//                System.out.print(arr3[row][col] + " ");
//            }
//            System.out.println();
//        }
//        OR
        for (int row = 0; row < arr3.length; row++) {
            System.out.println(Arrays.toString(arr3[row]));
        }

        for( int[] a : arr3){
            System.out.println(Arrays.toString(a));
        }




//        Dynamic Arrays
        int[][] arr4 = {
                {1 ,2 ,3 ,4},
                {5, 6},
                {7, 8, 9}
        };

        for (int row = 0; row < arr4.length; row++) {
            for (int col = 0; col < arr4[row].length; col++) {
                System.out.print(arr4[row][col] + " ");
            }
            System.out.println();
        }




    }
}
