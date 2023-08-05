package com.rahul;

public class BinarySearchRecurrsion {
    public static void main(String[] args) {
        int[] arr = {1, 2 , 4, 5 , 7 , 45, 574, 5634};
        int target = 2;
        System.out.println(BinarySearch(arr, target, 0, arr.length - 1));
    }

    static int BinarySearch(int[] arr, int target, int s, int e){
        if(s > e){
            return -1;
        }

        int m = s + (e - s)/2;

        if (target == arr[m]){
            return m;
        }

        if( target < arr[m]){
            return BinarySearch(arr, target, s, m -1);
        }
        return BinarySearch(arr, target, m + 1, e);

    }
}
