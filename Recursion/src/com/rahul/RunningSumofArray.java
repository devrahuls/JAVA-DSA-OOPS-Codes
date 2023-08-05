package com.rahul;

import java.util.Arrays;

public class RunningSumofArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] newArr = new int[nums.length];

        for (int i = 0; i < nums.length; i++){
            if(i == 0){
                newArr[i] = nums[i];
            }
            else {
                newArr[i] = newArr[i - 1] + nums[i];
            }
        }

        System.out.println(Arrays.toString(newArr));

    }
}
