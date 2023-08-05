package com.rahul;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr ={4, 5 ,6 , 7, 0, 1 ,2};
        System.out.println(countRotation(arr));
    }

    static int countRotation(int[] arr) {

        int positionOfPivot = findPivot(arr);
        return positionOfPivot + 1;
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            //Our all 4 cases are below
            int mid = start + (end - start)/2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            } else if (arr[start] >= arr[mid]) {
                end = mid - 1;
            } else if (arr[start] < arr[mid]) {
                start = mid + 1;
            }
        }
        return -1;
    }
}
