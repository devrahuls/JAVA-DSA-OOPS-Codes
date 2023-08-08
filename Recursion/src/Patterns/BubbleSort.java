package Patterns;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        Sort(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void Sort(int[] arr, int i, int j){

        //Returns the array when the array is being sorted.
        if (i == j){
            return;
        }

        if (i > j){
            if (arr[j] > arr[j+1]){
                //Swap the values to sort the array.
                swap(arr, j, j+1);
            }
            Sort(arr, i, j+1);
        }

        Sort(arr, i - 1, 0);
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
