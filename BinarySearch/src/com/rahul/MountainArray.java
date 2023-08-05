package com.rahul;

//    https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class MountainArray {

    public static void main(String[] args) {
        int[] arr = {0, 1,0};
        System.out.println(peakIndexInMountainArray(arr));
    }


static int peakIndexInMountainArray(int[] arr) {

    int start = 0;
    int end = arr.length -1;

    while (start < end){
        int mid = start + (end - start)/2;

        if (arr[mid] > arr[mid + 1]) {
            //Then, you are in descending part of the array.
            //This may be the answer but look left also.
            //This is why end != mid + 1;
            end = mid;
        } else{
            start = mid + 1; // because we got to know that mid +1 > mid-element.
        }
    }
//        So, at last, start == end, pointing at the largest number because of the 2 checks above.
//        Start and end are always trying to find the max element in the above 2 checks.
//        Hence, when they're pointing to just one element, that is the max one because that is what checks say
//        More Elaboration: At every point of time for start and end, they have the best possible answer till that time,
//        and if we are saying that only one item is remaining hence, bcz of above line that is the best possible ans.

    return start; //or return end as both are equal.
}
}
