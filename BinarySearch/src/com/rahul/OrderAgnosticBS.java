package com.rahul;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70 , 80 ,90};
        int find = 70;
//        int[] array = {97, 83, 79, 69, 52, 47, 32, 20, 15, 10};
//        int find = 79;

//      From here, suppose we don't know the array is sorted as in Ascending order or in Descending order. So, we do-

        int start = 0;
        int end = array.length - 1;

        if (array[end] > array[start]) {
            int ans = AscendingbinarySearch(array,find);
            System.out.println(ans);
        } else {
            int ans = DescendingbinarySearch(array,find);
            System.out.println(ans);
        }



    }

    // Return the index
    //Return -1 if it doesn't exist.
    // Data sorted in Ascending order.
    static int AscendingbinarySearch(int[]arr , int target){
        int start = 0;
        int end = arr.length - 1;

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

    // Return the index
    //Return -1 if it doesn't exist.
    // Data sorted in Descending order.
    static int DescendingbinarySearch(int[]arr , int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
//            int mid = (start + end) / 2; // The value of mid may exceed the range of int, hence cause error.
            int mid = start + (end - start)/2;

            if (target > arr[mid]) {
                end = mid - 1;
            } else if (target < arr[mid]) {
                start = mid + 1;
            }else {
                return mid;
            }

        }

        return -1;
    }
}
