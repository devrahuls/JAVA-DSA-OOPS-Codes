package com.rahul;

public class Ceiling {
    public static void main(String[] args) {
        int[] array = {2 , 3 , 5 , 9 , 16 , 18, 25, 33};
        int find = 17;

//        int ans = array[Ceiling(array,find)];   //To get the index's element.
        int ans = Ceiling(array,find);
        System.out.println(ans);
    }

    // Return the index: nearest greater than or equal to the target element.
    static int Ceiling(int[]arr , int target){
        int start = 0;
        int end = arr.length - 1;

        if (target > arr[end]) {
            return -1;
        }

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

        return start;
    }
}
