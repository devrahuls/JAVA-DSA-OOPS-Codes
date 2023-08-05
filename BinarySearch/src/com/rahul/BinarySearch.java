package com.rahul;

import javax.swing.plaf.metal.MetalButtonUI;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {10, 15, 20, 32, 47, 52, 69, 79, 83, 97};
        int find = 69;

        int ans = binarySearch(array,find);
        System.out.println(ans);
    }

    // Return the index
    //Return -1 if it doesn't exist.
    static int binarySearch(int[]arr , int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
//            int mid = (start + end) / 2; // The value of mid may exceed the range of int, hence cause error.
            int mid = start + (end - start)/2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else {
                return mid;
            }

        }

        return -1;
    }
}