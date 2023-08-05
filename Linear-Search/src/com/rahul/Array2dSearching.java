package com.rahul;

import java.util.Arrays;

public class Array2dSearching {
    public static void main(String[] args) {
        int[][] array = {
                {1 , 325 ,45 ,23},
                {324 ,5 ,67 ,436, 7 , 78},
                {534, 23, 75}
        };

        int target = 23;
        int[] ans = search(array, target); // Since, search method return an array, so we have to store 'search' value in an array.
        System.out.println(Arrays.toString(ans));


        int[][] array1 = {
                {1 , 325 ,45 ,23},
                {324 ,5 ,67 ,436, 7 , 78},
                {534, 23, 75}
        };
        int ans1 = maxSearch(array1);
        System.out.println(ans1);
    }

    static int[] search(int[][] arr, int find){

        if (arr.length == 0) {
            return new int[]{-1,-1};
        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (find == arr[row][col]){
                    return new int[] {row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

    //Find a maximum number in an array.
    static int maxSearch(int[][] arr){

        int max = arr[0][0];

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (max < arr[row][col]){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }

}
