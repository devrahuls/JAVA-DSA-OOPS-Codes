package com.rahul;

public class rotatedBSDuplicacy {
    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        //If you didn't find the pivot, means the array isn't rotated.
        if (pivot == -1) {
            //Then do normal Binary Search.
            return binarySearch(nums, target, 0, nums.length -1);

        }
        //If pivot is found!
        if (nums[pivot] == target) {
            return pivot;
        }if(target >= nums[0]){
            //Element will found (start,pivot)
            return binarySearch(nums, target, 0, pivot-1);
        }
        return binarySearch(nums, target, pivot + 1, nums.length -1 );
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            //Our all 4 cases are below
            int mid = start + (end - start)/2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return arr[mid];
            } else if (mid > start && arr[mid] < arr[mid - 1]) {
                return arr[mid - 1];
            }
            //If the elements of start, end and middle are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                //skip the duplicates

                //NOTE: What if the element of start and end were the pivot element.
                //So, now check if the start is pivot.
                if (arr[start] > arr[start + 1]){
                    return start;
                }
                start ++;

                //Check whether end is pivot
                if (arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end --;
            }
            //So until now, left is sorted. It means, pivot now lies on the right side.
            if (arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]) {
                start = mid + 1;
            }else {
                end = end - 1;
            }

        }
        return -1;
    }

    static int binarySearch(int[]arr , int target, int start, int end){
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
