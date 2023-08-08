package Patterns;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 1, 0};
        Sort(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void Sort(int[] arr, int i, int j){
        if (i == j){
            return;
        }

        if(j < i){
            if (arr[j] > arr[i]){
                swap(arr, j, i);
            }
            Sort(arr, i, j+1);
        }

        Sort(arr, i-1, 0);
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
