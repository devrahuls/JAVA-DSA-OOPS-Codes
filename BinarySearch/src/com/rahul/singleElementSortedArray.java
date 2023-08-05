package com.rahul;

import java.util.Arrays;

public class singleElementSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4, 4, 8, 8};

        System.out.println(singleNonDuplicate(arr));
    }

    static int singleNonDuplicate(int[] arr) {

        for (int i = 0; i < arr.length; i+=2) {

            if(arr[1+i] != arr[i]){
                return arr[i];
            }
        }
        return arr[arr.length-1];
    }
}
