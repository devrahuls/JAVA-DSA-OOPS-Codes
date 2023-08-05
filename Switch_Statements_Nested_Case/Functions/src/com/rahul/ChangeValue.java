package com.rahul;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {

        int[] arr = {1 , 3, 2 , 45, 6};
        changeValue(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void changeValue(int[] nums){
        nums[0] = 99; //If you modify the object via this ref variable, same object will be changed for the array. Because we can modify an array but not a String.
    }
}
