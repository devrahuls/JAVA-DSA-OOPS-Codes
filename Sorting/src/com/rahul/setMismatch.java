package com.rahul;

import java.util.Arrays;

/*
https://leetcode.com/problems/set-mismatch/
Input: nums = [1,2,2,4]
Output: [2,3]
*/
public class setMismatch {

    public static void main(String[] args) {
        int[] arr = {4, 7, 3 , 1, 2, 3, 6, 5};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }

    static int[] findErrorNums(int[] nums) {

        int i = 0;
        while (i < nums.length){
//          Correct index for every element.
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums , i,correct );
            }else {
                i++;
            }
        }

        //search for first missing number
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1){
                return new int[]{nums[index],index + 1}; //Return the repeated no, and the no. which is get replaced by the duplicacy.
            }
        }

        return new int[]{-1, -1};
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


}
