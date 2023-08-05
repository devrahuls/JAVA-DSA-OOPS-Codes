package com.rahul;

public class searchInRange {
    public static void main(String[] args) {
        int[] array = { 22, 32 ,325 ,23 ,-12 , 8 ,789 ,46};
        int find = 23;
        boolean ans = LinearSearch(array, find, 1, 5);
        System.out.println(ans);
    }

    static boolean LinearSearch(int[] arr , int target , int start, int end){

        if (end == 0){
            return false;
        }

        for (int index = start; index <= end ; index++) {
            int element = arr[index];
            if (element == target) {
                return true;
            }
        }

        return false;

    }
}
