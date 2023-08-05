package com.rahul;
import java.util.Arrays;

public class ConcatinationArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] ans = new int[2 * arr.length];

        for( int i = 0; i < 2 * arr.length; i++){
            if (i < arr.length){
                ans[i] = arr[i];
            }else {
                ans[i] = arr[i - arr.length];
            }
        }

        System.out.println(Arrays.toString(ans));
    }


}
