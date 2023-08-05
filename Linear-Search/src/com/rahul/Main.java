package com.rahul;

public class Main {
    public static void main(String[] args) {
        int[] array = { 22, 32 ,325 ,23 ,-12 , 8 ,789 ,46};
        int find = 23;
        int ans = linearSearch(array , find);
        System.out.println(ans);
        boolean ans1 = boolLinearSearch(array, 69);
        System.out.println(ans1);
    }

    //Returning the index of the target element
    static int linearSearch(int[] arr , int target){
        
        if (arr.length == 0){
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index + 1;
            }
        }

        return -1;
        
    }

    //Returning true or false
    static boolean boolLinearSearch(int[] arr , int target){

        if (arr.length == 0){
            return false;
        }

        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return true;
            }
        }

        return false;

    }
}