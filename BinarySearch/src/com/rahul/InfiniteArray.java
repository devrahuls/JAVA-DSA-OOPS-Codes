package com.rahul;

public class InfiniteArray {

    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        int target = 10;

        System.out.println(ans(arr, target));

    }

    static int ans(int[] arr, int target){
        //First find the range with the box size of 2.
        int startt = 0;
        int end = 1;

        while (target > arr[end]){
            int newStart = end + 1; //This is our new start.
            //Double the box size
            //end = previousEnd + sizeOfBox*2
            end = end + (end - startt + 1) * 2;
            startt = newStart;
        }

        return binarySearch1(arr , target , startt , end);
    }

    static int binarySearch1(int[]arr , int target , int start, int end){

        while (start <= end){
//            int mid = (start + end) / 2; // The value of mid may exceed the range of int, hence cause error.
            int mid = start + (end - start)/2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else {
                return mid;
            }

        }

        return -1;
    }
}
