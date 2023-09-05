package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {

        int[] arr = {5, 4, 3, 2, 1};
        sortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static int[] sort(int[] arr){
        if (arr.length == 1){
            return arr;
        }

        int mid = arr.length/2;

        int[] left = sort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = sort(Arrays.copyOfRange(arr, mid, arr.length));
        // copyOfRange - just copies the between the range's elements of an array.

        return merge(left,right);
    }

    static int[] merge(int[] first, int[] second){
        int[] mix = new int[first.length + second.length];

        int i = 0; //for traversing left side of the array
        int j = 0; //for traversing right side of the array
        int k = 0; //for traversing the merged array.

        while(i < first.length && j < second.length){
            if (first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        //It might be possible that one of the array isn't completely merged to the second one. Happens when the no. of elements in the array is odd.
        //Copying the remaining elements.
        while (i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;

    }




    //In the above method we are copying the original array and then changing it.
    //Now we are going to change the original array by passing range as start, mid, and end of the array or subarray.


    static void sortInPlace(int[] arr, int s, int e){
        if (e - s == 1){
            return;
        }

        int mid = (s + e)/2;

        sortInPlace(arr, 0, mid);
        sortInPlace(arr, mid, e);

        mergeInPlace(arr, s , mid, e);
    }

    static void mergeInPlace(int[] arr, int s, int m , int e){
        int[] mix = new int[e - s];

        int i = s; //for traversing left side of the array
        int j = m; //for traversing right side of the array
        int k = 0; //for traversing the merged array.

        while(i < m && j < e){
            if (arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        //It might be possible that one of the array isn't completely merged to the second one. Happens when the no. of elements in the array is odd.
        while (i < m){
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j < e){
            mix[k] = arr[j];
            j++;
            k++;
        }

        //Copying the remaining elements.
        for (int l = 0; l < mix.length; l++) {
            arr[s + l] = mix[l];
        }

    }

}
