package com.rahul;

//Q - Check whether the given array is sorted or not.
public class checkSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 8};
        System.out.println(sorted(arr, 0));
    }

    static boolean sorted(int[] arr, int index){

        if (arr[index] == arr.length - 1){
            return true;
        }

        return arr[index] < arr[index + 1] && sorted(arr, index + 1);
    }
}
