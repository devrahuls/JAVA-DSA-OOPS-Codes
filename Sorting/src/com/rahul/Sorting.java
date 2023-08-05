package com.rahul;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = {5, 4 , 3 , 2 ,1 };
        CycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void BubbleSort(int[] arr){
        boolean swapped; // for checking, if the array is already sorted or not.

//        Run the steps n-1 times.
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            //for each step max value will come at the last respective index.
            for (int j = 1; j < arr.length - i; j++) {

                //compare if the item is smaller than its previous one
                if (arr[j] < arr[j - 1]) {

                    //swap
                    swap(arr , arr[j], arr[j-1]);
                    swapped = true;
                }
            }
            //if you didn't swap for the valur of i, then  it means the array is already sorted, hence it comes out the loop.
            if (!swapped){
                break;
            }
        }
    }

    // To swap two numbers function
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

//    Selection Sort
    static void Selection(int[] arr){

        for (int i = 0; i < arr.length; i++) {

            //find the maximum item in the remaining array and swap it in its correct position.
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr , 0 , last);
            swap(arr, maxIndex, last);
        }
    }

    //To get the maximum index
    private static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;

        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    //Insertion Sort
    static void InsertionSort(int[] arr){

//      Starting index. from where the array is being started and getting sorted in a range.
        for (int i = 0; i < arr.length - 1; i++) {

            //Ending index. here it becomes a range from starting 'i' upto 'j'.
            for (int j = i + 1; j > 0 ; j--) {
                if (arr[j] < arr[j-1]) {
                    swap(arr, j, j-1);
                }else {
                    break;
                }
            }
        }
    }

    static void CycleSort(int[] arr){

        int i = 0;
        while (i < arr.length){
//            Correct index for every elemenet.
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr , i,correct );
            }else {
                i++;
            }
        }
    }

}

