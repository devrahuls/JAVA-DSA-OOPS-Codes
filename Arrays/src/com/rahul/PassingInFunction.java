package com.rahul;

import java.util.Arrays;

public class PassingInFunction {
    public static void main(String[] args) {
        int[] nums = { 1 , 34 , 45 , 57 , 47 };
        System.out.println(Arrays.toString(nums));

        change(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void change(int[] arr){
        arr[0] = 69;
    }
}
