package com.rahul;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
public class FindDisappearNumber {
    public static void main(String[] args) {
//        int[] arr = {4,3,2,7,8,2,3,1};
//        System.out.println(findDisappearedNumbers(arr));
    }

    public List<Integer> findDisappearedNumbers(int[] arr){
        int i = 0;

        while (i < arr.length){
//            Correct index for every elemenet.
            int correct = arr[i] - 1;

            if (arr[i] != arr[correct]) {
                swap(arr , i,correct );
            }else {
                i++;
            }
        }

        //Finding the missing number
        List <Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1){
                ans.add(index + 1);
            }
        }
        return ans;
    }

    // To swap two numbers function
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
