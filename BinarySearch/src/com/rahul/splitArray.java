package com.rahul;

//  https://leetcode.com/problems/split-array-largest-sum/
public class splitArray {
    public static void main(String[] args) {

    }

    public int splitArray(int[] nums, int k) {

        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]); //At the end of the loop this will contain the max item from the array.
            end += nums[i];
        }

        //Now, apply Binary search
        while (start < end){
            //try for the middle as the potential ans
            int mid = start + (end - start)/2;

            //Calculate how many pieces you can divide it with this max sum i.e., (mid's value).
            int sum = 0;
            int pieces = 1;
            for(int num: nums){
                if (sum + num > mid) {
//                    You cant add this in this subarray, make a new one.
//                    Say you add this num in new subarray, then sum = num
                    sum = num;
                    pieces++;
                }else {
                    sum += num;
                }
            }

            if (pieces > k) {
                start = mid + 1;
            }else {
                end = mid;
            }
        }
        return end; //bcz here, start == end == mid;
    }

}
