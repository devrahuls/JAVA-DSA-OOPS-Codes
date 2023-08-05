package com.rahul;

public class OptimizedOrderAgnosticBS {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70 , 80 ,90};
        int find = 70;
//        int[] array = {97, 83, 79, 69, 52, 47, 32, 20, 15, 10};
//        int find = 79;

//      From here, suppose we don't know the array is sorted as in Ascending order or in Descending order. So, we do-

        int ans = orderAgnosticBS(array,find);
        System.out.println(ans);
    }

    // Return the index
    //Return -1 if it doesn't exist.
    // Data sorted in Ascending/Descending order.
    static int orderAgnosticBS(int[]arr , int target) {
        int start = 0;
        int end = arr.length - 1;

        // Check wheter the array is sorted in Ascending or Descending.
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {

            //find the middle element
            int mid = start + (end - start) / 2;  // The value of mid may exceed the range of int, hence cause error.

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc == true) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (isAsc == false) {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }
}


