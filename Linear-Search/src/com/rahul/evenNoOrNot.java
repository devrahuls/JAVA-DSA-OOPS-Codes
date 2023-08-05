package com.rahul;

import java.util.Arrays;

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class evenNoOrNot {
    public static void main(String[] args) {
        int[] array = {123, 35 ,235 , 3525, 69};

        System.out.println(findNumbers(array)
        );
    }

    static int findNumbers(int[] nums) {
        int count = 0;

        for (int num : nums) {
            if(even(num)){
                count++;
            }
        }
        return count;
    }


    //function to check whether the digits are in even number or not.
    static boolean even(int nums) {
        int numberOfDigits = digits(nums);

        return numberOfDigits % 2 ==0;
    }


    // Count the number of digits in a number.
    static int digits(int nums){

        if (nums < 0) {
            nums = nums * -1;
        }
        if (nums == 0) {
            return 1;
        }

        int count = 0;

        while (nums > 0){
            count++;
            nums = nums / 10;
        }
        return count;
    }
}
