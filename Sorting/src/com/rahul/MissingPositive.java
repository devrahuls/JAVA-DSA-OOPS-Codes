package com.rahul;

//https://leetcode.com/problems/first-missing-positive/
public class MissingPositive {

    static int firstMissingPositive(int[] arr){
        int i = 0;
        while (i < arr.length){

//            Correct index for every elemenet.
            int correct = arr[i] - 1;
            //This will gonna sort the array even with the negative values. bcz when a no is -ve, when it is less than 0. And in if condition we put
            //only swap when no. is positive.
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
                swap(arr , i,correct );
            }else {
                i++;
            }
        }

        //search for first missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1){
                return index + 1;
            }
        }

        //case 2
        return arr.length + 1;

    }


    // To swap two numbers function
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
