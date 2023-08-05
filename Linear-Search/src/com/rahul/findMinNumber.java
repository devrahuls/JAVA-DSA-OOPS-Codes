package com.rahul;

public class findMinNumber {
    public static void main(String[] args) {
        int[] array = {22, 32 ,325 ,23 ,-12 , 8 ,789 ,46};
        int answer = min(array);
        System.out.println(answer);
    }

    static int min( int[] arr){
        int ans = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (ans > arr[i]) {
                ans = arr[i];
            }
        }
        return ans;
    }
}
