package com.rahul;

import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {

        int[] nums = {2, 5, 1, 3, 4, 7};
        int numsLength = nums.length;
        int[] ans = new int[numsLength];

        int j = 0;
        for (int i = 0; i < numsLength; i = i+2) {
            ans[i] = nums[j];
            ans[i + 1] = nums[j + (numsLength/2)];
            j++;
        }

        System.out.println(Arrays.toString(ans));
    }
}
