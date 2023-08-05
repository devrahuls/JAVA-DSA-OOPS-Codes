package com.rahul;

//https://leetcode.com/problems/missing-number/
public class MissingNumber {
    public static void main(String[] args) {

        int[] arr = {0, 1, 3, 2 , 5};
        System.out.println(findMissingNumber(arr));


    }

    static int findMissingNumber(int[] arr){
        int i = 0;
        while (i < arr.length){

//            Correct index for every elemenet.
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr , i,correct );
            }else {
                i++;
            }
        }

        //search for first missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index){
                return index;
            }
        }

        return arr.length;

    }

    // To swap two numbers function
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
