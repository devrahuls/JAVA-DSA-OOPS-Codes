package com.rahul;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 7};

        System.out.println(Search(arr,0, 0, arr.length - 1));
    }

    static int Search(int[] arr, int target, int s, int e){

        //Returns -1 if the target element doesn't exist in the array.
        if (s > e){
            return -1;
        }

        //Finds the middle element for every new Function call
        int mid = s + (e - s)/2;

        if (target == arr[mid]){
            return mid;
        }

        //If the first half of the array is sorted.
        if(arr[s] < arr[mid]){
            if (target >= arr[s] && target <= arr[mid]){
                return Search(arr, target, s, mid - 1);
            }
            return Search(arr, target, mid + 1, e);
        }

        //If the second half of the array is sorted.
        if (target >= arr[mid] && target <= arr[e]){
            return Search(arr, target, mid + 1, e);
        }
        return Search(arr, target, s, mid - 1);
    }
}
