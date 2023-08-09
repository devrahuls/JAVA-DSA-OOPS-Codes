package Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

        //This sorting is inbuilt technique in Java to sort an array. It sorts by taking two pivot elements.
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int low, int high){

        if (low >= high){
            return;
        }
        int s = low;
        int e = high;
        int mid = s + (e - s)/2;
        int pivot = arr[mid];

        while (s <= e){
            while (arr[s] < pivot){
                s++;
            }
            while (arr[e] > pivot){
                e--;
            }

            if (s <= e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }

        //Now our pivot is at its correct index, and now we have to just sort the two halves of the array.
        sort(arr, low, e);
        sort(arr, s, high);
    }
}
